package Chapter4;


//先死后活
public class manyfor_work5 {
    public static void main(String[] args){
        int totalscore = 10;  //把层数设置为变量
        for (int i= 1;i<=totalscore;i++){
            for (int k=1;k<=totalscore-i;k++){
                System.out.print(" ");
            }
            for (int f=1;f<=i*2-1;f++){
                if (f==1 || f==i*2-1 || i==totalscore){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
