/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javapractice;

/**
 *
 * @author Mohammad Mynoddin
 */
public class JavaPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0; 
        while(count <=100){
            prln("Count value is " + count); 
            count++; 
        }
        
    }
    public static void prln(Object anyObject){
        System.out.println(anyObject); 
    }
    
}
