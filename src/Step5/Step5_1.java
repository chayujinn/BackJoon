package Step5;

//단어 S와 정수i가 주어졌을 때, S의 i번째 글자를 출력

import java.util.Scanner;

public class Step5_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] S= scan.next().split("");
        int i = scan.nextInt();

        System.out.println(S[i-1]);

    }
}
