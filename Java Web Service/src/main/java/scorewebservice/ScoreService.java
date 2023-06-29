package scorewebservice;

import jakarta.ejb.*;
import jakarta.jws.WebService;

/**
 * @Stateless indicates a stateless session bean* @WebService annotation is used
 *            to indicate a SOAP WebService
 */
@Stateless
@WebService
public class ScoreService {
	public static Score score = new Score();

	public Score getScore() {
		return score;
	}

	public void resetScore() {
		score.wins = 0;
		score.losses = 0;
	}

	public int addWin() {
		score.wins++;
		return score.wins;
	}

	public int addLoss() {
		score.losses++;
		return score.losses;
	}
}
