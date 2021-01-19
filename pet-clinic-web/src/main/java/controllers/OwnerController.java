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
public class OwnerController {

    @RequestMapping({"/owners", "/owners/index", "/owners/index.html"})
    public String listOwners() {
        return "owners/index";

    }
}
