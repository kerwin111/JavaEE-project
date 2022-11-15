package Chapter4;


//while循环计算1+2+...+10
public class while02 {
    public static void main(String[] args){
        int i = 0;
        int j = 0;
        while (i<10){
            i++;
            j+=i;
        }
        System.out.println(j);
    }
}
