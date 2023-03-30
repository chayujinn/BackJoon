package Step3;

import java.util.Scanner;

public class Step3_4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum= scan.nextInt(); //영수증 총금액
        int n = scan.nextInt(); //물건의 종류 수

        for(int i=0; i<n; i++){

            int a = scan.nextInt();//구매물건 가격
            int b = scan.nextInt();//구매물건

            sum=sum-(a*b);
        }

        if(sum==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
