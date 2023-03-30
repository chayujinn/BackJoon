package Step2;

import java.util.Scanner;

public class Step2_1 {
    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int A,B;

    A=scan.nextInt();
    B=scan.nextInt();

    if(A>B){
        System.out.println(">");
    }
    else if (A<B) {
        System.out.println("<");

    }
    else
        System.out.println("==");


    }
}
