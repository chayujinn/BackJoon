package Step5;

//그대로 출력하기 hasNextLine()*************************************************

import java.util.Scanner;


public class Step5_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextLine()){//hasNextLine()은 다음에 읽을 값이 있으면 true를 리턴하고 없으면 false를 리턴
            String S = scan.nextLine();
            System.out.println(S);
        }

    }
}
