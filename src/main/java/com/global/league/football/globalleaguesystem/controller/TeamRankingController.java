package com.global.league.football.globalleaguesystem.controller;

import com.global.league.football.globalleaguesystem.bean.Country;
import com.global.league.football.globalleaguesystem.bean.League;
import com.global.league.football.globalleaguesystem.bean.TeamRanking;
import com.global.league.football.globalleaguesystem.config.PropertyConfiguration;
import com.global.league.football.globalleaguesystem.service.TeamRankingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamRankingController {

    @Autowired
    private TeamRankingService teamRankingService;

    @Autowired
    private PropertyConfiguration propertyConfiguration;


    @GetMapping("/api/service/country/{action}/")
    public List<Country> getCountries(@PathVariable String action) {

        List<Country> countries = teamRankingService.getCountries(action, propertyConfiguration.getApiKey());

        return countries;
    }

    @GetMapping("/api/service/league/{action}/country/{id}")
    public List<League> getLeague(@PathVariable String action, @PathVariable int id) {
        List<League> leagues = teamRankingService.getLeague(action, id, propertyConfiguration.getApiKey());
        return leagues;
    }

    @GetMapping("/api/service/ranking/{action}/league/{id}")
    public List<TeamRanking> getTeamRanking(@PathVariable String action, @PathVariable int id) {
        List<TeamRanking> teamRanking = teamRankingService.getTeamRanking(action, id, propertyConfiguration.getApiKey());
        return teamRanking;
    }
}
