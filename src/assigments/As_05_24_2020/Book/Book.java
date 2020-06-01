package assigments.As_05_24_2020.Book;

public class Book {
    String title; // taqyryby
    String author;
    String tableOfContents=""; // mazmuni

    int nextPage=1;
    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }
/*
A method named addChapter that accepts two parameters. The first, of type String, is the title of the chapter;
the

second, is an integer containing the number of pages in the chapter.

addChapter appends (that is concatenates)
a newline followed by the chapter title followed by the string "..." followed by the value of the nextPage instance
variable to the tableOfContents. The method also increases the value of nextPage by the number of pages in the chapter.
 */

    public void addChapter(String titleChapter, int numPage){
        tableOfContents = titleChapter+" "+numPage;
        nextPage+=numPage;
    }

    public int getPages(){
        return nextPage;
    }

    public String getTableOfContents(){
        return getTableOfContents();
    }

    /*
  A method named toString that accepts no parameters.
  toString returns a String consisting of the value of title, followed by a newline character, followed by the value of author.
     */

  public String toString(){
      return title+"\n"+author;
  }





}
