import java.util.Arrays;

/**
 * 189. 轮转数组
 */
public class Code06 {
    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7};
//        System.out.println(5%7);
        rotate(ints,3);
        System.out.println(Arrays.toString(ints));
    }

    public static void rotate(int[] nums, int k) {
        int[] result = new int[nums.length];
        for (int j = 0; j < nums.length; j++) {
            result[(j+k)%nums.length] = nums[j];
        }
        for (int i1 = 0; i1 < result.length; i1++) {
            nums[i1] = result[i1];
        }

    }
}

/**
 *        1,2,3,4,5,6,7  长度为7
 * k为1时，7,1,2,3,4,5,6
 * k为2时，6,7,1,2,3,4,5
 * k为3时，5,6,7,1,2,3,4
 */
