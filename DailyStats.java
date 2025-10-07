package com.example.music.model;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDate;

@Entity
@Table(name = "DAILY_STATS")
@Data
public class DailyStats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long statId;
    private LocalDate statDate;
    private Long views;
    private Long likes;
    private Long shares;
    private Integer chartPosition;
    @ManyToOne
    @JoinColumn(name = "song_id")
    private Song song;
}
