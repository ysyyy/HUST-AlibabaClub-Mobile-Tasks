import javafx.application.Application;
import javafx.stage.Stage;

import java.util.Random;
import java.util.Scanner;

public class guessTheNumber  {

    public static void main(String[] args)
    {
        int theNumber=(int)(Math.random()*100+1);
        while (true) {
            try {
                Scanner in = new Scanner(System.in);
                int a = in.nextInt();
                if (a < 1 || a > 100) {
                    System.out.println("不符合范围");
                } else if (a > theNumber) {
                    System.out.println(a + "太大");
                } else if (a < theNumber) {
                    System.out.println(a + "太小");
                } else {
                    System.out.println("猜对啦");
                    break;
                }
            } catch (Exception e) {
                System.out.println("不符合数字格式");
                continue;

            }
        }


    }
}
