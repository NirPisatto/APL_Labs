package com.lab;

import com.lab.set.IntersectionHelper;
import com.lab.set.SetDifferenceHelper;
import com.lab.set.UnionHelper;

import java.util.ArrayList;
import java.util.Scanner;

public class SetTheory {
    private static final String[] nodes = {"Intersection","Union", "Set different"};
    private ArrayList<Integer> setA = new ArrayList<Integer>();
    private ArrayList<Integer> setB = new ArrayList<Integer>();

    public void displayAllManus(){
        for (int i = 0; i < nodes.length; i++) {
            System.out.println(i + 1 +". "+ nodes[i]);
        }
    }

    public void createSet(){
        setA.clear();
        setB.clear();
        System.out.print("Input length of set A:");
        Scanner userInput = new Scanner(System.in);
        int setSize = 0;
        setSize = userInput.nextInt();
        for (int j = 0; j < setSize; j++) {
            System.out.print("Items ["+j+"]:");
            int item =0;
            item = userInput.nextInt();
            setA.add(item);
        }

        System.out.print("Input length of set B:");
        setSize = userInput.nextInt();
        for (int j = 0; j < setSize; j++) {
            System.out.print("Items ["+j+"]:");
            int item =0;
            item = userInput.nextInt();
            setB.add(item);
        }

        System.out.println("Set A:" + setA);
        System.out.println("Set B:" + setB);
    };



    public void union(){
        SetUnion setUnion = new SetUnion();
        createSet();

        ArrayList<Integer> ResultOfUnion;
        ResultOfUnion = setUnion.unionOperation(setA,setB);

        setUnion.display(ResultOfUnion);

    }

    public void intersection(){
        class SetIntersection implements IntersectionHelper {

            @Override
            public void display(ArrayList<Integer> set) {
                System.out.println(set);
            }

            @Override
            public ArrayList<Integer> intersectionOperation(ArrayList<Integer> setA, ArrayList<Integer> setB) {
                ArrayList<Integer> result = new ArrayList<>();
                ArrayList<Integer> ResultOfUnion = new ArrayList<>();
                SetUnion setUnion = new SetUnion();
                result.addAll(setA);
                result.addAll(setB);
                ResultOfUnion = setUnion.unionOperation(setA,setB);
                for (int resultIndex = 0; resultIndex < result.size(); resultIndex++) {
                    for (int unionIndex = 0; unionIndex < ResultOfUnion.size() ; unionIndex++) {
                        if(result.get(resultIndex) == ResultOfUnion.get(unionIndex)){
                            result.remove(resultIndex);
                            ResultOfUnion.remove(0);
                            break;
                        }
                    }
                }
                return result;
            }
        }

        createSet();
        SetIntersection setIntersection = new SetIntersection();
        ArrayList<Integer> ResultOfIntersection;
        ResultOfIntersection = setIntersection.intersectionOperation(setA,setB);
        setIntersection.display(ResultOfIntersection);

    }

    public void setDiff (){
        SetDifferenceHelper setDifferenceHelper = new SetDifferenceHelper() {
            @Override
            public ArrayList<Integer> setDifferenceOperation(ArrayList<Integer> setA, ArrayList<Integer> setB) {
                ArrayList<Integer> result = new ArrayList<>(setA);
                for (int indexB = 0; indexB <setB.size() ; indexB++) {
                    for (int indexA = 0; indexA < result.size(); indexA++) {
                        if (setB.get(indexB)==result.get(indexA)){
                            result.remove(indexA);
                            break;
                        }
                    }
                }
                return result;
            }

            @Override
            public void display(ArrayList<Integer> set) {
                System.out.println(set);
            }
        };

        createSet();
        setDifferenceHelper.display(setDifferenceHelper.setDifferenceOperation(setA,setB));
    }

    public class SetUnion implements UnionHelper {

        @Override
        public void display(ArrayList<Integer> set) {
            System.out.println(set);
        }

        @Override
        public ArrayList<Integer> unionOperation(ArrayList<Integer> setA, ArrayList<Integer> setB) {
            ArrayList<Integer> result = new ArrayList<Integer>();
            for (int setAIndex = 0;  setAIndex < setA.size(); setAIndex++) {
                for (int setBIndex = 0; setBIndex < setB.size(); setBIndex++) {
                    if (setA.get(setAIndex)==setB.get(setBIndex)){
                        result.add(setA.get(setAIndex));
                        setB.remove(setBIndex);
                        break;
                    }
                }

            }
            return result;
        }
    }

}
