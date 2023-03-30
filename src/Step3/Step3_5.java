package Step3;

import java.util.Scanner;

public class Step3_5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();//정수값 주어짐

        for(int i=1;i<=N/4;i++){

            System.out.print("long ");
        }
        System.out.println("int");
    }
}
