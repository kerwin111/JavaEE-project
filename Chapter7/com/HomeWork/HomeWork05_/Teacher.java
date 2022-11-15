package Chapter7.com.HomeWork.HomeWork05_;


//教师类
public class Teacher extends Work{
    private double reward;//课酬

    public Teacher(String name, String profess, double salary, double reward) {
        super(name, profess, salary);
        this.reward = reward;
    }

    @Override
    public void saySalary() {
        System.out.println("姓名:"+getName()+",工作:"+getProfess()+",工资:"+(getSalary()*12+reward));
    }
}
