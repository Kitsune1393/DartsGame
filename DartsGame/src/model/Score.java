/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author WILLIAM
 */
public class Score {
    
    private int value;
    
    public Score() {
    }

    public Score(int value) {
        this.value = value;
    }    

    public long getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
