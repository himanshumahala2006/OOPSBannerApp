import java.util.*;

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    // Map to store character patterns
    static Map<Character, CharacterPattern> patternMap = new HashMap<>();

    // Initialize patterns
    static void initializePatterns() {

        patternMap.put('O', new CharacterPattern('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        }));

        patternMap.put('P', new CharacterPattern('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        }));

        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        }));
    }

    // Display banner
    static void displayBanner(String word) {

        int height = 5;

        for (int i = 0; i < height; i++) {

            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {

                CharacterPattern cp = patternMap.get(ch);

                if (cp != null) {
                    line.append(cp.getPattern()[i]).append("  ");
                }
            }

            System.out.println(line);
        }
    }

    public static void main(String[] args) {

        initializePatterns();

        String banner = "OOPS";

        displayBanner(banner);
    }
}