/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package it.tss.blogapp.boundary;

import it.tss.blogapp.control.CommentStore;
import it.tss.blogapp.entity.Comment;
import it.tss.blogapp.entity.Post;
import it.tss.blogapp.entity.User;
import java.util.List;
import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author tss
 */
@Path("/comments")
public class CommentsResource {

    @Inject
    CommentStore commentStore;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Comment> all() {
        return commentStore.all();

    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void create(@Valid Comment entity) {
        commentStore.save(entity);

    }

    @GET
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Comment find(@PathParam("id") Long id) {
    return commentStore.find(id).orElseThrow(()-> new NotFoundException("Comment non trovato id: " + id));
    }

    
    @PUT
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Comment update(@PathParam("id") Long id, @Valid Comment entity) {
        throw new UnsupportedOperationException();
    }

    @DELETE
    @Path("{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public void delete(@PathParam("id") Long id) {
        throw new UnsupportedOperationException();
    }

}
