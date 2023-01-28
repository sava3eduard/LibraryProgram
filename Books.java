import java.time.Year;

public class Books {
    private int Year ;
    private String Title;
    private String Gendre;
    private String Author;
    private boolean isInStock;

    public Books(int Year,String Title,String Gendre,String Author,boolean isInStock){
        this.Year=Year;
        this.Title=Title;
        this.Gendre=Gendre;
        this.Author=Author;
        this.isInStock=isInStock;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int year) {
        Year = year;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getGendre() {
        return Gendre;
    }

    public void setGendre(String gendre) {
        Gendre = gendre;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public boolean isInStock() {
        return isInStock;
    }

    public void setInStock(boolean inStock) {
        isInStock = inStock;
    }
}
