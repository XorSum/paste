package win.han777.paste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    String addArticle(String writer,String content){
        try {
            ArticleModel article = new ArticleModel(writer, content);
            articleRepository.save(article);
            return "这份留言的id是  "+String.valueOf(article.getId());
        }catch (Exception e){
            return e.getMessage();
        }
    }

    String getArticle(int id){
        try {
            ArticleModel article = articleRepository.findById(id);
            return "<textarea  rows=\"30\" cols=\"70\">"+article.getContent()+"</textarea>";
        }catch (Exception e){
            return e.getMessage();
        }
    }


}
