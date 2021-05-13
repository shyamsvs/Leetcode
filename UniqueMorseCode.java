class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        if (words.length == 0){
            return 0;
        }
        String[] morseCode = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String[] answers = new String[words.length];
        int index = 0;
        for (String word : words) {
            StringBuilder morseCodeString = new StringBuilder();
            for (int j = 0; j < word.length(); j++) {
                morseCodeString.append(morseCode[(int) word.charAt(j) - 97]);
            }
            answers[index++] = morseCodeString.toString();
        }
        HashSet<String> hashSet= new HashSet<>();
        int uniqueCount = 0;
        //System.out.println(Arrays.toString(answers));
        for (String answer : answers){
            //System.out.println(answer);
            if(!hashSet.contains(answer)){
                hashSet.add(answer);
                uniqueCount++;
            }
        }
        return uniqueCount;
    }
}
