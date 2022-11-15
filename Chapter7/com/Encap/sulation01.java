package Chapter7.com.Encap;

public class sulation01 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("jack");
        person.setAge(300);
        person.setSalary(3000);
        System.out.println(person.info());

        Person person1 = new Person("Tom",3000,150);
        System.out.println(person1.info());
    }
}


class Person{
    public String name;
    private double salary;
    private int age;

    public Person() {
    }

    public Person(String name, double salary, int age) {
        setName(name);
        setSalary(salary);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>=2 && name.length()<=6){
            this.name = name;
        }else {
            this.name = "无名氏";
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 1 && age <=120){
            this.age = age;
        }else {
            this.age =18;
        }
    }

    public String info(){
        return ("name:"+name+",salary:"+salary+",age:"+age);
    }
}