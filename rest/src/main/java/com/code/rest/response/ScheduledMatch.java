package com.code.rest.response;

public class ScheduledMatch {
    private String team1;
    private String team2;
    private String venue;
    private String date;
    private String time;

    public ScheduledMatch() {
    }

    public ScheduledMatch(String team1, String team2, String venue, String date, String time) {
        this.team1 = team1;
        this.team2 = team2;
        this.venue = venue;
        this.date = date;
        this.time = time;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {
        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
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
