package com.example.demo;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Bhuridech Sudsee.
 */
@Data
@Entity
@Table(name = "comment")
public class Comment {
    @Id
    @GeneratedValue
    private Long id;

    private String content;

    @ManyToOne
    @JoinColumn(name = "video_id")
    private Video video;

    private Comment(){}

    public Comment(String content, Video video){
        this.content = content;
        this.video = video;
    }
}
