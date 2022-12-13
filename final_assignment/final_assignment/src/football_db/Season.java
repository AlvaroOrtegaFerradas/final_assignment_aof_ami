/**
 */
package football_db;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link football_db.Season#getStart_year_season <em>Start year season</em>}</li>
 *   <li>{@link football_db.Season#getEnd_year_season <em>End year season</em>}</li>
 *   <li>{@link football_db.Season#getLeague <em>League</em>}</li>
 *   <li>{@link football_db.Season#getGame_weeks <em>Game weeks</em>}</li>
 *   <li>{@link football_db.Season#getWeeks_number <em>Weeks number</em>}</li>
 * </ul>
 *
 * @see football_db.Football_dbPackage#getSeason()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='check_year_season'"
 * @generated
 */
public interface Season extends EObject {
	/**
	 * Returns the value of the '<em><b>Start year season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start year season</em>' attribute.
	 * @see #setStart_year_season(int)
	 * @see football_db.Football_dbPackage#getSeason_Start_year_season()
	 * @model required="true"
	 * @generated
	 */
	int getStart_year_season();

	/**
	 * Sets the value of the '{@link football_db.Season#getStart_year_season <em>Start year season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start year season</em>' attribute.
	 * @see #getStart_year_season()
	 * @generated
	 */
	void setStart_year_season(int value);

	/**
	 * Returns the value of the '<em><b>End year season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End year season</em>' attribute.
	 * @see #setEnd_year_season(int)
	 * @see football_db.Football_dbPackage#getSeason_End_year_season()
	 * @model required="true"
	 * @generated
	 */
	int getEnd_year_season();

	/**
	 * Sets the value of the '{@link football_db.Season#getEnd_year_season <em>End year season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End year season</em>' attribute.
	 * @see #getEnd_year_season()
	 * @generated
	 */
	void setEnd_year_season(int value);

	/**
	 * Returns the value of the '<em><b>League</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link football_db.League#getSeasons <em>Seasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>League</em>' container reference.
	 * @see #setLeague(League)
	 * @see football_db.Football_dbPackage#getSeason_League()
	 * @see football_db.League#getSeasons
	 * @model opposite="seasons" required="true" transient="false"
	 * @generated
	 */
	League getLeague();

	/**
	 * Sets the value of the '{@link football_db.Season#getLeague <em>League</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>League</em>' container reference.
	 * @see #getLeague()
	 * @generated
	 */
	void setLeague(League value);

	/**
	 * Returns the value of the '<em><b>Game weeks</b></em>' containment reference list.
	 * The list contents are of type {@link football_db.Game_Week}.
	 * It is bidirectional and its opposite is '{@link football_db.Game_Week#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Game weeks</em>' containment reference list.
	 * @see football_db.Football_dbPackage#getSeason_Game_weeks()
	 * @see football_db.Game_Week#getSeason
	 * @model opposite="season" containment="true" required="true"
	 * @generated
	 */
	EList<Game_Week> getGame_weeks();

	/**
	 * Returns the value of the '<em><b>Weeks number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weeks number</em>' attribute.
	 * @see #setWeeks_number(int)
	 * @see football_db.Football_dbPackage#getSeason_Weeks_number()
	 * @model required="true"
	 * @generated
	 */
	int getWeeks_number();

	/**
	 * Sets the value of the '{@link football_db.Season#getWeeks_number <em>Weeks number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weeks number</em>' attribute.
	 * @see #getWeeks_number()
	 * @generated
	 */
	void setWeeks_number(int value);

} // Season
