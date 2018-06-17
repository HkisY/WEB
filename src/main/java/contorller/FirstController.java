package contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Hxin
 * @describe
 * @since 2018/5/5 下午7:38
 */
@Controller
@RequestMapping(value = "/")
public class FirstController {
    public ModelAndView welcomeView(HttpServletRequest request, HttpServletResponse response) {
        return new ModelAndView("/WEB-INF/hello.jsp");
    }
}
