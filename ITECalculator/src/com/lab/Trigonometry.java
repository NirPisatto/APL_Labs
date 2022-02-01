package com.lab;

/**
 *JavaDoc Trigonometry class
 * @author MISA Pisatto
 * @version 1.1
 */

public class Trigonometry {

    public double sin(float radian) {
        return Math.sin(radian);
    }

    public float sind(int degree){
        return (float) Math.sin(degree2radian(degree));
    }

    public double cos(float radian) {
        return Math.cos(radian);
    }

    public float cosd(int degree) {
        return (float) Math.cos(degree2radian(degree));
    }

    public double tan(float radian) {
        return Math.tan(radian);
    }

    public float tand(int degree) {
        return (float) Math.tan(degree2radian(degree));
    }

    public long square2(long x) {
        return (long)Math.pow(x, 2);
    }

    public double square2(double x) {
        return (double) Math.pow(x, 2);
    }

    public  long square3(long x) {
        return (long)Math.pow(x, 3);
    }
    public  double square3(double x) {
        return (double) Math.pow(x, 3);
    }

    public static double degree2radian(double x) {
        return Math.toRadians(x);
    }
}
