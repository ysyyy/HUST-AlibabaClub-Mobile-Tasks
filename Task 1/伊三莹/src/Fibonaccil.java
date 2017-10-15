import javafx.application.Application;
import javafx.stage.Stage;

public class Fibonaccil{

    public static void main(String[] args)

    {   int a=1,b=0,c=0,i;
        for(i=1;i<=20;i++)
        {  c=a+b;
           a=b;
           b=c;
            System.out.print(c+"\t");
        }

        if(i%5==0);
        System.out.println("");
}}
