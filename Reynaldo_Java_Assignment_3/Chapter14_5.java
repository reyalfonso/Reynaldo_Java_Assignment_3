
import java.util.Random;

public class Chapter14_5 {
    public static void main(String[] args) {
        String[] article = {"the", "a", "one", "some", "any"};
        String[] noun = {"boy", "girl", "dog", "town", "car"};
        String[] verb = {"drove", "jumped", "ran", "walked", "skipped"};
        String[] preposition = {"to", "from", "over", "under", "on"};

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            StringBuilder sentence = new StringBuilder();

            sentence.append(article[random.nextInt(article.length)].substring(0, 1).toUpperCase())
                    .append(article[random.nextInt(article.length)].substring(1)).append(" ")
                    .append(noun[random.nextInt(noun.length)]).append(" ")
                    .append(verb[random.nextInt(verb.length)]).append(" ")
                    .append(preposition[random.nextInt(preposition.length)]).append(" ")
                    .append(article[random.nextInt(article.length)]).append(" ")
                    .append(noun[random.nextInt(noun.length)]).append(".");

            System.out.println(sentence);
        }
    } // main
} // class
