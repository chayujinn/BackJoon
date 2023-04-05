package Step4;
//최대값 그자리수
import java.util.Scanner;

public class Step4_4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int [] Arr = new int[9];

        for(int i=0;i<9;i++){
            Arr [i] = scan.nextInt();
        }

        int max = 0;
        int count =0;
        int index=0;

        for(int j=0;j<9;j++){
            count++;
            if(Arr[j]>max){
                max=Arr[j];
                index=count;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
