package edu.fatec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author KelvinVicenteCosta
 */
@Controller
public class DatabaseController {
    @RequestMapping("/database")
    public @ResponseBody String greeting() {
        return "Hello Database from labEngSoftware!";
    }
}
