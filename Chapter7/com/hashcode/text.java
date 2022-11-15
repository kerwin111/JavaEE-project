package Chapter7.com.hashcode;

public class text {

    public static void main(String[] args) {
        AA aa = new AA();
        AA bb = new AA();
        AA cc = aa;

        System.out.println("aa的hashcode:"+aa.hashCode());
        System.out.println("bb的hashcode:"+bb.hashCode());
        System.out.println("cc的hashcode:"+cc.hashCode());

    }
}


class AA{

}