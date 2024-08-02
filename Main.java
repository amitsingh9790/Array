package Array;

public class Main {
    public static void main(String[] args) {
        Book [] book = new Book[2];
        Book b1 = new Book(126,"Hindi");
        Book b2 = new Book();
        b2.setNoofPages(201);
        b2.setName("Physics");
        book[0]=b1;
        book[1]=b2;

        for (int i = 0; i < book.length; i++) {
            System.out.println(book[i].getName());
            System.out.println(book[i].getNoofPages());
        }
    }
}