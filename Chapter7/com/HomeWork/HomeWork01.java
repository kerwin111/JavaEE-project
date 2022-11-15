package Chapter7.com.HomeWork;


//运用冒泡排序给 用对象的age的值进行排序
public class HomeWork01 {
    public static void main(String[] args) {

        Person[] person = new Person[3];
        person[0] = new Person("jack", 40, "学生");
        person[1] = new Person("tom", 20, "教师");
        person[2] = new Person("jerry", 30, "主任");

        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
        Person temp = null;
        for (int i = 0; i < person.length - 1; i++) {
            for (int j = 0; j < person.length - i - 1; j++) {
                if (person[j].getName().length() > person[j + 1].getName().length()) {//按照名字长度来排序
                    temp = person[j];
                    person[j] = person[j + 1];
                    person[j + 1] = temp;
                }
            }
        }
        System.out.println("=============");
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }


}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
