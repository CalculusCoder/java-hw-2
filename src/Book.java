public class Book {

    //Fields
    String title;
    String author;
    int publicationYear;
    String ISBN;
    boolean available;
    double price;
    static int totalAvailableBooks; //static to call the Book object directly from our main method

    //Constructor
    public Book(String title, String author, int publicationYear, String ISBN, boolean available, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.ISBN = ISBN;
        this.available = available;
        this.price = price;

        totalAvailableBooks++; //increment book count when new book object is created
    }

    //Getters / Accessors
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public String getISBN() {
        return ISBN;
    }

    public boolean isAvailable() {
        return available;
    }

    public double getPrice() {
        return price;
    }

    //get book count statically
    public static int totalAvailableBooks() {
        return totalAvailableBooks;
    }

    //Setters / Mutators
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //Display info method
    public void displayInfo() {
        System.out.println("Book Details");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publication Year: " + publicationYear);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Available: " + available);
        System.out.println("Price: $" + price);
    }

    //Borrow Book method
    public void borrowBook() {
        if (available) {  //if book is available, set availiblity to false and decrease total book count
            available = false;
            totalAvailableBooks--;
            System.out.println("You have borrowed " + title);
        } else {
            System.out.println("Book is already borrowed");
        }
    }

    public void returnBook() {
        if (!available) { //if book is not available, set availiblity to true and increase total book count
            available = true;
            totalAvailableBooks++;
            System.out.println("You have returned " + title);
        } else {
            System.out.println("Book is already in library");
        }
    }

    //calculate late fee by function. Takes 1 parameter, days overdo.
    public void calculateLateFee(int daysOverdue) {
        double lateFee = 0.50; //fixed late fee

        //calculate total price based on fixed late fee
        System.out.println(String.format("Late fee charge: $ %.2f", lateFee * daysOverdue));
    }






}
