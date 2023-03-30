//클래스의 기본 문법

import java.math.BigDecimal;
import java.util.Scanner;

public class SimpleCalculatorTest {
    public static void main(String[] args) {

        //외부 입력을 받을 수 있는 Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        //첫번째 숫자 입력
        System.out.println("첫 번째 숫자를 입력하세요!");
        String str1 = scan.nextLine();

        //사칙연산자 입력
        System.out.println("사칙연산자를 입력하세요!");
        String op = scan.nextLine();

        //두 번째 숫자 입력
        System.out.println("두 번째 숫자를 입력하세요!");
        String str2 = scan.nextLine();

        //입력받은 첫 번째, 두 번째 문자를 숫자형으로 변환
        /*int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int result;
        */
        BigDecimal num1 = new BigDecimal(String.valueOf(str1));//BicDecimal 값은 반드시 숫자가 아닌 문자타입으로!!!
        BigDecimal num2 = new BigDecimal(String.valueOf(str2));
        BigDecimal result;

        //덧셈 연산
        if(op.equals("+")) {
            result = num1.add(num2);
        }
        //뺄셈 연산
        else if(op.equals("-")) {
            result = num1.subtract(num2);
        }
        //곱셈 연산
        else if(op.equals("*")) {
            result = num1.multiply(num2);
        }
        //나눗셈 연산
        else {
            result = num1.divide(num2);
        }
        //결과 값 출력
        System.out.println("계산한 결과 값 입니다!");
        System.out.println(str1 + " " + op +" "+ str2 + " = " + result);
    }
}
