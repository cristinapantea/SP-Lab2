import java.util.ArrayList;
import java.util.List;

public class Book {
    public String title;
    Author author;
    List<Chapter> chapters;

    public Book(String title) {
        this.title = title;
        this.chapters = new ArrayList<Chapter>();
    }

    public void addAuthor(Author name) {
        this.author = name;
    }

    public int createChapter(String name) {
        chapters.add(new Chapter(name));
        return chapters.indexOf(name) + 1;
    }

    public Chapter getChapter(int chapter) {
        return chapters.get(chapter);
    }


    public void print() {
        author.print();
        for(Chapter chp : chapters) {
            chp.print();
        }
    }

}
