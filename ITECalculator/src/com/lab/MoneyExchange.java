package com.lab;

public class MoneyExchange {
    private String[] methodsName = {"RToD","RToE","RToF","RToP","RToB","DToR","EToR","FToR","PToR","BToR"} ;
    static double rateRToD = 4000;
    static double rateRToE = 5000;
    static double rateRToF = 3000;
    static double rateRToB = 200;
    static double rateRToP = 100;

    /**
     * R to D
     * @param value double
     * @return R to D
     */
    public double RToD(double value){
        return  value / rateRToD;
    }

    /**
     * R to E
     * @param value double
     * @return R to E
     */
    public double RToE(double value){
        return  value / rateRToE;
    }

    /**
     * R to F
     * @param value double
     * @return R to F
     */
    public double RToF(double value){
        return value / rateRToF;
    }

    /**
     * R to P
     * @param value double
     * @return R to P
     */
    public double RToP(double value){
        return value / rateRToP;
    }

    /**
     * R to B
     * @param value double
     * @return R to B
     */
    public double RToB(double value){
        return value / rateRToB;
    }

    /**
     * D to R
     * @param value double
     * @return D To R
     */
    public double DToR(double value){
        return  value * rateRToD;
    }

    /**
     * E to R
     * @param value double
     * @return E To R
     */
    public double EToR(double value){
        return  value * rateRToE;
    }

    /**
     * F to R
     * @param value double
     * @return F To R
     */
    public double FToR(double value){
        return  value * rateRToF;
    }

    /**
     * P to R
     * @param value double
     * @return P To R
     */
    public double PToR(double value){
        return  value * rateRToP;
    }

    /**
     * B to R
     * @param value double
     * @return B To R
     */
    public double BToR(double value){
        return  value * rateRToB;
    }

    /**
     * getMethodsName
     * @return methods name array of string
     */
     public String[] getMethodsName() {
        return methodsName;
    }
}
