package com.example.demo;

import lombok.Data;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by Bhuridech Sudsee.
 */
@Data
@Entity
@Table( name = "playlist")
public class Playlist {
    @Id
    @GeneratedValue
    private Long id;
    private String playlistName;
    @OneToMany
    private Set<Video> videos;

    private Playlist(){}

    public Playlist(String playListName, Set<Video> videos){
        this.playlistName = playListName;
        this.videos = videos;
    }
}
