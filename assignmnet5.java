public class assignmnet5 {
    // left shift by 3
    public static void rotate_key(int arr[],int key){
        int temp[]={1,2,3};

        for(int i=3;i<arr.length;i++){
            arr[i-key]=arr[i];
        }
        for(int i=arr.length-key;i<arr.length;i++){
            arr[i]=temp[i-(arr.length-key)];
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7,8};
        int key =3;
        rotate_key(arr,key);
    }
    
}
