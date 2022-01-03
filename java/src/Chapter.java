import java.util.ArrayList;
import java.util.List;

public class Chapter extends Data {

    private List<Data> pages;

    public Chapter(String content) {
        super(content);
        this.pages = new ArrayList<Data>();
    }

    public String getData(){
        String output = "";
        output = this.getContent() + " \n ";
        for (Data page : pages){
            output += " " + page.getData();
        }
        return output;
    }

    public void addData(Data data){
        this.pages.add(data);
    }
}
