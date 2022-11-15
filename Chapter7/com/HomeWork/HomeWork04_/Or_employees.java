package Chapter7.com.HomeWork.HomeWork04_;

public class Or_employees extends employees {
    public Or_employees(String name, double salary, int day) {
        super(name, salary, day);
    }

    @Override
    public void saySalary() {
        System.out.println("这就是普通员工");
        System.out.println("姓名:"+getName()+"工资:"+getSalary()*getDay()*1);
    }
}
