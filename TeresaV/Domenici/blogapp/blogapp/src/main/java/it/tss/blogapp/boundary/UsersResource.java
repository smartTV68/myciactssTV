/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.blogapp.boundary;

import it.tss.blogapp.control.PostStore;
import it.tss.blogapp.control.UserStore;
import it.tss.blogapp.entity.Post;
import it.tss.blogapp.entity.User;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.container.ResourceContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;
import javax.ws.rs.core.UriInfo;

/**
 *
 * @author tss
 */
@Path("/users")
public class UsersResource {

    @Inject
    private UserStore store;
    
    @Inject
    private PostStore postStore;
    
    @Context
    ResourceContext rc;

    @Context
    UriInfo uriInfo;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<User> all() {
        System.out.println("++" + UriBuilder.fromResource(UsersResource.class).build().toString());
        System.out.println("--" + uriInfo.getBaseUriBuilder().path(UsersResource.class).build().toString());
        return store.all();
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(@Valid User entity) {
        store.save(entity);

    }

    @GET
    @Path("{id}")
    public User find(@PathParam("id") Long id) {
        return store.find(id).orElseThrow(() -> new NotFoundException("User non trovato. id= " + id));
    }
    
    @GET
    @Path("{id}/posts")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Post> posts(@PathParam("id") Long id){
        return postStore.byUser(id);
    }
    
    @POST
    @Path("{id}/posts")
    @Consumes(MediaType.APPLICATION_JSON)
    public void createPost(@PathParam("id") Long id, @Valid Post entity){
        User found = store.find(id).orElseThrow(() -> new NotFoundException("User non trovatp. id= " + id));
        entity.setAuthor(found);
        postStore.save(entity);
    }
}
