package Array;

public class Book {
    private int noofPages;
    private String name;
    public Book(){}
    public Book(int noofPages, String name) {
        this.noofPages = noofPages;
        this.name = name;
    }
    public int getNoofPages() {
        return noofPages;
    }
    public void setNoofPages(int noofPages) {
        this.noofPages = noofPages;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

}
