package com.code.rest.service.impl;

import com.code.rest.controller.MatchController;
import com.code.rest.model.Match;
import com.code.rest.model.Team;
import com.code.rest.model.TeamsMatch;
import com.code.rest.repository.MatchRepository;
import com.code.rest.repository.TeamRepository;
import com.code.rest.repository.TeamsMatchRepository;
import com.code.rest.response.GetResponse;
import com.code.rest.response.ScheduledMatch;
import com.code.rest.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    TeamsMatchRepository teamsMatchRepository;


    @Autowired
    TeamRepository teamRepository;

    @Autowired
    MatchRepository matchRepository;

    @Override
    public GetResponse getMatches() {
        GetResponse getResponse= new GetResponse();
        List<ScheduledMatch> scheduledMatchList= new ArrayList<ScheduledMatch>();
        List<TeamsMatch> teamsMatches=teamsMatchRepository.findAll();

        for (TeamsMatch element : teamsMatches
             ) {
            int team1Id= element.getTeam1();
            Team team1=teamRepository.getById(team1Id);
            String team1Name=team1.getName();


            int team2Id= element.getTeam2();

            Team team2=teamRepository.getById(team2Id);
            String team2Name=team2.getName();

            int matchId=element.getMatchId();
            Match match=matchRepository.getById(matchId);
            String matchDate=match.getDate();
            String matchVenue=match.getVenue();
            String matchTime=match.getTime();

            ScheduledMatch scheduledMatch= new ScheduledMatch(team1Name,team2Name,matchVenue,matchDate,matchTime);
            scheduledMatchList.add(scheduledMatch);

        }
        getResponse.setScheduledMatchList(scheduledMatchList);
        return getResponse;
    }

    @Override
    public void createMatch() {

    }
}
