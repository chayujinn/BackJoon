package Step3;

import java.util.Scanner;

public class Step3_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(true){
            int a = scan.nextInt();
            int b = scan.nextInt();


              if (a == 0 && b==0) {
                scan.close();// 없어도 노상관
                break;
              }
            System.out.println(a + b);
        }
    }
}
