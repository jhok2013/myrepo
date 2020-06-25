package com.company;
import java.io.*;
import java.io.File;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String startDice;
        String runs;
        String increasedCount;
        String decreasedCount;
        Integer[] startindDice = {6, 8, 10, 12};
        Integer runsPerTest = 1000;
        Integer tests = 1000;
        Integer[] results;
        Integer refill;

        try {
            for (int i = 0; i < tests; i++) {
                for (Integer dice : startindDice) {
                    refill = 1;
                    TestPsi testPsi = new TestPsi(dice, runsPerTest, refill);
                    testPsi.compute();
                    results = testPsi.getResults();
                    startDice = results[0].toString();
                    runs = results[1].toString();
                    increasedCount = results[2].toString();
                    decreasedCount = results[3].toString();
                    try {
                        File file = new File("C:\\Users\\jhok2013\\Documents\\PsiTest\\data.csv");
                        FileWriter fileWriter = new FileWriter(file, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.write(startDice + "," + runs + "," + increasedCount + "," + decreasedCount + "," + refill + "\n");
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            for (int i = 0; i < tests; i++) {
                for (Integer dice : startindDice) {
                    refill = 0;
                    TestPsi testPsi = new TestPsi(dice, runsPerTest, refill);
                    testPsi.compute();
                    results = testPsi.getResults();
                    startDice = results[0].toString();
                    runs = results[1].toString();
                    increasedCount = results[2].toString();
                    decreasedCount = results[3].toString();
                    try {
                        File file = new File("C:\\Users\\jhok2013\\Documents\\PsiTest\\data.csv");
                        FileWriter fileWriter = new FileWriter(file, true);
                        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                        bufferedWriter.write(startDice + "," + runs + "," + increasedCount + "," + decreasedCount + "," + refill + "\n");
                        bufferedWriter.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

