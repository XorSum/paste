package win.han777.paste.article;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository  extends CrudRepository<Article,Integer> {

    Article findById(int id);

}
