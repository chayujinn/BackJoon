package Step3;

import java.util.Scanner;

public class Step3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        for(int j=1; j<10; j++){
            System.out.println(n+" * "+j+" = "+n*j);
        }
    }
}
