package net.aslangoo.springMvc;

import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice//声明控制建言
public class ExceptionAdvice {
    @ExceptionHandler(value = Exception.class)//定义全局异常处理，拦截所有的Exception
    public ModelAndView exception(Exception e, WebRequest request) {
        ModelAndView modelAndView = new ModelAndView("error");
        modelAndView.addObject("errorMessage", e.getMessage());
        return modelAndView;
    }

    @ModelAttribute//在@RequestMapping之前执行
    public void addAttrabute(Model model) {
        model.addAttribute("msg", "额外信息");
    }

    @InitBinder//定制WebDataBinder绑定
    public void initBind(WebDataBinder dataBinder) {
        dataBinder.setDisallowedFields("id");
    }
}
