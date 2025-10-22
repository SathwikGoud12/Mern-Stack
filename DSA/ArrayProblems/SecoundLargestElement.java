public class SecoundLargestElement {
    public static void main(String[] args) {
        int arr[]={10,27,17,25,27};
        int FE=-1;
        int SE=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>FE){
                SE=FE;
                FE=arr[i];
            }else if(arr[i]>SE && arr[i]<FE){
                SE=arr[i];
            }
        }
        System.out.println(FE+""+SE);
    }
}
