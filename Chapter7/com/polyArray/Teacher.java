package Chapter7.com.polyArray;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, int age, int salary) {
        super(name, age);
        this.salary = salary;
    }

    public String say() {
        return super.say()+","+"工资"+salary;
    }

    public void teach(){
        System.out.println("老师:"+getName()+"正在教足球");
    }
    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
