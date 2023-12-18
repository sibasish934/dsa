public static String findMissingCharacter(String[] input) {
    int expectedCharacter = input[0].charAt(0) + 1;
    for (String character : input) {
        if (character.charAt(0) != expectedCharacter) {
            return String.valueOf((char) expectedCharacter);
        }
        expectedCharacter++;
    }
    return null;
}
