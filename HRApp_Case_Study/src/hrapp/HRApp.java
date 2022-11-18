/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hrapp;

/**
 *
 * @author diego
 */
public class HRApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("HRApp Starts");
        
        Employee e1 = new Employee(230, "Jerry", 333998);
        Employee e2 = new Employee(420, "Gracie", 3392823);
        
        Department dept = new Department("Education");
        dept.addEmp(e1);
        dept.addEmp(e2);
        dept.addEmp(new Employee(772, "Jack", 2998));
        
        Employee[] emps = dept.getEmployees();
        
        for (Employee emp: emps) {
            System.out.println("Emp: " + emp);
        }
        System.out.println("Total: " + dept.getTotalSalary());
        System.out.println("Avetage: " + dept.getAverageSalary());
        
        System.out.println("Emp: " + dept.getEmployeeByID(565));
    }
    
}
