class Book{
    String title;
    String author;
    Book(String title){
        this(title,"Unknown author");
    }
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }
    void displayBook(){
        System.out.println(this.title+" is written by "+this.author);
    }

}
public class Library_book {
    public static void main(String[] args){
        Book scifi= new Book("Ruku");
        Book history= new Book("Ana","D. Zerox");
        scifi.displayBook();
        history.displayBook();
    }
}
