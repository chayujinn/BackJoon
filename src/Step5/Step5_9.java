package Step5;
//상수 거꾸로 해서 값 비교

import java.util.Scanner;

public class Step5_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num1 = scan.next();
        String num2 = scan.next();

        StringBuffer sb1 = new StringBuffer(num1);
        int re1 = Integer.parseInt(sb1.reverse().toString());

        StringBuffer sb2 = new StringBuffer(num2);
        int re2 = Integer.parseInt(sb2.reverse().toString());


        System.out.println(re1>re2?re1:re2);
    }
}
