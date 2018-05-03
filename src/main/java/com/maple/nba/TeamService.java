package com.maple.nba;

import com.maple.nba.Entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import com.maple.nba.Crawler.teamCrawler;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

@Service
public class TeamService {
    @Autowired
    private TeamRepository teamRepository;

    private teamCrawler teamCrawler = new teamCrawler(2017);

    @Transactional
    public void init() {
        teamCrawler.init();
        Iterator<HashMap> teams = teamCrawler.getTeamList().iterator();
        while (teams.hasNext()) {
            Team team = new Team(teams.next());
            //System.out.println(team.toString());
            teamRepository.save(team);
        }
    }
}
