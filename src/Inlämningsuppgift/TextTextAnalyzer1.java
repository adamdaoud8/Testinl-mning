package Inlämningsuppgift;

import java.util.Scanner;

public class TextTextAnalyzer1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        TextCounterLogik counter = new TextCounterLogik();

        System.out.println("Skriv in text rad för rad, skriv 'stop' för att avsluta programmet");

        while (true) {
            String input = scan.nextLine();
            if (counter.isStop(input)) {
                break;
            }
            counter.addRow(input);
            System.out.println("Du skrev:" + input);
        }
        System.out.println("du skrev totalt" + counter.getCharacterCount());

        System.out.println("du skrev totoalt" + counter.getRowCount());

        System.out.println("du skrev totalt" + counter.getWordcount());

        System.out.println("Det längsta ordet var " + counter.getTheLongestWord());

        System.out.println("program avslutas");
    }
}