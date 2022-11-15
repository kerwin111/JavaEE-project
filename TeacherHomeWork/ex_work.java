package TeacherHomeWork;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class ex_work {

    public static void main(String[] args) {
             Dog dog = new Dog("斑点狗",2);
             dog.call();
    }
}

class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void call(){
        System.out.println("动物会叫");
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
}


class Dog extends Animal{
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void call() {
        System.out.println(getAge()+"的"+getName()+"正在"+"正在汪汪汪");
    }
}
