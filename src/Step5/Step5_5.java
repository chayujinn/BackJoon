package Step5;
//숫자의 합
//String 타입으로 입력된 값을 a.charAt(숫자)를 이용해 char 타입으로 변환

import java.util.Scanner;

public class Step5_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String a =scan.next();
        int sum =0;

        for(int i=0; i<n; i++){
            sum+=a.charAt(i)-48;//a.charAt()는 그 자리의 아스키코드 값을 반환 하기 때문에 -48 또는 -'0'을 해줘야함!!!!!!!!!!!
        }
        System.out.println(sum);
    }


}
