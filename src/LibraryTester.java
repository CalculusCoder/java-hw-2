
public class LibraryTester {
    //library tester main method
    public static void main(String[] args) {
        //create 3 new book objects with our favorite books
        Book book1 = new Book("Clean Code", "Robert Martin", 2008, "978-0132350884", true, 40.99);
        Book book2 = new Book("Designing Data Intensive Apps", "Martin Kleppmann", 2010, "978-377444", true, 31.85);
        Book book3 = new Book("Software Engineering", "Bob Larkin", 2020, "978-11111111", true, 20.99);

        //operations below as requested on the hw.

        book1.displayInfo();
        book1.borrowBook();
        book2.borrowBook();

        System.out.println("Total available books: " + Book.totalAvailableBooks());

        book2.returnBook();
        System.out.println("Total available books: " + Book.totalAvailableBooks());

        book1.calculateLateFee(5);



    }
}