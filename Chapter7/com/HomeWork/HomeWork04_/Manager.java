package Chapter7.com.HomeWork.HomeWork04_;

public class Manager extends employees {
    public Manager(String name, double salary, int day) {
        super(name, salary, day);
    }


    @Override
    public void saySalary() {
        System.out.println("这就是经理");
        System.out.println("姓名:"+getName()+"工资:"+(1000+getSalary()*getDay()*1.2));
    }
}