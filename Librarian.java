public class Librarian {
    private String Name;
    private int Age ;
    private char Sex;
    private double Salary;
    private String shifts;
    private int DaysOff;

    public Librarian(String Name,int Age,char Sex,double Salary,String Shifts,int DaysOff){
        this.Name=Name;
        this.Age=Age;
        this.Sex=Sex;
        this.Salary=Salary;
        this.shifts=Shifts;
        this.DaysOff=DaysOff;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public char getSex() {
        return Sex;
    }

    public void setSex(char sex) {
        Sex = sex;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public String getShifts() {
        return shifts;
    }

    public void setShifts(String shifts) {
        this.shifts = shifts;
    }

    public int getDaysOff() {
        return DaysOff;
    }

    public void setDaysOff(int daysOff) {
        DaysOff = daysOff;
    }
}




