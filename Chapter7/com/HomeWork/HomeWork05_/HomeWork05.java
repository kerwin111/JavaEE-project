package Chapter7.com.HomeWork.HomeWork05_;


// 创建工作的父类 由服务员/工人/农民/教师和科学家来继承 其中只有教师有奖金 科学家有年终奖
public class HomeWork05 {
    public static void main(String[] args) {
        Worker worker = new Worker("jack", "工人", 3000);
        worker.saySalary();
        Peasant peasant = new Peasant("tom", "农民", 3000);
        peasant.saySalary();
        Teacher teacher = new Teacher("jerry", "教师", 4000, 500);
        teacher.saySalary();
        Scientist scientist = new Scientist("kevin", "科学家", 7000, 1000);
        scientist.saySalary();
        Waiter waiter = new Waiter("zon", "服务员", 2500);
        waiter.saySalary();
    }
}

class Work {
    private String name;
    private String profess; //职业
    private double salary;

    public void saySalary() {
        System.out.println("姓名:" + name + ",工作:" + profess + ",工资:" + (salary * 12));
    }

    public Work(String name, String profess, double salary) {
        this.name = name;
        this.profess = profess;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfess() {
        return profess;
    }

    public void setProfess(String profess) {
        this.profess = profess;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
