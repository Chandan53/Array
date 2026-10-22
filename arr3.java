public class arr3 {
    public static int linearsearch(int arr[], int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;

            }
        }
        return -1;

    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10,12,13,15};
        int key =10;
        int index=linearsearch(arr,key);
        if (index ==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("element found at index = " + index);
        }

    }
    
}
