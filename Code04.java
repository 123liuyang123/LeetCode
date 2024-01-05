import java.util.Arrays;

/**
 * 删除有序数组中的重复项 II
 */
public class Code04 {

    public static void main(String[] args) {
        int[] ints = {0,0,1,1,1,1,2,3,3};
        System.out.println(removeDuplicates(ints));
        System.out.println(Arrays.toString(ints));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2){
            return nums.length;
        }
        int length = 2;
        int first = nums[0];
        int second = nums[1];
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != first || nums[i] != second){
                nums[length++] = nums[i];
                first = nums[length -2];
                second = nums[length -1];
            }
        }
        return length;
    }
}
