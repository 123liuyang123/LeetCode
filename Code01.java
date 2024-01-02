import java.util.Arrays;

/**
 * 88. 合并两个有序数组
 */
public class Code01 {

    public static void main(String[] args) {
        int[] result = new int[]{1,2,3,0,0,0};
        merge(result,3,new int[]{2,5,6},3);
        System.out.println(Arrays.toString(result));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1, j=n-1, k=m+n-1;
        // 合并
        while(i>=0 && j>=0)
        {
            if(nums1[i] > nums2[j])
            {
                nums1[k--] = nums1[i--];
            }
            else
            {
                nums1[k--] = nums2[j--];
            }
        }
        // 合并剩余的nums2
        while(j>=0)
        {
            nums1[k--] = nums2[j--];
        }
    }
}
