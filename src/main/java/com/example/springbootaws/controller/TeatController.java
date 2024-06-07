package com.example.springbootaws.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class TeatController
{
    @GetMapping("/")
    public String test1()
    {
        return "this is home page";
    }

    @GetMapping("/index")
    public String test2()
    {
        return "this is index page";
    }

    @GetMapping("/home")
    public String test3()
    {
        return "this is home page";
    }

    @GetMapping("/{number1}/{operation}/{number2}")
    public String test4(@PathVariable float number1, @PathVariable String operation, @PathVariable float number2)
    {
        if(operation.equals("add") || operation.equals("and")|| operation.equals("plus")|| operation.equals("+"))
        {
            return String.valueOf(number1+number2);
        }
        else if(operation.equals("minus") || operation.equals("-"))
        {
            return String.valueOf(number1-number2);
        }
        else if(operation.equals("times") || operation.equals("multiply") || operation.equals("*"))
        {
            return String.valueOf(number1*number2);
        }
        else if(operation.equals("over") || operation.equals("divide"))
        {
            if(number2 == 0)
            {
                return "ERROR: Zero cannot be used as a denominator";
            }
            else
            {
                return String.valueOf(number1/number2);
            }
        }
        else
        {
            return "ERROR: unknown operation";
        }
    }

}
