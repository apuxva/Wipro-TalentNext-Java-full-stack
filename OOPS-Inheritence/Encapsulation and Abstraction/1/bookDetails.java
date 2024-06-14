/*
Create a class Author with the following information.
Member variables : name (String), email (String), and gender (char)
Create a class Book with the following information.
Member variables : name (String), author (of the class Author you have 
just created), price (double), and qtyInStock (int)
Getters and Setters for all the member variables
In the main method, create a book object and print all details of the book */

class Author{
    private String name;
    private String email;
    private char gender;
    // Parameterized Constructor to initialize the variables
    Author(String name , String email , char g){
        this.name = name;
        this.email = email;
        this.gender = g ;
    }

    //Getter
    String getName(){
        return name;
    }

    String getEmail(){
        return email;
    }

    char getGender(){
        return gender;
    }
}

class Book{
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;

    Book(String name, Author author, double p, int q){
        this.name=name;
        this.author=author;
        this.price=p;
        this.qtyInStock=q;
    }
    //getters
    String getName(){
        return name;
    }

    Author getAuthor(){
        return author ;
    }

    double getPrice(){
        return price;
    }

    int getQtyInStock(){
        return qtyInStock;
    }

    //setters
    void setPrice(double p){
        this.price=p;
    }

    void setQtyInStock (int q){
        this.qtyInStock=q;
    }
}

class bookDetails {
    public static void main(String[] args) {
        Author author = new Author("Apurva","aapurvaapatil@gmail.com",'f');
        Book my_book = new Book("Art of living", author, 4444, 2);
        System.out.println("Name of the book is : " + my_book.getName());
        System.out.println("Author of the book is: " + my_book.getAuthor().getName() + ", " +
                            "Email: " + my_book.getAuthor().getEmail() + ", "+
                            "Gender: " + my_book.getAuthor().getGender() + "," +
                            "Price of the book is: " + my_book.getPrice()+ "," +
                            "Quantity in stock: " + my_book.getQtyInStock());
    }
}
