package Chapter7.com.polyArray;

public class Student extends Person{
    private int score;

    public Student(String name, int age, int score) {
        super(name, age);
        this.score = score;
    }


    public String say() {
        return super.say()+","+"成绩"+score;
    }

    public void study(){
        System.out.println("学生:"+getName()+"正在学java");
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
