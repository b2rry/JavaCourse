package com.mydomainname.helppac;

import java.math.*;
import java.io.*;

public class Exercises {

    public String InputString() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = null;

        try {
            str = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return str;
    }

    public double InputDoubleNumber() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = null;

        try {
            str = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        //int num = Integer.parseInt(str); //преобразовываем строку в число.
        double num = Double.valueOf(str);
        return num;
    }

    public int InputIntegerNumber() {
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String str = null;

        try {
            str = bufferedReader.readLine(); //читаем строку с клавиатуры
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        int num = Integer.parseInt(str); //преобразовываем строку в число.
        return num;
    }

    public void exerciseOne() {
        double a, b, c, z;
        System.out.print("Enter first number: ");
        a = InputDoubleNumber();
        System.out.print("Enter second number: ");
        b = InputDoubleNumber();
        System.out.print("Enter third number: ");
        c = InputDoubleNumber();
        z = (((a - 3) * b) / 2) + c;
        System.out.println("(((a-3)*b)/2)+c = " + z);
    }

    public void exerciseTwo() {
        double a, b, c, buf1 = 0, buf2 = 0;
        System.out.print("Enter first number: ");
        a = InputDoubleNumber();
        System.out.print("Enter second number: ");
        b = InputDoubleNumber();
        System.out.print("Enter third number: ");
        c = InputDoubleNumber();
        buf1 = Math.pow(b, 2);
        buf2 = buf1 + (4 * a * c);
        buf1 = Math.sqrt(buf2);
        buf2 = buf1 + b;
        buf1 = buf2 / (2 * a);
        buf2 = Math.pow(a, 3);
        buf2 = buf2 * c;
        buf2 = buf1 - buf2;
        buf1 = Math.pow(b, -2);
        buf2 = buf2 + buf1;
        //System.out.println(buf1+ " " +buf2);
        System.out.print("Результат вычисления выражения равняется: " + buf2 + "\n" + "При a,b,c равных ");
        System.out.println(a + ", " + b + ", " + c + " соответственно.");
    }

    public void exerciseThree() {
        double x, y, buf1 = 0, buf2 = 0;
        System.out.print("Enter first angle in radians: ");
        x = InputDoubleNumber();
        System.out.print("Enter second angle in radians: ");
        y = InputDoubleNumber();
        buf1 = Math.sin(x);
        buf1 += Math.cos(y);
        buf2 = Math.cos(x);
        buf2 -= Math.sin(y);
        buf1 /= buf2;
        buf2 = Math.tan(x * y);
        buf1 *= buf2;
        //System.out.println(buf1+ " " +buf2);
        System.out.print("Результат вычисления выражения равняется: " + buf1 + "\n" + "При x, y равных ");
        System.out.println(x + " рад., " + y + " рад. соответственно.");
    }

    public void exerciseFour() {
        double x = 456.123, buf, buf2;
        System.out.print("Enter double number in nnn.ddd format: ");
        x = InputDoubleNumber();
        buf2 = (int) x;
        buf = ((x * 1000) % 1000) + (buf2 / 1000);
        System.out.println("Исходное число: " + x + " Полученное число: " + buf);
    }

    public void exerciseFive() {
        System.out.print("Enter amount of seconds: ");
        int sec = InputIntegerNumber();
        int hh = sec / 3600;
        int mm = (sec - (hh * 3600)) / 60;
        int ss = sec - hh * 3600 - mm * 60;
        System.out.println("Time in HH:MM:SS format " + hh + ":" + mm + ":" + ss);
    }

    public void exerciseSix() {
        int x, y;
        System.out.print("Enter X coordinate: ");
        x = InputIntegerNumber();
        System.out.print("Enter Y coordinate: ");
        y = InputIntegerNumber();
        if (y > 0) System.out.println(((x <= 2) && (x >= -2) && (y <= 4)) ? true : false);
        else System.out.println(((x <= 4) && (x >= -4) && (y >= -3)) ? true : false);
    }

    public void exerciseSeven() {
        int A, B, C;
        System.out.print("Enter value of the first angle: ");
        A = InputIntegerNumber();
        System.out.print("Enter value of the second angle: ");
        B = InputIntegerNumber();
        if (A > 0 && B > 0) {
            C = 180 - A - B;
            if (C > 0) {
                System.out.print("A triangle with such angles exists.");
                if (A == 90 || B == 90 || C == 90) {
                    System.out.println(" It's right triangle.");
                } else {
                    System.out.println(" It isn't right triangle.");
                }
                System.out.print("Angles of this triangle are: " + A + "," + B + "," + C);
            } else {
                System.out.print("A triangle with such angles doesn't exist.");
            }
        } else {
            System.out.print("A triangle with such angles doesn't exist.");
        }
        System.out.print("\n");
    }

    public void exerciseEight() {
        double a, b, c, d, buf1, buf2;
        char buff1,buff2;
        System.out.println("Enter 4 numbers: ");
        System.out.print("a: ");
        a = InputDoubleNumber();
        System.out.print("b: ");
        b = InputDoubleNumber();
        System.out.print("c: ");
        c = InputDoubleNumber();
        System.out.print("d: ");
        d = InputDoubleNumber();
        if(a <= b){
            buf1 = a;
            buff1 = 'a';
        }else{
            buf1 = b;
            buff1 = 'b';
        }
        if(c <= d){
            buf2 = c;
            buff2 = 'c';
        }else{
            buf2 = d;
            buff2 = 'd';
        }
        System.out.print("Result of function:\nmax{min(a,b),min(c,d)} = ");
        if(buf1 >= buf2) System.out.println(buff1);
        System.out.println(buff2);
    }
    public void exerciseNine() {
        int x1, y1, x2, y2, x3, y3;
        double S;
        System.out.println("Enter 3 coordinates of points: ");
        System.out.print("Point A - x1: ");
        x1 = InputIntegerNumber();
        System.out.print("Point A - y1: ");
        y1 = InputIntegerNumber();
        System.out.print("Point B - x2: ");
        x2 = InputIntegerNumber();
        System.out.print("Point B - y2: ");
        y2 = InputIntegerNumber();
        System.out.print("Point C - x3: ");
        x3 = InputIntegerNumber();
        System.out.print("Point C - y3: ");
        y3 = InputIntegerNumber();
        S = 0.5*(((x1-x3)*(y2-y3))-((y1-y3)*(x2-x3)));
        if(S==0) System.out.println("Three points locate at one line.");
        else System.out.println("Three points locate like a triangle.");
    }
    public void exerciseTen(){
        double hWidth, hHigh, bWidth, bHigh, bLength, bMin, bAve, bMax, hMin, hMax;
        System.out.print("Enter width and high of a hole:\nWidth - ");
        hWidth = InputDoubleNumber();
        System.out.print("High - ");
        hHigh = InputDoubleNumber();
        System.out.print("Enter width, high and length of a brick:\nWidth - ");
        bWidth = InputDoubleNumber();
        System.out.print("High - ");
        bHigh = InputDoubleNumber();
        System.out.print("Length - ");
        bLength = InputDoubleNumber();
        //---------------
        if(bWidth <= bHigh){
            bMin = bWidth;
            bMax = bHigh;
        }else{
            bMin = bHigh;
            bMax = bWidth;
        }
        if(bLength <= bMin) {
            bAve = bMin;
            bMin = bLength;
        }else{
            if(bLength <= bMax){
                bAve = bLength;
            }else{
                bAve = bMax;
                bMax = bLength;
            }
        }
        //---------------
        if(hWidth >= hHigh){
            hMax = hWidth;
            hMin = hHigh;
        }else{
            hMax = hHigh;
            hMin = hWidth;
        }
        //---------------
        if((hMax >= bAve)&&(hMin >= bMin)) System.out.println("Size of the brick corresponds to the hole.");
        else System.out.println("Size of the brick don't correspond to the hole.");
    }
    public void exerciseEleven(){
        int res = 0;
        System.out.print("Enter any positive integer number - ");
        int number = InputIntegerNumber();
        for(int i = 1; i <= number; i++) res += i;
        System.out.println("Final number: "+res);
    }
    public void exerciseTwelve(){
        int res = 0;
        for(int i = 1; i <= 100; i++) res += (i*i);
        System.out.println("Final number: "+ res);
    }
    public void exerciseThirteen(){
        BigInteger res = new BigInteger("1");
        for(int i = 1; i <= 200; i++){
            res = res.multiply(BigInteger.valueOf(i*i));
            System.out.println("i = "+i+" Final number: "+ res);
        }
    }
    public void exerciseFourteen(){
        int x = 0;
        String endOfOut = "        ";
        for(int i = 1; i <=100; i++){
            for(int j = 1; j < 6; j++){
                if(x>=10) endOfOut = "       ";
                if(x>=100) endOfOut = "      ";
                switch (x){
                    case 8:
                        System.out.print("Символ с кодом: "+x+" - "+"BS"+"       ");
                        break;
                    case 9:
                        System.out.print("Символ с кодом: "+x+" - "+"TAB"+"      ");
                        break;
                    case 10:
                        System.out.print("Символ с кодом: "+x+" - "+"LF"+"      ");
                        break;
                    case 13:
                        System.out.print("Символ с кодом: "+x+" - "+"CR"+"      ");
                        break;
                    default:
                        System.out.print("Символ с кодом: "+x+" - "+(char)x+endOfOut);
                }
                x++;
            }
            System.out.print("\n");
        }
        System.out.print("\n");
    }
    public void exerciseFifteen(){
        int firstNum, secondNum;
        System.out.print("Enter first number - ");
        firstNum = InputIntegerNumber();
        System.out.print("Enter second number - ");
        secondNum = InputIntegerNumber();
        if(firstNum > secondNum){
            int buf = firstNum;
            firstNum = secondNum;
            secondNum = buf;
        }
        char bs = 8;
        do{
            System.out.print("Dividers for number - "+firstNum+" : ");
            boolean flag = false;
            for(int i=2;i<firstNum;i++){
                //System.out.println("Our number - "+firstNum);
                if(firstNum % i == 0){
                    System.out.print(i+", ");
                    flag = true;
                }
            }
            if(flag == false) System.out.print("dividers didn't found!");
            else System.out.print(bs+""+bs);
            System.out.print("\n");
            firstNum++;
        }while((firstNum-1) != secondNum);
        System.out.print("\n");
    }
    public void exerciseSixteen(){
        System.out.print("Enter first real number: ");
            BigDecimal num1 = new BigDecimal(InputString());
        System.out.print("Enter second real number: ");
            BigDecimal num2 = new BigDecimal(InputString());
        BigInteger highPartOne = num1.setScale(0, RoundingMode.DOWN).abs().toBigInteger();
        BigInteger lowPartOne = num1.remainder(BigDecimal.ONE).movePointRight(num1.scale()).abs().toBigInteger();
        BigInteger highPartTwo = num2.setScale(0, RoundingMode.DOWN).abs().toBigInteger();
        BigInteger lowPartTwo = num2.remainder(BigDecimal.ONE).movePointRight(num2.scale()).abs().toBigInteger();
        System.out.println("Numbers after parsing:");
        System.out.print(highPartOne +" , ");
        System.out.println(lowPartOne);
        System.out.print(highPartTwo +" , ");
        System.out.println(lowPartTwo);
        BigInteger zero = new BigInteger("0");
        String mainStr = highPartOne.toString() + highPartTwo.toString();
        if(lowPartOne.compareTo(zero) != 0){
            mainStr += lowPartOne.toString();
        }
        if(lowPartTwo.compareTo(zero) != 0){
            mainStr += lowPartTwo.toString();
        }
        int lengthOfMainStr = mainStr.length();
        String resStr = "";
        for(int i = 0; i < lengthOfMainStr; i++){
            boolean flag = false;
            int lengthOfResStr = resStr.length();
            for(int j = 0; j < lengthOfResStr; j++){
                if(mainStr.charAt(i) == resStr.charAt(j)){
                    flag = true;
                }
            }
            if(flag == false){
                resStr += mainStr.charAt(i);
            }
        }
        System.out.print("Resulting numbers: ");
        for(int i = 0; i < resStr.length(); i++)
        System.out.print(resStr.charAt(i)+" ");
        System.out.print("\n");
    }
}
