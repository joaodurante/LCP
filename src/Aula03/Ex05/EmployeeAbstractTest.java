package Aula03.Ex05;

public class EmployeeAbstractTest{
    public static void main(String[] args){
        SalariedEmployee e1 = new SalariedEmployee("Simone","Prado","11-22-11",800.00);
        HourlyEmployee e2 = new HourlyEmployee("Sara","Vieira","22-11-22",16.75,40.00);
        ComissionEmployee e3 = new ComissionEmployee("Ramons","Do Carmo","14-08-11",800,0.5);
        System.out.printf("%s\n%s: $%,.2f\n\n",e1,"ganhos",e1.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",e2,"ganhos",e2.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",e3,"ganhos",e3.earnings());
    }
}