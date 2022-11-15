package Chapter7.com.equals;

public class equalsExercise {
    public static void main(String[] args) {
        Person person = new Person("jack",20,'男');
        Person person2 = new Person("jack",20,'男');
        System.out.println(person.equals(person2));
    }
}

class Person{
    private String name;
    private int age;
    private char gender;


    //重写equals方法
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Person){
            Person p =(Person)obj; //向下转型
            return this.name.equals(p.name) && this.age ==p.age && this.gender == p.gender;
        }
        return false;
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
