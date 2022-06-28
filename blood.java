import java.util.Scanner;
public class blood {
public static void main(String[]args){
    Scanner age = new Scanner(System.in);
    System.out.println("input your age");
    int a= age.nextInt();
    Scanner weight = new Scanner(System.in);
    System.out.println("input your Weight");
    int b= weight.nextInt();
    if (a>25 && b>48 ){
        System.out.println("elligiable for donnate");
    } else  {
        System.out.println("not elligiable for donnate");
    }
    
}
    
}
