public class Patterns1 {
    public static void main(String[] args) {
        int n=3;
       int  st=1;
       int sp=3;
      int Cvalue=1;
       for(int i=1; i<=n; i++){
        Cvalue=1;
        //leftstars
        for(int j=1; j<=st; j++){
System.out.print(Cvalue);
Cvalue++;
        }
        for(int j=1; j<=sp; j++){
            System.out.print("*");
        }
        Cvalue--;
        for(int j=1; j<=st; j++){
            System.out.print(Cvalue);
Cvalue--;
        }

       System.out.println();
       sp-=2;
                   st++;
    }

    }
}
