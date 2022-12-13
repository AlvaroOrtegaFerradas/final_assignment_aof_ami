/**
 */
package football_db;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link football_db.Team#getName <em>Name</em>}</li>
 *   <li>{@link football_db.Team#getLeague <em>League</em>}</li>
 *   <li>{@link football_db.Team#getPlayers <em>Players</em>}</li>
 *   <li>{@link football_db.Team#getMatches <em>Matches</em>}</li>
 *   <li>{@link football_db.Team#getNumber_matches <em>Number matches</em>}</li>
 *   <li>{@link football_db.Team#getWins <em>Wins</em>}</li>
 *   <li>{@link football_db.Team#getDraws <em>Draws</em>}</li>
 *   <li>{@link football_db.Team#getLosses <em>Losses</em>}</li>
 *   <li>{@link football_db.Team#getPoints <em>Points</em>}</li>
 *   <li>{@link football_db.Team#getGoals_scored <em>Goals scored</em>}</li>
 *   <li>{@link football_db.Team#getGoals_conceded <em>Goals conceded</em>}</li>
 *   <li>{@link football_db.Team#getClean_sheets <em>Clean sheets</em>}</li>
 *   <li>{@link football_db.Team#getAverage_possesion <em>Average possesion</em>}</li>
 *   <li>{@link football_db.Team#getShots <em>Shots</em>}</li>
 *   <li>{@link football_db.Team#getShots_on_target <em>Shots on target</em>}</li>
 *   <li>{@link football_db.Team#getPoints_per_game <em>Points per game</em>}</li>
 *   <li>{@link football_db.Team#getGoals_difference <em>Goals difference</em>}</li>
 *   <li>{@link football_db.Team#getShoot_accuracy <em>Shoot accuracy</em>}</li>
 *   <li>{@link football_db.Team#getShoots_per_game <em>Shoots per game</em>}</li>
 *   <li>{@link football_db.Team#getShoots_on_target_per_game <em>Shoots on target per game</em>}</li>
 *   <li>{@link football_db.Team#getScored_goals_per_game <em>Scored goals per game</em>}</li>
 *   <li>{@link football_db.Team#getConceded_goals_per_game <em>Conceded goals per game</em>}</li>
 *   <li>{@link football_db.Team#getGoals_per_shoots <em>Goals per shoots</em>}</li>
 *   <li>{@link football_db.Team#getGoals_per_shoots_on_target <em>Goals per shoots on target</em>}</li>
 *   <li>{@link football_db.Team#getElo <em>Elo</em>}</li>
 * </ul>
 *
 * @see football_db.Football_dbPackage#getTeam()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='check_matches'"
 * @generated
 */
public interface Team extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see football_db.Football_dbPackage#getTeam_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link football_db.Team#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>League</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link football_db.League#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League</em>' container reference.
	 * @see #setLeague(League)
	 * @see football_db.Football_dbPackage#getTeam_League()
	 * @see football_db.League#getTeams
	 * @model opposite="Teams" required="true" transient="false"
	 * @generated
	 */
	League getLeague();

	/**
	 * Sets the value of the '{@link football_db.Team#getLeague <em>League</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League</em>' container reference.
	 * @see #getLeague()
	 * @generated
	 */
	void setLeague(League value);

	/**
	 * Returns the value of the '<em><b>Players</b></em>' containment reference list.
	 * The list contents are of type {@link football_db.Player}.
	 * It is bidirectional and its opposite is '{@link football_db.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Players</em>' containment reference list.
	 * @see football_db.Football_dbPackage#getTeam_Players()
	 * @see football_db.Player#getTeam
	 * @model opposite="Team" containment="true" required="true"
	 * @generated
	 */
	EList<Player> getPlayers();

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' reference list.
	 * The list contents are of type {@link football_db.Match}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' reference list.
	 * @see football_db.Football_dbPackage#getTeam_Matches()
	 * @model required="true"
	 * @generated
	 */
	EList<Match> getMatches();

	/**
	 * Returns the value of the '<em><b>Number matches</b></em>' attribute.
	 * The default value is <code>"38"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number matches</em>' attribute.
	 * @see football_db.Football_dbPackage#getTeam_Number_matches()
	 * @model default="38" required="true" changeable="false"
	 * @generated
	 */
	int getNumber_matches();

	/**
	 * Returns the value of the '<em><b>Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Wins</em>' attribute.
	 * @see #setWins(int)
	 * @see football_db.Football_dbPackage#getTeam_Wins()
	 * @model required="true"
	 * @generated
	 */
	int getWins();

	/**
	 * Sets the value of the '{@link football_db.Team#getWins <em>Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Wins</em>' attribute.
	 * @see #getWins()
	 * @generated
	 */
	void setWins(int value);

	/**
	 * Returns the value of the '<em><b>Draws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Draws</em>' attribute.
	 * @see #setDraws(int)
	 * @see football_db.Football_dbPackage#getTeam_Draws()
	 * @model required="true"
	 * @generated
	 */
	int getDraws();

	/**
	 * Sets the value of the '{@link football_db.Team#getDraws <em>Draws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Draws</em>' attribute.
	 * @see #getDraws()
	 * @generated
	 */
	void setDraws(int value);

	/**
	 * Returns the value of the '<em><b>Losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Losses</em>' attribute.
	 * @see #setLosses(int)
	 * @see football_db.Football_dbPackage#getTeam_Losses()
	 * @model required="true"
	 * @generated
	 */
	int getLosses();

	/**
	 * Sets the value of the '{@link football_db.Team#getLosses <em>Losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Losses</em>' attribute.
	 * @see #getLosses()
	 * @generated
	 */
	void setLosses(int value);

	/**
	 * Returns the value of the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points</em>' attribute.
	 * @see #setPoints(int)
	 * @see football_db.Football_dbPackage#getTeam_Points()
	 * @model required="true"
	 * @generated
	 */
	int getPoints();

	/**
	 * Sets the value of the '{@link football_db.Team#getPoints <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points</em>' attribute.
	 * @see #getPoints()
	 * @generated
	 */
	void setPoints(int value);

	/**
	 * Returns the value of the '<em><b>Goals scored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals scored</em>' attribute.
	 * @see #setGoals_scored(int)
	 * @see football_db.Football_dbPackage#getTeam_Goals_scored()
	 * @model required="true"
	 * @generated
	 */
	int getGoals_scored();

	/**
	 * Sets the value of the '{@link football_db.Team#getGoals_scored <em>Goals scored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals scored</em>' attribute.
	 * @see #getGoals_scored()
	 * @generated
	 */
	void setGoals_scored(int value);

	/**
	 * Returns the value of the '<em><b>Goals conceded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals conceded</em>' attribute.
	 * @see #setGoals_conceded(int)
	 * @see football_db.Football_dbPackage#getTeam_Goals_conceded()
	 * @model required="true"
	 * @generated
	 */
	int getGoals_conceded();

	/**
	 * Sets the value of the '{@link football_db.Team#getGoals_conceded <em>Goals conceded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals conceded</em>' attribute.
	 * @see #getGoals_conceded()
	 * @generated
	 */
	void setGoals_conceded(int value);

	/**
	 * Returns the value of the '<em><b>Clean sheets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clean sheets</em>' attribute.
	 * @see #setClean_sheets(int)
	 * @see football_db.Football_dbPackage#getTeam_Clean_sheets()
	 * @model required="true"
	 * @generated
	 */
	int getClean_sheets();

	/**
	 * Sets the value of the '{@link football_db.Team#getClean_sheets <em>Clean sheets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clean sheets</em>' attribute.
	 * @see #getClean_sheets()
	 * @generated
	 */
	void setClean_sheets(int value);

	/**
	 * Returns the value of the '<em><b>Average possesion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Average possesion</em>' attribute.
	 * @see #setAverage_possesion(int)
	 * @see football_db.Football_dbPackage#getTeam_Average_possesion()
	 * @model required="true"
	 * @generated
	 */
	int getAverage_possesion();

	/**
	 * Sets the value of the '{@link football_db.Team#getAverage_possesion <em>Average possesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Average possesion</em>' attribute.
	 * @see #getAverage_possesion()
	 * @generated
	 */
	void setAverage_possesion(int value);

	/**
	 * Returns the value of the '<em><b>Shots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shots</em>' attribute.
	 * @see #setShots(int)
	 * @see football_db.Football_dbPackage#getTeam_Shots()
	 * @model required="true"
	 * @generated
	 */
	int getShots();

	/**
	 * Sets the value of the '{@link football_db.Team#getShots <em>Shots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shots</em>' attribute.
	 * @see #getShots()
	 * @generated
	 */
	void setShots(int value);

	/**
	 * Returns the value of the '<em><b>Shots on target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shots on target</em>' attribute.
	 * @see #setShots_on_target(int)
	 * @see football_db.Football_dbPackage#getTeam_Shots_on_target()
	 * @model required="true"
	 * @generated
	 */
	int getShots_on_target();

	/**
	 * Sets the value of the '{@link football_db.Team#getShots_on_target <em>Shots on target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shots on target</em>' attribute.
	 * @see #getShots_on_target()
	 * @generated
	 */
	void setShots_on_target(int value);

	/**
	 * Returns the value of the '<em><b>Points per game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Points per game</em>' attribute.
	 * @see #setPoints_per_game(double)
	 * @see football_db.Football_dbPackage#getTeam_Points_per_game()
	 * @model required="true"
	 * @generated
	 */
	double getPoints_per_game();

	/**
	 * Sets the value of the '{@link football_db.Team#getPoints_per_game <em>Points per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Points per game</em>' attribute.
	 * @see #getPoints_per_game()
	 * @generated
	 */
	void setPoints_per_game(double value);

	/**
	 * Returns the value of the '<em><b>Goals difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals difference</em>' attribute.
	 * @see #setGoals_difference(int)
	 * @see football_db.Football_dbPackage#getTeam_Goals_difference()
	 * @model required="true"
	 * @generated
	 */
	int getGoals_difference();

	/**
	 * Sets the value of the '{@link football_db.Team#getGoals_difference <em>Goals difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals difference</em>' attribute.
	 * @see #getGoals_difference()
	 * @generated
	 */
	void setGoals_difference(int value);

	/**
	 * Returns the value of the '<em><b>Shoot accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shoot accuracy</em>' attribute.
	 * @see #setShoot_accuracy(double)
	 * @see football_db.Football_dbPackage#getTeam_Shoot_accuracy()
	 * @model required="true"
	 * @generated
	 */
	double getShoot_accuracy();

	/**
	 * Sets the value of the '{@link football_db.Team#getShoot_accuracy <em>Shoot accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shoot accuracy</em>' attribute.
	 * @see #getShoot_accuracy()
	 * @generated
	 */
	void setShoot_accuracy(double value);

	/**
	 * Returns the value of the '<em><b>Shoots per game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shoots per game</em>' attribute.
	 * @see #setShoots_per_game(double)
	 * @see football_db.Football_dbPackage#getTeam_Shoots_per_game()
	 * @model required="true"
	 * @generated
	 */
	double getShoots_per_game();

	/**
	 * Sets the value of the '{@link football_db.Team#getShoots_per_game <em>Shoots per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shoots per game</em>' attribute.
	 * @see #getShoots_per_game()
	 * @generated
	 */
	void setShoots_per_game(double value);

	/**
	 * Returns the value of the '<em><b>Shoots on target per game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shoots on target per game</em>' attribute.
	 * @see #setShoots_on_target_per_game(double)
	 * @see football_db.Football_dbPackage#getTeam_Shoots_on_target_per_game()
	 * @model required="true"
	 * @generated
	 */
	double getShoots_on_target_per_game();

	/**
	 * Sets the value of the '{@link football_db.Team#getShoots_on_target_per_game <em>Shoots on target per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Shoots on target per game</em>' attribute.
	 * @see #getShoots_on_target_per_game()
	 * @generated
	 */
	void setShoots_on_target_per_game(double value);

	/**
	 * Returns the value of the '<em><b>Scored goals per game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scored goals per game</em>' attribute.
	 * @see #setScored_goals_per_game(double)
	 * @see football_db.Football_dbPackage#getTeam_Scored_goals_per_game()
	 * @model required="true"
	 * @generated
	 */
	double getScored_goals_per_game();

	/**
	 * Sets the value of the '{@link football_db.Team#getScored_goals_per_game <em>Scored goals per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Scored goals per game</em>' attribute.
	 * @see #getScored_goals_per_game()
	 * @generated
	 */
	void setScored_goals_per_game(double value);

	/**
	 * Returns the value of the '<em><b>Conceded goals per game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Conceded goals per game</em>' attribute.
	 * @see #setConceded_goals_per_game(double)
	 * @see football_db.Football_dbPackage#getTeam_Conceded_goals_per_game()
	 * @model required="true"
	 * @generated
	 */
	double getConceded_goals_per_game();

	/**
	 * Sets the value of the '{@link football_db.Team#getConceded_goals_per_game <em>Conceded goals per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conceded goals per game</em>' attribute.
	 * @see #getConceded_goals_per_game()
	 * @generated
	 */
	void setConceded_goals_per_game(double value);

	/**
	 * Returns the value of the '<em><b>Goals per shoots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals per shoots</em>' attribute.
	 * @see #setGoals_per_shoots(double)
	 * @see football_db.Football_dbPackage#getTeam_Goals_per_shoots()
	 * @model required="true"
	 * @generated
	 */
	double getGoals_per_shoots();

	/**
	 * Sets the value of the '{@link football_db.Team#getGoals_per_shoots <em>Goals per shoots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals per shoots</em>' attribute.
	 * @see #getGoals_per_shoots()
	 * @generated
	 */
	void setGoals_per_shoots(double value);

	/**
	 * Returns the value of the '<em><b>Goals per shoots on target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals per shoots on target</em>' attribute.
	 * @see #setGoals_per_shoots_on_target(double)
	 * @see football_db.Football_dbPackage#getTeam_Goals_per_shoots_on_target()
	 * @model required="true"
	 * @generated
	 */
	double getGoals_per_shoots_on_target();

	/**
	 * Sets the value of the '{@link football_db.Team#getGoals_per_shoots_on_target <em>Goals per shoots on target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals per shoots on target</em>' attribute.
	 * @see #getGoals_per_shoots_on_target()
	 * @generated
	 */
	void setGoals_per_shoots_on_target(double value);

	/**
	 * Returns the value of the '<em><b>Elo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elo</em>' attribute.
	 * @see #setElo(double)
	 * @see football_db.Football_dbPackage#getTeam_Elo()
	 * @model required="true"
	 * @generated
	 */
	double getElo();

	/**
	 * Sets the value of the '{@link football_db.Team#getElo <em>Elo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elo</em>' attribute.
	 * @see #getElo()
	 * @generated
	 */
	void setElo(double value);

} // Team
