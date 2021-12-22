/**
 * @author wanghu
 * @discrption： 太简单了
 * @create 2021-12-22 9:28
 */
public class Easy_1603_DesignParkingSystem {

    //我的方法
    //Runtime: 6 ms, faster than 99.54% of Java online submissions for Design Parking System.
    //Memory Usage: 39.5 MB, less than 80.52% of Java online submissions for Design Parking System.
    private int big;
    private int medium;
    private int small;

    public Easy_1603_DesignParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if (carType == 1) {
            if (big > 0) {
                big--;
                return true;
            } else return false;
        } else if (carType == 2) {
            if (medium > 0) {
                medium--;
                return true;
            } else return false;
        } else {
            if (small > 0) {
                small--;
                return true;
            } else return false;
        }
    }

}
