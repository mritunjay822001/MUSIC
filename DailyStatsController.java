package com.example.music.controller;

import com.example.music.model.DailyStats;
import com.example.music.repository.DailyStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dailystats")
public class DailyStatsController {
    @Autowired
    private DailyStatsRepository dailyStatsRepository;

    @GetMapping
    public List<DailyStats> getAllStats() {
        return dailyStatsRepository.findAll();
    }

    @PostMapping
    public DailyStats addStats(@RequestBody DailyStats stats) {
        return dailyStatsRepository.save(stats);
    }
}
