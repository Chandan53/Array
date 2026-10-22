import java.util.*;
public class arr4 {
    public static int largest_value(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(largest < arr[i]){
                largest=arr[i];
            }
        }
        return largest;

    }
    public static void main(String args[]){
        int arr[]={1,2,6,3,5};
        System.out.println("largest value is = " + largest_value(arr));

    }
    
}
