package Chapter4;

public class do_while_work2 {
    public static void main(String[] args){
        int bian = 200;
        int b = 0;
        int i = 0;
        int c = 5;
        int d = 3;
        do {
            System.out.println("i="+i);
            i++;
            if (i%c==0 & i%d !=0){
                b++;
            }
        }while (i<=bian);
        System.out.println("b="+b);
    }
}
