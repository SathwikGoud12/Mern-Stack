import java.util.Scanner;
public class SquareAndCube {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int num1=0;
    for(int i=0; i<n; i++){
        int num=sc.nextInt();
        if(num%2==0){
  num1=num*num;
        }else {
  num1=num*num*num;
    }
}
System.out.println(num1);
}
}
