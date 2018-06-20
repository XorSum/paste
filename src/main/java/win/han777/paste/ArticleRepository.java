package win.han777.paste;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleRepository  extends CrudRepository<ArticleModel,Integer> {

    ArticleModel findById(int id);

}
