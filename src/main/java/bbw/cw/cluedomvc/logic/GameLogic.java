package bbw.cw.cluedomvc.logic;

import java.util.Random;

import bbw.cw.cluedomvc.Model.Crime;
import bbw.cw.cluedomvc.logic.GameLogic;
import bbw.cw.cluedomvc.Model.DataService;

/**
 * GameLogic
 *
 * @author Cameron Weijmer
 * @version 26.09.2022
 */
public class GameLogic {
    public void setupNewGame(DataService service, Crime secret) {
        Random random = new Random();
        secret.setActor(random.nextInt(service.getPersons().size()));
        secret.setWeapon(random.nextInt(service.getWeapons().size()));
        secret.setScene(random.nextInt(service.getRooms().size()));
        System.out.println("Gamelogic.setupNewGame " + secret);
    }

    public boolean evaluateSuggestion(Crime suggestion, Crime secret, int numberOfSuggestion,
                                      int maxNumberOfSuggestions) {
        int right = 0;

        if (suggestion.getWeapon() == secret.getWeapon()) {
            right++;
        }

        if (suggestion.getActor() == secret.getActor()) {
            right++;
        }

        if (suggestion.getScene() == secret.getScene()) {
            right++;
        }

        if (right == 3) {
            suggestion.getHistory().add(
                    "WIN, found correct answer: actor " + secret.getActor()
                            + " Weapon: " + secret.getWeapon()
                            + " Scene: " + secret.getScene());
            return true;
        } else if (numberOfSuggestion >= maxNumberOfSuggestions) {
            suggestion.getHistory().add("Failed, no more suggestions available");
            return true;
        }
        suggestion.getHistory().add("Correct: " + right + "Come on!");

        return false;
    }
}

