import java.util.*;
public class SumOFOddNumbers {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int sum=0;
    for(int i=0; i<n; i++){
     int num=sc.nextInt();
        if(num%2==1){
        sum=sum+num;
        }
        
    }
    System.out.println("Sum of odd Numbers"+sum);

}
}
