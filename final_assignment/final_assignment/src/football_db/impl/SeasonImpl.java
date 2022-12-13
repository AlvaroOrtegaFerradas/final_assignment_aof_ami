/**
 */
package football_db.impl;

import football_db.Football_dbPackage;
import football_db.Game_Week;
import football_db.League;
import football_db.Season;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link football_db.impl.SeasonImpl#getStart_year_season <em>Start year season</em>}</li>
 *   <li>{@link football_db.impl.SeasonImpl#getEnd_year_season <em>End year season</em>}</li>
 *   <li>{@link football_db.impl.SeasonImpl#getLeague <em>League</em>}</li>
 *   <li>{@link football_db.impl.SeasonImpl#getGame_weeks <em>Game weeks</em>}</li>
 *   <li>{@link football_db.impl.SeasonImpl#getWeeks_number <em>Weeks number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeasonImpl extends MinimalEObjectImpl.Container implements Season {
	/**
	 * The default value of the '{@link #getStart_year_season() <em>Start year season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_year_season()
	 * @generated
	 * @ordered
	 */
	protected static final int START_YEAR_SEASON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getStart_year_season() <em>Start year season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStart_year_season()
	 * @generated
	 * @ordered
	 */
	protected int start_year_season = START_YEAR_SEASON_EDEFAULT;

	/**
	 * The default value of the '{@link #getEnd_year_season() <em>End year season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_year_season()
	 * @generated
	 * @ordered
	 */
	protected static final int END_YEAR_SEASON_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEnd_year_season() <em>End year season</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd_year_season()
	 * @generated
	 * @ordered
	 */
	protected int end_year_season = END_YEAR_SEASON_EDEFAULT;

	/**
	 * The cached value of the '{@link #getGame_weeks() <em>Game weeks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGame_weeks()
	 * @generated
	 * @ordered
	 */
	protected EList<Game_Week> game_weeks;

	/**
	 * The default value of the '{@link #getWeeks_number() <em>Weeks number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeeks_number()
	 * @generated
	 * @ordered
	 */
	protected static final int WEEKS_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeeks_number() <em>Weeks number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeeks_number()
	 * @generated
	 * @ordered
	 */
	protected int weeks_number = WEEKS_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SeasonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Football_dbPackage.Literals.SEASON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getStart_year_season() {
		return start_year_season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStart_year_season(int newStart_year_season) {
		int oldStart_year_season = start_year_season;
		start_year_season = newStart_year_season;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.SEASON__START_YEAR_SEASON, oldStart_year_season, start_year_season));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEnd_year_season() {
		return end_year_season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd_year_season(int newEnd_year_season) {
		int oldEnd_year_season = end_year_season;
		end_year_season = newEnd_year_season;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.SEASON__END_YEAR_SEASON, oldEnd_year_season, end_year_season));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public League getLeague() {
		if (eContainerFeatureID() != Football_dbPackage.SEASON__LEAGUE) return null;
		return (League)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeague(League newLeague, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLeague, Football_dbPackage.SEASON__LEAGUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeague(League newLeague) {
		if (newLeague != eInternalContainer() || (eContainerFeatureID() != Football_dbPackage.SEASON__LEAGUE && newLeague != null)) {
			if (EcoreUtil.isAncestor(this, newLeague))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLeague != null)
				msgs = ((InternalEObject)newLeague).eInverseAdd(this, Football_dbPackage.LEAGUE__SEASONS, League.class, msgs);
			msgs = basicSetLeague(newLeague, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.SEASON__LEAGUE, newLeague, newLeague));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Game_Week> getGame_weeks() {
		if (game_weeks == null) {
			game_weeks = new EObjectContainmentWithInverseEList<Game_Week>(Game_Week.class, this, Football_dbPackage.SEASON__GAME_WEEKS, Football_dbPackage.GAME_WEEK__SEASON);
		}
		return game_weeks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeeks_number() {
		return weeks_number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeeks_number(int newWeeks_number) {
		int oldWeeks_number = weeks_number;
		weeks_number = newWeeks_number;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.SEASON__WEEKS_NUMBER, oldWeeks_number, weeks_number));
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
			case Football_dbPackage.SEASON__LEAGUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLeague((League)otherEnd, msgs);
			case Football_dbPackage.SEASON__GAME_WEEKS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getGame_weeks()).basicAdd(otherEnd, msgs);
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
			case Football_dbPackage.SEASON__LEAGUE:
				return basicSetLeague(null, msgs);
			case Football_dbPackage.SEASON__GAME_WEEKS:
				return ((InternalEList<?>)getGame_weeks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Football_dbPackage.SEASON__LEAGUE:
				return eInternalContainer().eInverseRemove(this, Football_dbPackage.LEAGUE__SEASONS, League.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Football_dbPackage.SEASON__START_YEAR_SEASON:
				return getStart_year_season();
			case Football_dbPackage.SEASON__END_YEAR_SEASON:
				return getEnd_year_season();
			case Football_dbPackage.SEASON__LEAGUE:
				return getLeague();
			case Football_dbPackage.SEASON__GAME_WEEKS:
				return getGame_weeks();
			case Football_dbPackage.SEASON__WEEKS_NUMBER:
				return getWeeks_number();
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
			case Football_dbPackage.SEASON__START_YEAR_SEASON:
				setStart_year_season((Integer)newValue);
				return;
			case Football_dbPackage.SEASON__END_YEAR_SEASON:
				setEnd_year_season((Integer)newValue);
				return;
			case Football_dbPackage.SEASON__LEAGUE:
				setLeague((League)newValue);
				return;
			case Football_dbPackage.SEASON__GAME_WEEKS:
				getGame_weeks().clear();
				getGame_weeks().addAll((Collection<? extends Game_Week>)newValue);
				return;
			case Football_dbPackage.SEASON__WEEKS_NUMBER:
				setWeeks_number((Integer)newValue);
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
			case Football_dbPackage.SEASON__START_YEAR_SEASON:
				setStart_year_season(START_YEAR_SEASON_EDEFAULT);
				return;
			case Football_dbPackage.SEASON__END_YEAR_SEASON:
				setEnd_year_season(END_YEAR_SEASON_EDEFAULT);
				return;
			case Football_dbPackage.SEASON__LEAGUE:
				setLeague((League)null);
				return;
			case Football_dbPackage.SEASON__GAME_WEEKS:
				getGame_weeks().clear();
				return;
			case Football_dbPackage.SEASON__WEEKS_NUMBER:
				setWeeks_number(WEEKS_NUMBER_EDEFAULT);
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
			case Football_dbPackage.SEASON__START_YEAR_SEASON:
				return start_year_season != START_YEAR_SEASON_EDEFAULT;
			case Football_dbPackage.SEASON__END_YEAR_SEASON:
				return end_year_season != END_YEAR_SEASON_EDEFAULT;
			case Football_dbPackage.SEASON__LEAGUE:
				return getLeague() != null;
			case Football_dbPackage.SEASON__GAME_WEEKS:
				return game_weeks != null && !game_weeks.isEmpty();
			case Football_dbPackage.SEASON__WEEKS_NUMBER:
				return weeks_number != WEEKS_NUMBER_EDEFAULT;
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
		result.append(" (start_year_season: ");
		result.append(start_year_season);
		result.append(", end_year_season: ");
		result.append(end_year_season);
		result.append(", weeks_number: ");
		result.append(weeks_number);
		result.append(')');
		return result.toString();
	}

} //SeasonImpl
