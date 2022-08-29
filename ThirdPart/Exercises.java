package com.mydomainname.exercisepac;

import com.mydomainname.helppac.InputOutputClass;

public class Exercises {

    private InputOutputClass inputOutput = null;

    public Exercises() {
        inputOutput = new InputOutputClass();
    }

    public void test() {
        //testCode
        char[] m = new char[5];
        System.out.println(m[4] == (char)0);
    }

    public void OnePointOne() {//программа изобретает велосипед=) и перезаписывает каждый элемент массива в соответствии с нормами записи переменных
        String[] strMass = {"firstDog", "secondOrThirdDog", "catOrDog", "oneTwoThree"};
        String[] resMass = {"", "", "", ""};
        String[] helpMass = {"First", "Second", "Third", "Fourth"};
        int length;
        for (int i = 0; i < strMass.length; i++) {
            length = strMass[i].length();
            for (int j = 0; j < length; j++) {
                if (strMass[i].charAt(j) >= 0x41 && strMass[i].charAt(j) <= 0x5A) {
                    resMass[i] += "_" + (char) ((int) strMass[i].charAt(j) + 32);
                } else {
                    resMass[i] += strMass[i].charAt(j);
                }
            }
            System.out.println(helpMass[i] + " name in camelCase: " + strMass[i]);
            System.out.println(helpMass[i] + " name in snake_case: " + resMass[i]+"\n");
        }
        System.out.println("EndOfExercise\n");
    }
    public void OnePointTwo() {
        String str = "cursive word isn't capital word";
        str = str.replaceAll("word","letter");
        System.out.println(str);
        System.out.println("\nEndOfExercise\n");
    }
    public void OnePointThree() {
        String str = "2In3 4this8 9string5 6there7 1are ";
        int counter = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 0x30 && str.charAt(i) <= 0x39){
                counter++;
            }
        }
        System.out.println(str + (counter+2) + " numbers!");
        System.out.println("\nEndOfExercise\n");
    }
    public void OnePointFour() {//после нахождения цифры программа увеличивает счетчик и проверяет является ли следующий символ цифрой,если да, увеличивает индекс i до тех пор пока число не найдет в строке 'не цифру'
        String str = "28In344 4this87 798779string5 6there168518641687 51are ";
        int counter = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) >= 0x30 && str.charAt(i) <= 0x39){
                counter++;
                if(str.charAt(i+1) >= 0x30 && str.charAt(i+1) <= 0x39){
                    do{
                        i++;
                    }while(str.charAt(i+1) >= 0x30 && str.charAt(i+1) <= 0x39);
                }
            }
        }
        System.out.println(str + (counter+1) + " numbers!");
        System.out.println("\nEndOfExercise\n");
    }
    public void OnePointFive() { // программа находит ближайшие 2+ пробела и меняет их на 1 пробел во всей строке, после чего выходит из цикла и ищет 2+ пробела снова
        String str = "            Hello,  my            name    is Kirill       ";
        String buf = " ";
        boolean flag = false;
        System.out.println("Your string before transformation:");
        System.out.println(str);
        do {
            for (int i = 0; i < str.length(); i++) {
                if (i == str.length() - 1) {
                    flag = true;
                    break;
                }
                if (str.charAt(i) == 0x20 && str.charAt(i + 1) == 0x20) {
                    do {
                        buf += " ";
                        i++;
                        if (i == str.length() - 1) break;
                    } while (str.charAt(i + 1) == 0x20);
                    str = str.replaceAll(buf, " ");
                    buf = " ";
                    break;
                }
            }
        }while(flag == false);
        str = str.substring(1,str.length()-1);//получение строки из str от второго до предпоследнего символа для избавления от боковых пробелов
        System.out.println("Your string after transformation:");
        System.out.println(str);
        System.out.println("\nEndOfExercise\n");
    }
    public void TwoPointOne() {//посимвольно прогоняется строка, пока не найдет пробел, после чего подсчитывается количество пробелов и сохраняется
        String str = " Hello,         my       name             is Kirill     ";
        int counter = 0;
        int maxCount = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 0x20){
                do {
                    i++;
                    counter++;
                    if (i == str.length() - 1) break;
                }while(str.charAt(i+1) == 0x20);
                if(counter > maxCount) maxCount = counter;
                counter = 0;
            }
        }
        System.out.println("Maximum amount of spaces in string: "+maxCount);
        System.out.println("\nEndOfExercise\n");
    }
    public void TwoPointTwo() {
        String str;
        System.out.print("Enter Your string: ");
        str = inputOutput.InputString();
        StringBuilder string = new StringBuilder(str);
        int len = string.length();
        for(int i = 0; i < len; i++){
            if(string.charAt(i) == 0x61){
                i++;
                len++;
                string.insert(i,'b');
            }
        }
        System.out.println("String after transformation: "+string);
        System.out.println("\nEndOfExercise\n");
    }
    public void TwoPointThree() {
        String str;
        System.out.print("Enter Your string: ");
        str = inputOutput.InputString();
        StringBuilder string = new StringBuilder(str);
        StringBuilder helpString = new StringBuilder();
        helpString = helpString.append(string);
        helpString.reverse();
        System.out.println("Your string:    "+string);
        System.out.println("Reverse string: "+helpString);
        if (helpString.toString().equals(string.toString())) {
            System.out.println("This word is palindrome!");
        } else {
            System.out.println("This word is not palindrome.");
        }
            System.out.println("\nEndOfExercise\n");
    }
    public void TwoPointFour() {
        StringBuilder str = new StringBuilder("информатика");
        char[] mass= new char[str.length()];
        str.getChars(0,str.length()-1,mass,0);
        System.out.println("Our word: "+str);
        str = new StringBuilder();
        str = str.append(mass[7]).append(mass[3]).append(mass[4]).append(mass[7]);
        System.out.println("New word: "+str);
        System.out.println("\nEndOfExercise\n");
    }
    public void TwoPointFive() {
        String str;
        System.out.print("Enter Your string: ");
        str = inputOutput.InputString();
        int counter = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 0x61 || str.charAt(i) == 0x430){
                counter++;
            }
        }
        System.out.println("There are " + counter + " russian or english symbol(s) 'а' in your string.");
        System.out.println("\nEndOfExercise\n");
    }
    public void TwoPointSix() {
        StringBuilder str = new StringBuilder("Hello, my name is Kirill");
        int len = str.length();
        System.out.println("String before transformation: "+ str);
        for(int i = 0; i < len; i++){
            str.insert(i+1,str.charAt(i));
            i++;
            len++;
        }
        System.out.println("New string: "+ str);
        System.out.println("\nEndOfExercise\n");
    }
    public void TwoPointSeven() {//программа запрашивает строку, создает строку для результата, создает массив для встретившихся символов и два индекса для работы с этим массивом
        String str;              //создает флаг на оригинальность символа. После инициализаций и после входа в цикл for(он проходит по всей введенной пользователем строке) пропускаются
        System.out.print("Enter Your string: ");// пробелы, далее проверяется символ на оригинальность, если символ встречается первый раз, происходит его запись в итоговую строку.
        str = inputOutput.InputString();
        StringBuilder string = new StringBuilder();
        int len = str.length();
        int checkInd = 0, insertInd = 0;
        boolean origFlag = true;
        char[] mass = new char[len+1];
        for(int i = 0; i < len; i++){
            do{
                if(str.charAt(i)==0x20){
                    i++;
                    if(i == len) break;
                }
            }while(str.charAt(i)==0x20);
            if(i == len) break;
            do{
                if(str.charAt(i) == mass[checkInd]){
                    origFlag = false;
                    break;
                }
                checkInd++;
            }while(mass[checkInd] != (char)0);
            if(origFlag == true){
                string.append(str.charAt(i));
                mass[insertInd] = str.charAt(i);
                insertInd++;
            }
            checkInd = 0;
            origFlag = true;
        }
        System.out.println("String before transformations: "+ str);
        System.out.println("New string: "+ string);
        System.out.println("\nEndOfExercise\n");
    }
    public void TwoPointEight() {//программа принимает введенную пользователем строку делит ее на части массива, после чего проходится по нему и записывает индекс самого длинного элемента.
        String str;
        System.out.print("Enter Your string dividing words with spaces: ");
        str = inputOutput.InputString();
        String[] mass = str.split(" ");
        int maxInd = 0;
        for(int i = 0, maxLen = 0; i < mass.length; i++){
            if(mass[i].length() > maxLen){
                maxLen = mass[i].length();
                maxInd = i;
            }
        }
        System.out.println("Massive of strings:");
        for(int i = 0; i < mass.length; i++){
            if(i == maxInd){
                System.out.println(mass[i]+ " - Max length!");
            }else{
                System.out.println(mass[i]);
            }
        }
        System.out.println("\nEndOfExercise\n");
    }
    public void TwoPointNine() {
        String str;
        System.out.print("Enter Your string: ");
        str = inputOutput.InputString();
        int cursiveAmount = 0, capitalAmount = 0;
        char buf;
        for(int ind = 0; ind < str.length(); ind++){
            buf = str.charAt(ind);
            if(buf >= 0x61 && buf <= 0x7A){
                cursiveAmount++;
            }else if(buf >= 0x41 && buf <= 0x5A) {
                capitalAmount++;
            }
        }
        System.out.println("In your string there are "+ cursiveAmount + " cursive letters and "+ capitalAmount + " capital letters.");
        System.out.println("\nEndOfExercise\n");
    }
    public void TwoPointTen() {
        String str;
        System.out.println("Enter Your string with sentences ending with '.', '!', or '?' symbol:");
        str = inputOutput.InputString();
        int sentenceAmount = 0;
        char buf;
        for (int ind = 0; ind < str.length(); ind++) {
            buf = str.charAt(ind);
            if (buf == 0x2E || buf == 0x21 || buf == 0x3F) {
               sentenceAmount++;
            }
        }
        System.out.println("Amount of sentences in your string: "+ sentenceAmount);
        System.out.println("\nEndOfExercise\n");
    }

}