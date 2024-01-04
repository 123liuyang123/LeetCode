import java.util.Arrays;

/**
 * 26. 删除有序数组中的重复项
 */
public class Code03 {
    public static void main(String[] args) {
        int[] ints = {1, 1, 1, 2};
        System.out.println(removeDuplicates(ints));
        System.out.println(Arrays.toString(ints));
    }

    public static int removeDuplicates(int[] nums) {
        int length = 1;
        int prev = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (prev != nums[i]){
                nums[length++] = nums[i];
                prev =  nums[i];
            }
        }
        return length;
    }
}
