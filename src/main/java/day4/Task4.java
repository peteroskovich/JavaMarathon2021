package day4;

import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] num = new int[100];
        for (int i=0; i<100; i++){
            int d = random.nextInt(10000);
            num[i]=d;
        }
int max=0;
        int ind=0;
        for(int i= 0; i<num.length -2; i++){
            int sum=0;
            for (int j=i; j< i+3; j++){
                sum += num[j];
          }
            if (sum>max){
                max=sum;
                ind=i;
            }
                 }
        System.out.println(max);
        System.out.println(ind);

    }
}
