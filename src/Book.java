public class Book extends Product {

    private String author;
    private int pages;

    public Book(){

    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public String toStringBook(){
        return  "Author:             " + author + "\n" +
                "Pages:              " + pages + "\n";
    }


}