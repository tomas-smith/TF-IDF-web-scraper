

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static String Input(){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter desired website: ");

        String websiteName = input.nextLine();
        System.out.println("Website: " + websiteName);

        return websiteName;
    }

    public static String Input2(){
        Scanner input  = new Scanner(System.in);
        System.out.println("Enter desired website: ");

        String websiteName = input.nextLine();
        System.out.println("Website: " + websiteName);

        return websiteName;
    }


    public static void main(String[] args) throws IOException {


        String test1 = HTMLParser.parse();
        String test2 = HTMLParser.parse2();

        List<String> doc1 = Arrays.asList(test1);
        List<String> doc2 = Arrays.asList(test2);

        List<List<String>> documents = Arrays.asList(doc1, doc2);
        TFIDF calculator = new TFIDF();
        double tfidf = calculator.tfIdf(doc1, documents, "the");
        System.out.println("TF-IDF (ipsum) = " + tfidf);









    }
}
