package com.global.league.football.globalleaguesystem.service;

import com.global.league.football.globalleaguesystem.bean.Country;
import com.global.league.football.globalleaguesystem.bean.League;
import com.global.league.football.globalleaguesystem.bean.TeamRanking;
import com.global.league.football.globalleaguesystem.feignclient.APIFootBallProxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class TeamRankingService {

    @Autowired
    private APIFootBallProxy apiFootBallProxy;

    public List<Country> getCountries(@RequestParam("action") String action, @RequestParam("APIkey") String apiKey) {
        List<Country>  countries = apiFootBallProxy.getCountries(action, apiKey);
        return countries;
    }

    public List<League> getLeague(@RequestParam("action") String action, @RequestParam("league_id") int countryId, @RequestParam("APIkey") String apiKey) {
        List<League> leagues = apiFootBallProxy.getLeague(action, countryId, apiKey);
        return leagues;
    }

    public List<TeamRanking> getTeamRanking(@RequestParam("action") String action, @RequestParam("league_id") int leagueId, @RequestParam("APIkey") String apiKey) {
        List<TeamRanking> teamRanking = apiFootBallProxy.getTeamRanking(action, leagueId, apiKey);
        return teamRanking;
    }
}
