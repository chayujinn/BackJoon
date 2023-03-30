package Step2;

import java.util.Scanner;

public class Step2_6_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int M = scan.nextInt();
        int MM = scan.nextInt();

        int a = H*60+M+MM;
        H=a/60;
        M=a%60;

        if(H>=24){
            H=H-24;
        }
        System.out.println(H+" "+M);

    }
}
