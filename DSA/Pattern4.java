public class Pattern4 {
    public static void main(String[] args) {
        int n=4;
       int sp=5;
       int st=1;
       int CValue=1;
        for(int i=1; i<=n; i++){
            int Cvalue=1;
for(int j=1; j<=st; j++){
    System.out.print(CValue);
    Cvalue--;
        }
        for(int j=1; j<=sp; j++){
            System.out.print(" ");
        }
        for(int j=1; j<=st; j++){
            System.out.print(CValue);
            CValue++;
        }
        st++;
        sp-=2;
        System.out.println();

    }
}
}
