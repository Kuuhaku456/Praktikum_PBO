import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) throws Exception {
        String stringAwal = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
        String output = getStringOutput(stringAwal);
        String output2 = output2(stringAwal);
        String output3 = output3(stringAwal);
        String output4 = output4(stringAwal);
        String output5 = output5(stringAwal);
        System.out.println(output);
        System.out.println(output2);
        System.out.println(output3);
        System.out.println(output4);
        System.out.println(output5);

    }

    public static String getStringOutput(String input) {
        int index = input.indexOf("tingkat");
        if (index != -1) {
            return input.substring(0, index).trim();
        }
        return input;
    }

    public static String output2 (String input){
        String pattern = "^(.*?) tingkat tinggi";
        Pattern regex = Pattern.compile(pattern, Pattern.CASE_INSENSITIVE);
        Matcher matcher = regex.matcher(input);

        if (matcher.find()) {
            String matchedText = matcher.group(1).trim();
            String lowercaseJavaScript = matchedText.replace("JavaScript", "javascript");
            return lowercaseJavaScript;
        }

        return input;
    }

    public static String output3 (String input){
        String pattern = "^(.*?) tingkat tinggi dan dinamis";
        String replacement = "JAVASCRIPT adalah bahasa pemrograman";
        String output = input.replaceFirst(pattern, replacement);
        return output.toUpperCase();
    }

    public static String output4 (String input){
        String[] words = input.split(" ");
        for (String word : words) {
            if (word.equalsIgnoreCase("pemrograman")) {
                return word;
            }
        }
        return "";
    }

    public static String output5 (String input){
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        boolean found = false;
        for (String word : words) {
            if (found) {
                result.append(word).append(" ");
            }
            if (word.equalsIgnoreCase("pemrograman")) {
                found = true;
            }
        }
        if (result.length() > 0) {
            result.deleteCharAt(result.length() - 1);
        }
        return result.toString();
    }
}
