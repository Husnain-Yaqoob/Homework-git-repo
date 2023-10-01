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
        
       if(isOdd(num)){
           System.out.println("this is an odd number");
       } else{
           System.out.println("this is even number");
       }
        EO.close();
    }
    public static boolean isOdd(int num){
        return num%2==1;
    }
}
