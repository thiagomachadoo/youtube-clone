package com.programming.techie.youtubeclone.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

//definindo classe particular do mongodb
@Document(value = "User")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String fullName;
    private String emailAdress;
    private Set<String> subscribedToUsers;
    private Set<String> subscribes;
    private List<String> videoHistory;
    private Set<String> likedVideos;
    private Set<String> disLikedVideos;



}
