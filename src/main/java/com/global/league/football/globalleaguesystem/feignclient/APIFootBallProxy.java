package com.global.league.football.globalleaguesystem.feignclient;

import com.global.league.football.globalleaguesystem.bean.Country;
import com.global.league.football.globalleaguesystem.bean.League;
import com.global.league.football.globalleaguesystem.bean.TeamRanking;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "api-football", url = "https://apiv2.apifootball.com/")
public interface APIFootBallProxy {

    @GetMapping()
    public List<Country> getCountries(@RequestParam("action") String name, @RequestParam("APIkey") String apiKey);

    @GetMapping()
    public List<TeamRanking> getTeamRanking(@RequestParam("action") String name, @RequestParam("league_id") int countryId, @RequestParam("APIkey") String apiKey);

    @GetMapping()
    public List<League> getLeague(@RequestParam("action") String name, @RequestParam("country_id") int countryId, @RequestParam("APIkey") String apiKey);
}
