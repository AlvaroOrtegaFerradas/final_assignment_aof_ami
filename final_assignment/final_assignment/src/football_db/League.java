/**
 */
package football_db;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link football_db.League#getName <em>Name</em>}</li>
 *   <li>{@link football_db.League#getTeams <em>Teams</em>}</li>
 *   <li>{@link football_db.League#getSeasons <em>Seasons</em>}</li>
 *   <li>{@link football_db.League#getCountry <em>Country</em>}</li>
 *   <li>{@link football_db.League#getTeams_number <em>Teams number</em>}</li>
 * </ul>
 *
 * @see football_db.Football_dbPackage#getLeague()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='check_number_teams'"
 * @generated
 */
public interface League extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see football_db.Football_dbPackage#getLeague_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link football_db.League#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Teams</b></em>' containment reference list.
	 * The list contents are of type {@link football_db.Team}.
	 * It is bidirectional and its opposite is '{@link football_db.Team#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams</em>' containment reference list.
	 * @see football_db.Football_dbPackage#getLeague_Teams()
	 * @see football_db.Team#getLeague
	 * @model opposite="League" containment="true" required="true"
	 * @generated
	 */
	EList<Team> getTeams();

	/**
	 * Returns the value of the '<em><b>Seasons</b></em>' containment reference list.
	 * The list contents are of type {@link football_db.Season}.
	 * It is bidirectional and its opposite is '{@link football_db.Season#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seasons</em>' containment reference list.
	 * @see football_db.Football_dbPackage#getLeague_Seasons()
	 * @see football_db.Season#getLeague
	 * @model opposite="league" containment="true" required="true"
	 * @generated
	 */
	EList<Season> getSeasons();

	/**
	 * Returns the value of the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Country</em>' attribute.
	 * @see #setCountry(String)
	 * @see football_db.Football_dbPackage#getLeague_Country()
	 * @model required="true"
	 * @generated
	 */
	String getCountry();

	/**
	 * Sets the value of the '{@link football_db.League#getCountry <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Country</em>' attribute.
	 * @see #getCountry()
	 * @generated
	 */
	void setCountry(String value);

	/**
	 * Returns the value of the '<em><b>Teams number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Teams number</em>' attribute.
	 * @see #setTeams_number(int)
	 * @see football_db.Football_dbPackage#getLeague_Teams_number()
	 * @model required="true"
	 * @generated
	 */
	int getTeams_number();

	/**
	 * Sets the value of the '{@link football_db.League#getTeams_number <em>Teams number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Teams number</em>' attribute.
	 * @see #getTeams_number()
	 * @generated
	 */
	void setTeams_number(int value);

} // League
