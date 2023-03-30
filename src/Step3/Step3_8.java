package Step3;

import java.util.Scanner;

public class Step3_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for(int i=1;i<=N;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int result = a+b;
            System.out.println("Case #"+i+": "+a+" + "+b+" = "+result);

        }
    }
}
