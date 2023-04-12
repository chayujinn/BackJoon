package Step5;

//문자열 반복

import java.util.Scanner;

public class Step5_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();//전체 반복 횟수

        for(int i=0; i<N; i++){//문자열당 반복할 횟수,문자열 입력받기
            int num = scan.nextInt();
            String str = scan.next();

            for(int j=0; j<str.length(); j++){//문자갯수만큼 반복
                for(int k=0; k<num; k++){//num 만큼 반복
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
