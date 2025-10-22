import java.util.Arrays;
import java.util.Scanner;
public class MissingNumberinArray {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n =sc.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++){
        arr[i]=sc.nextInt();
    }
    Arrays.sort(arr);
    System.out.println( Arrays.toString(arr));
    int count=0;
    for(int i=0; i<n-1; i++){
     if(arr[i+1]!=arr[i]+1){
count=arr[i]+1;
     }else if(n==1){
        System.out.println(arr[0]+1);
     }else if(arr[i]!=arr[i+1]-1){
System.out.println(arr[i+1]-1);
     }
        }
    System.out.println(count);
}
}
