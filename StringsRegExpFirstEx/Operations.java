package com.mydomainname.mainpac;

import java.io.*;
import java.util.*;

public class Operations {

    private String mainString;
    private int lengthMainStr;
    private int amountOfParagraphs;
    private String[] paragraphMass;

    public Operations(String str){
        mainString = str;
        lengthMainStr = str.length();
        paragraphMass = mainString.split("\n");
        amountOfParagraphs = paragraphMass.length;
    }

    public void sortParagraphs(){//первая операция по заданию. текст разбивается на массив состоящий из абзацев, подсчитывается кол-во предложений в каждом и заносятся в отдельный массив, после чего этот массив сортируется параллельно переставляя в методе сортировки и индексы абзацев из массива, после выводятся абзацы в нужном порядке.
        StringBuilder string = new StringBuilder();
        int[] amountSentenceInParagraphs = new int[amountOfParagraphs];
        int[] sortIndexes;
        char buf;
        for(int paragraphNum = 0; paragraphNum < amountOfParagraphs; paragraphNum++){
            int len = paragraphMass[paragraphNum].length();
            for(int ind = 0; ind < len; ind++){
                buf = paragraphMass[paragraphNum].charAt(ind);
                if (buf == 0x2E || buf == 0x21 || buf == 0x3F) { // '.' or '!' or '?'
                    amountSentenceInParagraphs[paragraphNum]++;
                }
            }
        }
        sortIndexes = sortMass(amountSentenceInParagraphs);
        for(int ind = 0; ind < amountOfParagraphs; ind++){
            string = string.append(paragraphMass[sortIndexes[ind]]);
            string = string.append("\n");
        }
        System.out.println("Text after sorting:\n" + string);
    }

    public void sortWordsInSentences(){//Вторая операция по заданию. Создается массив пердложений(см. описание к функции), Затем элементы массива состоящие из предложенией последовательно разбиваются на слова и для каждого создается массив с кол-вом букв в каждом слове, после чего массив сортируется, параллельно переставляя индексы слов и слова выводятся в нужном порядке.
        String[] sentenceMass = createMassOfSentences();
        for(int sentenceInd = 0; sentenceInd < sentenceMass.length; sentenceInd++){
            String[] wordMass = sentenceMass[sentenceInd].split(" ");
            int[] amountLetters = new int[wordMass.length];
            int[] sortIndexes;
            for(int wordInd = 0; wordInd < wordMass.length; wordInd++){
                amountLetters[wordInd] = wordMass[wordInd].length();
            }
            sortIndexes = sortMass(amountLetters);
            System.out.println("Sorting list of words in sentence:\n"+ sentenceMass[sentenceInd]);
            for(int wordInd = 0; wordInd < wordMass.length; wordInd++){
                System.out.println((wordInd+1)+". "+wordMass[sortIndexes[wordInd]]);
            }
            System.out.println();
        }
    }

