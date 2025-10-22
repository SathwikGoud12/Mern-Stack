public class GCD {
public static void main(String[] args) {
    int a=6;
    int b = 8;
for(int i=1; i*i<a; i++)
{
if(a%i==0){
System.out.println(i);
System.out.println(a/i);
}
}
for(int i=1; i*i<b; i++)
{
if(b%i==0){
System.out.println(i);
System.out.println(b/i);
}
}
}
}
