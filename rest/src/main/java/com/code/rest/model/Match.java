package com.code.rest.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "match")
public class Match {

    @Id
    @Column(name = "match_id")
    private int matchId;

    @Column(name= "name")
    private String name;

    @Column(name= "venue")
    private String venue;

    @Column(name= "date")
    private String date;

    @Column(name= "time")
    private String time;

    public Match() {
    }

    public Match(int matchId, String name, String venue, String date, String time) {
        this.matchId = matchId;
        this.name = name;
        this.venue = venue;
        this.date = date;
        this.time = time;
    }

    public int getMatchId() {
        return matchId;
    }

    public void setMatchId(int matchId) {
        this.matchId = matchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVenue() {
        return venue;
    }

    public void setVenue(String venue) {
        this.venue = venue;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
