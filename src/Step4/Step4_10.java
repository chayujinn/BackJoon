package Step4;

import java.util.Scanner;

public class Step4_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        double[]arr= new double[N];
        double max=0;
        double sum=0;

        for(int i=0; i<N; i++){
            arr[i]=scan.nextInt();
        }
        for(int j=0;j<N; j++){

            if(arr[j]>max){
                max=arr[j];
            }
        }
        for(int k=0; k<N; k++){
            arr[k]=(arr[k]/max)*100;
            sum+=arr[k];
        }
        System.out.println(sum/N);
    }
}
