public class arr11 {
    public static void prefixarr(int arr[]){
        int currsum=0;
        int maxsum=0;
        
        int prefix[]=new int[arr.length];
        prefix[0]=arr[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
            //System.out.print(prefix[i]+ " ");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currsum= i == 0? prefix[j] : prefix[j]-prefix[i-1];
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }

        }
        System.out.println("Maxsum = " +maxsum);
    }
    public static void main(String args[]){
        int arr[]={10,-1,-2,-3};
        prefixarr(arr);
       

    }
    
}
