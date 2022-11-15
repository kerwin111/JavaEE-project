package Chapter7.com.polyArray;


//多态数组
public class poly {
    public static void main(String[] args) {
        Person[] person = new Person[5];
        person[0] = new Person("tom",5);
        person[1] = new Student("jerry",4,30);
        person[2] = new Student("jack",6,40);
        person[3] = new Teacher("messi",10,1000);
        person[4] = new Teacher("neymar",11,999);


        for (int i = 0; i <person.length; i++) {
            System.out.println(person[i].say());

            if (person[i] instanceof Student){
                Student student = (Student) person[i];
                student.study();
            }else if (person[i] instanceof Teacher){
                Teacher teacher = (Teacher) person[i];
                teacher.teach();
            }else if (person[i] instanceof Person){

            }else {
                System.out.println("你输出的类型有误");
            }
        }
    }
}
