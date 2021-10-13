import java.util.Scanner;

public class revwordbyword {
     public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string here ");
        String s1=sc.nextLine();
        StringBuilder sb=new StringBuilder(s1);
        sb.reverse();
        System.out.println("string after rverse : "+sb);
    
    }
    
}
