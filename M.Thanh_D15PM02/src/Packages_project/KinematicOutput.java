/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Packages_project;

import java.util.Objects;

/**
 *
 * @author M.Thanh
 */
public class KinematicOutput {
    private Vector2D velocity;
    private float rotation;

    public KinematicOutput() {
    }

    public KinematicOutput(Vector2D velocity, float rotation) {
        this.velocity = velocity;
        this.rotation = rotation;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "KinematicOutput{" + "velocity=" + velocity + ", rotation=" + rotation + '}';
    }

    public void setVelocity(Vector2D velocity) {
        this.velocity = velocity;
    }

    public void setRotation(float rotation) {
        this.rotation = rotation;
    }

    public Vector2D getVelocity() {
        return velocity;
    }

    public float getRotation() {
        return rotation;
    }
}
