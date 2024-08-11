package ImportantExercises;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Driver Class
public class DeleteDuplicate {

    public static void main(String args[]) {
        // Test Case: 1
        String str1 = "Good bye bye bye bye world bye world";
        System.out.println(removeDuplicateWords(str1));

        // Test Case: 2
        String str2 = "Ram went went to to his home";
        System.out.println(removeDuplicateWords(str2));

        // Test Case: 3
        String str3 = "Hello hello world world";
        System.out.println(removeDuplicateWords(str3));
    }

    public static String removeDuplicateWords(String input) {

        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        /*
        1. “\\b”: A word boundary. Boundaries are needed for special cases.
        For example, in “My thesis is great”, “is” won't be matched twice.
        2. “\\w+” A word character: [a-zA-Z_0-9]
        3. (?:\\W+\\1\\b)+ : This part is a non-capturing group
        (denoted by (?:…)). It’s used to group together the repeated words.
         Let’s break it down further:
         4. “\\W+” : This matches one or more non-word characters
         (anything that is not a word character).
         5. “\\1:” This is a back reference to the first capturing group (\\w+).
         It ensures that the same word that was captured earlier is repeated.
         The \\1 references the exact text captured by the first capturing group.
         6. “\\b” Another word boundary anchor to ensure that the repeated word is a whole word.
         7. “+” This quantifier ensures that the non-capturing group (?:\\W+\\1\\b) matches
         one or more times, effectively matching one or more repeated words.
         */



        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(input);


        while (m.find())
            input = input.replaceAll(m.group(), m.group(1));
        return input;
    }
}

