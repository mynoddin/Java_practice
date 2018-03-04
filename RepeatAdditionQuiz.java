/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;
import java.util.Scanner; 
/**
 *
 * @author Mohammad Mynoddin
 */
public class RepeatAdditionQuiz {
  
    public static void main(String[] args) {
        int number1 = (int)(Math.random() * 10); 
        int number2 = (int)(Math.random() * 10);
        int answer; 
        prln("What is " + number1 + " + " + number2 + " ?"); 
        
        Scanner in = new Scanner(System.in);     
        
        answer = in.nextInt(); 
        while(number1+ number2 != answer){
            prln("Wrong answer. Try again! "
                    + "What is " + number1 + " + " + number2 + " ?"); 
            answer = in.nextInt(); 
        }
       pr("You got this.");
    }
    static void prln(Object anyObject){
        System.out.println(anyObject);
    }
    static void pr(Object anyObject){
        System.out.print(anyObject);
    }
}