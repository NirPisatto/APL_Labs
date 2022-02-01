package com.lab;

/**
 *JavaDoc NumberSystemConversion class
 * @author MISA Pisatto
 * @version 1.1
 */
public class NumberSystemConversion {
    private String[][] methodsName = {{"Binary","Octal","Decimal","Hexadecimal"},{"2","8","10","16"}};

    /**
     * decimalToBase
     * @param decimalValue
     * @param baseNumber
     * @return converted string of decimal number
     */
    private static String decimalToBase(long decimalValue,long baseNumber){
        String result = "";
        while (decimalValue > 0){
            result += numberToText(decimalValue % baseNumber);
            decimalValue /= baseNumber;
        }
        return reverse(result);
    }


    /**
     * validator
     * @param value which want to validate
     * @param baseNumber
     * @return status true or false
     */
    public boolean baseNumberValidator(String value,long baseNumber){
        for (int i = 0; i < value.length(); i++) {
            if (!((int)value.charAt(i) > 47 && (int)value.charAt(i) < (48 + baseNumber))) return true;
        }
        return true;
    }


    /**
     * converter int to char
     * @param number
     * @return char of number
     */
    private static char numberToText(long number){
        if (number >= 10){
            return (char) (number - 10 + 65);
        }
        return (char) (number + 48);
    }

    /**
     * converter char to int
     * @param text char
     * @return int of text
     */
    private static int textToNumber(char text){
        if ((int)text >= 65){
            return ((int)text - 65 + 10);
        }
        return (int)text - 48;
    }

    /**
     * reverse string
     * @param value
     * @return reversed string
     */
    private static String reverse(String value){
        String result = "";
        for (int i = value.length() - 1; i >= 0 ; i--) {
            result += value.charAt(i);
        }
        return result;
    }

    /**
     * getMethodsName
     * @param isName return as names or base numbers
     * @return methods name array of string
     */
    public String[] getMethodsName(Boolean isName) {
        if (isName) return methodsName[0];
        return methodsName[1];
    }

    /**
     * getBaseNumberByMenuIndex
     * @param  index int index of method
     * @return base number by index of methodsName
     */
    public int getBaseNumberByMenuIndex(int index) {
        return Integer.parseInt(methodsName[1][index]);
    }

    /**
     * getMenuIndexs
     * @param mainUserInput main menu number
     * @param subUserInput sub manu number
     * @return array of menus index
     */
    public int[] getMenuIndexs (int mainUserInput, int subUserInput){
        if (mainUserInput == subUserInput) return new int[]{mainUserInput - 1 ,subUserInput};
        else if (mainUserInput < subUserInput) return new int[]{mainUserInput - 1,subUserInput};
        return new int[]{mainUserInput - 1,subUserInput - 1};
    }

    /**
     * print all menus base on index of menu
     * @param mainMenu main menu number
     * @return void
     */
    public void printAllMenus (int[] mainMenu){
        for (int i = 0; i < mainMenu.length; i++) {
            System.out.println(i + 1 +". "+methodsName[0][mainMenu[i]]);
            int subIndex = 1;
            for (int j = 0; j < methodsName[0].length; j++) {
                if (j != mainMenu[i]){
                    System.out.println("\t"+ subIndex +". "+methodsName[0][j]);
                    subIndex++;
                }
            }
        }
    }

    /**
     * decimalToBase
     * @param baseValue
     * @param currentBaseNumber
     * @param nextBaseNumber
     * @return converted string of currentBaseNumber to nextBaseNumber
     */
    public String baseToBase (String baseValue,long currentBaseNumber,long nextBaseNumber){
        long decimalResultAsLong = 0;
        int powerTime = 0;
        for (int index = baseValue.length() - 1; index >= 0; index--) {
            decimalResultAsLong += (long) ((textToNumber(baseValue.charAt(index))) * Math.pow(currentBaseNumber,powerTime));
            powerTime++;
        }
        return decimalToBase(decimalResultAsLong,nextBaseNumber);
    }
}
