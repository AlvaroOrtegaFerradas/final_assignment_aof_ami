/**
 */
package football_db;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link football_db.Match#getMatch_number <em>Match number</em>}</li>
 *   <li>{@link football_db.Match#getHome_team <em>Home team</em>}</li>
 *   <li>{@link football_db.Match#getAway_team <em>Away team</em>}</li>
 *   <li>{@link football_db.Match#getGame_week <em>Game week</em>}</li>
 *   <li>{@link football_db.Match#getGoals_home_team <em>Goals home team</em>}</li>
 *   <li>{@link football_db.Match#getGoals_away_team <em>Goals away team</em>}</li>
 *   <li>{@link football_db.Match#getHome_possesion <em>Home possesion</em>}</li>
 *   <li>{@link football_db.Match#getAway_possesion <em>Away possesion</em>}</li>
 *   <li>{@link football_db.Match#getHome_corners <em>Home corners</em>}</li>
 *   <li>{@link football_db.Match#getAway_corners <em>Away corners</em>}</li>
 *   <li>{@link football_db.Match#getHome_shots <em>Home shots</em>}</li>
 *   <li>{@link football_db.Match#getAway_shots <em>Away shots</em>}</li>
 *   <li>{@link football_db.Match#getHome_shots_on_target <em>Home shots on target</em>}</li>
 *   <li>{@link football_db.Match#getAway_shots_on_target <em>Away shots on target</em>}</li>
 *   <li>{@link football_db.Match#getHome_faults <em>Home faults</em>}</li>
 *   <li>{@link football_db.Match#getAway_faults <em>Away faults</em>}</li>
 *   <li>{@link football_db.Match#getHome_yellow_cards <em>Home yellow cards</em>}</li>
 *   <li>{@link football_db.Match#getAway_yellow_cards <em>Away yellow cards</em>}</li>
 *   <li>{@link football_db.Match#getHome_red_cards <em>Home red cards</em>}</li>
 *   <li>{@link football_db.Match#getAway_red_cards <em>Away red cards</em>}</li>
 *   <li>{@link football_db.Match#getWinner <em>Winner</em>}</li>
 *   <li>{@link football_db.Match#getLoser <em>Loser</em>}</li>
 *   <li>{@link football_db.Match#getWin_home_team_probabilities <em>Win home team probabilities</em>}</li>
 *   <li>{@link football_db.Match#getWin_away_team_probabilities <em>Win away team probabilities</em>}</li>
 * </ul>
 *
 * @see football_db.Football_dbPackage#getMatch()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='check_match'"
 * @generated
 */
public interface Match extends EObject {
	/**
	 * Returns the value of the '<em><b>Match number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Match number</em>' attribute.
	 * @see #setMatch_number(int)
	 * @see football_db.Football_dbPackage#getMatch_Match_number()
	 * @model id="true" required="true"
	 * @generated
	 */
	int getMatch_number();

	/**
	 * Sets the value of the '{@link football_db.Match#getMatch_number <em>Match number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Match number</em>' attribute.
	 * @see #getMatch_number()
	 * @generated
	 */
	void setMatch_number(int value);

	/**
	 * Returns the value of the '<em><b>Home team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home team</em>' reference.
	 * @see #setHome_team(Team)
	 * @see football_db.Football_dbPackage#getMatch_Home_team()
	 * @model required="true"
	 * @generated
	 */
	Team getHome_team();

	/**
	 * Sets the value of the '{@link football_db.Match#getHome_team <em>Home team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home team</em>' reference.
	 * @see #getHome_team()
	 * @generated
	 */
	void setHome_team(Team value);

	/**
	 * Returns the value of the '<em><b>Away team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away team</em>' reference.
	 * @see #setAway_team(Team)
	 * @see football_db.Football_dbPackage#getMatch_Away_team()
	 * @model required="true"
	 * @generated
	 */
	Team getAway_team();

	/**
	 * Sets the value of the '{@link football_db.Match#getAway_team <em>Away team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away team</em>' reference.
	 * @see #getAway_team()
	 * @generated
	 */
	void setAway_team(Team value);

	/**
	 * Returns the value of the '<em><b>Game week</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link football_db.Game_Week#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game week</em>' container reference.
	 * @see #setGame_week(Game_Week)
	 * @see football_db.Football_dbPackage#getMatch_Game_week()
	 * @see football_db.Game_Week#getMatches
	 * @model opposite="Matches" required="true" transient="false"
	 * @generated
	 */
	Game_Week getGame_week();

	/**
	 * Sets the value of the '{@link football_db.Match#getGame_week <em>Game week</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Game week</em>' container reference.
	 * @see #getGame_week()
	 * @generated
	 */
	void setGame_week(Game_Week value);

	/**
	 * Returns the value of the '<em><b>Goals home team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals home team</em>' attribute.
	 * @see #setGoals_home_team(int)
	 * @see football_db.Football_dbPackage#getMatch_Goals_home_team()
	 * @model required="true"
	 * @generated
	 */
	int getGoals_home_team();

	/**
	 * Sets the value of the '{@link football_db.Match#getGoals_home_team <em>Goals home team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals home team</em>' attribute.
	 * @see #getGoals_home_team()
	 * @generated
	 */
	void setGoals_home_team(int value);

	/**
	 * Returns the value of the '<em><b>Goals away team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals away team</em>' attribute.
	 * @see #setGoals_away_team(int)
	 * @see football_db.Football_dbPackage#getMatch_Goals_away_team()
	 * @model required="true"
	 * @generated
	 */
	int getGoals_away_team();

	/**
	 * Sets the value of the '{@link football_db.Match#getGoals_away_team <em>Goals away team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals away team</em>' attribute.
	 * @see #getGoals_away_team()
	 * @generated
	 */
	void setGoals_away_team(int value);

	/**
	 * Returns the value of the '<em><b>Home possesion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home possesion</em>' attribute.
	 * @see #setHome_possesion(int)
	 * @see football_db.Football_dbPackage#getMatch_Home_possesion()
	 * @model required="true"
	 * @generated
	 */
	int getHome_possesion();

	/**
	 * Sets the value of the '{@link football_db.Match#getHome_possesion <em>Home possesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home possesion</em>' attribute.
	 * @see #getHome_possesion()
	 * @generated
	 */
	void setHome_possesion(int value);

	/**
	 * Returns the value of the '<em><b>Away possesion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away possesion</em>' attribute.
	 * @see #setAway_possesion(int)
	 * @see football_db.Football_dbPackage#getMatch_Away_possesion()
	 * @model required="true"
	 * @generated
	 */
	int getAway_possesion();

	/**
	 * Sets the value of the '{@link football_db.Match#getAway_possesion <em>Away possesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away possesion</em>' attribute.
	 * @see #getAway_possesion()
	 * @generated
	 */
	void setAway_possesion(int value);

	/**
	 * Returns the value of the '<em><b>Home corners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home corners</em>' attribute.
	 * @see #setHome_corners(int)
	 * @see football_db.Football_dbPackage#getMatch_Home_corners()
	 * @model required="true"
	 * @generated
	 */
	int getHome_corners();

	/**
	 * Sets the value of the '{@link football_db.Match#getHome_corners <em>Home corners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home corners</em>' attribute.
	 * @see #getHome_corners()
	 * @generated
	 */
	void setHome_corners(int value);

	/**
	 * Returns the value of the '<em><b>Away corners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away corners</em>' attribute.
	 * @see #setAway_corners(int)
	 * @see football_db.Football_dbPackage#getMatch_Away_corners()
	 * @model required="true"
	 * @generated
	 */
	int getAway_corners();

	/**
	 * Sets the value of the '{@link football_db.Match#getAway_corners <em>Away corners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away corners</em>' attribute.
	 * @see #getAway_corners()
	 * @generated
	 */
	void setAway_corners(int value);

	/**
	 * Returns the value of the '<em><b>Home shots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home shots</em>' attribute.
	 * @see #setHome_shots(int)
	 * @see football_db.Football_dbPackage#getMatch_Home_shots()
	 * @model required="true"
	 * @generated
	 */
	int getHome_shots();

	/**
	 * Sets the value of the '{@link football_db.Match#getHome_shots <em>Home shots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home shots</em>' attribute.
	 * @see #getHome_shots()
	 * @generated
	 */
	void setHome_shots(int value);

	/**
	 * Returns the value of the '<em><b>Away shots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away shots</em>' attribute.
	 * @see #setAway_shots(int)
	 * @see football_db.Football_dbPackage#getMatch_Away_shots()
	 * @model required="true"
	 * @generated
	 */
	int getAway_shots();

	/**
	 * Sets the value of the '{@link football_db.Match#getAway_shots <em>Away shots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away shots</em>' attribute.
	 * @see #getAway_shots()
	 * @generated
	 */
	void setAway_shots(int value);

	/**
	 * Returns the value of the '<em><b>Home shots on target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home shots on target</em>' attribute.
	 * @see #setHome_shots_on_target(int)
	 * @see football_db.Football_dbPackage#getMatch_Home_shots_on_target()
	 * @model required="true"
	 * @generated
	 */
	int getHome_shots_on_target();

	/**
	 * Sets the value of the '{@link football_db.Match#getHome_shots_on_target <em>Home shots on target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home shots on target</em>' attribute.
	 * @see #getHome_shots_on_target()
	 * @generated
	 */
	void setHome_shots_on_target(int value);

	/**
	 * Returns the value of the '<em><b>Away shots on target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away shots on target</em>' attribute.
	 * @see #setAway_shots_on_target(int)
	 * @see football_db.Football_dbPackage#getMatch_Away_shots_on_target()
	 * @model required="true"
	 * @generated
	 */
	int getAway_shots_on_target();

	/**
	 * Sets the value of the '{@link football_db.Match#getAway_shots_on_target <em>Away shots on target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away shots on target</em>' attribute.
	 * @see #getAway_shots_on_target()
	 * @generated
	 */
	void setAway_shots_on_target(int value);

	/**
	 * Returns the value of the '<em><b>Home faults</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home faults</em>' attribute.
	 * @see #setHome_faults(int)
	 * @see football_db.Football_dbPackage#getMatch_Home_faults()
	 * @model required="true"
	 * @generated
	 */
	int getHome_faults();

	/**
	 * Sets the value of the '{@link football_db.Match#getHome_faults <em>Home faults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home faults</em>' attribute.
	 * @see #getHome_faults()
	 * @generated
	 */
	void setHome_faults(int value);

	/**
	 * Returns the value of the '<em><b>Away faults</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away faults</em>' attribute.
	 * @see #setAway_faults(int)
	 * @see football_db.Football_dbPackage#getMatch_Away_faults()
	 * @model required="true"
	 * @generated
	 */
	int getAway_faults();

	/**
	 * Sets the value of the '{@link football_db.Match#getAway_faults <em>Away faults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away faults</em>' attribute.
	 * @see #getAway_faults()
	 * @generated
	 */
	void setAway_faults(int value);

	/**
	 * Returns the value of the '<em><b>Home yellow cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home yellow cards</em>' attribute.
	 * @see #setHome_yellow_cards(int)
	 * @see football_db.Football_dbPackage#getMatch_Home_yellow_cards()
	 * @model required="true"
	 * @generated
	 */
	int getHome_yellow_cards();

	/**
	 * Sets the value of the '{@link football_db.Match#getHome_yellow_cards <em>Home yellow cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home yellow cards</em>' attribute.
	 * @see #getHome_yellow_cards()
	 * @generated
	 */
	void setHome_yellow_cards(int value);

	/**
	 * Returns the value of the '<em><b>Away yellow cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away yellow cards</em>' attribute.
	 * @see #setAway_yellow_cards(int)
	 * @see football_db.Football_dbPackage#getMatch_Away_yellow_cards()
	 * @model required="true"
	 * @generated
	 */
	int getAway_yellow_cards();

	/**
	 * Sets the value of the '{@link football_db.Match#getAway_yellow_cards <em>Away yellow cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away yellow cards</em>' attribute.
	 * @see #getAway_yellow_cards()
	 * @generated
	 */
	void setAway_yellow_cards(int value);

	/**
	 * Returns the value of the '<em><b>Home red cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home red cards</em>' attribute.
	 * @see #setHome_red_cards(int)
	 * @see football_db.Football_dbPackage#getMatch_Home_red_cards()
	 * @model required="true"
	 * @generated
	 */
	int getHome_red_cards();

	/**
	 * Sets the value of the '{@link football_db.Match#getHome_red_cards <em>Home red cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Home red cards</em>' attribute.
	 * @see #getHome_red_cards()
	 * @generated
	 */
	void setHome_red_cards(int value);

	/**
	 * Returns the value of the '<em><b>Away red cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Away red cards</em>' attribute.
	 * @see #setAway_red_cards(int)
	 * @see football_db.Football_dbPackage#getMatch_Away_red_cards()
	 * @model required="true"
	 * @generated
	 */
	int getAway_red_cards();

	/**
	 * Sets the value of the '{@link football_db.Match#getAway_red_cards <em>Away red cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Away red cards</em>' attribute.
	 * @see #getAway_red_cards()
	 * @generated
	 */
	void setAway_red_cards(int value);

	/**
	 * Returns the value of the '<em><b>Winner</b></em>' attribute.
	 * The default value is <code>"Draw"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Winner</em>' attribute.
	 * @see #setWinner(String)
	 * @see football_db.Football_dbPackage#getMatch_Winner()
	 * @model default="Draw" required="true"
	 * @generated
	 */
	String getWinner();

	/**
	 * Sets the value of the '{@link football_db.Match#getWinner <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Winner</em>' attribute.
	 * @see #getWinner()
	 * @generated
	 */
	void setWinner(String value);

	/**
	 * Returns the value of the '<em><b>Loser</b></em>' attribute.
	 * The default value is <code>"Draw"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Loser</em>' attribute.
	 * @see #setLoser(String)
	 * @see football_db.Football_dbPackage#getMatch_Loser()
	 * @model default="Draw" required="true"
	 * @generated
	 */
	String getLoser();

	/**
	 * Sets the value of the '{@link football_db.Match#getLoser <em>Loser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Loser</em>' attribute.
	 * @see #getLoser()
	 * @generated
	 */
	void setLoser(String value);

	/**
	 * Returns the value of the '<em><b>Win home team probabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win home team probabilities</em>' attribute.
	 * @see #setWin_home_team_probabilities(double)
	 * @see football_db.Football_dbPackage#getMatch_Win_home_team_probabilities()
	 * @model required="true"
	 * @generated
	 */
	double getWin_home_team_probabilities();

	/**
	 * Sets the value of the '{@link football_db.Match#getWin_home_team_probabilities <em>Win home team probabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Win home team probabilities</em>' attribute.
	 * @see #getWin_home_team_probabilities()
	 * @generated
	 */
	void setWin_home_team_probabilities(double value);

	/**
	 * Returns the value of the '<em><b>Win away team probabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Win away team probabilities</em>' attribute.
	 * @see #setWin_away_team_probabilities(double)
	 * @see football_db.Football_dbPackage#getMatch_Win_away_team_probabilities()
	 * @model required="true"
	 * @generated
	 */
	double getWin_away_team_probabilities();

	/**
	 * Sets the value of the '{@link football_db.Match#getWin_away_team_probabilities <em>Win away team probabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Win away team probabilities</em>' attribute.
	 * @see #getWin_away_team_probabilities()
	 * @generated
	 */
	void setWin_away_team_probabilities(double value);

} // Match
