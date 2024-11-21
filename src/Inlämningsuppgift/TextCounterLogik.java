package Inlämningsuppgift;

public class TextCounterLogik {
    private int rowcount = 0;
    private int characterCount = 0;
    private String TheLongestWord = "";
    private int WordCount = 0;

    public void addRow(String row) {

        rowcount++;
        characterCount+= row.length();
        String[] words = row.split( "" );

        WordCount += words.length;

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > TheLongestWord.length()) {
                TheLongestWord = words[i];
            }
        }
    }
    public boolean isStop(String row) {
        return row.equalsIgnoreCase( "stop");
    }
    public int getRowCount() {
        return rowcount;
    }
    public int getCharacterCount() {
        return characterCount;
    }
    public String getTheLongestWord() {
        return TheLongestWord;
    }
    public int getWordcount() {
       return WordCount;
    }
}