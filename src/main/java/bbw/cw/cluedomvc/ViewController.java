package bbw.cw.cluedomvc;

/*
 *   ModelViewController
 *
 * @author Cameron Weijmer
 * @version 04.09.2022
 *
 * */

import bbw.cw.cluedomvc.logic.GameLogic;
import bbw.cw.cluedomvc.Model.Crime;
import bbw.cw.cluedomvc.Model.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ViewController {
    @Autowired
    private DataService service;
    private GameLogic gameLogic = new GameLogic();

    @RequestMapping(value = {"/", "/showView"}, method = RequestMethod.GET)
    public String showView(Model model){
        System.out.println("ViewController.showView");

        //prepare game
        service.resetGame();
        gameLogic.setupNewGame(service, service.getSecret());

        model.addAttribute("persons", service.getPersons() );
        model.addAttribute("weapons", service.getWeapons() );
        model.addAttribute("rooms", service.getRooms() );
        model.addAttribute("crime", service.getSuggestion());
        model.addAttribute("history", service.getSuggestion().getHistory());
        return "cluedolistview";
    }

    @RequestMapping(value = {"/showView"}, method = RequestMethod.POST, params = {"submit=Evaluate"})
    public String evaluate(Model model, @ModelAttribute("crime") Crime crime){
        System.out.println("ViewController.evaluate: " + crime);

        //Store value of suggestion in service
        service.getSuggestion().setActor(crime.getActor());
        service.getSuggestion().setWeapon(crime.getWeapon());
        service.getSuggestion().setScene(crime.getScene());

        //evaluate suggestion
        gameLogic.evaluateSuggestion(service.getSuggestion(), service.getSecret(),
                service.getNumberOfSuggestions(), service.getMAXNUMBEROFSUGGESTIONS());
        service.increaseNumberOfSuggestions();

        model.addAttribute("persons", service.getPersons() );
        model.addAttribute("weapons", service.getWeapons() );
        model.addAttribute("rooms", service.getRooms() );
        model.addAttribute("crime", service.getSuggestion());
        model.addAttribute("history", service.getSuggestion().getHistory());
        return "cluedolistview";
    }

    @RequestMapping(value = {"/showView"}, method = RequestMethod.POST, params = {"submit=New"})
    public String newGame(){
        System.out.println("ViewController.newGame");
        return "redirect:/";
    }
}
