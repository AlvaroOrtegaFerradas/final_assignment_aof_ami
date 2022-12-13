/**
 */
package football_db;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Game Week</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link football_db.Game_Week#getNumber <em>Number</em>}</li>
 *   <li>{@link football_db.Game_Week#getMatches <em>Matches</em>}</li>
 *   <li>{@link football_db.Game_Week#getSeason <em>Season</em>}</li>
 *   <li>{@link football_db.Game_Week#getMatches_number <em>Matches number</em>}</li>
 * </ul>
 *
 * @see football_db.Football_dbPackage#getGame_Week()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='check_matches_number'"
 * @generated
 */
public interface Game_Week extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see football_db.Football_dbPackage#getGame_Week_Number()
	 * @model required="true"
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link football_db.Game_Week#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Matches</b></em>' containment reference list.
	 * The list contents are of type {@link football_db.Match}.
	 * It is bidirectional and its opposite is '{@link football_db.Match#getGame_week <em>Game week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches</em>' containment reference list.
	 * @see football_db.Football_dbPackage#getGame_Week_Matches()
	 * @see football_db.Match#getGame_week
	 * @model opposite="game_week" containment="true" required="true"
	 * @generated
	 */
	EList<Match> getMatches();

	/**
	 * Returns the value of the '<em><b>Season</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link football_db.Season#getGame_weeks <em>Game weeks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' container reference.
	 * @see #setSeason(Season)
	 * @see football_db.Football_dbPackage#getGame_Week_Season()
	 * @see football_db.Season#getGame_weeks
	 * @model opposite="game_weeks" required="true" transient="false"
	 * @generated
	 */
	Season getSeason();

	/**
	 * Sets the value of the '{@link football_db.Game_Week#getSeason <em>Season</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Season</em>' container reference.
	 * @see #getSeason()
	 * @generated
	 */
	void setSeason(Season value);

	/**
	 * Returns the value of the '<em><b>Matches number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matches number</em>' attribute.
	 * @see #setMatches_number(int)
	 * @see football_db.Football_dbPackage#getGame_Week_Matches_number()
	 * @model required="true"
	 * @generated
	 */
	int getMatches_number();

	/**
	 * Sets the value of the '{@link football_db.Game_Week#getMatches_number <em>Matches number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matches number</em>' attribute.
	 * @see #getMatches_number()
	 * @generated
	 */
	void setMatches_number(int value);

} // Game_Week
