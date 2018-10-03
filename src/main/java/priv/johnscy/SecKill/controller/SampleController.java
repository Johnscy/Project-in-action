package priv.johnscy.SecKill.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import priv.johnscy.SecKill.result.Result;
import priv.johnscy.SecKill.service.UserService;


@Controller
@RequestMapping("/demo")
public class SampleController {
    @Autowired
    UserService userService;
    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","John");
        return "hello";
    }

    @RequestMapping("/db/get")
    @ResponseBody
    public Result<String> dbGet(){
        return ;
    }
}
