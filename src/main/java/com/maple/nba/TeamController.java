package com.maple.nba;

import com.maple.nba.Entity.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TeamController {
    @Autowired
    private TeamRepository teamRepository;

    @Autowired
    private TeamService teamService;

    @GetMapping(path = "/teams/init")
    public void init() {
        teamService.init();
    }

    @GetMapping(path = "/teams")
    public List<Team> getAllTeam() {
        return teamRepository.findAll();
    }

    @GetMapping(path = "/teams/{teamId}")
    public Team getTeamById(@PathVariable("teamId") Integer teamId) {
        return teamRepository.getOne(teamId);
    }

    @GetMapping(path = "/teams/{teamName}")
    public Team getTeamById(@PathVariable("teamName") String teamName) {
        return teamRepository.findTeamByFullName(teamName);
    }


}
