/**
 * 55. 跳跃游戏
 */
public class Code09 {

    public static void main(String[] args) {
        int[] ints = {3,3,1,0,4};
        System.out.println(canJump(ints));
    }
    public static boolean canJump(int[] nums) {
        int n=nums.length;
        int k=0;
        for(int i=0;i<n;i++)
        {
            if(i>k){
                return false;
            }
            // 能跳到最后一个位置
            if(k>=n-1){
                return true;
            }
            // 从当前位置能跳的最远的位置
            k = Math.max(k, i+nums[i]);
        }
        return k >= n-1;
    }
}
