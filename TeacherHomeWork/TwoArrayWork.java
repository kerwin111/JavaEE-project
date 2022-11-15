package TeacherHomeWork;

public class TwoArrayWork {
    public static void main(String[] args){
        int[][] arr2 = {{1},{2,5,6},{12}};
        int sum = 0;
        for (int i=0;i< arr2.length;i++){
            for (int j=0;j< arr2[i].length;j++){
                sum += arr2[i][j];
            }
        }
        System.out.println(sum);
    }
}
