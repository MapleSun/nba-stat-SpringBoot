package com.maple.nba.Crawler;

import com.maple.nba.Entity.Team;
import com.maple.nba.TeamRepository;
import com.maple.nba.TeamService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import static org.junit.Assert.*;
@Service
public class teamCrawlerTest {
    @Autowired
    private TeamRepository teamRepository;

    teamCrawler teamCrawler = new teamCrawler(2017);
    @Test
    public void getResultSet() {
        teamCrawler.init();
        //JSONArray teams = teamCrawler.getTeamList();
        Iterator<HashMap> teams = teamCrawler.getTeamList().iterator();
        while (teams.hasNext()) {
            Team team = new Team(teams.next());
            System.out.println(team.toString());
            teamRepository.save(team);
        }
    }
}