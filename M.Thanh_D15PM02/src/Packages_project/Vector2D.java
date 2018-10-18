/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Packages_project;

/**
 *
 * @author 103
 */
public class Vector2D {
    private float X;
    private float z;
    public float getX() {
        return X;
    }

    public void setX(float X) {
        this.X = X;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Vector2D(float X, float z) {
        this.X = X;
        this.z = z;
    }
    
    public void Vector2D(){
    }
    
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "Vector2D{" + "X=" + X + ", z=" + z + '}';
    }
    
    public void  addVector(Vector2D v1)
    {
        this.X+=v1.X;
    }
    
    public static Vector2D addVector(Vector2D v1,Vector2D v2)
    {
        return new Vector2D(v1.getX()+v2.getX(), v1.getZ()+v2.getZ());
    }
    
    public void  subVector(Vector2D v1)
    {
        this.X-=v1.X;
    }
    
    public static Vector2D subVector(Vector2D v1,Vector2D v2)
    {
        return new Vector2D(v1.getX()-v2.getX(), v1.getZ()-v2.getZ());
    }
    
    public Vector2D  mulConstant(float x)
    {
        this.setX(this.X*=this.X*x);       
        this.setZ(this.z*=this.z*x);
        return this;    
    }
       
    public double lenght()
    {
        return Math.sqrt(X*X+z*z);
    }
    
    public void normolize()
    {
        double lenght=this.lenght();
        this.X/=lenght;
        this.z/=lenght;
    }
    
    
}
