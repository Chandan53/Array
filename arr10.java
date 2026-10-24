public class arr10 {
    public static void subarray(int arr[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");
                    currsum+=arr[k];
                }
                System.out.println("Current Sum = " + currsum);
                System.out.println();
                if(maxsum <currsum){
                    maxsum=currsum;
                }
            }
            System.out.println();
        }
        System.out.println("Maximum sum = "+ maxsum);
    }
    public static void main(String args[]){
        int arr[]={1,-2,6,-1,3};
        subarray(arr);
    }
    
}
