package com.learning.leetcode;

public class StringEasyPrograms {

    public static int mostWordsFound(String[] sentences) {
        int maxCount = Integer.MIN_VALUE;

        for(String sentence : sentences){
            int i = 0;
            int count = 1;
            while(i < sentence.length()){
                if(sentence.charAt(i) == ' '){
                    count++;
                }
                i++;
            }

            if(maxCount < count){
                maxCount = count;
            }
        }
        return maxCount;
    }

    public static int mostWordsFoundOptimum(String[] sentences){
        int maxNumberOfWords = Integer.MIN_VALUE;

        for(String sentence: sentences){
            int numberOfWords = sentence.split(" ").length;

            if(maxNumberOfWords < numberOfWords){
                maxNumberOfWords = numberOfWords;
            }
        }

        return maxNumberOfWords;
    }

    public static int balancedStringSplit(String s) {
        int ans = 0, l = 0;
        for (char c : s.toCharArray()) {
            if (c == 'L') {
                ++l;
            } else {
                --l;
            }
            if (l == 0) {
                ++ans;
            }
        }
        return ans;
    }

    public static String restoreString(String s, int[] indices) {
        int n = s.length();
        char[] ans = new char[n];
        for (int i = 0; i < n; ++i) {
            ans[indices[i]] = s.charAt(i);
        }
        return String.valueOf(ans);
    }
}
