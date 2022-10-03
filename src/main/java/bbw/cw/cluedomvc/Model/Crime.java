package bbw.cw.cluedomvc.Model;

import java.util.ArrayList;
import java.util.List;

/**
 * Crime
 * @author Cameron Weijmer
 * @version 26.09.2022
 */
public class Crime{
    private int actor = 0;
    private int weapon = 0;
    private int scene = 0;

    private List<String> history = new ArrayList<>();

    public void setActor(int i) {
    }

    public int getActor() {
        return actor;
    }

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public int getScene() {
        return scene;
    }

    public void setScene(int scene) {
        this.scene = scene;
    }

    public List<String> getHistory() {
        return history;
    }

    public void setHistory(List<String> history) {
        this.history = history;
    }
// to be done... Getter, Setter and more
}
