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

    public int[] InputIntegerArray(){
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        boolean flag;
        System.out.print("Enter a dimension of an array. ");
        int n = InputIntegerNumber();
        int[] resArray = new int[n];
        String enterStr = null;


        do{

            System.out.print("Enter the array with your amount of elements and dividing them with a \"/\" sign: ");
            flag = false;
            try {
                enterStr = bufferedReader.readLine(); //читаем строку с клавиатуры
            } catch (IOException ex1) {
                System.out.println(ex1.getMessage());
            }

            String[] arrayStr = enterStr.split("/");
            try {
                for (int i = 0; i < n; i++) {
                    try {
                        resArray[i] = Integer.parseInt(arrayStr[i]); //преобразовываем строку в число.
                    } catch (NumberFormatException ex2) {
                        System.out.println("Recognized NumberFormatException " + ex2.getMessage() + ". Input array again.");
                        flag = true;
                    }
                }
            }catch(ArrayIndexOutOfBoundsException ex3){
                System.out.println("Recognized ArrayIndexOutOfBoundsException. " + ex3.getMessage() + ". Input array again.");
                flag = true;
            }

        }while(flag == true);

        return resArray;
    }

    public double[] InputDoubleArray(){
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        boolean flag;
        System.out.print("Enter a dimension of an array. ");
        int n = InputIntegerNumber();
        double[] resArray = new double[n];
        String enterStr = null;


        do{

            System.out.print("Enter the array with your amount of elements and dividing them with a \"/\" sign: ");
            flag = false;
            try {
                enterStr = bufferedReader.readLine(); //читаем строку с клавиатуры
            } catch (IOException ex1) {
                System.out.println(ex1.getMessage());
            }

            String[] arrayStr = enterStr.split("/");
            try {
                for (int i = 0; i < n; i++) {
                    try {
                        resArray[i] = Double.valueOf(arrayStr[i]); //преобразовываем строку в число.
                    } catch (NumberFormatException ex2) {
                        System.out.println("Recognized NumberFormatException " + ex2.getMessage() + ". Input array again.");
                        flag = true;
                    }
                }
            }catch(ArrayIndexOutOfBoundsException ex3){
                System.out.println("Recognized ArrayIndexOutOfBoundsException. " + ex3.getMessage() + ". Input array again.");
                flag = true;
            }

        }while(flag == true);

        return resArray;
    }

    public void OutputIntegerArray(int array[]){
        int n = array.length;
        //System.out.println("Your result array: ");
        for(int i = 0; i < n; i++){
            System.out.println("Element with index ["+i+"] = "+array[i]+";");
        }
    }

    public void OutputDoubleArray(double array[]){
        int n = array.length;
        //System.out.println("Your result array: ");
        for(int i = 0; i < n; i++){
            System.out.println("Element with index ["+i+"] = "+array[i]+";");
        }
    }
    public int[][] InputIntegerMatrix(int x, int y){
        int[][] resMatrix = new int[x][y];
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                InputStream inputStream = System.in;
                Reader inputStreamReader = new InputStreamReader(inputStream);
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                boolean flag;
                int num = 0;
                String enterStr = null;
                do {
                    System.out.print("Enter ["+i+"]["+j+"] element: ");
                    flag = false;
                    try {
                        enterStr = bufferedReader.readLine(); //читаем строку с клавиатуры
                    } catch (IOException exc) {
                        System.out.println(exc.getMessage());
                    }
                    try {
                        num = Integer.parseInt(enterStr); //преобразовываем строку в число.
                    } catch (NumberFormatException ex2) {
                        System.out.println("Recognized NumberFormatException " + ex2.getMessage() + ". Input number again.");
                        flag = true;
                    }
                } while (flag == true);
                resMatrix[i][j] = num;
            }
        }
        return resMatrix;
    }
    public void OutputIntegerMatrix(int[][] matrix, int x, int y){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }
    }
    public void OutputDoubleMatrix(double[][] matrix, int x, int y){
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
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
    public double[] SortDoubleArrayAscending(double[] array){
        int dimension = array.length;
        double buf;
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
    public  int BinarySearchForIntegerSort(int array[], int number, int minPos, int maxPos){
        System.out.println("Start do-while");
        int midPos,resPos;
        do { // цикл двоичной выборки позиции самого приближенного по значению элемента к valueMain-элементу из предшествующих элементов массива. Содержится в переменной midPos
            midPos = minPos + ((maxPos - minPos + 1) / 2);
            if (number < array[midPos]) {
                maxPos = midPos - 1;
            } else if (number > array[midPos]) {
                minPos = midPos + 1;
            } else {
                break;//если valueMine-элемент равен среднему элементу из предшествующих ему
            }
            System.out.println("iter do-while." + "  midPos: " + midPos + "  minPos: " + minPos + "  maxPos: " + maxPos);
        } while (midPos != minPos && midPos != maxPos);
        System.out.println("End do-while");
        if (number > array[midPos]) { //установка результирующей позиции для valueMain-элемента
            resPos = midPos + 1;
        } else {
            resPos = midPos;
        }
        return resPos;
    }
    public  int BinarySearchForDoubleSort(double array[], double number, int minPos, int maxPos){
        //System.out.println("Start do-while");
        int midPos,resPos;
        do { // цикл двоичной выборки позиции самого приближенного по значению элемента к valueMain-элементу из предшествующих элементов массива. Содержится в переменной midPos
            midPos = minPos + ((maxPos - minPos + 1) / 2);
            if (number < array[midPos]) {
                maxPos = midPos - 1;
            } else if (number > array[midPos]) {
                minPos = midPos + 1;
            } else {
                break;//если valueMine-элемент равен среднему элементу из предшествующих ему
            }
            //System.out.println("iter do-while." + "  midPos: " + midPos + "  minPos: " + minPos + "  maxPos: " + maxPos);
        } while (midPos != minPos && midPos != maxPos);
        //System.out.println("End do-while");
        if (number > array[midPos]) { //установка результирующей позиции для valueMain-элемента
            resPos = midPos + 1;
        } else {
            resPos = midPos;
        }
        return resPos;
    }
}
