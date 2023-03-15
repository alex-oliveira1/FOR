import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       Scanner sc=new Scanner(System.in);
       int i=1, ac=0;
       while (i!=0){
        i=sc.nextInt();
        ac+=i;
       }
       sc.close();
       System.out.println("O resultado da soma:"+ac);

    }
}
