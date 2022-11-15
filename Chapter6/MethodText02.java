package Chapter6;


public class MethodText02 {
    public static void main(String[] args) {
        BB b = new BB();
        b.choose(4,4,'#');
    }
}

class BB{
    public void choose(int row,int col,char c){
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
