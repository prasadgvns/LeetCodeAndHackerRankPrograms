package com.learning.ds.sorting;

import org.junit.Test;

import static org.junit.Assert.*;

public class SortingExamplesTest {

    @Test
    public void mergeSortTest(){
        int[] expected = {1, 1, 2, 2, 3, 4, 4, 5, 6};
        int[] arr = {3, 1, 2, 4, 1, 5, 2, 6, 4};

        assertArrayEquals(expected, SortingExamples.mergeSort(arr, 0, arr.length - 1));
    }
}
