public class Fibonacci {
public static void main(String[] args) {
   int n=0;
   int n1=1;
   int sum;
   int value;
   for(int i=1; i<10; i++){
sum=n+n1;
System.out.println(sum);
n=n1;
n1=sum;
   }
}
}
