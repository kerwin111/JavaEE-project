package Chapter5;


//二维数组
public class TwoArray {
    public static void main(String[] args) {
        int[][] arr ={{0,0,0,0,0},{0,0,0,0,0},{0,2,0,3,0},{0,0,0,0,0},};
        System.out.println("二维数组的个数:"+arr.length);
        System.out.println("第二行第三列的数:"+arr[2][3]);

        for (int i=0;i< arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
