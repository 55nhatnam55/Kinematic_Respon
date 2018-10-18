/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Packages_project;

import java.util.Objects;

/**
 *
 * @author 103
 */
public class KinematicSeek {
    Character character;
    Character target;
    float maxSpeed;

    public KinematicSeek() {
    }

    public KinematicSeek(Character charater, Character target, float maxSpeed) {
        this.character = charater;
        this.target = target;
        this.maxSpeed = maxSpeed;
    }

    public Character getCharater() {
        return character;
    }

    public Character getTarget() {
        return target;
    }

    public float getMaxSpeed() {
        return maxSpeed;
    }

    public void setCharater(Character charater) {
        this.character = charater;
    }

    public void setTarget(Character target) {
        this.target = target;
    }

    public void setMaxSpeed(float maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "KinematicSeek{" + "charater=" + character + ", target=" + target + ", maxSpeed=" + maxSpeed + '}';
    }
    
    public KinematicOutput ganerateKinematicOutput(){
        Vector2D velocity = new Vector2D();
        velocity = target.getPosition().subVector2D(character.getPosition());
        velocity.normalize();
        velocity.mulConstant(maxSpeed);
        return new KinematicOutput(velocity,0);
    }
}
