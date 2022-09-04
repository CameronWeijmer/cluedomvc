package bbw.cw.cluedomvc;

/*
*   ModelViewController
*
* @author Cameron Weijmer
* @version 04.09.2022
*
* */

import bbw.cw.cluedomvc.DataModel.DataService;
import bbw.cw.cluedomvc.DataModel.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModelViewController {

    @Autowired
    private DataService list;

    @RequestMapping(value = {"/", "/addPerson"}, method = RequestMethod.GET)
    public String showCrowdfunding(Model model) {
        model.addAttribute("item", new Person());
        model.addAttribute("Persons", list.getPersonList());
        System.out.println("ModelViewController.showPerson");
        return "personview";
    }
}
