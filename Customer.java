import java.util.ArrayList;

public class Customer {
    private int Age;
    private ArrayList<Books>books;
    private String Name;
    private String Email;
    private String Telephone;
    private String Adress;
    private int Penalties;

    public Customer(ArrayList<Books> books, String Name,String Email,String Telephone,String Adress,int penalties){
        this.books=books;
        this.Name=Name;
        this.Email=Email;
        this.Telephone=Telephone;
        this.Adress=Adress;
        this.Penalties=penalties;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public ArrayList<Books> getBooksList() {
        return books;
    }

    public void setBooksList( ArrayList<Books> books) {
        books = books;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        Telephone = telephone;
    }

    public String getAdress() {
        return Adress;
    }

    public void setAdress(String adress) {
        Adress = adress;
    }

    public int getPenalties() {
        return Penalties;
    }

    public void setPenalties(int penalties) {
        Penalties = penalties;
    }
    public Customer(ArrayList<Customer> customers){
        this.

    }
}

