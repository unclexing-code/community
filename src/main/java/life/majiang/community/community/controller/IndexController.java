package life.majiang.community.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by unclexing on 2019/6/20.
 */

@Controller  //return 模板
//@RestController  //return 字符串
public class IndexController {
    @GetMapping("/")
    public String index(){
        return "index";
    }

//    @GetMapping("/demo")
//    public String demo() {
//        return "hello world";
//    }
}
