package app;

public class Corrector {

    public String handleData(String[] strs) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        for (String word : strs) {
            StringBuilder correctedWord = new StringBuilder();

            for (int i = 0; i < word.length(); i++) {
                char c = word.charAt(i);
                if (c == 'b') {
                    correctedWord.append('o');
                } else {
                    correctedWord.append(c);
                }
            }

            result.append(count)
                    .append(") ")
                    .append(correctedWord)
                    .append("\n");
            count++;
        }

        return result.toString();
    }
}
