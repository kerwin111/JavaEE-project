package Chapter7.com.HomeWork.HomeWork08_;

public class Person {
    private String name;
    private int age;
    private char sex;

    public String hobby(){
        return name+"爱玩";
    }

    public String basicInfo(){
        return "姓名:"+name+"\n"+"年龄:"+age+"\n"+"性别:"+sex;
    }

    public Person(String name, int age, char sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}


