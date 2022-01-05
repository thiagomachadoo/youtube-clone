package com.programming.techie.youtubeclone.model;

//Entidade do banco

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
import java.util.Set;

//definindo classe particular do mongodb
@Document(value = "Video")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Video {

    @Id
    private String id;
    private String title;
    private String description;
    private String userId;
    private String likes;
    private Integer deslikes;
    private Set<String> tags;
    private String videoUrl;
    private VideoStatus videoStatus;
    private Integer viewCount;
    private String thumbnailUrl;
    private List<Comment> commentList;

}
