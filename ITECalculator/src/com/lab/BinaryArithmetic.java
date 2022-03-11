package com.lab;

public class BinaryArithmetic {

    /**
     * Binary subtraction
     * @param aValue String
     * @param bValue String
     * @return subtraction result
     */
    public  String binarySubtraction(String aValue, String bValue){
        Complement com = new Complement();
        String aString = aValue;
        String bString = com.firstComplement(bValue);
        int maxLength;
        if (aValue.length() >= bValue.length()){
            maxLength = aValue.length();
            StringBuilder left0 = new StringBuilder();
            for (int i = 0; i < aValue.length() - bValue.length(); i++) {
                left0.append("0");
            }
            bString = com.firstComplement(left0+bValue);
        }else {
            maxLength = bValue.length();
        }
        StringBuilder resultString = new StringBuilder(binaryAdd(aString,bString));
        if (resultString.length() > maxLength) return com.secondComplement(resultString.substring(1).toString());
        String isNegative = "-";

        if(com.firstComplement(resultString.toString()).contains("1")) return "-"+com.firstComplement(resultString.toString());

        return com.firstComplement(resultString.toString());
    }

    /**
     * Binary addition
     * @param aValue String
     * @param bValue String
     * @return addition result
     */
    public String binaryAdd(String aValue, String bValue ){
        String aString,bString;
        StringBuilder resultString = new StringBuilder();

        // Define which string length is bigger
        if (aValue.length() >= bValue.length()){
            aString = aValue;
            bString = bValue;

        }else {
            aString = bValue;
            bString = aValue;
        }

        int lengthBetween = aString.length() - bString.length();

        int vPass = 0;
        for (int i = aString.length() - 1; i >= 0; i--) {
            int va = Character.getNumericValue(aString.charAt(i));
            int vb;
            if (i - lengthBetween >= 0 ){
                vb = Character.getNumericValue(bString.charAt(i - lengthBetween));
            }else{
                vb = 0;
            }
            vPass = vPass + va + vb;
            resultString.append((char)vPass%2);
            vPass = vPass/2;
        }
        while (vPass > 0){
            resultString.append((char)vPass%2);
            vPass = vPass/2;
        }
        return resultString.reverse().toString();
    }

    class Complement {
        /**
         * Find the first complement
         * @param value String
         * @return the first compliment
         */
        public String firstComplement(String value){
            StringBuilder resultString = new StringBuilder();
            for (int i = 0; i < value.length(); i++) {
                resultString.append(reverseBinary(value.charAt(i)));
            }
            return resultString.toString();
        }

        /**
         * Find the first complement
         * @param value String
         * @return the first compliment
         */
        public String secondComplement(String value){
            return binaryAdd(firstComplement(value),"1");
        }

        /**
         * reverse Binary
         * @param value char
         * @return reversed of value
         */
        static private char reverseBinary(char value){
            if (value == '0') return '1';
            else return '0';
        }
    }



}
