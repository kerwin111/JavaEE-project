package TeacherHomeWork;

public class Ord_university extends university{
    public Ord_university(double chinese, double math, double english) {
        super(chinese, math, english);
        double total = chinese + math + english;
        if (total>180){
            System.out.println("考分:"+total+"达到普通大学录取分数线");
        }else {
            System.out.println("考分:"+total+"未达到普通大学录取分数线");
        }
    }
}
