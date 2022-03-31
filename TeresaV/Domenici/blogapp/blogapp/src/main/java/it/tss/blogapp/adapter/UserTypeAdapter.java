/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.blogapp.adapter;

    
    import it.tss.blogapp.control.UserStore;
import it.tss.blogapp.entity.User;
import javax.inject.Inject;
import javax.json.JsonObject;
import javax.json.bind.adapter.JsonbAdapter;
import javax.ws.rs.NotFoundException;

/**
 *
 * @author tss
 */
public class UserTypeAdapter implements JsonbAdapter<User, JsonObject> {

    @Inject
    UserStore store;

    @Override
    public JsonObject adaptToJson(User entity) throws Exception {
        return entity.toJsonSlice();
    }

    @Override
    public User adaptFromJson(JsonObject json) throws Exception {
        if (!json.containsKey("id")) {
            return null;
        }
        return store.find(json.getJsonNumber("id").longValue()).orElseThrow(() -> new NotFoundException("UserTypeAdapter.adaptFromJson not found"));
    }

}

