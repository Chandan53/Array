public class assignment3{
    public static void rotate_arr(int arr[]){
        int temp=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[i-1]=arr[i];
        }
        arr[arr.length-1]=temp;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        rotate_arr(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}