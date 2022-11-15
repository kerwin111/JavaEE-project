package Chapter7.com.extendText;

public class Text {
    public static void main(String[] args) {
        Person person = new Person("messi",34);
        System.out.println(person.say());
        Student student = new Student("Neymar",30,3,3);
        System.out.println(student.say());
    }
}
