package Chapter7.com.HomeWork.HomeWork04_;


// 创建一个员工类的父类  再创建工人类 和经理类 去继承 并重写他的方法 最终把工人和经理的属性打印输出
public class HomeWork04 {
    public static void main(String[] args) {
        Or_employees or_employees = new Or_employees("jack", 50, 10);
        or_employees.saySalary();
        Manager manager = new Manager("tom", 40, 30);
        manager.saySalary();

    }

}

class employees {
    private String name;
    private double salary;
    private int day;

    public void saySalary() {
        System.out.println("姓名:" + name + "工资:" + salary + "天数:" + day);
    }

    public employees(String name, double salary, int day) {
        this.name = name;
        this.salary = salary;
        this.day = day;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
}