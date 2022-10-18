import java.util.ArrayList;
import java.util.List;

public class Chapter {
    public String name;
    List<SubChapter> subchapters;

    public Chapter(String name) {
        this.name = name;
        this.subchapters = new ArrayList<SubChapter>();
    }

    public int createSubChapter(String name) {
        subchapters.add(new SubChapter(name));
        return subchapters.indexOf(name) + 1;
    }

    public SubChapter getSubChapter(int chapter) {
        return subchapters.get(chapter);
    }

    public void print() {
        System.out.println("Chapter: " + name);
        for(SubChapter sub : subchapters) {
            sub.print();
        }
    }
}
