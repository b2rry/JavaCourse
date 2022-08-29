package com.mydomainname.mainpac;

import com.mydomainname.helppac.InputOutputClass;
import com.mydomainname.exercisepac.Exercises;

public class Main {
    public static void main(String[] args) {
        InputOutputClass input = new InputOutputClass();
        Exercises start = new Exercises();
        while (true) {
            System.out.println("Enter number of exercise in format: Chapter.Number (for example: 1.1)\nOr enter \"stop\" and stop the program.");
            String exNum = input.InputString();
            switch (exNum) {
                case "test":
                    //start.test();
                    break;
                case "1.1":
                    start.FirstExFirst();
                    break;
                case "1.2":
                    start.FirstExSecond();
                    break;
                case "1.3":
                    start.FirstExThird();
                    break;
                case "1.4":
                    start.FirstExFourth();
                    break;
                case "1.5":
                    start.FirstExFifth();
                    break;
                case "1.6":
                    start.FirstExSixth();
                    break;
                case "1.7":
                    start.FirstExSeventh();
                    break;
                case "1.8":
                    start.FirstExEighth();
                    break;
                case "1.9":
                    start.FirstExNinth();
                    break;
                case "1.10":
                    start.FirstExTenth();
                    break;
                case "2.1":
                    start.SecondExFirst();
                    break;
                case "2.2":
                    start.SecondExSecond();
                    break;
                case "2.3":
                    start.SecondExThird();
                    break;
                case "2.4":
                    start.SecondExFourth();
                    break;
                case "2.5":
                    start.SecondExFifth();
                    break;
                case "2.6":
                    start.SecondExSixth();
                    break;
                case "2.7":
                    start.SecondExSeventh();
                    break;
                case "2.8":
                    start.SecondExEighth();
                    break;
                case "2.9":
                    start.SecondExNinth();
                    break;
                case "2.10":
                    start.SecondExTenth();
                    break;
                case "2.11":
                    start.SecondExEleventh();
                    break;
                case "2.12":
                    start.SecondExTwelfth();
                    break;
                case "2.13":
                    start.SecondExThirteenth();
                    break;
                case "2.14":
                    start.SecondExFourteen();
                    break;
                case "2.15":
                    start.SecondExFifteen();
                    break;
                case "2.16":
                    start.SecondExSixteen();
                    break;
                case "3.1":
                    start.ThirdExFirst();
                    break;
                case "3.2":
                    start.ThirdExSecond();
                    break;
                case "3.3":
                    start.ThirdExThird();
                    break;
                case "3.4":
                    start.ThirdExFourth();
                    break;
                case "3.5":
                    start.ThirdExFifth();
                    break;
                case "3.7":
                    start.ThirdExSeventh();
                    break;
                case "stop":
                    System.exit(0);
                default:
                    System.out.println("Incorrect format of exercise number");
            }
        }
    }
}
