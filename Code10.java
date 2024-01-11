/**
 * 45. 跳跃游戏 II
 */
public class Code10 {

    public static void main(String[] args) {
        int[] ints = {2,3,1,1,4};
        System.out.println(jump(ints));
    }
    public static int jump(int[] nums) {
        int count = 0;
        int end = 0;
        int mostSolution = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            mostSolution = Math.max(mostSolution, nums[i] + i);
            //遇到边界，就更新边界，并且步数加1
            if (i == end){
                end = mostSolution;
                count++;
            }
        }
        return count;
    }
}
