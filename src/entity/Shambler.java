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
public class Shambler extends Entity{
    
    public Shambler(float x, float y, int t) {
        super(x, y, true, true, true, true, Entity.AI.MOBILE);
        // TODO: Add textures
    }
    
    public Shambler(float x, float y){
        this(x, y, 0);
    }
}
