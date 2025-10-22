    public class Subarray {
        public static void main(String[] args) {
            int arr[]={10,5,2,6};
            int k=100;
                        int lesscount=0;
                int maxcount=0;
            for(int i=0; i<arr.length; i++){
                String sub="";
                int product=1;
                for(int j=i; j<arr.length; j++){
                    sub+=arr[j]+"";
                    product*=arr[j];
                    if(product<k){
    lesscount++;
                    }
                    maxcount++;
                                System.out.println(sub.trim()+" "+"Product:"+product);
                }
            }
            System.out.println(lesscount);
            
        }
    }
