/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework.git.repo;

import java.util.Scanner;

/**
 *
 * @author hasan
 */
public class HomeworkGitRepo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner EO = new Scanner(System.in);
        System.out.println("enter a number");//ask the user to enter a number
        int num= EO.nextInt(); // the num entered to be scanned
        
       if(isOdd(num)){// conditionals added to check if number about the even or odd
           System.out.println("this is an odd number");//output message 
       } else{ //
           System.out.println("this is even number");//the alternate thing if the conditins doesnot satisfy
       }
        EO.close();// scanner to be close
    }
    public static boolean isOdd(int num){
        return num%2==1;
    }
}
