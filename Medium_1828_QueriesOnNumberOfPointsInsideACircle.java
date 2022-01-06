/**
 * @author wanghu
 * @discrption： 判断有多少个点在圆内
 * @create 2022-01-06 11:17
 */
public class Medium_1828_QueriesOnNumberOfPointsInsideACircle {
    
    //我的方法
    //Runtime: 25 ms, faster than 71.69% of Java online submissions for Queries on Number of Points Inside a Circle.
    //Memory Usage: 47.4 MB, less than 22.43% of Java online submissions for Queries on Number of Points Inside a Circle.
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] res = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int num = 0, r = queries[i][2] * queries[i][2];
            for (int j = 0; j < points.length; j++) {
                int x = points[j][0] - queries[i][0];
                int y = points[j][1] - queries[i][1];
                int dist = x * x + y * y;
                if (dist <= r) num++;
            }
            res[i] = num;
        }
        return res;
    }

}
