package com.example.demo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Set;

/**
 * Created by Bhuridech Sudsee.
 */
@Data
@Entity
@Table(name = "video")
public class Video {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    @Size(min = 4,max = 10)
    private String code;
    private String title;
    private String url;

    @OneToMany(mappedBy = "video", cascade = CascadeType.ALL)
    private Set<Comment> comments;

    private Video() {}

    public Video( String code,String title, String url){
        this.code = code;
        this.title = title;
        this.url = url;
    }
}
