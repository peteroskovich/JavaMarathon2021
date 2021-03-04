package day4;

import java.util.Random;
import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[100];
        for (int i=0; i<100; i++){

            int d = random.nextInt(10000);
            num[i]=d;
        }
        System.out.println(Arrays.toString(num));
        int res=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]% 10==0){
                res++;
            }
        }
        System.out.println("количество элементов массива, оканчивающихся на 0: "+ res);
        int sum=0;
        for (int i = 0; i < num.length; i++){
            if (num[i]% 10==0){
                sum=sum+ num[i];
            }
        }
        System.out.println("сумма элементов массива, оканчивающихся на 0: "+sum);
        int min= 0;
        for (int element: num) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("наименьший элемент массива: "+min);
        int max= 0;
        for (int element: num) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("наибольший элемент массива "+max);
    }
}
