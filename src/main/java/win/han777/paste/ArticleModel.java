package win.han777.paste;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ArticleModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String writer;

    @Lob
    @Basic(fetch = FetchType.LAZY)
    @Column(columnDefinition = "Text")
    private String content;

    private Date date;

    public ArticleModel() {
        this.writer = "";
        this.content = "";
        this.date =new Date() ;
    }

    public ArticleModel(String writer, String content) {
        this.writer = writer;
        this.content = content;
        this.date =new Date() ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
