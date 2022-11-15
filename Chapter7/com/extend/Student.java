package Chapter7.com.extend;

public class Student {
    public String name;
    public int age;
    private double score;

    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo(){
        System.out.println("学生姓名:"+name+"学生年龄:"+age+"学生成绩:"+score);
    }
}
