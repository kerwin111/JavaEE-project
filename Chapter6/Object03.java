package Chapter6;


public class Object03 {
    public static void main(String[] args) {
        People p1 = new People();
        p1.speak();
        p1.cal01();
        p1.cal02(10);
        int getReturn =p1.cal03(50,30);
        System.out.println("return的值返回为:"+getReturn);

    }
}

class People{
    String name;
    int age;

    public void speak(){
        System.out.println("我是一个好人");
    }

    public void cal01(){
        int sum = 0;
        //计算从1+...+1000的值
        for(int i=0;i<=1000;i++){
            sum += i;
        }
        System.out.println("1+..+1000的值为:"+sum);
    }
    public void cal02(int n){
        int add = 0;
        for (int i=0;i<=n;i++){
            add +=i;
        }
        System.out.println("1+到N的值为:"+add);
    }
    public int cal03(int num1,int num2){
        int res = num1 + num2;
        return res;
    }
}
