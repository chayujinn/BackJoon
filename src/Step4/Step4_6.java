package Step4;
//공바꾸기
import java.util.Scanner;

public class Step4_6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();//5개의 바구니
        int[] arr = new int[N];//바구니 배열
        int M = scan.nextInt();//M번 공을 바꿀 횟수

        for(int i=0; i<N; i++){//5개 처음 바구니 번호
            arr[i]=i+1;
        }

        for(int j=0; j<M; j++){//M번 반복
            int I = scan.nextInt();
            int J = scan.nextInt();
            int temp=0;

            temp=arr[I-1];
            arr[I-1]=arr[J-1];
            arr[J-1]=temp;
        }

        for(int s=0; s<arr.length; s++){
            System.out.print(arr[s]+" ");
        }
    }
}
