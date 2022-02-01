package com.lab;
/**
 *JavaDoc Arithmetic class
 * @author MISA Pisatto
 * @version 1.1
 */

public class Arithmetic {
    private String[] methodsName = {"sum","divide","minus","multiply","modulo"} ;
    /**
     * sum
     * @param a int
     * @param b int
     * @return result of sum
     */
    public double sum(int a,int b){
        return a + b;
    }

    /**
     * divide
     * @param a int
     * @param b int
     * @return result of divide
     */
    public double divide(int a, int b){
        return (double) a / b;
    }

    /**
     * minus
     * @param a int
     * @param b int
     * @return result of minus
     */
    public double minus(int a, int b){
        return a - b;
    }

    /**
     * multiply
     * @param a int
     * @param b int
     * @return result of multiply
     */
    public double multiply(int a, int b){
        return a * b;
    }

    /**
     * modulo
     * @param a int
     * @param b int
     * @return result of modulo
     */
    public double modulo(int a,int b){
        return a % b;
    }

    /**
     * getMethodsName
     * @return methods name array of string
     */
    public String[] getMethodsName() {
        return methodsName;
    }
}