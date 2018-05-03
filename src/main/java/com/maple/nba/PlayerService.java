package com.maple.nba;

import com.maple.nba.Crawler.playerCrawler;
import com.maple.nba.Entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    private playerCrawler playerCrawler;

    public PlayerService() throws Exception {
        playerCrawler = new playerCrawler();
    }

    @Transactional
    public void init() {
        Iterator<ArrayList> players = playerCrawler.getPlayersList().iterator();
        while (players.hasNext()) {
            Player player1 = new Player(players.next());
            System.out.println(player1.toString());
            playerRepository.save(player1);
        }
    }

}
