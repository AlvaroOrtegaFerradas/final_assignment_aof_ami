/**
 */
package football_db;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link football_db.Player#getTeam <em>Team</em>}</li>
 *   <li>{@link football_db.Player#getName <em>Name</em>}</li>
 *   <li>{@link football_db.Player#getAge <em>Age</em>}</li>
 *   <li>{@link football_db.Player#getPosition <em>Position</em>}</li>
 *   <li>{@link football_db.Player#getGoals_scored <em>Goals scored</em>}</li>
 *   <li>{@link football_db.Player#getAssists <em>Assists</em>}</li>
 *   <li>{@link football_db.Player#getMinutes_played <em>Minutes played</em>}</li>
 *   <li>{@link football_db.Player#getMatches_played <em>Matches played</em>}</li>
 *   <li>{@link football_db.Player#getCountry <em>Country</em>}</li>
 *   <li>{@link football_db.Player#getYellow_cards <em>Yellow cards</em>}</li>
 *   <li>{@link football_db.Player#getRed_cards <em>Red cards</em>}</li>
 *   <li>{@link football_db.Player#getGoals_per_match <em>Goals per match</em>}</li>
 *   <li>{@link football_db.Player#getAssists_per_match <em>Assists per match</em>}</li>
 *   <li>{@link football_db.Player#getMinutes_played_per_match <em>Minutes played per match</em>}</li>
 *   <li>{@link football_db.Player#getRed_cards_per_match <em>Red cards per match</em>}</li>
 *   <li>{@link football_db.Player#getYellow_cards_per_match <em>Yellow cards per match</em>}</li>
 *   <li>{@link football_db.Player#getMinutes_per_goal <em>Minutes per goal</em>}</li>
 *   <li>{@link football_db.Player#getMinutes_per_assists <em>Minutes per assists</em>}</li>
 *   <li>{@link football_db.Player#getMinutes_per_red_cards <em>Minutes per red cards</em>}</li>
 *   <li>{@link football_db.Player#getMinutes_per_yellow_cards <em>Minutes per yellow cards</em>}</li>
 *   <li>{@link football_db.Player#getPlayer_elo <em>Player elo</em>}</li>
 * </ul>
 *
 * @see football_db.Football_dbPackage#getPlayer()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='check_number_of_matches'"
 * @generated
 */
public interface Player extends EObject {
	/**
	 * Returns the value of the '<em><b>Team</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link football_db.Team#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Team</em>' container reference.
	 * @see #setTeam(Team)
	 * @see football_db.Football_dbPackage#getPlayer_Team()
	 * @see football_db.Team#getPlayers
	 * @model opposite="Players" required="true" transient="false"
	 * @generated
	 */
	Team getTeam();

	/**
	 * Sets the value of the '{@link football_db.Player#getTeam <em>Team</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Team</em>' container reference.
	 * @see #getTeam()
	 * @generated
	 */
	void setTeam(Team value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see football_db.Football_dbPackage#getPlayer_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link football_db.Player#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see football_db.Football_dbPackage#getPlayer_Age()
	 * @model required="true"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link football_db.Player#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see football_db.Football_dbPackage#getPlayer_Position()
	 * @model required="true"
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link football_db.Player#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

	/**
	 * Returns the value of the '<em><b>Goals scored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals scored</em>' attribute.
	 * @see #setGoals_scored(int)
	 * @see football_db.Football_dbPackage#getPlayer_Goals_scored()
	 * @model required="true"
	 * @generated
	 */
	int getGoals_scored();

	/**
	 * Sets the value of the '{@link football_db.Player#getGoals_scored <em>Goals scored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals scored</em>' attribute.
	 * @see #getGoals_scored()
	 * @generated
	 */
	void setGoals_scored(int value);

	/**
	 * Returns the value of the '<em><b>Assists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assists</em>' attribute.
	 * @see #setAssists(int)
	 * @see football_db.Football_dbPackage#getPlayer_Assists()
	 * @model required="true"
	 * @generated
	 */
	int getAssists();

	/**
	 * Sets the value of the '{@link football_db.Player#getAssists <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assists</em>' attribute.
	 * @see #getAssists()
	 * @generated
	 */
	void setAssists(int value);

	/**
	 * Returns the value of the '<em><b>Minutes played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes played</em>' attribute.
	 * @see #setMinutes_played(int)
	 * @see football_db.Football_dbPackage#getPlayer_Minutes_played()
	 * @model required="true"
	 * @generated
	 */
	int getMinutes_played();

	/**
	 * Sets the value of the '{@link football_db.Player#getMinutes_played <em>Minutes played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes played</em>' attribute.
	 * @see #getMinutes_played()
	 * @generated
	 */
	void setMinutes_played(int value);

	/**
	 * Returns the value of the '<em><b>Matches played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches played</em>' attribute.
	 * @see #setMatches_played(int)
	 * @see football_db.Football_dbPackage#getPlayer_Matches_played()
	 * @model required="true"
	 * @generated
	 */
	int getMatches_played();

	/**
	 * Sets the value of the '{@link football_db.Player#getMatches_played <em>Matches played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matches played</em>' attribute.
	 * @see #getMatches_played()
	 * @generated
	 */
	void setMatches_played(int value);

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see football_db.Football_dbPackage#getPlayer_Country()
	 * @model required="true"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link football_db.Player#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Yellow cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yellow cards</em>' attribute.
	 * @see #setYellow_cards(int)
	 * @see football_db.Football_dbPackage#getPlayer_Yellow_cards()
	 * @model required="true"
	 * @generated
	 */
	int getYellow_cards();

	/**
	 * Sets the value of the '{@link football_db.Player#getYellow_cards <em>Yellow cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yellow cards</em>' attribute.
	 * @see #getYellow_cards()
	 * @generated
	 */
	void setYellow_cards(int value);

	/**
	 * Returns the value of the '<em><b>Red cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red cards</em>' attribute.
	 * @see #setRed_cards(int)
	 * @see football_db.Football_dbPackage#getPlayer_Red_cards()
	 * @model required="true"
	 * @generated
	 */
	int getRed_cards();

	/**
	 * Sets the value of the '{@link football_db.Player#getRed_cards <em>Red cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red cards</em>' attribute.
	 * @see #getRed_cards()
	 * @generated
	 */
	void setRed_cards(int value);

	/**
	 * Returns the value of the '<em><b>Goals per match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Goals per match</em>' attribute.
	 * @see #setGoals_per_match(double)
	 * @see football_db.Football_dbPackage#getPlayer_Goals_per_match()
	 * @model required="true"
	 * @generated
	 */
	double getGoals_per_match();

	/**
	 * Sets the value of the '{@link football_db.Player#getGoals_per_match <em>Goals per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Goals per match</em>' attribute.
	 * @see #getGoals_per_match()
	 * @generated
	 */
	void setGoals_per_match(double value);

	/**
	 * Returns the value of the '<em><b>Assists per match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assists per match</em>' attribute.
	 * @see #setAssists_per_match(double)
	 * @see football_db.Football_dbPackage#getPlayer_Assists_per_match()
	 * @model required="true"
	 * @generated
	 */
	double getAssists_per_match();

	/**
	 * Sets the value of the '{@link football_db.Player#getAssists_per_match <em>Assists per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assists per match</em>' attribute.
	 * @see #getAssists_per_match()
	 * @generated
	 */
	void setAssists_per_match(double value);

	/**
	 * Returns the value of the '<em><b>Minutes played per match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes played per match</em>' attribute.
	 * @see #setMinutes_played_per_match(double)
	 * @see football_db.Football_dbPackage#getPlayer_Minutes_played_per_match()
	 * @model required="true"
	 * @generated
	 */
	double getMinutes_played_per_match();

	/**
	 * Sets the value of the '{@link football_db.Player#getMinutes_played_per_match <em>Minutes played per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes played per match</em>' attribute.
	 * @see #getMinutes_played_per_match()
	 * @generated
	 */
	void setMinutes_played_per_match(double value);

	/**
	 * Returns the value of the '<em><b>Red cards per match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Red cards per match</em>' attribute.
	 * @see #setRed_cards_per_match(double)
	 * @see football_db.Football_dbPackage#getPlayer_Red_cards_per_match()
	 * @model required="true"
	 * @generated
	 */
	double getRed_cards_per_match();

	/**
	 * Sets the value of the '{@link football_db.Player#getRed_cards_per_match <em>Red cards per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Red cards per match</em>' attribute.
	 * @see #getRed_cards_per_match()
	 * @generated
	 */
	void setRed_cards_per_match(double value);

	/**
	 * Returns the value of the '<em><b>Yellow cards per match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Yellow cards per match</em>' attribute.
	 * @see #setYellow_cards_per_match(double)
	 * @see football_db.Football_dbPackage#getPlayer_Yellow_cards_per_match()
	 * @model required="true"
	 * @generated
	 */
	double getYellow_cards_per_match();

	/**
	 * Sets the value of the '{@link football_db.Player#getYellow_cards_per_match <em>Yellow cards per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yellow cards per match</em>' attribute.
	 * @see #getYellow_cards_per_match()
	 * @generated
	 */
	void setYellow_cards_per_match(double value);

	/**
	 * Returns the value of the '<em><b>Minutes per goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes per goal</em>' attribute.
	 * @see #setMinutes_per_goal(double)
	 * @see football_db.Football_dbPackage#getPlayer_Minutes_per_goal()
	 * @model required="true"
	 * @generated
	 */
	double getMinutes_per_goal();

	/**
	 * Sets the value of the '{@link football_db.Player#getMinutes_per_goal <em>Minutes per goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes per goal</em>' attribute.
	 * @see #getMinutes_per_goal()
	 * @generated
	 */
	void setMinutes_per_goal(double value);

	/**
	 * Returns the value of the '<em><b>Minutes per assists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes per assists</em>' attribute.
	 * @see #setMinutes_per_assists(double)
	 * @see football_db.Football_dbPackage#getPlayer_Minutes_per_assists()
	 * @model required="true"
	 * @generated
	 */
	double getMinutes_per_assists();

	/**
	 * Sets the value of the '{@link football_db.Player#getMinutes_per_assists <em>Minutes per assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes per assists</em>' attribute.
	 * @see #getMinutes_per_assists()
	 * @generated
	 */
	void setMinutes_per_assists(double value);

	/**
	 * Returns the value of the '<em><b>Minutes per red cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes per red cards</em>' attribute.
	 * @see #setMinutes_per_red_cards(double)
	 * @see football_db.Football_dbPackage#getPlayer_Minutes_per_red_cards()
	 * @model required="true"
	 * @generated
	 */
	double getMinutes_per_red_cards();

	/**
	 * Sets the value of the '{@link football_db.Player#getMinutes_per_red_cards <em>Minutes per red cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes per red cards</em>' attribute.
	 * @see #getMinutes_per_red_cards()
	 * @generated
	 */
	void setMinutes_per_red_cards(double value);

	/**
	 * Returns the value of the '<em><b>Minutes per yellow cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minutes per yellow cards</em>' attribute.
	 * @see #setMinutes_per_yellow_cards(double)
	 * @see football_db.Football_dbPackage#getPlayer_Minutes_per_yellow_cards()
	 * @model required="true"
	 * @generated
	 */
	double getMinutes_per_yellow_cards();

	/**
	 * Sets the value of the '{@link football_db.Player#getMinutes_per_yellow_cards <em>Minutes per yellow cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minutes per yellow cards</em>' attribute.
	 * @see #getMinutes_per_yellow_cards()
	 * @generated
	 */
	void setMinutes_per_yellow_cards(double value);

	/**
	 * Returns the value of the '<em><b>Player elo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Player elo</em>' attribute.
	 * @see #setPlayer_elo(double)
	 * @see football_db.Football_dbPackage#getPlayer_Player_elo()
	 * @model required="true"
	 * @generated
	 */
	double getPlayer_elo();

	/**
	 * Sets the value of the '{@link football_db.Player#getPlayer_elo <em>Player elo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Player elo</em>' attribute.
	 * @see #getPlayer_elo()
	 * @generated
	 */
	void setPlayer_elo(double value);

} // Player
