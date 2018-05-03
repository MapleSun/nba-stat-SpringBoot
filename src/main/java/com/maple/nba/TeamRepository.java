package com.maple.nba;

import com.maple.nba.Entity.Team;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<Team, Integer> {
    public Team findTeamByFullName(String teamName);
}
