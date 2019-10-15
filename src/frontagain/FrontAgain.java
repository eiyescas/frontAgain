/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frontagain;

/**
 *
 * @author 17862
 */
public class FrontAgain {

  

    public static void main(String[] args) {
        // TODO code application logic here
        
      String str = "jaja";
      String first = str.substring(0,1);
      //first char
      String second = str.substring(1,2);
      //second char
      String secondToLast = str.substring(str.length() - 2, str.length()-1);
      //second to last char
      String last = str.substring(str.length() - 1, str.length());
      //last char
  
        System.out.println(first); //to verify that was the first char
        System.out.println(second); // " " 
        System.out.println(secondToLast);
        System.out.println(last);
        
    if((str.length() >= 3) && 
  ((first.equals(secondToLast) && second.equals(last)|| (first.equals(last) && second.equals(secondToLast))))){
    //I individually compared each charcter to make sure that the first two chars == last two chars         
        System.out.println("T"); //true
  }else{
        System.out.println("F"); //false
    }
    }
    
}
