package Step5;


import java.util.Scanner;

//문자열을 입력으로 주면 문자열의 첫글자와 마지막 글자를 출력

//*******charAt(인덱스)사용해서 풀기-String타입의 문자열에서 해당취치에 있는 문자만을 char타입으로 변환!!!!********************
public class Step5_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();

         for(int i=0; i<a; i++){
             String b = scan.next();
             System.out.println(b.charAt(0)+""+b.charAt(b.length()-1));//중간에""해줘야 문자로 인식해서 출력/ 저거 없으면 숫자나옴(아스키코드값)
        }
    }
}
