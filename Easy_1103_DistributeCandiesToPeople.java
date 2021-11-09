/**
 * @author wanghu
 * @discrption： 我们通过以下方式将一些糖果分发给一排 n = num_people 人：
 * 然后我们给第一个人 1 个糖果，给第二个人 2 个糖果，依此类推，直到我们给最后一个人 n 个糖果。
 * 然后，我们回到行的开头，给第一个人 n + 1 个糖果，给第二个人 n + 2 个糖果，依此类推，直到我们给最后一个人 2 * n 个糖果。
 * 这个过程重复（我们每次多给一颗糖果，在我们到达结束后移动到行的开头）直到我们用完糖果。
 * 最后一个人将收到我们所有剩余的糖果（不一定比之前的礼物多一个）。
 * 返回一个数组（长度为 num_people 和 sum candies），表示糖果的最终分布。
 * @create 2021-11-09 10:41
 */
public class Easy_1103_DistributeCandiesToPeople {

    // 我的方法
    //Runtime: 1 ms, faster than 95.48% of Java online submissions for Distribute Candies to People.
    //Memory Usage: 36.7 MB, less than 69.68% of Java online submissions for Distribute Candies to People.
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int num = 1;
        while (true){
            for (int i=0;i<num_people;i++){
                if (candies >= num){
                    candies-=num;
                }else {
                    res[i] += candies;
                    return res;
                }
                res[i] += num;
                num++;
            }
        }
    }

}
