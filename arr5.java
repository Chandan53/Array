public class arr5 {
    public static int linearsearch(String arr[], String key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i ;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        String arr[]={"egg","fish","chicken","mutton","tea","coffee"};
        String key ="tea";
        int ans=linearsearch(arr,key);
        if(ans ==-1){
            System.out.println("element not found");
        }
        else{
            System.out.println("element found at = " + linearsearch(arr,key));
        }

    }
    
}
