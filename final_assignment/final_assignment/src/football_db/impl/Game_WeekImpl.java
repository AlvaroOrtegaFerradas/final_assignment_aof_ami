/**
 */
package football_db.impl;

import football_db.Football_dbPackage;
import football_db.Game_Week;
import football_db.Match;
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
 * An implementation of the model object '<em><b>Game Week</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link football_db.impl.Game_WeekImpl#getNumber <em>Number</em>}</li>
 *   <li>{@link football_db.impl.Game_WeekImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link football_db.impl.Game_WeekImpl#getSeason <em>Season</em>}</li>
 *   <li>{@link football_db.impl.Game_WeekImpl#getMatches_number <em>Matches number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Game_WeekImpl extends MinimalEObjectImpl.Container implements Game_Week {
	/**
	 * The default value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumber() <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber()
	 * @generated
	 * @ordered
	 */
	protected int number = NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * The default value of the '{@link #getMatches_number() <em>Matches number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches_number()
	 * @generated
	 * @ordered
	 */
	protected static final int MATCHES_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatches_number() <em>Matches number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches_number()
	 * @generated
	 * @ordered
	 */
	protected int matches_number = MATCHES_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Game_WeekImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Football_dbPackage.Literals.GAME_WEEK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumber(int newNumber) {
		int oldNumber = number;
		number = newNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.GAME_WEEK__NUMBER, oldNumber, number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectContainmentWithInverseEList<Match>(Match.class, this, Football_dbPackage.GAME_WEEK__MATCHES, Football_dbPackage.MATCH__GAME_WEEK);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season getSeason() {
		if (eContainerFeatureID() != Football_dbPackage.GAME_WEEK__SEASON) return null;
		return (Season)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSeason(Season newSeason, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newSeason, Football_dbPackage.GAME_WEEK__SEASON, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSeason(Season newSeason) {
		if (newSeason != eInternalContainer() || (eContainerFeatureID() != Football_dbPackage.GAME_WEEK__SEASON && newSeason != null)) {
			if (EcoreUtil.isAncestor(this, newSeason))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newSeason != null)
				msgs = ((InternalEObject)newSeason).eInverseAdd(this, Football_dbPackage.SEASON__GAME_WEEKS, Season.class, msgs);
			msgs = basicSetSeason(newSeason, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.GAME_WEEK__SEASON, newSeason, newSeason));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMatches_number() {
		return matches_number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatches_number(int newMatches_number) {
		int oldMatches_number = matches_number;
		matches_number = newMatches_number;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.GAME_WEEK__MATCHES_NUMBER, oldMatches_number, matches_number));
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
			case Football_dbPackage.GAME_WEEK__MATCHES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMatches()).basicAdd(otherEnd, msgs);
			case Football_dbPackage.GAME_WEEK__SEASON:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetSeason((Season)otherEnd, msgs);
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
			case Football_dbPackage.GAME_WEEK__MATCHES:
				return ((InternalEList<?>)getMatches()).basicRemove(otherEnd, msgs);
			case Football_dbPackage.GAME_WEEK__SEASON:
				return basicSetSeason(null, msgs);
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
			case Football_dbPackage.GAME_WEEK__SEASON:
				return eInternalContainer().eInverseRemove(this, Football_dbPackage.SEASON__GAME_WEEKS, Season.class, msgs);
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
			case Football_dbPackage.GAME_WEEK__NUMBER:
				return getNumber();
			case Football_dbPackage.GAME_WEEK__MATCHES:
				return getMatches();
			case Football_dbPackage.GAME_WEEK__SEASON:
				return getSeason();
			case Football_dbPackage.GAME_WEEK__MATCHES_NUMBER:
				return getMatches_number();
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
			case Football_dbPackage.GAME_WEEK__NUMBER:
				setNumber((Integer)newValue);
				return;
			case Football_dbPackage.GAME_WEEK__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
				return;
			case Football_dbPackage.GAME_WEEK__SEASON:
				setSeason((Season)newValue);
				return;
			case Football_dbPackage.GAME_WEEK__MATCHES_NUMBER:
				setMatches_number((Integer)newValue);
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
			case Football_dbPackage.GAME_WEEK__NUMBER:
				setNumber(NUMBER_EDEFAULT);
				return;
			case Football_dbPackage.GAME_WEEK__MATCHES:
				getMatches().clear();
				return;
			case Football_dbPackage.GAME_WEEK__SEASON:
				setSeason((Season)null);
				return;
			case Football_dbPackage.GAME_WEEK__MATCHES_NUMBER:
				setMatches_number(MATCHES_NUMBER_EDEFAULT);
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
			case Football_dbPackage.GAME_WEEK__NUMBER:
				return number != NUMBER_EDEFAULT;
			case Football_dbPackage.GAME_WEEK__MATCHES:
				return matches != null && !matches.isEmpty();
			case Football_dbPackage.GAME_WEEK__SEASON:
				return getSeason() != null;
			case Football_dbPackage.GAME_WEEK__MATCHES_NUMBER:
				return matches_number != MATCHES_NUMBER_EDEFAULT;
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
		result.append(" (number: ");
		result.append(number);
		result.append(", matches_number: ");
		result.append(matches_number);
		result.append(')');
		return result.toString();
	}

} //Game_WeekImpl
