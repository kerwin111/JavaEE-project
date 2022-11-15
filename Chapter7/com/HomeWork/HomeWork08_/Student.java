package Chapter7.com.HomeWork.HomeWork08_;

public class Student extends Person{
    private String stu_id;

    public Student(String name, int age, char sex, String stu_id) {
        super(name, age, sex);
        this.stu_id = stu_id;
    }

    public String study() {
        return getName()+"我承诺 会好好学习";
    }

    public void Info(){
        System.out.println("学生的信息:\n"+super.basicInfo()+"\n"+"学号:"+stu_id);
        System.out.println(study());
        System.out.println(hobby());
    }
    @Override
    public String hobby() {
        return super.hobby()+"踢足球";
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}'+super.toString();
    }
}
