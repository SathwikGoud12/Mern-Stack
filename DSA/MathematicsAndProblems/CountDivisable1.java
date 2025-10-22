import java.util.*;
public class CountDivisable1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int count=0;
    for(int i=0; i<n; i++){
        int num=sc.nextInt();
        if(num%3==0 || num%5==0){
count=count+1;
        }
    }
    System.out.println(count);
}
}
