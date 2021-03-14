package day8;

public class Task1 {
    public static void main(String[] args) {



    StringBuilder sb= new StringBuilder("");
        long start =System.currentTimeMillis();
        for(int i=0 ; i<=20000; i++){
            sb.append(i).append(" ");
        }
        long after = System.currentTimeMillis();
System.out.println(sb);
        System.out.println("Время"+ (after-start));

    String s1= "";
     start =System.currentTimeMillis();

    for(int i=0; i<=20000;i++){
        s1+=i + " ";
        }
        System.out.println(s1);
    after = System.currentTimeMillis();
    System.out.println("Время"+ (after-start));

    }

}