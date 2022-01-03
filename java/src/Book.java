public class Book {

    private String title;
    private String author;
    private Data chapters;

    public String getChapters() {
        if(this.chapters == null)
            throw  new NullPointerException("The book has no chapters");
        return this.chapters.getData();
    }

    public void setChapters(Data chapters) {
        this.chapters = chapters;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
