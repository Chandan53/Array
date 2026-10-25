public class assignment4 {
    public static void rotatearrright(int arr[]){
        int temp=arr[arr.length-1];
        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        rotatearrright(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
