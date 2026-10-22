public class arr1 {

    public static void update(int arr[], int a){
        a=30;
        for (int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
        }
    }
    public static void main(String args[]){
       int arr[]={97,98,99};
       int a=10;

       update(arr, a);
       System.out.println("value of a is unchangeable = " + a);
       for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
       }


    }
    
}
