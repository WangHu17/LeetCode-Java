/**
 * @author wanghu
 * @discrption： timeSeries数组是提莫放技能的时间点，duration是技能效果的持续时间，每次放技能，效果持续时间会重置。求技能持续总时间。
 * @create 2021-09-10 9:38
 */
public class Easy_495_TeemoAttacking {

    //我的方法
    //Runtime: 2 ms, faster than 47.65% of Java online submissions for Teemo Attacking.
    //Memory Usage: 40.6 MB, less than 74.54% of Java online submissions for Teemo Attacking.
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int sum = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            if (timeSeries[i + 1] - timeSeries[i] < duration) {
                sum += timeSeries[i + 1] - timeSeries[i];
            } else {
                sum += duration;
            }
        }
        sum += duration;
        return sum;
    }

}
