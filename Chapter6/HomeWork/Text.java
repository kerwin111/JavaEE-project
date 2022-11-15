package Chapter6.HomeWork;

public class Text {  //圆的面积和矩形的面积
    public static void main(String[] args) {
        Area area1 = new Area(3.14, 5);
        Area area2 = new Area(4, 5.5);
    }
}

class Area {
    double pai;
    int high;
    double wide;


    public Area(double pai, int high) {  //圆面积
        System.out.println("圆的面积为:" + pai * high);
    }

    public Area(int high, double wide) {
        System.out.println("矩形的面积为:" + high * wide);
    }
}


