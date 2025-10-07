package com.example.music.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "SONG")
@Data
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long songId;
    private String title;
    private LocalDate releaseDate;
    private String genre;
    private Long totalViews;
    @ManyToOne
    @JoinColumn(name = "artist_id")
    private Artist artist;
    @OneToMany(mappedBy = "song")
    private List<DailyStats> dailyStats;
}
