package Chapter7.com.poly;

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public void feed(dog dog, bone bone){
        System.out.println("主人"+name+"给"+dog.getName()+"喂"+bone.getName());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
