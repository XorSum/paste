package win.han777.paste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin("*")
public class ArtivleController {

    @Autowired
    ArticleService articleService;

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public String add(String writer,String content){
        return articleService.addArticle(writer,content);
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public String get(int aid){
        return articleService.getArticle(aid);
    }


}

