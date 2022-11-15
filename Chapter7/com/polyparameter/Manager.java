package Chapter7.com.polyparameter;

public class Manager extends Employee{
    private double bonus;   //经理的奖金

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manager(){
        System.out.println(getName()+"正在管理");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual()+bonus;
    } //年工资加上奖金

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
