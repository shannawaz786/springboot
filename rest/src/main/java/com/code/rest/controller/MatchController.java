package com.code.rest.controller;

import com.code.rest.model.Match;
import com.code.rest.response.GetResponse;
import com.code.rest.response.ScheduledMatch;
import com.code.rest.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/matchScheduler")
public class MatchController {

    @Autowired
    MatchService matchService;

    @GetMapping(value = "/getScheduledMatches", produces = "application/json")
    ResponseEntity<GetResponse> getScheduledMatch(){
        GetResponse response=matchService.getMatches();
        return ResponseEntity.ok().body(response);
    }
}
