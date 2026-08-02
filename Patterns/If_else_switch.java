import java.util.Scanner;

class Book {
    int id;
    String title;
    Boolean isIssued;

    Book(int id,String title){
        this.id=id;
        this.isIssued=false;
        this.title=title;
    }

    void Display() {
        System.out.println("Book id: "+id+"\nTitle: "+title+"\n Isissued: "+isIssued);
    }
}

class Library {
    Book books[] = new Book[5];
    int count=0;

    void addBooks(int id, String title) {
        if(count < books.length) {
            books[count]=new Book(id, title);
            count++;
            System.out.println("Books added successfully!");
        }
        else {
            System.out.println("Library is full!");
        }
    }
}

public class If_else_switch {
}
