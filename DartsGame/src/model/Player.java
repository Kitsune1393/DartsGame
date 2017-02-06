/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Player {
    
    private String name;
    private ArrayList<Score> score;
    
    public Player(String name) {
        this.name = name;
        score = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public void addScore(int value){
        Score s = new Score(value);
        score.add(s);
    }
    
    public void eraseScore(){
        score.clear();
    }
}
