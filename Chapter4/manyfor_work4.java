package Chapter4;

public class manyfor_work4 {
    public static void main(String[] args){
        for (int i =1;i<=5;i++ ){ //层数
            for (int k = 1;k <= 5-i;k++){ //打印空格 5-i等于空格的格数
                System.out.print(" ");
            }
            for (int j =1;j <= 2*i-1; j++){ //
                if ( j==1 || j==2*i-1 || i==5){ //判断 如果是第一个 或者是最后一个 再或者是最后一层
                    System.out.print("*");
                }else { //如果是其他就打印空格
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
