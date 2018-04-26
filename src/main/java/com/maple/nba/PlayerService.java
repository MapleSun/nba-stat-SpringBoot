package com.maple.nba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Iterator;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    private Crawler crawler = new Crawler();

    public PlayerService() throws Exception {
    }

    @Transactional
    public void init() {
        Iterator<ArrayList> players = crawler.getPlayersList().iterator();
        while (players.hasNext()) {
            Player player1 = new Player(players.next());
            System.out.println(player1.toString());
            playerRepository.save(player1);
        }
    }

}
