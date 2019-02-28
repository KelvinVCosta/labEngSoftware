package edu.fatec.controller;

import edu.fatec.dto.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author KelvinVicenteCosta
 */
@Controller
public class PostController {
 
    @PostMapping(path = "/post", consumes = "application/json", produces = "application/json")
    @ResponseBody
    public String postResponseController(
      @RequestBody Customer customer) {
        
        return customer.toString() + "fake added!!!";
     }
}
