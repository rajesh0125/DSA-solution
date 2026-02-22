class Solution {
    public int lengthOfLastWord(String s) {
        String words [] = s.split(" ");
        String LastWords=words[words.length - 1];
        int length = LastWords.length();
        return length;

    }
}