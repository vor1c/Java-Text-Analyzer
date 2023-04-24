import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class AufgabeTextAnalyzer {
    public static void main(String[] args) {


        System.out.println("Name der Textdatei : ");
        String fileName;
        Scanner sc = new Scanner(System.in);
        fileName = sc.nextLine();
        char[] Case = new char[]{'a','b','c'};


        BufferedReader b;
        String line = "";
        try {
            b = new BufferedReader(new FileReader(fileName));
            line = b.readLine();
            TextAnalyzer textAnalyzer = new TextAnalyzer(line);

            while(line != null){

                textAnalyzer.setZeile(line);
                textAnalyzer.analyzeChar(line);
                textAnalyzer.analyzeCharDoubles(line);
                line = b.readLine();
            }
            //Ausgabe
            System.out.println(textAnalyzer.getFrequencyOfChar('c'));
            System.out.println("------------------------------------");
            textAnalyzer.printSingleCharacterStatistic(Case);
            System.out.println("------------------------------------");
            textAnalyzer.printSingleCharacterStatistic();
            System.out.println("------------------------------------");
            System.out.println(textAnalyzer.getFrequencyCharDouble('a'));
            System.out.println("------------------------------------");
            textAnalyzer.printDoubleCharacterStatistic(Case);
            System.out.println("------------------------------------");
            textAnalyzer.printDoubleCharacterStatistic();
            System.out.println("------------------------------------");
            textAnalyzer.printDoubleCharacterStatistic();
            System.out.println("------------------------------------");
            textAnalyzer.printSingleCharacterStatistic();
            System.out.println("------------------------------------");
            textAnalyzer.printDoubleCharacterStatistic();

            b.close();

        }catch(Exception e){

        }







    }
}
