import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 27. 移除元素
 */
public class Code02 {
    public static void main(String[] args) {
        int[] ints = {3, 2, 2, 3};
        System.out.println(removeElement(ints,3));
        System.out.println(Arrays.toString(ints));
    }
    public static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
