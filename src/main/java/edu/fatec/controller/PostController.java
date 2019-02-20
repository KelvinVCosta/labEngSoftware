package edu.fatec.controller;

import edu.fatec.dto.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author KelvinVicenteCosta
 */
@Controller
@RequestMapping("/post")
public class PostController {
 
    @PostMapping("/response")
    @ResponseBody
    public String postResponseController(
      @RequestBody Customer customer) {
        return customer.toString() + "fake added!!!";
     }
}
