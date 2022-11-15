package Chapter7.com.poly;

public class poly01 {
    public static void main(String[] args) {
        Master master = new Master("tom");
        dog dog = new dog("大黄");
        bone bone = new bone("大棒骨");

        master.feed(dog,bone);

    }
}
