/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entity;

/**
 *
 * @author Allister
 */
public class Player extends Entity{
    int weapon;     // TODO: define lookup table for weapons
    
    public Player(float x, float y, String[] filenames) {
        super(x, y, true, false, false, true, filenames, AI.STATIC);
    }
}
