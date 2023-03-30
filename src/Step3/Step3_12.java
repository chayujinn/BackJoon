package Step3;

//EOF관련 문제(End Of File)-데이터 소스로 부터 더 이상 읽을 수 있는 데이터가 없음을 의미
//hasNest() hasNextInt()
import java.util.Scanner;

public class Step3_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while(scan.hasNextInt()){
            int a = scan.nextInt();
            int b = scan.nextInt();

            System.out.println(a+b);
        }
        scan.close();
    }
}
