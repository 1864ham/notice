package ds.com.notice.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
@RequestMapping("/notice")
@RequiredArgsConstructor
public class NoticeController {

    @RequestMapping("/index")
    public ModelAndView ex() {
        ModelAndView mv = new ModelAndView("/index");
        mv.setViewName("/index");
        mv.addObject("myName","박다은");

        return mv;
    }


}
