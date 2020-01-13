package studentdetails; 
 
import java.util.Scanner; 
 
public class Studentdetails { 
 
    public static void main(String[] args) { 
       Scanner sc = new Scanner(System.in); 
       boolean back = true; 
       boolean ret = true; 
        
       String name, course, id; 
        
       double itc, prog, eth, und; 
 
         
         
        yw: 
        while(back){ 
             
            System.out.println("Enter Name: "); 
            name = sc.nextLine(); 
            System.out.println("Enter ID no.: "); 
            id = sc.nextLine(); 
            System.out.println("Enter Course: "); 
            course = sc.nextLine(); 
            System.out.println("Enter mark in ITC-100: "); 
            itc = Double.parseDouble(sc.nextLine()); 
            System.out.println("Enter mark in Programming: "); 
            prog = Double.parseDouble(sc.nextLine()); 
            System.out.println("Enter mark in Ethics: "); 
            eth = Double.parseDouble(sc.nextLine()); 
            System.out.println("Enter mark in Understanding Self: "); 
            und = Double.parseDouble(sc.nextLine()); 
             
            double total= und+itc+eth+prog; 
            double gen = (double)total/400*100; 
             
            System.out.println("========================================="); 
            System.out.println("Name:               " +name); 
            System.out.println("Course:             " + course  ); 
            System.out.println("ID No.:             "+id); 
            System.out.println("            MARKS"); 
            System.out.println("ITC-100:            " + itc); 
            System.out.println("Programming:        " + prog); 
            System.out.println("Ethics:             " + eth); 
            System.out.println("Understanding Self: " + und); 
            System.out.println("Total:              " + total ); 
            System.out.println("General Average:    " + gen); 
            System.out.println("========================================="); 
          
            pst: 
            while(ret){ 
           System.out.println("Do you want to continue?"); 
           System.out.println("type 1 to continue and 2 to quit"); 
            
           int a = Integer.parseInt(sc.nextLine()); 
           if(a == 1){ 
               continue yw; 
            
           }else if(a==2){ 
               System.out.println("Bye"); 
               System.exit(0); 
           }else{ 
               System.out.println("Invalid Input"); 
           } 
        }   
        } 
         
    } 
        }
