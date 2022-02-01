package com.lab;
import java.lang.Math;

/**
 *JavaDoc StorageConverter class
 * @author MISA Pisatto
 * @version 1.1
 */
public class StorageConverter {
    private static final long byteRate = 1024;
    private static final String[] nodes = {"byte","kilobyte","megabyte","gigabyte","terabyte","petabyte"};

    /**
     * printAllMenu print all menu base on nodes
     */
    public void printAllMenus(){
        for (int i = 0; i < nodes.length; i++) {
            System.out.println((i+1) + ". " +capitalize(nodes[i]));
            int subMenuIndex = 1;
            for (int j = 0; j < nodes.length; j++) {
                if (i != j){
                    System.out.println("\t"+(i+1)+"."+(subMenuIndex) + " " +capitalize(nodes[i]) + " to " +nodes[j]);
                    subMenuIndex++;
                }
            }
        }
    }

    /**
     * operation convert value base on menu index
     * @param value long value to convert
     * @param mainInput user selected main menu ordered index
     * @param subInput User selected sub menu ordered index
     */
    public void operation(long value, int mainInput, int subInput){
        double result;
        int times;

        if (mainInput == subInput){
            subInput ++;
        }
        times = mainInput - subInput;

        if (times < 0){
            times *= -1;
            double rate = Math.pow(byteRate,times);
            Main.print(Double.toString(rate));
            result = value / rate;
        }else {
            double rate = Math.pow(byteRate,times);
            result = value * rate;
        }
        System.out.println("Resutl \033[0;33m" + value +"\033[0m "+ nodes[mainInput-1] + " = \033[0;32m" + result + "\033[0m " + nodes[subInput - 1]);
    }

    /**
     * capitalize text
     * @param text String
     * @return capitalize text
     */
    private static String capitalize(String text){
        String firstText = text.substring(0, 1).toUpperCase();
        String remainText = text.substring(1);
        return firstText+remainText;
    }

    /**
     * getNodes nodes getter
     * @return nodes array of string
     */
    public static String [] getNodes(){
        return nodes;
    }
}
