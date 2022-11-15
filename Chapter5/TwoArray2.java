package Chapter5;


//二维数组
public class TwoArray2 {
    public static void main(String[] args) {
        int[][] arr = new int[3][];  //创建二维数组
        for (int i=0;i< arr.length;i++){ //遍历每个arr的一维数组
            arr[i] = new int[i+1];  //给一维数组赋值开孔机

            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=i+1;
            }
        }
        System.out.println();
        for (int i=0;i< arr.length;i++){
            for (int j=0;j< arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
