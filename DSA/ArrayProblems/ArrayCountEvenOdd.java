import java.util.*;
public class ArrayCountEvenOdd {
public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0; i<n; i++){
     arr[i]=sc.nextInt();
    }
        System.out.println(Arrays.toString(arr));
        int evencount=0;
    int oddcount=0;
    for(int i=0; i<arr.length; i++){
        if(arr[i]%2==0){
        evencount++;
        }
        if(arr[i]%2!=0){
            oddcount++;
            }
        }
        System.out.println(evencount);
        System.out.println(oddcount);
}
}
