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
                    start.test();
                    break;
                case "1.1":
                    start.OnePointOne();
                    break;
                case "1.2":
                    start.OnePointTwo();
                    break;
                case "1.3":
                    start.OnePointThree();
                    break;
                case "1.4":
                    start.OnePointFour();
                    break;
                case "1.5":
                    start.OnePointFive();
                    break;
                case "2.1":
                    start.TwoPointOne();
                    break;
                case "2.2":
                    start.TwoPointTwo();
                    break;
                case "2.3":
                    start.TwoPointThree();
                    break;
                case "2.4":
                    start.TwoPointFour();
                    break;
                case "2.5":
                    start.TwoPointFive();
                    break;
                case "2.6":
                    start.TwoPointSix();
                    break;
                case "2.7":
                    start.TwoPointSeven();
                    break;
                case "2.8":
                    start.TwoPointEight();
                    break;
                case "2.9":
                    start.TwoPointNine();
                    break;
                case "2.10":
                    start.TwoPointTen();
                    break;
                case "2.11":
                    //start.SecondExEleventh();
                    break;
                case "2.12":
                    //start.SecondExTwelfth();
                    break;
                case "2.13":
                    //start.SecondExThirteenth();
                    break;
                case "2.14":
                    //start.SecondExFourteen();
                    break;
                case "2.15":
                    //start.SecondExFifteen();
                    break;
                case "2.16":
                    //start.SecondExSixteen();
                    break;
                case "stop":
                    System.exit(0);
                default:
                    System.out.println("Incorrect format of exercise number");
            }
        }
    }
}
