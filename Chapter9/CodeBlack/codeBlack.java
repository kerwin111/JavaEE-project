package Chapter9.CodeBlack;

public class codeBlack {
    public static void main(String[] args) {
        new Code("你好,李焕英");
        new Code("唐人街探案",45,"陈思诚");
    }

}

class Code{
    private String name;
    private int price;
    private String director; //导演

    {
        System.out.println("电影屏幕打开了");
        System.out.println("广告开始了");
        System.out.println("电影开始了");
    }

    public Code(String name) {
        this.name = name;
        System.out.println("Code(String name)被调用");
    }

    public Code(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Code(String name, int price, String director) {
        this.name = name;
        this.price = price;
        this.director = director;
        System.out.println("Code(String name, int price, String director)被调用");
    }
}
