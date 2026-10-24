public class arr12 {
    public static void kandane(int arr[]){
        int cs=0;
        int mx=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs=cs+arr[i];
            if(cs <0){
                cs=0;
            }
            mx=Math.max(cs,mx);
        }
        System.out.println(mx);
    }
    public static void main(String args[]){
        int arr[]={-1,-2,4,-1,-2,1,5,-3};
        kandane(arr);
    }
    
}
