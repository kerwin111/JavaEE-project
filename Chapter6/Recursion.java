package Chapter6;


// 猴子吃桃 递归
public class Recursion {
    public static void main(String[] args) {
        Peach p1 = new Peach();
        int d1 = 2;
        int peachNum = p1.peach(d1);
        if (peachNum != -1){
            System.out.println("第"+d1+"天的桃子数为:"+peachNum);
        }
    }
}

class Peach{
    public int peach(int day){
        if (day == 10){
            return 1;
        }else if(day >= 1 && day <= 9 ){
            return (peach(day + 1) +1) *2;
        }else {
            System.out.println("请输入正确的天数");
            return -1;
        }
    }
}
