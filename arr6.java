import java.util.*;
public class arr6 {
    public static int smallestvalue(int arr[]){
        int smallest=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < smallest){
                smallest=arr[i];
            }
        }
        return smallest;

    }
    public static void main(String args[]){
        int arr[]={4,5,3,6,8,2};
        System.out.println("smallest vaue is " + smallestvalue(arr));
    }
    
}
