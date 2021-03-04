package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] mat = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = random.nextInt(50);
            }
        }
        int max = 0;
        int maxIn = 0;
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[i].length; j++) {
                sum += mat[i][j];
            }
            if (max < sum) {
                max = sum;
                maxIn = i;
            }
        }
        System.out.println(maxIn);
    }
}

