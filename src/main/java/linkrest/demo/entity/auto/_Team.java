package linkrest.demo.entity.auto;

import java.util.List;

import org.apache.cayenne.CayenneDataObject;
import org.apache.cayenne.exp.Property;

import linkrest.demo.entity.Game;

/**
 * Class _Team was generated by Cayenne.
 * It is probably a good idea to avoid changing this class manually,
 * since it may be overwritten next time code is regenerated.
 * If you need to make any customizations, please use subclass.
 */
public abstract class _Team extends CayenneDataObject {

    private static final long serialVersionUID = 1L; 

    public static final String ID_PK_COLUMN = "id";

    public static final Property<String> NAME = new Property<String>("name");
    public static final Property<List<Game>> HOME_GAMES = new Property<List<Game>>("homeGames");
    public static final Property<List<Game>> VISITING_GAMES = new Property<List<Game>>("visitingGames");

    public void setName(String name) {
        writeProperty("name", name);
    }
    public String getName() {
        return (String)readProperty("name");
    }

    public void addToHomeGames(Game obj) {
        addToManyTarget("homeGames", obj, true);
    }
    public void removeFromHomeGames(Game obj) {
        removeToManyTarget("homeGames", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Game> getHomeGames() {
        return (List<Game>)readProperty("homeGames");
    }


    public void addToVisitingGames(Game obj) {
        addToManyTarget("visitingGames", obj, true);
    }
    public void removeFromVisitingGames(Game obj) {
        removeToManyTarget("visitingGames", obj, true);
    }
    @SuppressWarnings("unchecked")
    public List<Game> getVisitingGames() {
        return (List<Game>)readProperty("visitingGames");
    }


}
