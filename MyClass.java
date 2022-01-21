import java.util.Scanner;

public class MyClass{
  public static void main(String[] Args){
    Scanner sc=new Scanner(System.in);
    String input=sc.nextLine();
    for(int i=0;i<input.length();i++){
      if(i%2==0){
        System.out.print(input.charAt(i));
      }
    }
  }
}
