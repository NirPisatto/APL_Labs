package com.lab;

import java.lang.reflect.Method;
import java.util.Scanner;
import java.lang.Thread;
/**
 *JavaDoc Bitwise class
 * @author MISA Pisatto
 * @version 1.1
 */
public class Main {
    static String[] menus = {"Arithmetic","Trigonometry","Bitwise","Money exchange", "Storage converter", "Number system conversion" ,"Exit"};

    public static void main(String[] args) {


        int userInputed;
        boolean isSystemUp = true;
        Scanner userInput = new Scanner(System.in);


        while (isSystemUp){
            printMenus(menus);

            System.out.print("Input menu > ");

            userInputed = userInput.nextInt();
//            userInputed = 6;
            print("----------------------");
            print(menus[userInputed - 1]);

            if (userInputed == 1){
                // arithmetic

                Arithmetic arithmetic = new Arithmetic();
                try {
                    print("A (+ / - * %) B");
                    System.out.print("Input value A > ");
                    int userInputA = userInput.nextInt();
                    System.out.print("Input value B > ");
                    int userInputB = userInput.nextInt();

                    for (int i = 0; i < arithmetic.getMethodsName().length; i++) {
                        Method executeMethod = Arithmetic.class.getMethod(arithmetic.getMethodsName()[i], int.class, int.class);
                        double result = (double)executeMethod.invoke(arithmetic,userInputA,userInputB);
                        System.out.println(" "+userInputA +" "+arithmetic.getMethodsName()[i]+" by "+userInputB + " = "+ result);
                    }
                }catch (Exception e){
                    print("\033[0;31mError: Invalided values or values contain characters. \033[0m");
                }

            }else if (userInputed == 2){
                // Trigonometry

                Trigonometry trigonometry = new Trigonometry();

                System.out.print("Input value > ");
                int userInputA = userInput.nextInt();

                System.out.println("Sin("+userInputA+") = " + trigonometry.sin(userInputA));
                System.out.println("Sin("+userInputA+" degree) = " + trigonometry.sind(userInputA));
                System.out.println("Cos("+userInputA+") = " + trigonometry.cos(userInputA));
                System.out.println("Cos("+userInputA+" degree) = " + trigonometry.cosd(userInputA));
                System.out.println("Tan("+userInputA+") = " + trigonometry.tan(userInputA));
                System.out.println("Tan("+userInputA+" degree) = " + trigonometry.tand(userInputA));
                System.out.println("Square2("+userInputA+") = " + trigonometry.square2(userInputA));
                System.out.println("Square3("+userInputA+") = " + trigonometry.square3(userInputA));

            }else if (userInputed == 3){
                // Bit wise
                Bitwise bitwise = new Bitwise();
                try {
                    print("A bit wise operation of B or just A");
                    System.out.print("Input value A > ");
                    int userInputA = userInput.nextInt();
                    System.out.print("Input value B > ");
                    int userInputB = userInput.nextInt();

                    for (int i = 0; i < bitwise.getMethodsName().length -1; i++) {
                        Method executeMethod = Bitwise.class.getMethod(bitwise.getMethodsName()[i], int.class, int.class);
                        int result = (int)executeMethod.invoke(bitwise,userInputA,userInputB);
                        System.out.println(" "+userInputA +" "+bitwise.getMethodsName()[i].toUpperCase()+" by "+userInputB + " = "+ result);
                    }
                    System.out.println(" "+userInputA +" "+bitwise.getMethodsName()[bitwise.getMethodsName().length-1].toUpperCase()+" = "+ bitwise.bitInversion(userInputA));

                }catch (Exception e){
                    System.out.println(e);
                    print("\033[0;31mError: Invalided values or values contain characters. \033[0m");
                }

            }else if (userInputed == 4){
                // Money exchange

                MoneyExchange moneyExchange = new MoneyExchange();

                try {
                    System.out.print("Input value > ");
                    int userInputA = userInput.nextInt();

                    for (int i = 0; i < moneyExchange.getMethodsName().length; i++) {
                        Method executeMethod = MoneyExchange.class.getMethod(moneyExchange.getMethodsName()[i], double.class);
                        double result = (double)executeMethod.invoke(moneyExchange,userInputA);
                        System.out.println(" "+userInputA +" "+moneyExchange.getMethodsName()[i] + " = "+ result);
                    }

                }catch (Exception e){
                    System.out.println(e);
                    print("\033[0;31mError: Invalided values or values contain characters. \033[0m");
                }

            }else if (userInputed == 5){
                // storage converter

                StorageConverter storageConverter = new StorageConverter();
                storageConverter.printAllMenus();

                System.out.print("Input main menu > ");
                int userInputMainMenu = userInput.nextInt();
                System.out.print("Input sub menu > ");
                int userInputSubMenu = userInput.nextInt();
                System.out.print("Input value > ");
                int userInputValue = userInput.nextInt();

                storageConverter.operation(userInputValue,userInputMainMenu,userInputSubMenu);
            }else if (userInputed == 6){
                // number system conversion

                NumberSystemConversion OBJ = new NumberSystemConversion();

                OBJ.printAllMenus(new int[]{0,1,2,3,4});

                System.out.print("Input main menu > ");
                int userInputMainMenu = userInput.nextInt();
                System.out.print("Input sub menu > ");
                int userInputSubMenu = userInput.nextInt();

                int[] selectedMenuIndex = OBJ.getMenuIndexs(userInputMainMenu,userInputSubMenu);

                int currentBaseMenuIndex = selectedMenuIndex[0];
                int currentBaseNumber = OBJ.getBaseNumberByMenuIndex(currentBaseMenuIndex);

                int toBaseMenuIndex = selectedMenuIndex[1];
                int toBaseNumber = OBJ.getBaseNumberByMenuIndex(toBaseMenuIndex);

                System.out.print("Input value in "+ OBJ.getMethodsName(true)[currentBaseMenuIndex].toLowerCase() +" base > ");
                String userInputedValue = userInput.next();

                if (OBJ.baseNumberValidator(userInputedValue,currentBaseNumber)){
                    System.out.print(userInputedValue + " " + OBJ.getMethodsName(true)[currentBaseMenuIndex].toLowerCase());
                    System.out.print( "("+currentBaseNumber+") = ");
                    System.out.print(OBJ.baseToBase(userInputedValue, currentBaseNumber, toBaseNumber));
                    System.out.print(" " + OBJ.getMethodsName(true)[toBaseMenuIndex].toLowerCase());
                    System.out.print( "("+toBaseNumber+")\n\n\n\n");
                }else {
                    System.out.println("Invalid "+OBJ.getMethodsName(true)[currentBaseMenuIndex]+ " base number values.");
                }
            }
            else{
                isSystemUp = false;
            }
        }
    }

    /**
     * print
     * @param value String [text that want to print]
     */
    static void print(String value){
        System.out.println(value);
    }

    /**
     * printMenus
     * @param _menus Array of string [menus that want to print]
     */
    static void printMenus (String[] _menus){
        print("Menu:");
        int number = 0;
        for (String menu : _menus){
            number++;
            print(number+". "+ menu);
        }
    }

}
