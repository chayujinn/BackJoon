package Step4;


//최소,최대값 구하기
import java.util.Arrays;
import java.util.Scanner;

public class Step4_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [] A = new int[N];

        for(int i=0;i<N;i++){
            A[i]=scan.nextInt();
        }

        Arrays.sort(A);//배열 원소값을 오름차순으로 정렬!!!!!!!!!!!!!!!

        System.out.println(A[0]+" "+A[N-1]);
    }
}
