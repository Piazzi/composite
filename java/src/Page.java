public class Page extends Data {

    private int number;

    public Page(String content, int number) {
        super(content);
        this.number = number;
    }

    public String getData() {
        return this.getContent() + " - Page number: " + this.number + " \n ";
    }
}
