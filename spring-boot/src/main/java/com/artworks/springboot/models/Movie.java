package com.artworks.springboot.models;



import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
//import lombok.Data;
import lombok.NoArgsConstructor;

//The annotations @Document applied to a class marks this class as a candidate for mapping to the database
@Document(collection = "movie")
@AllArgsConstructor
//generates a constructor with one parameter for every field in the class
@NoArgsConstructor
//used to generate the no-argument constructor for a class


/********* @Data **********/
//is a convenient shortcut annotation that bundles the features of @ToString , @EqualsAndHashCode , @Getter / @Setter and @RequiredArgsConstructor together: In other words, @Data generates all the boilerplate that is normally associated with simple POJOs (Plain Old Java Objects)


public class Movie {

    @Id
    private ObjectId id;
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
		this.name = name;
	}
    
    public ObjectId getAge() {
        return this.id;
    }


}