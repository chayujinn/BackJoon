package Step4;
//공넣기
import java.util.Scanner;

public class Step4_5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] arr = new int[N];
        int M = scan.nextInt();

        for(int i=0;i<M; i++){
            int I= scan.nextInt();
            int J= scan.nextInt();
            int K= scan.nextInt();

            for(int j=I-1;j<J;j++){
                arr[j]=K;
            }
        }
        for(int s=0; s<arr.length; s++){
            System.out.print(arr[s]+" ");
        }
    }
}
