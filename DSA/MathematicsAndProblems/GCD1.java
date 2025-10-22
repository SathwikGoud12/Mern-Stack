public class GCD1 {
public static void main(String[]args){
    int a=40; int b=30;
    int GCD=Math.min(a,b);
    while(true){
        if(a%GCD==0 && b%GCD==0){
            System.out.println(GCD);
            break;
        }
        GCD=GCD-1;
    }
}
}   
