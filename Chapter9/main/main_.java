package Chapter9.main;


// main方法动态穿参
public class main_ {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            System.out.println("agrs"+"["+i+"}"+args[i]);
        }
    }
}
