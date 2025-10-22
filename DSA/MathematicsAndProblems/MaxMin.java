import java.util.*;
import java.util.Arrays;
public class MaxMin {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    System.out.println(Arrays.toString(arr));
    int max=arr[0];
    int min=arr[0];
    for(int i=0; i<n; i++){
        if(arr[i]>max){
            max=arr[i];
        }
      }
      for(int i=0; i<n; i++){
        if(arr[i]<min){
            min =arr[i];
        }
      }

      System.out.println("Minimum Value :"+""+min);
      System.out.println("Maximum Value :"+""+max);
    }
}
