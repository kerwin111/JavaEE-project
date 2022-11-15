package Chapter7.com.HomeWork.HomeWork07_;

//重写equals方法 比较两个对象第值是否相等
public class HomeWork07 {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("jack", 30, "医生", '男', 12000);
        Doctor doctor1 = new Doctor("jack", 30, "医生", '男', 12000);
        System.out.println(doctor.equals(doctor1));
    }
}

class Doctor {
    private String name;
    private int age;
    private String job;
    private char gender; //性别
    private double sal; //工资

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Doctor) {
            Doctor d = (Doctor) obj;
            return this.name.equals(d.name) && this.age == d.age &&
                    this.job.equals(d.job) && this.gender == d.gender && this.sal == d.sal;
        }
        return false;
    }

    public Doctor(String name, int age, String job, char gender, double sal) {
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.sal = sal;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
}
