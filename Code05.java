import java.util.Arrays;

/**
 * 169. 多数元素
 */
public class Code05 {

    public static void main(String[] args) {
        int[] ints = {2,2,2,2,2,1,1,3,3};
        System.out.println(majorityElement(ints));
        System.out.println(Arrays.toString(ints));
    }

    public static int majorityElement(int[] nums) {
        int num = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (num == nums[i]){
                count++;
            }else {
                count--;
                if (count == 0){
                    num = nums[i];
                    count = 1;
                }
            }
        }
        return num;
    }
}
