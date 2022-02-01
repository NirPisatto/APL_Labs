package com.lab;

/**
 *JavaDoc Bitwise class
 * @author MISA Pisatto
 * @version 1.1
 */

public class Bitwise {
    private String[] methodsName = {"AND","OR","XOR","leftShift","rightShift","bitInversion"} ;

    /**
     * bitwise AND
     * @param a int
     * @param b int
     * @return result of bitwise and
     */
    public int AND(int a,int b){
        return a & b;
    }

    /**
     * bitwise OR
     * @param a int
     * @param b int
     * @return result of bitwise and
     */
    public int OR(int a,int b){
        return a | b;
    }

    /**
     * bitwise XOR
     * @param a int
     * @param b int
     * @return result of bitwise and
     */
    public int XOR(int a,int b){
        return a ^ b;
    }

    /**
     * left shift
     * @param a int value
     * @param b int bits
     * @return result of bitwise and
     */
    public int leftShift(int a,int b){
        return a << b;
    }

    /**
     * right shift
     * @param a int
     * @param b int
     * @return result of bitwise and
     */
    public int rightShift(int a,int b){
        return a >> b;
    }

    /**
     * bitwise and
     * @param a int
     * @return result of bitwise and
     */
    public int bitInversion(int a){
        return ~a;
    }

    /**
     * getMethodsName
     * @return methods name array of string
     */
    public String[] getMethodsName() {
        return methodsName;
    }
}
