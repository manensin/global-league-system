package com.global.league.football.globalleaguesystem.bean;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamRanking {

    @JsonProperty("country_name")
    private String countryName;

    @JsonProperty("league_name")
    private String leagueName;

    @JsonProperty("league_id")
    private int leagueId;

    @JsonProperty("team_name")
    private String teamName;

    @JsonProperty("team_id")
    private int teamId;

    @JsonProperty("overall_league_position")
    private int overallPosition;

    @JsonProperty("overall_league_payed")
    private int overallLeaguePayed;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public int getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(int leagueId) {
        this.leagueId = leagueId;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getTeamId() {
        return teamId;
    }

    public void setTeamId(int teamId) {
        this.teamId = teamId;
    }

    public int getOverallPosition() {
        return overallPosition;
    }

    public void setOverallPosition(int overallPosition) {
        this.overallPosition = overallPosition;
    }

    public int getOverallLeaguePayed() {
        return overallLeaguePayed;
    }

    public void setOverallLeaguePayed(int overallLeaguePayed) {
        this.overallLeaguePayed = overallLeaguePayed;
    }

}
