package com.rsg.pkg1;

import java.util.Arrays;

public class SortingArrayDemo{

    public static void main(String[] args) {

        int[] a = { 3,2,1,4,6,5,8,7,9};

        System.out.println("Before sorting " + Arrays.toString(a));

        int temp = 0;
        for (int i = 0; i < a.length - 1; i++)
 {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("After  sorting " + Arrays.toString(a));
    }
}