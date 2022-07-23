package com.code.rest.repository;

import com.code.rest.model.Match;
import com.code.rest.model.TeamsMatch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamsMatchRepository extends JpaRepository<TeamsMatch,Integer> {
}
