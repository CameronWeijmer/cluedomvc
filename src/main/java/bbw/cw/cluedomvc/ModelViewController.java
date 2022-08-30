package bbw.cw.cluedomvc;

/*
*   ModelViewController
*
* @author Cameron Weijmer
* @version 29.08.2022
*
* */

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ModelViewController {

    @GetMapping("/showCriminals")
        public String showCriminals(){
            System.out.println("ModelViewController.showCriminals");
            return "personview";
        }
}
