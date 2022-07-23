package com.code.rest.response;


import java.util.List;

public class GetResponse {

    private List<ScheduledMatch> scheduledMatchList;

    public GetResponse() {
    }

    public GetResponse(List<ScheduledMatch> scheduledMatchList) {
        this.scheduledMatchList = scheduledMatchList;
    }

    public List<ScheduledMatch> getScheduledMatchList() {
        return scheduledMatchList;
    }

    public void setScheduledMatchList(List<ScheduledMatch> scheduledMatchList) {
        this.scheduledMatchList = scheduledMatchList;
    }
}
