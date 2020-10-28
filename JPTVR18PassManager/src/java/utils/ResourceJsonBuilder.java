/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entity.Resource;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 *
 * @author pupil
 */
public class ResourceJsonBuilder {
    public JsonObject createJsonResource(Resource r){
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("id", r.getId())
            .add("name", r.getName())
            .add("url", r.getUrl())
            .add("login", r.getLogin())
            .add("password", r.getPassword());
        return job.build();
    }
    
}
