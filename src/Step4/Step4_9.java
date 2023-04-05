package Step4;
//****************************바구니 뒤집기****************************************
//어려움 노이해
import java.util.Scanner;

public class Step4_9 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int[]arr=new int[N+1];

        for(int i=0; i<=N; i++){
            arr[i]=i;
        }

        for(int j=0; j<M; j++){
            int a =scan.nextInt();
            int b =scan.nextInt();

            while(a<b){
                int temp= arr[b];
                arr[b] =arr[a];
                arr[a] =temp;
                a++;
                b--;
            }
        }

        for(int i=1; i<=N; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
