package Chapter7.com.HomeWork.HomeWork08_;

public class Teacher extends Person{
    private int work_age;

    public Teacher(String name, int age, char sex, int work_age) {
        super(name, age, sex);
        this.work_age = work_age;
    }

    public String teach() {
        return getName()+"我承诺 会好好教书";
    }

    public void Info(){
        System.out.println("老师的信息如下\n"+super.basicInfo()+"\n"+"工龄:"+work_age);
        System.out.println(teach());
        System.out.println(hobby());
    }
    @Override
    public String hobby() {
        return super.hobby()+"下象棋";
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}'+super.toString();
    }
}
