package Step2;

import java.util.Scanner;

public class Step2_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int M = scan.nextInt();
        int MM= scan.nextInt();
        int MMM=M+MM;

        if(MMM>=60 && MMM<120){
            H++;
            M=MMM-60;
            if(H>23){
                H=H-24;
            }
            System.out.println(H+" "+M);
        } else if (MMM>=120) {
            H = H+2;
            M =MMM-120;
            if(H>23){
                H=H-24;
            }
            System.out.println(H+" "+M);
        } else{
            System.out.println(H+" "+MMM);
        }
    }
}
