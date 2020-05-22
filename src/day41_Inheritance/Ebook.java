package day41_Inheritance;

public class Ebook extends Book{

    /*
    title(inherited)
    author (inherited)
    price (inherited)
    toString()  (inherited)

    size (declared)
    page (declared)
    readBook()

     */
    public String size;
    public int pages;

    public void readBook(){
        System.out.println("reading "+title);
    }

}
