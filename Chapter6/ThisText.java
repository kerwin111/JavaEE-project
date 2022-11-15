package Chapter6;


//This的使用
public class ThisText {
    public static void main(String[] args) {
        ThisT thisT = new ThisT("mary",50);
        ThisT thisT1 = new ThisT("jack",100);
        System.out.println("thisT和thisT1的结果:"+thisT.Person(thisT1));
    }
}

class ThisT{
    String name;
    int age;

    public ThisT(String name,int age){
        this.name = name;
        this.age = age;
    }

    public boolean Person(ThisT p){
//        if (this.name.equals(p.name) && this.age == p.age){
//            return true;
//        }else {
//            return false;
//        }
        return this.name.equals(p.name) && this.age == p.age;
    }
}