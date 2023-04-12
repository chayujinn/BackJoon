package Step5;

//단어의 개수

import java.util.Scanner;
import java.util.StringTokenizer;

public class Step5_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String S = scan.nextLine();

        StringTokenizer st = new StringTokenizer(S, " ");//공백을 기준으로 나눠서 토큰에 저장

        System.out.println(st.countTokens());//토큰의 개수를 반환
    }
}