    public void sortSentenceTokens(){//Третья операция по заданию. Запрашивается ввод символа и номера сортируемого предложения с последующими проверками. Создается массив предложений и массив слов из нужного предложения, после создается массив, в который заносится кол-во вхождений выбранного символа для каждого слова. После находится максимальное кол-во вхождений и создается коллекция из всех слов с таким значением вхождений, коллекция сортируется по алфавиту и записывается в итоговый массив, действие повторяется для каждого кол-ва вхождений символа в словах.
        boolean symbolFlag,numberFlag;
        String strSymbol;
        int numOfSent = -1;
        do {//проверка на ввод одиночного символа
            symbolFlag = true;
            System.out.print("Enter sorting symbol: ");
            strSymbol = inputString();
            if(strSymbol.length() != 1){
                symbolFlag = false;
                System.out.print("Invalid enter, try again. ");
            }
        }while(symbolFlag == false);
        String[] sentenceMass = createMassOfSentences();
        System.out.println("Sentences in the text with numbers: ");
        for(int sentInd = 0; sentInd < sentenceMass.length; sentInd++){
            System.out.println((sentInd+1) + ". "+sentenceMass[sentInd]);
        }
        do {//проверка на ввод числа в допустимом диапазоне
            do {//проверка на ввод числа
                numberFlag = false;
                System.out.print("Enter number of sorting sentence: ");
                String buf = inputString();
                try {
                    numOfSent = Integer.parseInt(buf);
                } catch (NumberFormatException ex) {
                    System.out.println("Recognized NumberFormatException. " + ex.getMessage() + ". Input number again.");
                    numberFlag = true;
                }
            } while (numberFlag == true);
            if(numOfSent < 1 || numOfSent > sentenceMass.length){
                numberFlag = true;
                System.out.print("Invalid number, try again. ");
            }
        }while(numberFlag == true);
        //System.out.println("Your symbol: "+ strSymbol + ". Your sentence number: " + numOfSent + ".");
        String[] tokensMass = sentenceMass[numOfSent-1].split(" ");
        int[] amountOfSymbolsInTokens = new int[tokensMass.length];
        char symbol = strSymbol.charAt(0);
        for(int tokenInd = 0; tokenInd < tokensMass.length; tokenInd++){
            for(int tokenLetterInd = 0; tokenLetterInd < tokensMass[tokenInd].length();tokenLetterInd++){
                if(tokensMass[tokenInd].charAt(tokenLetterInd) == symbol){
                    amountOfSymbolsInTokens[tokenInd]++;
                }
            }
        }
        int momentAmount = -1;
        for(int amountInd = 0; amountInd < amountOfSymbolsInTokens.length; amountInd++){
            if(momentAmount < amountOfSymbolsInTokens[amountInd]){
                momentAmount = amountOfSymbolsInTokens[amountInd];
            }
        }
        boolean beginSortFlag;
        ArrayList<String> listToSort;
        String[] sortTokensMass = new String[tokensMass.length];
        int sortTokenInd = 0;
        for(;momentAmount > 0; momentAmount--){
            beginSortFlag = false;
            listToSort = new ArrayList<>();
            for(int amountInd = 0; amountInd < amountOfSymbolsInTokens.length; amountInd++){
                if(amountOfSymbolsInTokens[amountInd] == momentAmount){
                    listToSort.add(tokensMass[amountInd]);
                    beginSortFlag = true;
                }
            }
            if(beginSortFlag == true){
                Collections.sort(listToSort);
                for (String str : listToSort) {
                    sortTokensMass[sortTokenInd] = str;
                    sortTokenInd++;
                }
            }
        }
        listToSort = new ArrayList<>();
        for(int amountInd = 0; amountInd < amountOfSymbolsInTokens.length; amountInd++){
            if(amountOfSymbolsInTokens[amountInd] == 0){
                listToSort.add(tokensMass[amountInd]);
            }
        }
        Collections.sort(listToSort);
        for (String str : listToSort) {
            sortTokensMass[sortTokenInd] = str;
            sortTokenInd++;
        }
        System.out.println("Your sort list of words in "+numOfSent+" sentence, using symbol '"+ strSymbol+"':");
        int num = 1;
        for (String str : sortTokensMass) {
            System.out.println(num + ". " + str);
            num++;
        }
        System.out.println();
    }

    public String[] createMassOfSentences(){//функция подготавливает текст к разделению на элементы массива, являющиеся предложениями текста, после чего разделяет его по знаку точки.
        StringBuilder string = new StringBuilder(mainString);
        char buf;
        boolean flagPrevSpaceOrPoint = false;
        int len = lengthMainStr;
        for(int ind = 0; ind < len; ind++){
            buf = string.charAt(ind);
            if(flagPrevSpaceOrPoint == true && buf == 0x20){
                string.deleteCharAt(ind);
                len--;
                ind--;
            }else if(!((buf >= 0x430 && buf <= 0x44F)||(buf >= 0x410 && buf <= 0x42F)||(buf >= 0x41 && buf <= 0x5A)||(buf >= 0x61 && buf <=0x7A) || buf == 0x2E || buf == 0x21 || buf == 0x3F || buf == 0x20)){
                string.deleteCharAt(ind);
                len--;
                ind--;
            }else if(buf == 0x20 || buf == 0x2E || buf == '!' || buf == '?'){
                flagPrevSpaceOrPoint = true;
            }else{
                flagPrevSpaceOrPoint = false;
            }
        }
        String bufString = new String(string);
        bufString = bufString.replaceAll("\\!",".");
        bufString = bufString.replaceAll("\\?",".");
        String[] sentenceMass = bufString.split("\\.");
        return sentenceMass;
    }

    public int[] sortMass(int[] inputMass){//принимает целочисленный массив (состоящий предполагаемо из параметров слов в нужном предложении), а возвращает упорядоченный по возрастанию параметров массив индексов этих слов.
        int dimension = inputMass.length;
        int[] sortIndexMass = new int[dimension];
        for(int ind = 0; ind < dimension; ind++){
            sortIndexMass[ind] = ind;
        }
        int buf;
        for(int i = dimension - 1; i > 0; i--){
            for(int j = 0; j < i; j++){
                if(inputMass[j] > inputMass[j+1]){
                    buf = inputMass[j+1];
                    inputMass[j+1] = inputMass[j];
                    inputMass[j] = buf;
                    buf = sortIndexMass[j+1];
                    sortIndexMass[j+1] = sortIndexMass[j];
                    sortIndexMass[j] = buf;
                }
            }
        }
        return sortIndexMass;
    }

    public String inputString() {//ввод строки с клавиатуры
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        String enterStr = null;
        try {
            enterStr = bufferedReader.readLine();
        } catch (IOException ex1) {
            System.out.println(ex1.getMessage());
        }
        return enterStr;
    }
}