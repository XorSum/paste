package win.han777.paste.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import win.han777.paste.article.ArticleService;
import win.han777.paste.util.Result;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ArticleController {

    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Result add(String content,String mode){
        System.out.println(content+" "+mode);
        return articleService.addArticle(content,mode);
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public Result get(int aid){
        return articleService.getArticle(aid);
    }


}

