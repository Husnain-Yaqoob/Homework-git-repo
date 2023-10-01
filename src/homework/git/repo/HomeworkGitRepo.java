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
        int num= EO.nextInt();
        
       if(num%2==0){
           System.out.println("this is even number" + num);
       } else{
           System.out.println("this is odd number");
       }
        
    }
    
}
