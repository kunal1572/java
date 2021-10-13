import java.util.Scanner;
public class nth_prime_no {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("name = Kunak Kumar Singh");
    System.out.println("roll no = 32201219043");
    System.out.print("Enter the value of n here ");
    int n = sc.nextInt(); 
    int num=1, count=0, i;
    while (count < n){
      num=num+1;
        for (i = 2; i <= num; i++)
        {
            if (num % i == 0) 
            {
                break;
            }
      }
      if ( i == num)
      {
        count++;
    
      }
    }
    System.out.println("the prime no. in the " +n+"th position is " + num);
  }
}
   
     