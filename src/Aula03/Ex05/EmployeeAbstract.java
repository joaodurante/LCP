package Aula03.Ex05;

abstract class EmployeeAbstract{
    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public EmployeeAbstract (String firstName, String lastName, String SSN){
        this.firstName=firstName; this.lastName=lastName;
        socialSecurityNumber=SSN;
    }

    public void setFirstName(String Name){
        firstName=Name;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setLastName(String Name){
        lastName=Name;
    }

    public String getLastName(){
        return lastName;
    }

    public void setSocialSecurityNumber(String Number){
        socialSecurityNumber=Number;
    }

    public String getSocialSecurityNumber(){
        return socialSecurityNumber;
    }

    public String toString(){
       return String.format("%s %s\n Social Security Number:%s",
               getFirstName(),getLastName(),getSocialSecurityNumber());
    }

    public abstract double earnings();
}
