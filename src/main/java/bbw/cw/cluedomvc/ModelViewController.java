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
import org.springframework.web.bind.annotation.*;

@Controller
public class ModelViewController {

    @Autowired
    private DataService list;

    @GetMapping(value = {"/", "/addPerson"})
    public String showPersons(Model model) {
        model.addAttribute("Person", list.getPersonList());
        System.out.println("ModelViewController.showPersons");
        return "personview";
    }

//    @PostMapping("/addPerson")
//    public String addDonation(@ModelAttribute Person personList, Model model) {
//        list.getPersonList().add(personList);
//        model.addAttribute("item", new Person());
//        model.addAttribute("donations", list.getPersonList());
//        System.out.println("ViewController.person");
//        return "personview";
//    }
}
