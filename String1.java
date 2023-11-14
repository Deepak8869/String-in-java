import java.util.*;
  //Print All Palindrome Substring

public class String1 {
   static boolean isPalindrome(String str){
    int i = 0;
    int j = str.length()-1;

    while(i <= j){
      char ch1 = str.charAt(i);
      char ch2 = str.charAt(j);

      if(ch1 != ch2){
        return false;
      }
      else{
        i++;
        j--;
      }

    }
    return true;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    for(int i = 0;i<str.length();i++){
      for(int j=i;j<str.length();j++){
        String ss = str.substring(i, j);
        if(isPalindrome(ss) == true){
          System.out.print(ss + " ");
        }
      }
    }
  }
}
