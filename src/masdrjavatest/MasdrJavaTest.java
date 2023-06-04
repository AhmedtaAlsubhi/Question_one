
package masdrjavatest;

public class MasdrJavaTest {
    
    public static void main(String[] args) {
        
        //******   Here are some test of the program
        
        
        //******   Bachelors
        FullTimeEmployee Employee1 = new FullTimeEmployee("Ahmed", "IT", 4, "bachelor");
        PartTimeEmployee Employee2 = new PartTimeEmployee("Khaled", "engineer", 4, "bachelor");
        
        //******   Diplomas
        FullTimeEmployee Employee3 = new FullTimeEmployee("Salim", "Developer", 3, "diploma");
        PartTimeEmployee Employee4 = new PartTimeEmployee("Mohammed", "Maneger", 3, "diploma");
        
        //******   No Degree
        FullTimeEmployee Employee5 = new FullTimeEmployee("Ayman", "CEO", 5, "none");
        
        System.out.println(Employee1.toString());
        System.out.println(Employee2.toString());
        System.out.println(Employee3.toString());
        System.out.println(Employee4.toString());
        System.out.println(Employee5.toString());
    }
}

class Employee{
    
    private String name;
    private String position;
    private double salary;
    private int experience;
    private String educationalLevel;
    
    Employee(){}
    Employee(String name, String position, int experience, String educationalLevel){
        
        this.name = name;
        this.position = position;
        this.experience = experience;
        this.educationalLevel = educationalLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }
    
    public String toString(){
        return "Employee's Name:" + getName() + "\nEmployee's Position: " + getPosition() + "\nEmployee's Salary: " + getSalary() + "\nEmployee's Experience: " + getExperience() + " year/s\nEmployee's Educational Level: " + getEducationalLevel() + " Degree";
    }
}

class FullTimeEmployee extends Employee{
    
    private double bonus;
    
    FullTimeEmployee(){}
    FullTimeEmployee(String name, String position, int experience, String educationalLevel){
        super(name, position, experience, educationalLevel);
        
        double basicSalary;
        if (educationalLevel == "bachelor"){
            basicSalary = 500;
        }
        else if (educationalLevel == "diploma"){
            basicSalary = 250;
        }
        else{
            basicSalary = 0;
        }
        
        this.setSalary(basicSalary + (basicSalary*0.05*experience));
        this.bonus = (0.03 * basicSalary);
    }
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public String toString(){
        return "\n********************************\n       Full time employee\n\n" + super.toString() + "\nEmployee's Bonus: " + getBonus();
    }
}

class PartTimeEmployee extends Employee{
    
    private double bonus;
    
    PartTimeEmployee(){}
    PartTimeEmployee(String name, String position, int experience, String educationalLevel){
        super(name, position, experience, educationalLevel);
        
        double basicSalary;
        if (educationalLevel == "bachelor"){
            basicSalary = 500;
        }
        else if (educationalLevel == "diploma"){
            basicSalary = 250;
        }
        else{
            basicSalary = 0;
        }
        
        this.setSalary(basicSalary + (basicSalary*0.05*experience));
        this.bonus = (0.015 * basicSalary);
    }
    
    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
    
    public String toString(){
        return "********************************\n       Part time employee\n" + super.toString() + "\nEmployee's Bonus: " + getBonus();
    }
}