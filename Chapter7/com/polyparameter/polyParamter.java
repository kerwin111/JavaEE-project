package Chapter7.com.polyparameter;

public class polyParamter {
    public static void main(String[] args) {
        Worker worker = new Worker("tom",5000);
        Manager manager = new Manager("jerry",6000,20000);
        polyParamter polyParamter = new polyParamter();
        polyParamter.showEmployee(worker);
        polyParamter.showEmployee(manager);
        polyParamter.textWork(worker);
        polyParamter.textWork(manager);
    }

    public void showEmployee(Employee e){
        System.out.println(e.getAnnual()); //计算员工的年工资
    }
    public void textWork(Employee e){
        if (e instanceof Worker){
            ((Worker) e).work();
        }else if (e instanceof Manager){
            ((Manager) e).manager();
        }else {
            System.out.println("");
        }
    }
}
