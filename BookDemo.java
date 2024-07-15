public class BookDemo {
    public static void main(String[] args){
        //Creating 2 books with same author and title but different price...
        Book bookOne = new Book("Awesome Book", "John Smith", 10.00);

        Book bookTwo = new Book("Awesome Book", "John Smith", 9.99);

        //Printing out details of each book...
        System.out.println("Book 1: "+bookOne.toString()+0);

        System.out.println("Book 2: "+bookTwo.toString());

        System.out.println("Books are equal: "+bookOne.equals(bookTwo));

        //create a deep copy of one of the books and show they have the same contents but are separate objects
        Book bookThree = new Book(bookOne);

        System.out.println("Book 3 (copy of Book 1): "+bookThree.toString());

        System.out.println("Book 3 and Book 1 are the same object: "+bookThree.objectEquals(bookOne));
    }
}
