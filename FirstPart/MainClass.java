package com.mydomainname.mainpac;

import com.mydomainname.helppac.Exercises;

public class MainClass {
        public static void main(String[] args) {
            Exercises start = new Exercises();
            while (true) {
                System.out.println("Enter number of program in format: /chapter.number/\nOr enter \"stop\" and stop the program.");
                String num = start.InputString();
                switch (num) {
                    case "1.1":
                        start.exerciseOne();
                        break;
                    case "1.2":
                        start.exerciseTwo();
                        break;
                    case "1.3":
                        start.exerciseThree();
                        break;
                    case "1.4":
                        start.exerciseFour();
                        break;
                    case "1.5":
                        start.exerciseFive();
                        break;
                    case "1.6":
                        start.exerciseSix();
                        break;
                    case "2.1":
                        start.exerciseSeven();
                        break;
                    case "2.2":
                        start.exerciseEight();
                        break;
                    case "2.3":
                        start.exerciseNine();
                        break;
                    case "2.4":
                        start.exerciseTen();
                        break;
                    case "3.1":
                        start.exerciseEleven();
                        break;
                    case "3.3":
                        start.exerciseTwelve();
                        break;
                    case "3.4":
                        start.exerciseThirteen();
                        break;
                    case "3.6":
                        start.exerciseFourteen();
                        break;
                    case "3.7":
                        start.exerciseFifteen();
                        break;
                    case "3.8":
                        start.exerciseSixteen();
                        break;
                    case "stop":
                        System.exit(0);
                    default:
                        System.out.println("Incorrect format of exercise number\nor it's 2.5, 3.2, 3.5 number of exercise\nthat was not very interesting for me, sorry =)");
                }
            }
        }
}
