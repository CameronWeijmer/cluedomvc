package bbw.cw.cluedomvc.logic;

import bbw.cw.cluedomvc.Model.Crime;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GameLogicTest {

    private GameLogic gameLogic;
    private Crime suggestion;
    private Crime secret;
    private int numberOfSuggestion;
    private int maxNumberOfSuggestion;

    @BeforeEach
    private void setupBeforeEachTest(){
        gameLogic = new GameLogic();
        suggestion = new Crime();
        secret = new Crime();
    }

    @Test
    void evaluateSuggestion() {

        int numberOfSuggestion = 0;
        int maxNumberOfSuggestion = 8;

        // Setup Secret

        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(0);

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);

        GameLogic gamelogic = new GameLogic();

        assertEquals(true, gamelogic.evaluateSuggestion(suggestion, secret, numberOfSuggestion, maxNumberOfSuggestion));
    }
    @Test
    void ActorWeaponSceneNotEqualThenReturnFalseAndHistory0(){
        int numberOfSuggestion = 0;
        int maxNumberOfSuggestion = 8;

        secret.setActor(0);
        secret.setWeapon(0);
        secret.setScene(0);

        suggestion.setActor(0);
        suggestion.setWeapon(0);
        suggestion.setScene(0);
    }
}