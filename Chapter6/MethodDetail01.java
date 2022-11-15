package Chapter6;


public class MethodDetail01 {
    public static void main(String[] args) {
        Deatil deatil = new Deatil();
        int[] res = deatil.printArr(20,10);
        System.out.println("和为:"+res[0]);
        System.out.println("和为:"+res[1]);

    }
}

class Deatil{
    public int[] printArr(int num01,int num02){
        int[] arr = new int[2];
        arr[0] = num01 + num02;
        arr[1] = num01 - num02;
        return arr;

    }
}
