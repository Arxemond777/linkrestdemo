package linkrest.demo.entity;



import com.nhl.link.rest.annotation.LrAttribute;
import linkrest.demo.entity.auto._Game;

public class Game extends _Game {

    private static final long serialVersionUID = 1L;

    private Score score;

    @LrAttribute
    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }
}
