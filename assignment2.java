
public class assignment2 {

    public static void rotate(int nums[], int key) {
        int n = nums.length;
        key = key % n;

        int temp[] = new int[n];

        // Left rotate the array
        for (int i = 0; i < n; i++) {
            temp[i] = nums[(i + key) % n];
        }

        // Copy temp array back to nums
        for (int i = 0; i < temp.length; i++) {
            System.out.println("ans = "+ temp[i]);
        }
    }

    public static void main(String args[]) {
        int nums[] = {0, 1, 2, 3, 4, 5};
        int key = 3;

        rotate(nums, key);

        
    }
}
