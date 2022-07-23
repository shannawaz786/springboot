package com.code.rest.service;

import com.code.rest.response.GetResponse;
import com.code.rest.response.ScheduledMatch;

import java.util.List;

public interface MatchService {
    GetResponse getMatches();
    void createMatch();
}
