package Chapter6;


public class OverLoad01 {
    public static void main(String[] args) {
        O o1 = new O();
        double culate =o1.Calculate(1.1,2);
        System.out.println(culate);
    }
}

class O{
    public int Calculate(int n1,int n2){
        return n1 + n2;
    }
    public double Calculate(int n1,double n2){
        return n1 + n2;
    }
    public double Calculate(double n1,int n2){
        return n1 + n2;
    }
    public int Calculate(int n1,int n2,int n3){
        return n1 + n2 + n3 ;
    }

}


