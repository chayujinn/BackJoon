package Step3;

import java.util.Scanner;

public class Step3_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N-i;j++){
                System.out.print(" ");
             }
            for(int k=1;k<=i;k++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
