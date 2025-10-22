public class Countzeros {
public static void main(String[] args) {
    int num=120500;
    int count=0;
    while(num>0){
    int lastdigit=num%10;
    if(lastdigit==0){
    count++;
    }else{
        break;
    }
    num=num/10;
    
}
System.out.println(count);
}
}
