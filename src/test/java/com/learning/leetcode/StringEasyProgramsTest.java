package com.learning.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringEasyProgramsTest {

    @Test
    public void mostWordsFoundTest(){
      String[]  sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
      assertEquals(6, StringEasyPrograms.mostWordsFound(sentences));

        String[]  sentences1 = {"please wait", "continue to fight", "continue to win"};
        assertEquals(3, StringEasyPrograms.mostWordsFound(sentences1));
    }

    @Test
    public void mostWordsFoundOptimumTest(){
        String[]  sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        assertEquals(6, StringEasyPrograms.mostWordsFoundOptimum(sentences));

        String[]  sentences1 = {"please wait", "continue to fight", "continue to win"};
        assertEquals(3, StringEasyPrograms.mostWordsFoundOptimum(sentences1));
    }

    @Test
    public void balancedStringSplitTest(){
        assertEquals(4, StringEasyPrograms.balancedStringSplit("RLRRLLRLRL"));
        assertEquals(2, StringEasyPrograms.balancedStringSplit("RLRRRLLRLL"));
        assertEquals(1, StringEasyPrograms.balancedStringSplit("LLLLRRRR"));
    }

    @Test
    public void restoreStringTest(){
        int[] indices = {4,5,6,7,0,2,1,3};
        assertEquals("leetcode", StringEasyPrograms.restoreString("codeleet", indices));

//        int[] indices1 = {0, 1, 2};
//        assertEquals("abc", StringEasyPrograms.restoreString("abc", indices1));
    }
}
