package com.code.rest.model;


import javax.persistence.*;

@Entity
@Table(name = "teams_match")
public class TeamsMatch {

    @Id
    @Column(name = "teams_match_id")
    private int matchId;

    @Column(name= "team_1")
    private int team1;


    @Column(name= "team_2")
    private int team2;


    public TeamsMatch() {
    }

    public TeamsMatch(int matchId, int team1, int team2) {
        this.matchId = matchId;
        this.team1 = team1;
        this.team2 = team2;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public int getTeam1() {
        return team1;
    }

    public void setTeam1(int team1) {
        this.team1 = team1;
    }

    public int getTeam2() {
        return team2;
    }

    public void setTeam2(int team2) {
        this.team2 = team2;
    }
}
