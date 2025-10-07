package com.example.music.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Table(name = "ARTIST")
@Data
public class Artist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long artistId;
    private String name;
    private Long followers;
    @OneToMany(mappedBy = "artist")
    private List<Song> songs;
}
