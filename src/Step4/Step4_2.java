package Step4;


//X보다 작은 수
import java.util.Arrays;
import java.util.Scanner;

//X보다 작은 수를 모두 출력!
public class Step4_2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();//정수갯수
        int X = scan.nextInt();//값비교할 정수

        int[] A = new int[N];//수열

        for (int i = 0; i < N; i++) {
            A[i] = scan.nextInt();
        }

        for (int j = 0; j < N; j++) {
            if (A[j] < X) {
                System.out.print(A[j]+" ");

            }
        }
    }
}


