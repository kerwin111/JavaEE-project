package Chapter7.com.HomeWork.HomeWork08_;

public class HomeWork08 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("张飞", 30, '男', 5);
        teacher.Info();

        Student student = new Student("小明", 15, '男', "00023102");
        System.out.println("---------------------");
        student.Info();


        Person[] per = new Person[4];
        per[0] = new Student("jack", 35, '男', "12113123");
        per[1] = new Student("jerry", 20, '女', "12131123");
        per[2] = new Teacher("tom", 30, '男', 3);
        per[3] = new Teacher("timi", 40, '女', 10);

        HomeWork08 homeWork08 = new HomeWork08();
        homeWork08.ButterSort(per);

        System.out.println("===========排序后的方法顺序==========");
        for (int i = 0; i < per.length; i++) {
            System.out.println(per[i]);
        }

        for (int i = 0; i < per.length; i++) {
            homeWork08.text(per[i]);
        }
    }

    public void ButterSort(Person[] per) {
        Person temp = null;
        for (int i = 0; i < per.length - 1; i++) {
            for (int j = 0; j < per.length - 1 - i; j++) {
                if (per[j].getAge() > per[j + 1].getAge()) {
                    temp = per[j];
                    per[j] = per[j + 1];
                    per[j + 1] = temp;
                }
            }
        }
    }

    public void text(Person person) {
        if (person instanceof Student) {
            ((Student) person).study();
        } else if (person instanceof Teacher) {
            ((Teacher) person).teach();
        } else {
            System.out.println("do none");
        }
    }
}
