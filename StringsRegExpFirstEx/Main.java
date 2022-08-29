package com.mydomainname.mainpac;

public class Main {//предполагается что предложения могут заканчиваться только точкой, вопросительным или восклицательным знаками.

    private static String mainStr = "Добавьте безмолвие к списку эмоциональных рисков для здоровья. И внесите эмоциональные узы в список защитных факторов. КряКря. Кря!4\nИсследования, выполнявшиеся на протяжении двух десятилетий и охватывающие более 37 тысяч человек, показывают: социальная изоляция - ощущение, что у тебя нет никого, с кем бы ты мог поделиться сокровенными чувствами или иметь близкий контакт, - удваивает шансы заболеть и умереть! Кря?2\nВ сообщении в журнале Science за 1987 год сделан вывод. Что изоляция сама по себе имеет такое же значение по коэффициенту смертности, как курение, высокое кровяное давление, высокий уровень холестерина, ожирение и недостаточная физическая нагрузка. Действительно, курение повышает риск смертности всего лишь в 1,6 раз, тогда как социальная изоляция увеличивает его в 2 раза, превращая в более серьезную угрозу для здоровья.3";

    public static void main(String[] args) {
        Operations operation = new Operations(mainStr);
        String enter;
        while (true) {
            System.out.println("1. See the original text\n2. Sort paragraphs by numbers of sentences\n3. Sort sentences in the text by length of words\n4. Sort tokens in sentence by amount of incoming symbols\n5. Stop application");
            System.out.print("Enter number of action: ");
            enter = operation.inputString();
            switch (enter) {
                case "1":
                    System.out.println(mainStr+"\n");
                    break;
                case "2":
                    operation.sortParagraphs();
                    break;
                case "3":
                    operation.sortWordsInSentences();
                    break;
                case "4":
                    operation.sortSentenceTokens();
                    break;
                case "5":
                    System.exit(0);
                default:
                    System.out.println("Incorrect format of action number, try enter again.");
            }
        }
    }
}