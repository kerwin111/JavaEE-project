package Chapter6;


// 可变参数
public class Kebian {
    public static void main(String[] args) {
        K k = new K();
        System.out.println(k.KebianAge(10,20,30));
    }
}

class K{
    public int KebianAge(int...nums){
        int res = 0;
        for(int i=0;i< nums.length;i++){
            res += nums[i];
        }
        return res;
    }
}


