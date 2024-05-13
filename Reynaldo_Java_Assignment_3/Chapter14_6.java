
import java.util.Random;

public class Chapter14_6 {
    public static void main(String[] args) {
        
        String[] line1 = {"Any", "These", "In", "There is", "It's"};
        String[] line2 = {"man", "woman", "boy", "girl", "dog"};
        String[] line3 = {"from", "who", "that", "and", "which"};
        String[] line4 = {"ran", "jumped", "walked", "skipped", "danced"};
        String[] line5 = {"tan", "ran", "man", "plan", "can"};

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            StringBuilder limerick = new StringBuilder();

            limerick.append(capitalize(line1[random.nextInt(line1.length)])).append(" ")
                    .append(line2[random.nextInt(line2.length)]).append(" ");

            limerick.append(line2[random.nextInt(line2.length)]).append(" ")
                    .append(line4[random.nextInt(line4.length)]).append(" ")
                    .append(line5[random.nextInt(line5.length)]).append(".\n");

            limerick.append(line3[random.nextInt(line3.length)]).append(" ")
                    .append(line2[random.nextInt(line2.length)]).append(" ")
                    .append(line4[random.nextInt(line4.length)]).append(".\n");

            limerick.append(line3[random.nextInt(line3.length)]).append(" ")
                    .append(line2[random.nextInt(line2.length)]).append(" ")
                    .append(line4[random.nextInt(line4.length)]).append(".\n");

            limerick.append(capitalize(line1[random.nextInt(line1.length)])).append(" ")
                    .append(line2[random.nextInt(line2.length)]).append(" ")
                    .append(line5[random.nextInt(line5.length)]).append(".\n");

            System.out.println(limerick);
        }
    } // main

    private static String capitalize(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
} // class
