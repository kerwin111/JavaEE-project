package TeacherHomeWork;

class Imp_university extends university{
    public Imp_university(double chinese, double math, double english) {
        super(chinese, math, english);
        double total = chinese + math + english;
        if (total>220){
            System.out.println("考分:"+total+"达到重点大学录取分数线");
        }else {
            System.out.println("考分:"+total+"未达到重点大学录取分数线");
        }
    }
}
