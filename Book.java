public class Book {
    //instance fields...
    String title;
    String author;
    double price;

    //constructor...
    public Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }

    //constructor 2...
    public Book(Book object){
        this.title=object.title;
        this.author=object.author;
        this.price=object.price;
    }

    //replace toString method...
    public String toString(){
        return "Title: "+title+", Author: "+author+", Price: "+price;
    }

    //Compare the author and title of books
    public boolean equals(Book object){
        if((object.title==this.title)&&(object.author==this.author)){
            return true;
        }
        else{
            return false;
        }
    }


    //Method to show if 2 objects are equal or not...
    public boolean objectEquals(Book object){
        if(this==object){
            return true;
        }
        else{
            return false;
        }
    }
}
