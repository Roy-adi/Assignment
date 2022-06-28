import java.util.Scanner;
public class checkNo {
    public static void main(String[]args){
    Scanner positive = new Scanner(System.in);
    System.out.println("enter your no ");
    int a= positive.nextInt();
    if(a>0){
        System.out.println("the no is positve");
    } else if (a <0) {
      System.out.println("the no is negative");
    }  else {
      System.out.println("the no is zero");
    }
  }
}

      


