/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.ArrayList;
import java.util.Iterator;
import model.GameSettings;
import model.Player;

/**
 *
 * @author WILLIAM
 */
public class Control {

    private GameSettings gameSettings;
    private ArrayList<Player> players;

    public Control() {
        this.gameSettings = new GameSettings();
        this.players = new ArrayList<>();
    }

    public void newPlayer(String playerName) {
        Player p = new Player(playerName);
        players.add(p);
    }

    public void addScore(String playerName, int score) {
        Player p = searchPlayer(playerName); 
        p.addScore(score);
    }
    
    public void eraseScorePlayer(String playerName){
        Player p = searchPlayer(playerName); 
        p.eraseScore();
    }
    
    public Player searchPlayer(String name){
        Iterator<Player> i = players.iterator();
        while (i.hasNext()) {
            if (i.next().getName().equals(name)) {
                return i.next();
            }
        }
        return null;
    }
}
