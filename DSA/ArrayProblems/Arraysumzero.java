import java.util.Arrays;
import java.util.Scanner;

public class Arraysumzero {
public static void main(String[] args) {
   Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++){
     arr[i]=sc.nextInt();
    }
        System.out.println(Arrays.toString(arr));
            for(int i=0; i<n; i++){
                for(int j=i+1; j<n; j++){
                if(arr[i]+arr[j]==0){
                    int arr1[] = new int[2];   // array of size 2
    arr1[0] = arr[i];
    arr1[1] = arr[j];
    System.out.println(Arrays.toString(arr1));
                }
                }
            }
}
}

