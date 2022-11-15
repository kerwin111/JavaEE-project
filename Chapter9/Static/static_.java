package Chapter9.Static;

public class static_ {
    public static void main(String[] args) {
        int count = 0;

        Children children1 = new Children("白骨精");
        children1.count++;

        Children children2 = new Children("蜘蛛精");
        children2.count++;
//        count++;

        Children children3 = new Children("蝎子精");
        children3.count++;
//        count++;

        System.out.println("有"+count+"个小孩加入了游戏");

        System.out.println(children1.count);
        System.out.println(children2.count);
        System.out.println(children3.count);


    }

}


class Children{
    private String name;
    public static int count = 0;

    public Children(String name) {
        this.name = name;
    }

    public void join(){
        System.out.println(name+"加入了游戏");
    }
}