package Chapter6;


public class Method01 {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0},{0,0,1},{0,1,0}};
        Array array = new Array();
        array.printArr(arr);
        array.printArr(arr);
        array.printArr(arr);

    }
}

class Array{
    public void printArr(int[][] map){
        System.out.println("======");
        for (int i=0;i<map.length;i++){
            for (int j=0;j< map[i].length;j++){
                System.out.print(map[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
