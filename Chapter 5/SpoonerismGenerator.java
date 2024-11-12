import java.util.Scanner;

public class SpoonerismGenerator {

    public static void main(String[] args) {
        SpoonerismGenerator generator = new SpoonerismGenerator();
        generator.run();
    }

    
    public String getWord(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextLine().trim();
    }

    
    public int vowelIndex(String word) {
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; 
    }

    
    public void run() {
        String word1 = getWord("Word 1: ");
        String word2 = getWord("Word 2: ");

        int index1 = vowelIndex(word1);
        int index2 = vowelIndex(word2);

        
        if (index1 == -1 || index2 == -1 || index1 == 0 || index2 == 0) {
            System.out.println(word1 + " and " + word2 + " are not good words to spoonerize.");
        } else {
            
            String initialConsonant1 = word1.substring(0, index1);
            String restOfWord1 = word1.substring(index1);
            String initialConsonant2 = word2.substring(0, index2);
            String restOfWord2 = word2.substring(index2);

            
            String spoonerizedWord1 = initialConsonant2 + restOfWord1;
            String spoonerizedWord2 = initialConsonant1 + restOfWord2;

            
            System.out.println(word1 + " and " + word2 + " spoonerized are " + spoonerizedWord1 + " " + spoonerizedWord2);
        }
    }
}