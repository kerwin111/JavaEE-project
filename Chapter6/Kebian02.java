package Chapter6;


public class Kebian02 {
    public static void main(String[] args) {
        HsMethod hsMethod = new HsMethod();
        System.out.println(hsMethod.ShowScore("Messi",100,100,100));
        System.out.println(hsMethod.ShowScore("Messi",100,100,100,150,150));

    }
}

class HsMethod{
    public String ShowScore(String name,int ... age){
        int add = 0;
        for (int i =0;i< age.length;i++){
            add += age[i];
        }
        return name + age.length +"门功课的总分为"+add;
    }
}
