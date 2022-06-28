import java.util.Scanner;
public class vote {
    public static void main(String[]args){
    Scanner age = new Scanner(System.in);
    System.out.println("enter your age ");
    int a= age.nextInt();
    if (a>=18){
        System.out.println("elligiable for vote");
        }else {
            System.out.println("not elligiable for vote");
        }
    }

    }
    

