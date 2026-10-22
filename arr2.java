import java.util.*;
public class arr2 {

    public static void main(String args[]){
        int arr[] = new int[5];

        Scanner sc = new Scanner(System.in);

        arr[0]=sc.nextInt();
        arr[1]=sc.nextInt();
        arr[2]=sc.nextInt();

        System.out.println("phy = " + arr[0]);
        System.out.println("math = " + arr[1]);
        System.out.println("chem = " + arr[2]);

        arr[2]=30;
        System.out.println("phy = " + arr[0]);
        System.out.println("math = " + arr[1]);
        System.out.println("chem = " + arr[2]);

        


    }
    
}
