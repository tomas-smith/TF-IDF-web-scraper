



import opennlp.tools.postag.POSModel;
import opennlp.tools.postag.POSSample;
import opennlp.tools.postag.POSTaggerME;
import opennlp.tools.tokenize.WhitespaceTokenizer;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.safety.Whitelist;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class HTMLParser {


    public static String parse() throws IOException{
        Document doc = Jsoup.connect(Main.Input()).get();

        String htmlString = doc.toString();
        String cleanedHTML = Jsoup.clean(htmlString, Whitelist.none());
        String normalized;
        normalized = cleanedHTML.toLowerCase();


        //fully remove HTML tags
        InputStream inputStream = new
                FileInputStream("en-pos-maxent.bin");
        POSModel model = new POSModel(inputStream);

        POSTaggerME tagger = new POSTaggerME(model);


        WhitespaceTokenizer Tokenizer = WhitespaceTokenizer.INSTANCE;
        String tokens[] = Tokenizer.tokenize(normalized);
        String[] tags = tagger.tag(tokens);
        POSSample sample = new POSSample(tokens, tags);
        System.out.println("Plaintext with POS applied: ");
        System.out.println(sample.toString());

        System.out.println("tokens: ");
        for(String token : tokens){
            System.out.println(token);
        }






        return normalized;
    }
    public static String parse2() throws IOException{
        Document doc = Jsoup.connect(Main.Input2()).get();

        String htmlString = doc.toString();
        String cleanedHTML = Jsoup.clean(htmlString, Whitelist.none());
        String normalized;
        normalized = cleanedHTML.toLowerCase();


        //fully remove HTML tags
        InputStream inputStream = new
                FileInputStream("en-pos-maxent.bin");
        POSModel model = new POSModel(inputStream);

        POSTaggerME tagger = new POSTaggerME(model);


        WhitespaceTokenizer Tokenizer = WhitespaceTokenizer.INSTANCE;
        String tokens[] = Tokenizer.tokenize(normalized);


        String[] tags = tagger.tag(tokens);
        POSSample sample = new POSSample(tokens, tags);
        System.out.println("Plaintext with POS applied: ");
        System.out.println(sample.toString());

        System.out.println("tokens: ");
        for(String token : tokens){
          System.out.println(token);
        }


        return normalized;
    }



}
