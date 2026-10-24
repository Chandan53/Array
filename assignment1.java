public class assignment1 {
    public static boolean check(int num[]){
        for(int i=0;i<num.length;i++){
            for(int j=i+1;j<num.length;j++){
                if(num[i]==num[j]){
                    return true;
                }
            
            }
        }
        return false;
    }
    public static void main(String args[]){
        int num[]={1, 1, 3, 3, 4, 3, 2, 4, 2};
        System.out.println(check(num));
    }
    

  
    


}
