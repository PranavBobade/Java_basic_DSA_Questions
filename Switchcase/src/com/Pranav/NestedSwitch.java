package com.Pranav;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);
        int empID=s.nextInt();
        String department=s.next();

//        switch (empID)
//        {
//            case 1:
//                System.out.println("pranav bobade");
//                break;
//            case 2:
//                System.out.println("luffy");
//                break;
//            case 3:
//                System.out.println("emp. no. 3");
//
//                 switch (department){
//                     case "IT":
//                         System.out.println("IT DEPARTMENT");
//                         break;
//                     case "MANAGEMENT":
//                         System.out.println("Management DEPARTMENT");
//                         break;
//                     default:
//                         System.out.println("no DEPARTMENT");
//                         break;
//                 }
//                 break;
//            default:
//                System.out.println("enter correct empid");
//                break;
//
//        }

        //BETTER WAY TO WRITE SWITCH CASE

        switch (empID) {
            case 1 -> System.out.println("pranav bobade");
            case 2 -> System.out.println("luffy");
            case 3 -> {
                System.out.println("emp. no. 3");
                switch (department) {
                    case "IT" -> System.out.println("IT DEPARTMENT");
                    case "MANAGEMENT" -> System.out.println("Management DEPARTMENT");
                    default -> System.out.println("no DEPARTMENT");
                }
            }
            default -> System.out.println("enter correct empid");
        }
    }
}
