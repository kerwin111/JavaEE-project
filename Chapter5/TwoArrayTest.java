package Chapter5;


//静态初始化二维数组 遍历并求和
public class TwoArrayTest {
    public static void main(String[] args) {
        int[][] arr = {{4,6},{1,4,5,7},{-2}};  //静态初始化二维数组 遍历并求和
        int tatal = 0;
        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
//                System.out.println(arr[i][j]);
                tatal +=arr[i][j];
            }
        }
        System.out.println(tatal);

    }
}
