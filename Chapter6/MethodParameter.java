package Chapter6;


public class MethodParameter {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap aa = new swap();
        aa.printArr(a,b);
        System.out.println("\nmain主方法中的值"+"\n"+a+"\t"+b);
    }
}

class swap{
    public void printArr(int a,int b){
        System.out.println("\n交换之前的值"+"\n"+a+"\t"+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("\n交换之后的值"+"\n"+a+"\t"+b);
    }
}
