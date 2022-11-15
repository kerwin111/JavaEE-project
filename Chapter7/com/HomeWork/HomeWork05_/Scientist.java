package Chapter7.com.HomeWork.HomeWork05_;

public class Scientist extends Work{
    private double bonus; //年终奖

    public Scientist(String name, String profess, double salary, double bonus) {
        super(name, profess, salary);
        this.bonus = bonus;
    }

    @Override
    public void saySalary() {
        System.out.println("姓名:"+getName()+",工作:"+getProfess()+",工资:"+(getSalary()*12+bonus));
    }
}
