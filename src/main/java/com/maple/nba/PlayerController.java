package com.maple.nba;

import com.maple.nba.Entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerService playerService;


    @GetMapping(value = "/init")
    public void init() {
        playerService.init();
    }


    @GetMapping(value = "/players")
    public List<Player> playerList() {
        return playerRepository.findAll();
    }

    @GetMapping(value = "/players/{id}")
    public Player playerFindOne(@PathVariable("id") Integer id) {
        return playerRepository.getOne(id);
    }


//    @GetMapping(value = "/players/team/{team}")
//    public List<Player> playerTeam(@PathVariable("team") String team) {
//        return playerRepository.findByTeam(team);
//    }


}
