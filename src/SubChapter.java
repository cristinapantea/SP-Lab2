import java.util.ArrayList;
import java.util.List;

public class SubChapter {
    public String name;
    List<Paragraph> paragraphs;
    List<Image> images;
    List<Table> tables;

    public SubChapter(String name) {
        this.name = name;
        this.paragraphs = new ArrayList<Paragraph>();
        this.images = new ArrayList<Image>();
        this.tables = new ArrayList<Table>();
    }

    public void createNewParagraph(String paragraph) {
        paragraphs.add(new Paragraph(paragraph));
    }

    public void createNewImage(String image) {
        images.add(new Image(image));
    }

    public void createNewTable(String table) {
        tables.add(new Table(table));
    }

    public void print() {
        System.out.println("Subchapter: " + name);
        for(Paragraph par : paragraphs) {
            par.print();
        }
        for(Image img : images) {
            img.print();
        }
        for(Table tab : tables) {
            tab.print();
        }
    }
}
