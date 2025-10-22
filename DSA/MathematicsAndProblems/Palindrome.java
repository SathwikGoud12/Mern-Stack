import java.util.*;
public class Palindrome {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int lastdigit=n%10;
            n=n/10;
            sum=sum+lastdigit;
        }
        System.out.println("Sum Value:"+sum);
        int rev=0;
        int temp=sum;
                while(temp>0){
            int lastdigit=temp%10;
            temp=temp/10;
            rev=rev*10+lastdigit;
                }
                System.out.println("rev value:"+rev);
                if(sum==rev){
                    System.out.println("Number is Palondrome");
                }else{
                    System.out.println("Not Palindrome");
                }

}
}

