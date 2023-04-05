package Step4;
//과제 안내신분
// boolean 배열 사용하는거 기본값 false 지정
//입력 받은 값은 true로 해서 false인 번호 출력
import java.util.Scanner;

public class Step4_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean arr[] = new boolean[31];//1~30이 필요해서 31크기의 배열 선언 false로 초기화

        for(int i=0; i<28; i++){//28번 반복하면서 배열값은 true로 지정
            arr[scan.nextInt()] = true;
        }
        for(int i=1; i<=30; i++){//1번부터 30번의 배열을 돌면서 false인 경우만 출력
            if(!arr[i])//false인거 출력 arr[i]==false
                System.out.println(i);
        }

    }
}