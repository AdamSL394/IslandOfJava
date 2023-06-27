package com.artworks.springboot.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mongodb.lang.NonNull;

@Document(collection = "user")
public class User {
    
    @Id
    private ObjectId id;
    @NonNull
    private String username;
    @NonNull
    private String email;
    @NonNull
    private String password;
    private String role;

    public ObjectId getId() {
		return id;
	}
	public void setId(ObjectId id) {
		this.id = id;
	}
	public String getName() {
		return username;
	}
	public void setName(String name) {
		this.username = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
    public void setPassword(String password) {
		this.password = password;
	}

}
 