package win.han777.paste.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import win.han777.paste.util.Result;

import java.util.Date;


@Service
public class ArticleService {

    @Autowired
    ArticleRepository articleRepository;

    Result addArticle(String content,String mode){
        try {
            Article article = new Article();
            article.setDate(new Date());
            article.setContent(content);
            article.setMode(mode);
            article.setReadCount(0);
            articleRepository.save(article);

            return Result.success(article);
        }catch (Exception e){
            e.printStackTrace();
            return Result.error();
        }
    }

    Result getArticle(int id){
        try {
            Article article = articleRepository.findById(id);
            if (article!=null){
                int readCount = article.getReadCount()+1;
                article.setReadCount(readCount);
                articleRepository.save(article);
                return Result.success(article);
            }else{
                return Result.error("根据相关法律法规，部分搜索结果不予展示");
            }
        }catch (Exception e){
            e.printStackTrace();
            return Result.error();
        }
    }


}
