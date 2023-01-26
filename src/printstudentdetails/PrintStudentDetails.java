/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package printstudentdetails;

/**
 * store and print student details
 * view class - user interaction
 * @author srinivsi
 */
public class PrintStudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // store and student 3 details
        Student[] list = new Student[3];
        Student s1 = new Student(); //object s1 created
        Student s2 = new Student();
        Student s3 = new Student();
        s1.setName("peter");
        s1.setSid(23);
        s2.setName("tarun");
        s2.setSid(23);
        s3.setName("kartik");
        s3.setSid(23);
       // stored object in array - array of objects
       list[0]=s1;
        list[1]=s2;
         list[2]=s3;
         for(int i=0;i<list.length;i++)
         {
             System.out.println(list[i].getName() + " "+list[i].getSid());
         }
    }
    
}
