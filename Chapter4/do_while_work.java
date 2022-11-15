package Chapter4;

public class do_while_work {
    public static void main(String[] args){
        int count = 0;
        int i =0;
        do {
            System.out.println("i="+i);
            count+=i;
            i++;
        }while (i<=100);
        System.out.println("count="+count);
    }
}
