package controllers;
/**
 * Date: 1/19/21
 * Question Description
 */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Description: TODO
 * Time complexity:O();
 * Space complexity: O();

 */
@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/index", "/vets/index.html"})
    public String listVets() {
        return "vets/index";

    }
}
