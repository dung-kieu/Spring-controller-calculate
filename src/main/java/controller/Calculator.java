package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Calculator {
@RequestMapping(value = "",method = RequestMethod.GET)
    public ModelAndView get(){
    ModelAndView modelAndView = new ModelAndView("index");
    return modelAndView;
}
@RequestMapping(value = "/calculate", method = RequestMethod.POST)
    public ModelAndView calculate (@RequestParam("firstNumber") double number1,@RequestParam("secondNumber") double number2,@RequestParam("operator") String operator  ){
    double result= 0;
    switch (operator){
        case "+":
            result = number1+number2;
            break;
        case "-":
            result = number1-number2;
            break;
        case "*":
            result = number1*number2;
            break;
        case "/":
            result = number1/number2;
            break;
    }
    ModelAndView modelAndView = new ModelAndView("index","result", result);
    modelAndView.addObject("firstNumber",number1);
    modelAndView.addObject("secondNumber",number2);
    return modelAndView;
}
}