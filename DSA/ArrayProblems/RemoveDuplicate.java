public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={10,10,20,40,20,50,};
        int i=0;
        int j=i+1;
        while(j<arr.length){
if(arr[i]==arr[j]){
    j++;
}else if(arr[i]!=arr[j]){
    i++;
arr[i]=arr[j];
}
        }

    }
}
