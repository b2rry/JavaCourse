package com.mydomainname.helppac;

import java.io.*;

public class InputOutputClass {
    public int InputIntegerNumber() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        boolean flag;
        int num = 0;
        String enterStr = null;

        do {

            System.out.print("Enter integer number: ");
            flag = false;
            try {
                enterStr = bufferedReader.readLine(); //читаем строку с клавиатуры
            } catch (IOException ex1) {
                System.out.println(ex1.getMessage());
            }

            try {
                num = Integer.parseInt(enterStr); //преобразовываем строку в число.
            } catch (NumberFormatException ex2) {
                System.out.println("Recognized NumberFormatException " + ex2.getMessage() + ". Input number again.");
                flag = true;
            }

        } while (flag == true);

        //System.out.println("Ваше число: " + num);
        return num;
    }

    public double InputDoubleNumber() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        boolean flag;
        double num = 0.0;
        String enterStr = null;

        do {

            System.out.print("Enter double number: ");
            flag = false;
            try {
                enterStr = bufferedReader.readLine(); //читаем строку с клавиатуры
            } catch (IOException ex1) {
                System.out.println(ex1.getMessage());
            }

            try {
                num = Double.valueOf(enterStr); //преобразовываем строку в число.
            } catch (NumberFormatException ex2) {
                System.out.println("Recognized NumberFormatException " + ex2.getMessage() + ". Input number again.");
                flag = true;
            }

        } while (flag == true);

        //System.out.println("Ваше число: " + num);
        return num;
    }

    public String InputString() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String enterStr = null;

        try {
            enterStr = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException ex1) {
            System.out.println(ex1.getMessage());
        }

        return enterStr;
    }

    public int[] SortIntegerArrayAscending(int[] array){
        int dimension = array.length;
        int buf;
        for(int i = dimension - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] > array[j+1]){
                    buf = array[j+1];
                    array[j+1] = array[j];
                    array[j] = buf;
                }
            }
        }
        return array;
    }
    public int[] SortIntegerArrayDescending(int[] array){
        int dimension = array.length;
        int buf;
        for(int i = dimension - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(array[j] < array[j+1]){
                    buf = array[j+1];
                    array[j+1] = array[j];
                    array[j] = buf;
                }
            }
        }
        return array;
    }
}
