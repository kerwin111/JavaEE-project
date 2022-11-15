package Chapter6.HomeWork;

public class Exercise02 {
    public static void main(String[] args) {
        String[] str2 = {"jack","mary","tom","jery"};
        A02 a02 = new A02();
        System.out.println(a02.find("tom",str2));
    }
}

class A02{
    public int find(String findStr,String[] str){
        for (int i = 0; i < str.length; i++) {
            if (findStr.equals(str[i])){
                return i;
            }
        }
        return -1;
    }
}