package Chapter4;

import java.awt.*;
import java.util.Scanner;

public class continue_text {
    public static void main(String[] args){
        Label1:
        for (int j = 0; j<3;j++){
            Label2:
            for (int i = 0;i<10;i++){
                if (i==2){
                    continue Label2;
                }
                System.out.println("i="+i);
            }

        }
    }

}