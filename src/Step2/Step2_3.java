package Step2;

import java.util.Scanner;

public class Step2_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        scan.close();


        if(A%4==0){
            if(A%400==0) System.out.println("1");
            else if (A%100!=0) System.out.println("1");
            else System.out.println("0");
        }
        else
            System.out.println("0");
    }
}
