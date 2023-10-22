import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the String :");
        String s=sc.nextLine();
        String[] ans =s.split(" ");
        String size=" ";
        for(int i =0;i<ans.length;i++){
            size=ans[ans.length-1];
        }
        System.out.println("The Size of the Last Element is :");
        System.out.println(size.length());
    }
}
