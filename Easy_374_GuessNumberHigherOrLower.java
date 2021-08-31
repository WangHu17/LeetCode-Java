/**
 * @author wanghu
 * @discrption： 我们正在玩猜谜游戏。游戏如下： 我从 1 到 n 中选择一个数字。
 * 你必须猜出我选的是哪个号码。 每次你猜错了，我都会告诉你我选的数字是高于还是低于你的猜测。
 * @create 2021-08-31 14:41
 */
public class Easy_374_GuessNumberHigherOrLower {

    //二分法
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Guess Number Higher or Lower.
    //Memory Usage: 37.6 MB, less than 10.51% of Java online submissions for Guess Number Higher or Lower.

//    public class Solution extends GuessGame {
//        public int guessNumber(int n) {
//            int low = 1,high = n;
//            while(low<=high){
//                int mid = low + (high - low)/2;
//                if(guess(mid)==0){
//                    return mid;
//                }else if(guess(mid)==-1){
//                    high = mid - 1;
//                }else {
//                    low = mid + 1;
//                }
//            }
//            return -1;
//        }
//    }

}
