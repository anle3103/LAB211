/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p0102;

import java.util.Scanner;
import java.util.Date;


public class P0102 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       SimpleDateFormat fd = new SimpleDateFormat("dd/MM/yyyy");
       SimpleDateFormat fdday = new SimpleDateFormat("E");
       fd.setLenient(false);
       Date date;
       while(true){
           try{
               System.out.print("Please enter date with format[dd/mm/yyyy]");
               date = fd.parse(sc.nextLine());
               break;
           } catch (Exception e){
               System.out.println("Invalid date, please input again");
           }
       }
        System.out.println("Your day is "+fdday.format(date));
    }  
