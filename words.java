import java.util.Scanner;
public class words{   
  public static void main(String[] args){   
      Scanner sc=new Scanner(System.in);
      System.out.println(" enter a string here ");
      String string=sc.nextLine();
      String word = "", small = "", large="";    
      String[] words = new String[100];    
      int length = 0;    
      for(int i = 0; i < string.length(); i++){    
          if(string.charAt(i) != ' '){    
              word = word + string.charAt(i);    
          }    
          else{    
              words[length] = word;    
              length++;    
              word = "";    
          }    
      }           
      small = large = words[0];    
      for(int i = 0; i < length; i++){    
          if(small.length() > words[i].length())    
              small = words[i];    
          if(large.length() < words[i].length())    
              large = words[i];    
      }    
      System.out.println("Smallest word in the given string is : " + small);    
      System.out.println("Largest word in the given string is  : " + large);    

      
}
}
  