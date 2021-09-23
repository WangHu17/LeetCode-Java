/**
 * @author wanghu
 * @discrption： 给定按非递减顺序排序的字符数组字母和字符目标，返回数组中大于目标的最小字符。
 * 请注意，字母环绕。 例如，如果目标 == 'z' 和字母 == ['a', 'b']，则答案为 'a'。
 * @create 2021-09-23 9:14
 */
public class Easy_744_FindSmallestLetterGreaterThanTarget {

    //我的方法：用两组变量，一组记录差为正的最小的字母，一组记录差为负的最小的字母，如果有差为正的就返回，否则放回差为负的（我以为数组没排序）
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Smallest Letter Greater Than Target.
    //Memory Usage: 39.4 MB, less than 56.46% of Java online submissions for Find Smallest Letter Greater Than Target.
    public char nextGreatestLetter(char[] letters, char target) {
        int cha1 = 26, cha2 = 0;
        char res1 = target, res2 = target;
        for (char letter : letters) {
            int cur = letter - target;
            if (cur > 0 && cur < cha1) {
                cha1 = cur;
                res1 = letter;
            } else if (cur < 0 && cur < cha2) {
                cha2 = cur;
                res2 = letter;
            }
        }
        if (cha1 != 26) return res1;
        return res2;
    }

    //方法二：数组已排序，那还不简单
    //Runtime: 0 ms, faster than 100.00% of Java online submissions for Find Smallest Letter Greater Than Target.
    //Memory Usage: 38.9 MB, less than 90.93% of Java online submissions for Find Smallest Letter Greater Than Target.
    public char nextGreatestLetter1(char[] letters, char target) {
        for (char letter:letters){
            if (letter > target)return letter;
        }
        return letters[0];
    }

}
