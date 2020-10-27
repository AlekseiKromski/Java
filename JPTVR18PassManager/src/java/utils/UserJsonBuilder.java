/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import entity.Resource;
import entity.User;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 *
 * @author pupil
 */
public class UserJsonBuilder {
  public JsonObject createJsonUser(User u, String session_id, String roleUser){
        JsonObjectBuilder job = Json.createObjectBuilder();
        job.add("id", u.getId())
            .add("login", u.getLogin())
            .add("SESSION_ID", session_id)
            .add("role", roleUser);
        return job.build();

    }
     
}
