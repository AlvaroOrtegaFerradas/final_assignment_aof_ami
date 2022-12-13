/**
 */
package football_db.impl;

import football_db.Football_dbPackage;
import football_db.League;
import football_db.Season;
import football_db.Team;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>League</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link football_db.impl.LeagueImpl#getName <em>Name</em>}</li>
 *   <li>{@link football_db.impl.LeagueImpl#getTeams <em>Teams</em>}</li>
 *   <li>{@link football_db.impl.LeagueImpl#getSeasons <em>Seasons</em>}</li>
 *   <li>{@link football_db.impl.LeagueImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link football_db.impl.LeagueImpl#getTeams_number <em>Teams number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LeagueImpl extends MinimalEObjectImpl.Container implements League {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTeams() <em>Teams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams()
	 * @generated
	 * @ordered
	 */
	protected EList<Team> teams;

	/**
	 * The cached value of the '{@link #getSeasons() <em>Seasons</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeasons()
	 * @generated
	 * @ordered
	 */
	protected EList<Season> seasons;

	/**
	 * The default value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected static final String COUNTRY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCountry() <em>Country</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCountry()
	 * @generated
	 * @ordered
	 */
	protected String country = COUNTRY_EDEFAULT;

	/**
	 * The default value of the '{@link #getTeams_number() <em>Teams number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams_number()
	 * @generated
	 * @ordered
	 */
	protected static final int TEAMS_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getTeams_number() <em>Teams number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTeams_number()
	 * @generated
	 * @ordered
	 */
	protected int teams_number = TEAMS_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LeagueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Football_dbPackage.Literals.LEAGUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.LEAGUE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Team> getTeams() {
		if (teams == null) {
			teams = new EObjectContainmentWithInverseEList<Team>(Team.class, this, Football_dbPackage.LEAGUE__TEAMS, Football_dbPackage.TEAM__LEAGUE);
		}
		return teams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Season> getSeasons() {
		if (seasons == null) {
			seasons = new EObjectContainmentWithInverseEList<Season>(Season.class, this, Football_dbPackage.LEAGUE__SEASONS, Football_dbPackage.SEASON__LEAGUE);
		}
		return seasons;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCountry(String newCountry) {
		String oldCountry = country;
		country = newCountry;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.LEAGUE__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getTeams_number() {
		return teams_number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeams_number(int newTeams_number) {
		int oldTeams_number = teams_number;
		teams_number = newTeams_number;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.LEAGUE__TEAMS_NUMBER, oldTeams_number, teams_number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Football_dbPackage.LEAGUE__TEAMS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTeams()).basicAdd(otherEnd, msgs);
			case Football_dbPackage.LEAGUE__SEASONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSeasons()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Football_dbPackage.LEAGUE__TEAMS:
				return ((InternalEList<?>)getTeams()).basicRemove(otherEnd, msgs);
			case Football_dbPackage.LEAGUE__SEASONS:
				return ((InternalEList<?>)getSeasons()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Football_dbPackage.LEAGUE__NAME:
				return getName();
			case Football_dbPackage.LEAGUE__TEAMS:
				return getTeams();
			case Football_dbPackage.LEAGUE__SEASONS:
				return getSeasons();
			case Football_dbPackage.LEAGUE__COUNTRY:
				return getCountry();
			case Football_dbPackage.LEAGUE__TEAMS_NUMBER:
				return getTeams_number();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Football_dbPackage.LEAGUE__NAME:
				setName((String)newValue);
				return;
			case Football_dbPackage.LEAGUE__TEAMS:
				getTeams().clear();
				getTeams().addAll((Collection<? extends Team>)newValue);
				return;
			case Football_dbPackage.LEAGUE__SEASONS:
				getSeasons().clear();
				getSeasons().addAll((Collection<? extends Season>)newValue);
				return;
			case Football_dbPackage.LEAGUE__COUNTRY:
				setCountry((String)newValue);
				return;
			case Football_dbPackage.LEAGUE__TEAMS_NUMBER:
				setTeams_number((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Football_dbPackage.LEAGUE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Football_dbPackage.LEAGUE__TEAMS:
				getTeams().clear();
				return;
			case Football_dbPackage.LEAGUE__SEASONS:
				getSeasons().clear();
				return;
			case Football_dbPackage.LEAGUE__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case Football_dbPackage.LEAGUE__TEAMS_NUMBER:
				setTeams_number(TEAMS_NUMBER_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Football_dbPackage.LEAGUE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Football_dbPackage.LEAGUE__TEAMS:
				return teams != null && !teams.isEmpty();
			case Football_dbPackage.LEAGUE__SEASONS:
				return seasons != null && !seasons.isEmpty();
			case Football_dbPackage.LEAGUE__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case Football_dbPackage.LEAGUE__TEAMS_NUMBER:
				return teams_number != TEAMS_NUMBER_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", country: ");
		result.append(country);
		result.append(", teams_number: ");
		result.append(teams_number);
		result.append(')');
		return result.toString();
	}

} //LeagueImpl
