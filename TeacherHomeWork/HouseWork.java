package TeacherHomeWork;

public class HouseWork {
    public static void main(String[] args){
        House h = new House();
        h.size = 15000;
        h.floor=15;
        h.color="五颜六色";
        System.out.println("房子的大小"+h.size);
        System.out.println("房子的层数"+h.floor);
        System.out.println("房子的颜色"+h.color);
        h.live();

        System.out.println("=================");


        House h2 = new House();
        h2.size=5000;
        h2.floor=50;
        h2.color="金碧辉煌";
        System.out.println("房子的大小"+h2.size);
        System.out.println("房子的层数"+h2.floor);
        System.out.println("房子的颜色"+h2.color);
        h.live();


    }
}
class House{
    int size;
    int floor;
    String color;

    public void live(){
        System.out.println("这个房子可以住人");
    }
}