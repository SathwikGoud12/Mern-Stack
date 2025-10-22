public class Numerical {
    public static void main(String[] args) {
        int n = 4;       
        int CValue=1;

        for (int i = 1; i <= n; i++) {        
            for (int j = 1; j <= n; j++) {    
                System.out.print(CValue);
                CValue=CValue+n;
            }
            System.out.println();   
            CValue=i+1;                         
        }
    }
}
