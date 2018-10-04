package priv.johnscy.SecKill.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import priv.johnscy.SecKill.domain.User;
import priv.johnscy.SecKill.redis.RedisService;
import priv.johnscy.SecKill.result.Result;
import priv.johnscy.SecKill.service.UserService;


@Controller
@RequestMapping("/demo")
public class SampleController {
    @Autowired
    UserService userService;
    @Autowired
    RedisService redisService;

    @RequestMapping("/thymeleaf")
    public String thymeleaf(Model model){
        model.addAttribute("name","John");
        return "hello";
    }

    @RequestMapping("/db/get")
    @ResponseBody
    public Result<User> dbGet(){
        User user = userService.getById(1);
        return Result.success(user);
    }

    @RequestMapping("/redis/get")
    @ResponseBody
    public Result<Long> redisGet(){
        Long v1 = redisService.get("key1",Long.class);
        return Result.success(v1);
    }
}
