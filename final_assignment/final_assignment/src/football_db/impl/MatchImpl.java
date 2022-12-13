/**
 */
package football_db.impl;

import football_db.Football_dbPackage;
import football_db.Game_Week;
import football_db.Match;
import football_db.Team;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Match</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link football_db.impl.MatchImpl#getMatch_number <em>Match number</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getHome_team <em>Home team</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getAway_team <em>Away team</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getGame_week <em>Game week</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getGoals_home_team <em>Goals home team</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getGoals_away_team <em>Goals away team</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getHome_possesion <em>Home possesion</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getAway_possesion <em>Away possesion</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getHome_corners <em>Home corners</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getAway_corners <em>Away corners</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getHome_shots <em>Home shots</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getAway_shots <em>Away shots</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getHome_shots_on_target <em>Home shots on target</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getAway_shots_on_target <em>Away shots on target</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getHome_faults <em>Home faults</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getAway_faults <em>Away faults</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getHome_yellow_cards <em>Home yellow cards</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getAway_yellow_cards <em>Away yellow cards</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getHome_red_cards <em>Home red cards</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getAway_red_cards <em>Away red cards</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getWinner <em>Winner</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getLoser <em>Loser</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getWin_home_team_probabilities <em>Win home team probabilities</em>}</li>
 *   <li>{@link football_db.impl.MatchImpl#getWin_away_team_probabilities <em>Win away team probabilities</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MatchImpl extends MinimalEObjectImpl.Container implements Match {
	/**
	 * The default value of the '{@link #getMatch_number() <em>Match number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch_number()
	 * @generated
	 * @ordered
	 */
	protected static final int MATCH_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatch_number() <em>Match number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatch_number()
	 * @generated
	 * @ordered
	 */
	protected int match_number = MATCH_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHome_team() <em>Home team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_team()
	 * @generated
	 * @ordered
	 */
	protected Team home_team;

	/**
	 * The cached value of the '{@link #getAway_team() <em>Away team</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_team()
	 * @generated
	 * @ordered
	 */
	protected Team away_team;

	/**
	 * The default value of the '{@link #getGoals_home_team() <em>Goals home team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_home_team()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_HOME_TEAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoals_home_team() <em>Goals home team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_home_team()
	 * @generated
	 * @ordered
	 */
	protected int goals_home_team = GOALS_HOME_TEAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoals_away_team() <em>Goals away team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_away_team()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_AWAY_TEAM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoals_away_team() <em>Goals away team</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_away_team()
	 * @generated
	 * @ordered
	 */
	protected int goals_away_team = GOALS_AWAY_TEAM_EDEFAULT;

	/**
	 * The default value of the '{@link #getHome_possesion() <em>Home possesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_possesion()
	 * @generated
	 * @ordered
	 */
	protected static final int HOME_POSSESION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHome_possesion() <em>Home possesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_possesion()
	 * @generated
	 * @ordered
	 */
	protected int home_possesion = HOME_POSSESION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAway_possesion() <em>Away possesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_possesion()
	 * @generated
	 * @ordered
	 */
	protected static final int AWAY_POSSESION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAway_possesion() <em>Away possesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_possesion()
	 * @generated
	 * @ordered
	 */
	protected int away_possesion = AWAY_POSSESION_EDEFAULT;

	/**
	 * The default value of the '{@link #getHome_corners() <em>Home corners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_corners()
	 * @generated
	 * @ordered
	 */
	protected static final int HOME_CORNERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHome_corners() <em>Home corners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_corners()
	 * @generated
	 * @ordered
	 */
	protected int home_corners = HOME_CORNERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAway_corners() <em>Away corners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_corners()
	 * @generated
	 * @ordered
	 */
	protected static final int AWAY_CORNERS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAway_corners() <em>Away corners</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_corners()
	 * @generated
	 * @ordered
	 */
	protected int away_corners = AWAY_CORNERS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHome_shots() <em>Home shots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_shots()
	 * @generated
	 * @ordered
	 */
	protected static final int HOME_SHOTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHome_shots() <em>Home shots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_shots()
	 * @generated
	 * @ordered
	 */
	protected int home_shots = HOME_SHOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAway_shots() <em>Away shots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_shots()
	 * @generated
	 * @ordered
	 */
	protected static final int AWAY_SHOTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAway_shots() <em>Away shots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_shots()
	 * @generated
	 * @ordered
	 */
	protected int away_shots = AWAY_SHOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHome_shots_on_target() <em>Home shots on target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_shots_on_target()
	 * @generated
	 * @ordered
	 */
	protected static final int HOME_SHOTS_ON_TARGET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHome_shots_on_target() <em>Home shots on target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_shots_on_target()
	 * @generated
	 * @ordered
	 */
	protected int home_shots_on_target = HOME_SHOTS_ON_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getAway_shots_on_target() <em>Away shots on target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_shots_on_target()
	 * @generated
	 * @ordered
	 */
	protected static final int AWAY_SHOTS_ON_TARGET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAway_shots_on_target() <em>Away shots on target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_shots_on_target()
	 * @generated
	 * @ordered
	 */
	protected int away_shots_on_target = AWAY_SHOTS_ON_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getHome_faults() <em>Home faults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_faults()
	 * @generated
	 * @ordered
	 */
	protected static final int HOME_FAULTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHome_faults() <em>Home faults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_faults()
	 * @generated
	 * @ordered
	 */
	protected int home_faults = HOME_FAULTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAway_faults() <em>Away faults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_faults()
	 * @generated
	 * @ordered
	 */
	protected static final int AWAY_FAULTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAway_faults() <em>Away faults</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_faults()
	 * @generated
	 * @ordered
	 */
	protected int away_faults = AWAY_FAULTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHome_yellow_cards() <em>Home yellow cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_yellow_cards()
	 * @generated
	 * @ordered
	 */
	protected static final int HOME_YELLOW_CARDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHome_yellow_cards() <em>Home yellow cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_yellow_cards()
	 * @generated
	 * @ordered
	 */
	protected int home_yellow_cards = HOME_YELLOW_CARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAway_yellow_cards() <em>Away yellow cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_yellow_cards()
	 * @generated
	 * @ordered
	 */
	protected static final int AWAY_YELLOW_CARDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAway_yellow_cards() <em>Away yellow cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_yellow_cards()
	 * @generated
	 * @ordered
	 */
	protected int away_yellow_cards = AWAY_YELLOW_CARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getHome_red_cards() <em>Home red cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_red_cards()
	 * @generated
	 * @ordered
	 */
	protected static final int HOME_RED_CARDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getHome_red_cards() <em>Home red cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHome_red_cards()
	 * @generated
	 * @ordered
	 */
	protected int home_red_cards = HOME_RED_CARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAway_red_cards() <em>Away red cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_red_cards()
	 * @generated
	 * @ordered
	 */
	protected static final int AWAY_RED_CARDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAway_red_cards() <em>Away red cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAway_red_cards()
	 * @generated
	 * @ordered
	 */
	protected int away_red_cards = AWAY_RED_CARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getWinner() <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected static final String WINNER_EDEFAULT = "Draw";

	/**
	 * The cached value of the '{@link #getWinner() <em>Winner</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWinner()
	 * @generated
	 * @ordered
	 */
	protected String winner = WINNER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoser() <em>Loser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoser()
	 * @generated
	 * @ordered
	 */
	protected static final String LOSER_EDEFAULT = "Draw";

	/**
	 * The cached value of the '{@link #getLoser() <em>Loser</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoser()
	 * @generated
	 * @ordered
	 */
	protected String loser = LOSER_EDEFAULT;

	/**
	 * The default value of the '{@link #getWin_home_team_probabilities() <em>Win home team probabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWin_home_team_probabilities()
	 * @generated
	 * @ordered
	 */
	protected static final double WIN_HOME_TEAM_PROBABILITIES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWin_home_team_probabilities() <em>Win home team probabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWin_home_team_probabilities()
	 * @generated
	 * @ordered
	 */
	protected double win_home_team_probabilities = WIN_HOME_TEAM_PROBABILITIES_EDEFAULT;

	/**
	 * The default value of the '{@link #getWin_away_team_probabilities() <em>Win away team probabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWin_away_team_probabilities()
	 * @generated
	 * @ordered
	 */
	protected static final double WIN_AWAY_TEAM_PROBABILITIES_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getWin_away_team_probabilities() <em>Win away team probabilities</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWin_away_team_probabilities()
	 * @generated
	 * @ordered
	 */
	protected double win_away_team_probabilities = WIN_AWAY_TEAM_PROBABILITIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Football_dbPackage.Literals.MATCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMatch_number() {
		return match_number;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatch_number(int newMatch_number) {
		int oldMatch_number = match_number;
		match_number = newMatch_number;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__MATCH_NUMBER, oldMatch_number, match_number));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getHome_team() {
		if (home_team != null && home_team.eIsProxy()) {
			InternalEObject oldHome_team = (InternalEObject)home_team;
			home_team = (Team)eResolveProxy(oldHome_team);
			if (home_team != oldHome_team) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Football_dbPackage.MATCH__HOME_TEAM, oldHome_team, home_team));
			}
		}
		return home_team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetHome_team() {
		return home_team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome_team(Team newHome_team) {
		Team oldHome_team = home_team;
		home_team = newHome_team;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__HOME_TEAM, oldHome_team, home_team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getAway_team() {
		if (away_team != null && away_team.eIsProxy()) {
			InternalEObject oldAway_team = (InternalEObject)away_team;
			away_team = (Team)eResolveProxy(oldAway_team);
			if (away_team != oldAway_team) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Football_dbPackage.MATCH__AWAY_TEAM, oldAway_team, away_team));
			}
		}
		return away_team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team basicGetAway_team() {
		return away_team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAway_team(Team newAway_team) {
		Team oldAway_team = away_team;
		away_team = newAway_team;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__AWAY_TEAM, oldAway_team, away_team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game_Week getGame_week() {
		if (eContainerFeatureID() != Football_dbPackage.MATCH__GAME_WEEK) return null;
		return (Game_Week)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGame_week(Game_Week newGame_week, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGame_week, Football_dbPackage.MATCH__GAME_WEEK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGame_week(Game_Week newGame_week) {
		if (newGame_week != eInternalContainer() || (eContainerFeatureID() != Football_dbPackage.MATCH__GAME_WEEK && newGame_week != null)) {
			if (EcoreUtil.isAncestor(this, newGame_week))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGame_week != null)
				msgs = ((InternalEObject)newGame_week).eInverseAdd(this, Football_dbPackage.GAME_WEEK__MATCHES, Game_Week.class, msgs);
			msgs = basicSetGame_week(newGame_week, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__GAME_WEEK, newGame_week, newGame_week));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGoals_home_team() {
		return goals_home_team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoals_home_team(int newGoals_home_team) {
		int oldGoals_home_team = goals_home_team;
		goals_home_team = newGoals_home_team;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__GOALS_HOME_TEAM, oldGoals_home_team, goals_home_team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGoals_away_team() {
		return goals_away_team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoals_away_team(int newGoals_away_team) {
		int oldGoals_away_team = goals_away_team;
		goals_away_team = newGoals_away_team;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__GOALS_AWAY_TEAM, oldGoals_away_team, goals_away_team));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHome_possesion() {
		return home_possesion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome_possesion(int newHome_possesion) {
		int oldHome_possesion = home_possesion;
		home_possesion = newHome_possesion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__HOME_POSSESION, oldHome_possesion, home_possesion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAway_possesion() {
		return away_possesion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAway_possesion(int newAway_possesion) {
		int oldAway_possesion = away_possesion;
		away_possesion = newAway_possesion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__AWAY_POSSESION, oldAway_possesion, away_possesion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHome_corners() {
		return home_corners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome_corners(int newHome_corners) {
		int oldHome_corners = home_corners;
		home_corners = newHome_corners;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__HOME_CORNERS, oldHome_corners, home_corners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAway_corners() {
		return away_corners;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAway_corners(int newAway_corners) {
		int oldAway_corners = away_corners;
		away_corners = newAway_corners;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__AWAY_CORNERS, oldAway_corners, away_corners));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHome_shots() {
		return home_shots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome_shots(int newHome_shots) {
		int oldHome_shots = home_shots;
		home_shots = newHome_shots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__HOME_SHOTS, oldHome_shots, home_shots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAway_shots() {
		return away_shots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAway_shots(int newAway_shots) {
		int oldAway_shots = away_shots;
		away_shots = newAway_shots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__AWAY_SHOTS, oldAway_shots, away_shots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHome_shots_on_target() {
		return home_shots_on_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome_shots_on_target(int newHome_shots_on_target) {
		int oldHome_shots_on_target = home_shots_on_target;
		home_shots_on_target = newHome_shots_on_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__HOME_SHOTS_ON_TARGET, oldHome_shots_on_target, home_shots_on_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAway_shots_on_target() {
		return away_shots_on_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAway_shots_on_target(int newAway_shots_on_target) {
		int oldAway_shots_on_target = away_shots_on_target;
		away_shots_on_target = newAway_shots_on_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__AWAY_SHOTS_ON_TARGET, oldAway_shots_on_target, away_shots_on_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHome_faults() {
		return home_faults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome_faults(int newHome_faults) {
		int oldHome_faults = home_faults;
		home_faults = newHome_faults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__HOME_FAULTS, oldHome_faults, home_faults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAway_faults() {
		return away_faults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAway_faults(int newAway_faults) {
		int oldAway_faults = away_faults;
		away_faults = newAway_faults;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__AWAY_FAULTS, oldAway_faults, away_faults));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHome_yellow_cards() {
		return home_yellow_cards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome_yellow_cards(int newHome_yellow_cards) {
		int oldHome_yellow_cards = home_yellow_cards;
		home_yellow_cards = newHome_yellow_cards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__HOME_YELLOW_CARDS, oldHome_yellow_cards, home_yellow_cards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAway_yellow_cards() {
		return away_yellow_cards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAway_yellow_cards(int newAway_yellow_cards) {
		int oldAway_yellow_cards = away_yellow_cards;
		away_yellow_cards = newAway_yellow_cards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__AWAY_YELLOW_CARDS, oldAway_yellow_cards, away_yellow_cards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getHome_red_cards() {
		return home_red_cards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHome_red_cards(int newHome_red_cards) {
		int oldHome_red_cards = home_red_cards;
		home_red_cards = newHome_red_cards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__HOME_RED_CARDS, oldHome_red_cards, home_red_cards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAway_red_cards() {
		return away_red_cards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAway_red_cards(int newAway_red_cards) {
		int oldAway_red_cards = away_red_cards;
		away_red_cards = newAway_red_cards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__AWAY_RED_CARDS, oldAway_red_cards, away_red_cards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getWinner() {
		return winner;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWinner(String newWinner) {
		String oldWinner = winner;
		winner = newWinner;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__WINNER, oldWinner, winner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoser() {
		return loser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoser(String newLoser) {
		String oldLoser = loser;
		loser = newLoser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__LOSER, oldLoser, loser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWin_home_team_probabilities() {
		return win_home_team_probabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWin_home_team_probabilities(double newWin_home_team_probabilities) {
		double oldWin_home_team_probabilities = win_home_team_probabilities;
		win_home_team_probabilities = newWin_home_team_probabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__WIN_HOME_TEAM_PROBABILITIES, oldWin_home_team_probabilities, win_home_team_probabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWin_away_team_probabilities() {
		return win_away_team_probabilities;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWin_away_team_probabilities(double newWin_away_team_probabilities) {
		double oldWin_away_team_probabilities = win_away_team_probabilities;
		win_away_team_probabilities = newWin_away_team_probabilities;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.MATCH__WIN_AWAY_TEAM_PROBABILITIES, oldWin_away_team_probabilities, win_away_team_probabilities));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Football_dbPackage.MATCH__GAME_WEEK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGame_week((Game_Week)otherEnd, msgs);
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
			case Football_dbPackage.MATCH__GAME_WEEK:
				return basicSetGame_week(null, msgs);
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
			case Football_dbPackage.MATCH__GAME_WEEK:
				return eInternalContainer().eInverseRemove(this, Football_dbPackage.GAME_WEEK__MATCHES, Game_Week.class, msgs);
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
			case Football_dbPackage.MATCH__MATCH_NUMBER:
				return getMatch_number();
			case Football_dbPackage.MATCH__HOME_TEAM:
				if (resolve) return getHome_team();
				return basicGetHome_team();
			case Football_dbPackage.MATCH__AWAY_TEAM:
				if (resolve) return getAway_team();
				return basicGetAway_team();
			case Football_dbPackage.MATCH__GAME_WEEK:
				return getGame_week();
			case Football_dbPackage.MATCH__GOALS_HOME_TEAM:
				return getGoals_home_team();
			case Football_dbPackage.MATCH__GOALS_AWAY_TEAM:
				return getGoals_away_team();
			case Football_dbPackage.MATCH__HOME_POSSESION:
				return getHome_possesion();
			case Football_dbPackage.MATCH__AWAY_POSSESION:
				return getAway_possesion();
			case Football_dbPackage.MATCH__HOME_CORNERS:
				return getHome_corners();
			case Football_dbPackage.MATCH__AWAY_CORNERS:
				return getAway_corners();
			case Football_dbPackage.MATCH__HOME_SHOTS:
				return getHome_shots();
			case Football_dbPackage.MATCH__AWAY_SHOTS:
				return getAway_shots();
			case Football_dbPackage.MATCH__HOME_SHOTS_ON_TARGET:
				return getHome_shots_on_target();
			case Football_dbPackage.MATCH__AWAY_SHOTS_ON_TARGET:
				return getAway_shots_on_target();
			case Football_dbPackage.MATCH__HOME_FAULTS:
				return getHome_faults();
			case Football_dbPackage.MATCH__AWAY_FAULTS:
				return getAway_faults();
			case Football_dbPackage.MATCH__HOME_YELLOW_CARDS:
				return getHome_yellow_cards();
			case Football_dbPackage.MATCH__AWAY_YELLOW_CARDS:
				return getAway_yellow_cards();
			case Football_dbPackage.MATCH__HOME_RED_CARDS:
				return getHome_red_cards();
			case Football_dbPackage.MATCH__AWAY_RED_CARDS:
				return getAway_red_cards();
			case Football_dbPackage.MATCH__WINNER:
				return getWinner();
			case Football_dbPackage.MATCH__LOSER:
				return getLoser();
			case Football_dbPackage.MATCH__WIN_HOME_TEAM_PROBABILITIES:
				return getWin_home_team_probabilities();
			case Football_dbPackage.MATCH__WIN_AWAY_TEAM_PROBABILITIES:
				return getWin_away_team_probabilities();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Football_dbPackage.MATCH__MATCH_NUMBER:
				setMatch_number((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__HOME_TEAM:
				setHome_team((Team)newValue);
				return;
			case Football_dbPackage.MATCH__AWAY_TEAM:
				setAway_team((Team)newValue);
				return;
			case Football_dbPackage.MATCH__GAME_WEEK:
				setGame_week((Game_Week)newValue);
				return;
			case Football_dbPackage.MATCH__GOALS_HOME_TEAM:
				setGoals_home_team((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__GOALS_AWAY_TEAM:
				setGoals_away_team((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__HOME_POSSESION:
				setHome_possesion((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__AWAY_POSSESION:
				setAway_possesion((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__HOME_CORNERS:
				setHome_corners((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__AWAY_CORNERS:
				setAway_corners((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__HOME_SHOTS:
				setHome_shots((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__AWAY_SHOTS:
				setAway_shots((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__HOME_SHOTS_ON_TARGET:
				setHome_shots_on_target((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__AWAY_SHOTS_ON_TARGET:
				setAway_shots_on_target((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__HOME_FAULTS:
				setHome_faults((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__AWAY_FAULTS:
				setAway_faults((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__HOME_YELLOW_CARDS:
				setHome_yellow_cards((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__AWAY_YELLOW_CARDS:
				setAway_yellow_cards((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__HOME_RED_CARDS:
				setHome_red_cards((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__AWAY_RED_CARDS:
				setAway_red_cards((Integer)newValue);
				return;
			case Football_dbPackage.MATCH__WINNER:
				setWinner((String)newValue);
				return;
			case Football_dbPackage.MATCH__LOSER:
				setLoser((String)newValue);
				return;
			case Football_dbPackage.MATCH__WIN_HOME_TEAM_PROBABILITIES:
				setWin_home_team_probabilities((Double)newValue);
				return;
			case Football_dbPackage.MATCH__WIN_AWAY_TEAM_PROBABILITIES:
				setWin_away_team_probabilities((Double)newValue);
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
			case Football_dbPackage.MATCH__MATCH_NUMBER:
				setMatch_number(MATCH_NUMBER_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__HOME_TEAM:
				setHome_team((Team)null);
				return;
			case Football_dbPackage.MATCH__AWAY_TEAM:
				setAway_team((Team)null);
				return;
			case Football_dbPackage.MATCH__GAME_WEEK:
				setGame_week((Game_Week)null);
				return;
			case Football_dbPackage.MATCH__GOALS_HOME_TEAM:
				setGoals_home_team(GOALS_HOME_TEAM_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__GOALS_AWAY_TEAM:
				setGoals_away_team(GOALS_AWAY_TEAM_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__HOME_POSSESION:
				setHome_possesion(HOME_POSSESION_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__AWAY_POSSESION:
				setAway_possesion(AWAY_POSSESION_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__HOME_CORNERS:
				setHome_corners(HOME_CORNERS_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__AWAY_CORNERS:
				setAway_corners(AWAY_CORNERS_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__HOME_SHOTS:
				setHome_shots(HOME_SHOTS_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__AWAY_SHOTS:
				setAway_shots(AWAY_SHOTS_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__HOME_SHOTS_ON_TARGET:
				setHome_shots_on_target(HOME_SHOTS_ON_TARGET_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__AWAY_SHOTS_ON_TARGET:
				setAway_shots_on_target(AWAY_SHOTS_ON_TARGET_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__HOME_FAULTS:
				setHome_faults(HOME_FAULTS_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__AWAY_FAULTS:
				setAway_faults(AWAY_FAULTS_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__HOME_YELLOW_CARDS:
				setHome_yellow_cards(HOME_YELLOW_CARDS_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__AWAY_YELLOW_CARDS:
				setAway_yellow_cards(AWAY_YELLOW_CARDS_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__HOME_RED_CARDS:
				setHome_red_cards(HOME_RED_CARDS_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__AWAY_RED_CARDS:
				setAway_red_cards(AWAY_RED_CARDS_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__WINNER:
				setWinner(WINNER_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__LOSER:
				setLoser(LOSER_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__WIN_HOME_TEAM_PROBABILITIES:
				setWin_home_team_probabilities(WIN_HOME_TEAM_PROBABILITIES_EDEFAULT);
				return;
			case Football_dbPackage.MATCH__WIN_AWAY_TEAM_PROBABILITIES:
				setWin_away_team_probabilities(WIN_AWAY_TEAM_PROBABILITIES_EDEFAULT);
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
			case Football_dbPackage.MATCH__MATCH_NUMBER:
				return match_number != MATCH_NUMBER_EDEFAULT;
			case Football_dbPackage.MATCH__HOME_TEAM:
				return home_team != null;
			case Football_dbPackage.MATCH__AWAY_TEAM:
				return away_team != null;
			case Football_dbPackage.MATCH__GAME_WEEK:
				return getGame_week() != null;
			case Football_dbPackage.MATCH__GOALS_HOME_TEAM:
				return goals_home_team != GOALS_HOME_TEAM_EDEFAULT;
			case Football_dbPackage.MATCH__GOALS_AWAY_TEAM:
				return goals_away_team != GOALS_AWAY_TEAM_EDEFAULT;
			case Football_dbPackage.MATCH__HOME_POSSESION:
				return home_possesion != HOME_POSSESION_EDEFAULT;
			case Football_dbPackage.MATCH__AWAY_POSSESION:
				return away_possesion != AWAY_POSSESION_EDEFAULT;
			case Football_dbPackage.MATCH__HOME_CORNERS:
				return home_corners != HOME_CORNERS_EDEFAULT;
			case Football_dbPackage.MATCH__AWAY_CORNERS:
				return away_corners != AWAY_CORNERS_EDEFAULT;
			case Football_dbPackage.MATCH__HOME_SHOTS:
				return home_shots != HOME_SHOTS_EDEFAULT;
			case Football_dbPackage.MATCH__AWAY_SHOTS:
				return away_shots != AWAY_SHOTS_EDEFAULT;
			case Football_dbPackage.MATCH__HOME_SHOTS_ON_TARGET:
				return home_shots_on_target != HOME_SHOTS_ON_TARGET_EDEFAULT;
			case Football_dbPackage.MATCH__AWAY_SHOTS_ON_TARGET:
				return away_shots_on_target != AWAY_SHOTS_ON_TARGET_EDEFAULT;
			case Football_dbPackage.MATCH__HOME_FAULTS:
				return home_faults != HOME_FAULTS_EDEFAULT;
			case Football_dbPackage.MATCH__AWAY_FAULTS:
				return away_faults != AWAY_FAULTS_EDEFAULT;
			case Football_dbPackage.MATCH__HOME_YELLOW_CARDS:
				return home_yellow_cards != HOME_YELLOW_CARDS_EDEFAULT;
			case Football_dbPackage.MATCH__AWAY_YELLOW_CARDS:
				return away_yellow_cards != AWAY_YELLOW_CARDS_EDEFAULT;
			case Football_dbPackage.MATCH__HOME_RED_CARDS:
				return home_red_cards != HOME_RED_CARDS_EDEFAULT;
			case Football_dbPackage.MATCH__AWAY_RED_CARDS:
				return away_red_cards != AWAY_RED_CARDS_EDEFAULT;
			case Football_dbPackage.MATCH__WINNER:
				return WINNER_EDEFAULT == null ? winner != null : !WINNER_EDEFAULT.equals(winner);
			case Football_dbPackage.MATCH__LOSER:
				return LOSER_EDEFAULT == null ? loser != null : !LOSER_EDEFAULT.equals(loser);
			case Football_dbPackage.MATCH__WIN_HOME_TEAM_PROBABILITIES:
				return win_home_team_probabilities != WIN_HOME_TEAM_PROBABILITIES_EDEFAULT;
			case Football_dbPackage.MATCH__WIN_AWAY_TEAM_PROBABILITIES:
				return win_away_team_probabilities != WIN_AWAY_TEAM_PROBABILITIES_EDEFAULT;
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
		result.append(" (match_number: ");
		result.append(match_number);
		result.append(", goals_home_team: ");
		result.append(goals_home_team);
		result.append(", goals_away_team: ");
		result.append(goals_away_team);
		result.append(", home_possesion: ");
		result.append(home_possesion);
		result.append(", away_possesion: ");
		result.append(away_possesion);
		result.append(", home_corners: ");
		result.append(home_corners);
		result.append(", away_corners: ");
		result.append(away_corners);
		result.append(", home_shots: ");
		result.append(home_shots);
		result.append(", away_shots: ");
		result.append(away_shots);
		result.append(", home_shots_on_target: ");
		result.append(home_shots_on_target);
		result.append(", away_shots_on_target: ");
		result.append(away_shots_on_target);
		result.append(", home_faults: ");
		result.append(home_faults);
		result.append(", away_faults: ");
		result.append(away_faults);
		result.append(", home_yellow_cards: ");
		result.append(home_yellow_cards);
		result.append(", away_yellow_cards: ");
		result.append(away_yellow_cards);
		result.append(", home_red_cards: ");
		result.append(home_red_cards);
		result.append(", away_red_cards: ");
		result.append(away_red_cards);
		result.append(", winner: ");
		result.append(winner);
		result.append(", loser: ");
		result.append(loser);
		result.append(", win_home_team_probabilities: ");
		result.append(win_home_team_probabilities);
		result.append(", win_away_team_probabilities: ");
		result.append(win_away_team_probabilities);
		result.append(')');
		return result.toString();
	}

} //MatchImpl
