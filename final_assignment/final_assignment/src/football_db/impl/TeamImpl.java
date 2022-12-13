/**
 */
package football_db.impl;

import football_db.Football_dbPackage;
import football_db.League;
import football_db.Match;
import football_db.Player;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Team</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link football_db.impl.TeamImpl#getName <em>Name</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getLeague <em>League</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getPlayers <em>Players</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getMatches <em>Matches</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getNumber_matches <em>Number matches</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getWins <em>Wins</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getDraws <em>Draws</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getLosses <em>Losses</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getPoints <em>Points</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getGoals_scored <em>Goals scored</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getGoals_conceded <em>Goals conceded</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getClean_sheets <em>Clean sheets</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getAverage_possesion <em>Average possesion</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getShots <em>Shots</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getShots_on_target <em>Shots on target</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getPoints_per_game <em>Points per game</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getGoals_difference <em>Goals difference</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getShoot_accuracy <em>Shoot accuracy</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getShoots_per_game <em>Shoots per game</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getShoots_on_target_per_game <em>Shoots on target per game</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getScored_goals_per_game <em>Scored goals per game</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getConceded_goals_per_game <em>Conceded goals per game</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getGoals_per_shoots <em>Goals per shoots</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getGoals_per_shoots_on_target <em>Goals per shoots on target</em>}</li>
 *   <li>{@link football_db.impl.TeamImpl#getElo <em>Elo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TeamImpl extends MinimalEObjectImpl.Container implements Team {
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
	 * The cached value of the '{@link #getPlayers() <em>Players</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayers()
	 * @generated
	 * @ordered
	 */
	protected EList<Player> players;

	/**
	 * The cached value of the '{@link #getMatches() <em>Matches</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches()
	 * @generated
	 * @ordered
	 */
	protected EList<Match> matches;

	/**
	 * The default value of the '{@link #getNumber_matches() <em>Number matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_matches()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_MATCHES_EDEFAULT = 38;

	/**
	 * The cached value of the '{@link #getNumber_matches() <em>Number matches</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumber_matches()
	 * @generated
	 * @ordered
	 */
	protected int number_matches = NUMBER_MATCHES_EDEFAULT;

	/**
	 * The default value of the '{@link #getWins() <em>Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWins()
	 * @generated
	 * @ordered
	 */
	protected static final int WINS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWins() <em>Wins</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWins()
	 * @generated
	 * @ordered
	 */
	protected int wins = WINS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDraws() <em>Draws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDraws()
	 * @generated
	 * @ordered
	 */
	protected static final int DRAWS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDraws() <em>Draws</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDraws()
	 * @generated
	 * @ordered
	 */
	protected int draws = DRAWS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLosses() <em>Losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLosses()
	 * @generated
	 * @ordered
	 */
	protected static final int LOSSES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLosses() <em>Losses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLosses()
	 * @generated
	 * @ordered
	 */
	protected int losses = LOSSES_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected static final int POINTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPoints() <em>Points</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints()
	 * @generated
	 * @ordered
	 */
	protected int points = POINTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoals_scored() <em>Goals scored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_scored()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_SCORED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoals_scored() <em>Goals scored</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_scored()
	 * @generated
	 * @ordered
	 */
	protected int goals_scored = GOALS_SCORED_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoals_conceded() <em>Goals conceded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_conceded()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_CONCEDED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoals_conceded() <em>Goals conceded</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_conceded()
	 * @generated
	 * @ordered
	 */
	protected int goals_conceded = GOALS_CONCEDED_EDEFAULT;

	/**
	 * The default value of the '{@link #getClean_sheets() <em>Clean sheets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClean_sheets()
	 * @generated
	 * @ordered
	 */
	protected static final int CLEAN_SHEETS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getClean_sheets() <em>Clean sheets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClean_sheets()
	 * @generated
	 * @ordered
	 */
	protected int clean_sheets = CLEAN_SHEETS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAverage_possesion() <em>Average possesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage_possesion()
	 * @generated
	 * @ordered
	 */
	protected static final int AVERAGE_POSSESION_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAverage_possesion() <em>Average possesion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAverage_possesion()
	 * @generated
	 * @ordered
	 */
	protected int average_possesion = AVERAGE_POSSESION_EDEFAULT;

	/**
	 * The default value of the '{@link #getShots() <em>Shots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShots()
	 * @generated
	 * @ordered
	 */
	protected static final int SHOTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShots() <em>Shots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShots()
	 * @generated
	 * @ordered
	 */
	protected int shots = SHOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getShots_on_target() <em>Shots on target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShots_on_target()
	 * @generated
	 * @ordered
	 */
	protected static final int SHOTS_ON_TARGET_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getShots_on_target() <em>Shots on target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShots_on_target()
	 * @generated
	 * @ordered
	 */
	protected int shots_on_target = SHOTS_ON_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPoints_per_game() <em>Points per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints_per_game()
	 * @generated
	 * @ordered
	 */
	protected static final double POINTS_PER_GAME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPoints_per_game() <em>Points per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoints_per_game()
	 * @generated
	 * @ordered
	 */
	protected double points_per_game = POINTS_PER_GAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoals_difference() <em>Goals difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_difference()
	 * @generated
	 * @ordered
	 */
	protected static final int GOALS_DIFFERENCE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGoals_difference() <em>Goals difference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_difference()
	 * @generated
	 * @ordered
	 */
	protected int goals_difference = GOALS_DIFFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getShoot_accuracy() <em>Shoot accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoot_accuracy()
	 * @generated
	 * @ordered
	 */
	protected static final double SHOOT_ACCURACY_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getShoot_accuracy() <em>Shoot accuracy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoot_accuracy()
	 * @generated
	 * @ordered
	 */
	protected double shoot_accuracy = SHOOT_ACCURACY_EDEFAULT;

	/**
	 * The default value of the '{@link #getShoots_per_game() <em>Shoots per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoots_per_game()
	 * @generated
	 * @ordered
	 */
	protected static final double SHOOTS_PER_GAME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getShoots_per_game() <em>Shoots per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoots_per_game()
	 * @generated
	 * @ordered
	 */
	protected double shoots_per_game = SHOOTS_PER_GAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getShoots_on_target_per_game() <em>Shoots on target per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoots_on_target_per_game()
	 * @generated
	 * @ordered
	 */
	protected static final double SHOOTS_ON_TARGET_PER_GAME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getShoots_on_target_per_game() <em>Shoots on target per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShoots_on_target_per_game()
	 * @generated
	 * @ordered
	 */
	protected double shoots_on_target_per_game = SHOOTS_ON_TARGET_PER_GAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getScored_goals_per_game() <em>Scored goals per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScored_goals_per_game()
	 * @generated
	 * @ordered
	 */
	protected static final double SCORED_GOALS_PER_GAME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getScored_goals_per_game() <em>Scored goals per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScored_goals_per_game()
	 * @generated
	 * @ordered
	 */
	protected double scored_goals_per_game = SCORED_GOALS_PER_GAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getConceded_goals_per_game() <em>Conceded goals per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceded_goals_per_game()
	 * @generated
	 * @ordered
	 */
	protected static final double CONCEDED_GOALS_PER_GAME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getConceded_goals_per_game() <em>Conceded goals per game</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConceded_goals_per_game()
	 * @generated
	 * @ordered
	 */
	protected double conceded_goals_per_game = CONCEDED_GOALS_PER_GAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoals_per_shoots() <em>Goals per shoots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_per_shoots()
	 * @generated
	 * @ordered
	 */
	protected static final double GOALS_PER_SHOOTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGoals_per_shoots() <em>Goals per shoots</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_per_shoots()
	 * @generated
	 * @ordered
	 */
	protected double goals_per_shoots = GOALS_PER_SHOOTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoals_per_shoots_on_target() <em>Goals per shoots on target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_per_shoots_on_target()
	 * @generated
	 * @ordered
	 */
	protected static final double GOALS_PER_SHOOTS_ON_TARGET_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGoals_per_shoots_on_target() <em>Goals per shoots on target</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_per_shoots_on_target()
	 * @generated
	 * @ordered
	 */
	protected double goals_per_shoots_on_target = GOALS_PER_SHOOTS_ON_TARGET_EDEFAULT;

	/**
	 * The default value of the '{@link #getElo() <em>Elo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElo()
	 * @generated
	 * @ordered
	 */
	protected static final double ELO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getElo() <em>Elo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElo()
	 * @generated
	 * @ordered
	 */
	protected double elo = ELO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TeamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Football_dbPackage.Literals.TEAM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public League getLeague() {
		if (eContainerFeatureID() != Football_dbPackage.TEAM__LEAGUE) return null;
		return (League)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLeague(League newLeague, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLeague, Football_dbPackage.TEAM__LEAGUE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeague(League newLeague) {
		if (newLeague != eInternalContainer() || (eContainerFeatureID() != Football_dbPackage.TEAM__LEAGUE && newLeague != null)) {
			if (EcoreUtil.isAncestor(this, newLeague))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLeague != null)
				msgs = ((InternalEObject)newLeague).eInverseAdd(this, Football_dbPackage.LEAGUE__TEAMS, League.class, msgs);
			msgs = basicSetLeague(newLeague, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__LEAGUE, newLeague, newLeague));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Player> getPlayers() {
		if (players == null) {
			players = new EObjectContainmentWithInverseEList<Player>(Player.class, this, Football_dbPackage.TEAM__PLAYERS, Football_dbPackage.PLAYER__TEAM);
		}
		return players;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Match> getMatches() {
		if (matches == null) {
			matches = new EObjectResolvingEList<Match>(Match.class, this, Football_dbPackage.TEAM__MATCHES);
		}
		return matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumber_matches() {
		return number_matches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWins() {
		return wins;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWins(int newWins) {
		int oldWins = wins;
		wins = newWins;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__WINS, oldWins, wins));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDraws() {
		return draws;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDraws(int newDraws) {
		int oldDraws = draws;
		draws = newDraws;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__DRAWS, oldDraws, draws));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLosses() {
		return losses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLosses(int newLosses) {
		int oldLosses = losses;
		losses = newLosses;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__LOSSES, oldLosses, losses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints(int newPoints) {
		int oldPoints = points;
		points = newPoints;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__POINTS, oldPoints, points));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGoals_scored() {
		return goals_scored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoals_scored(int newGoals_scored) {
		int oldGoals_scored = goals_scored;
		goals_scored = newGoals_scored;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__GOALS_SCORED, oldGoals_scored, goals_scored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGoals_conceded() {
		return goals_conceded;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoals_conceded(int newGoals_conceded) {
		int oldGoals_conceded = goals_conceded;
		goals_conceded = newGoals_conceded;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__GOALS_CONCEDED, oldGoals_conceded, goals_conceded));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getClean_sheets() {
		return clean_sheets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClean_sheets(int newClean_sheets) {
		int oldClean_sheets = clean_sheets;
		clean_sheets = newClean_sheets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__CLEAN_SHEETS, oldClean_sheets, clean_sheets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAverage_possesion() {
		return average_possesion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAverage_possesion(int newAverage_possesion) {
		int oldAverage_possesion = average_possesion;
		average_possesion = newAverage_possesion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__AVERAGE_POSSESION, oldAverage_possesion, average_possesion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShots() {
		return shots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShots(int newShots) {
		int oldShots = shots;
		shots = newShots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__SHOTS, oldShots, shots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getShots_on_target() {
		return shots_on_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShots_on_target(int newShots_on_target) {
		int oldShots_on_target = shots_on_target;
		shots_on_target = newShots_on_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__SHOTS_ON_TARGET, oldShots_on_target, shots_on_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPoints_per_game() {
		return points_per_game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPoints_per_game(double newPoints_per_game) {
		double oldPoints_per_game = points_per_game;
		points_per_game = newPoints_per_game;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__POINTS_PER_GAME, oldPoints_per_game, points_per_game));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGoals_difference() {
		return goals_difference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoals_difference(int newGoals_difference) {
		int oldGoals_difference = goals_difference;
		goals_difference = newGoals_difference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__GOALS_DIFFERENCE, oldGoals_difference, goals_difference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getShoot_accuracy() {
		return shoot_accuracy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShoot_accuracy(double newShoot_accuracy) {
		double oldShoot_accuracy = shoot_accuracy;
		shoot_accuracy = newShoot_accuracy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__SHOOT_ACCURACY, oldShoot_accuracy, shoot_accuracy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getShoots_per_game() {
		return shoots_per_game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShoots_per_game(double newShoots_per_game) {
		double oldShoots_per_game = shoots_per_game;
		shoots_per_game = newShoots_per_game;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__SHOOTS_PER_GAME, oldShoots_per_game, shoots_per_game));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getShoots_on_target_per_game() {
		return shoots_on_target_per_game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShoots_on_target_per_game(double newShoots_on_target_per_game) {
		double oldShoots_on_target_per_game = shoots_on_target_per_game;
		shoots_on_target_per_game = newShoots_on_target_per_game;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__SHOOTS_ON_TARGET_PER_GAME, oldShoots_on_target_per_game, shoots_on_target_per_game));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getScored_goals_per_game() {
		return scored_goals_per_game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScored_goals_per_game(double newScored_goals_per_game) {
		double oldScored_goals_per_game = scored_goals_per_game;
		scored_goals_per_game = newScored_goals_per_game;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__SCORED_GOALS_PER_GAME, oldScored_goals_per_game, scored_goals_per_game));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getConceded_goals_per_game() {
		return conceded_goals_per_game;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConceded_goals_per_game(double newConceded_goals_per_game) {
		double oldConceded_goals_per_game = conceded_goals_per_game;
		conceded_goals_per_game = newConceded_goals_per_game;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__CONCEDED_GOALS_PER_GAME, oldConceded_goals_per_game, conceded_goals_per_game));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGoals_per_shoots() {
		return goals_per_shoots;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoals_per_shoots(double newGoals_per_shoots) {
		double oldGoals_per_shoots = goals_per_shoots;
		goals_per_shoots = newGoals_per_shoots;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__GOALS_PER_SHOOTS, oldGoals_per_shoots, goals_per_shoots));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGoals_per_shoots_on_target() {
		return goals_per_shoots_on_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoals_per_shoots_on_target(double newGoals_per_shoots_on_target) {
		double oldGoals_per_shoots_on_target = goals_per_shoots_on_target;
		goals_per_shoots_on_target = newGoals_per_shoots_on_target;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__GOALS_PER_SHOOTS_ON_TARGET, oldGoals_per_shoots_on_target, goals_per_shoots_on_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getElo() {
		return elo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElo(double newElo) {
		double oldElo = elo;
		elo = newElo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.TEAM__ELO, oldElo, elo));
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
			case Football_dbPackage.TEAM__LEAGUE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLeague((League)otherEnd, msgs);
			case Football_dbPackage.TEAM__PLAYERS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPlayers()).basicAdd(otherEnd, msgs);
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
			case Football_dbPackage.TEAM__LEAGUE:
				return basicSetLeague(null, msgs);
			case Football_dbPackage.TEAM__PLAYERS:
				return ((InternalEList<?>)getPlayers()).basicRemove(otherEnd, msgs);
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
			case Football_dbPackage.TEAM__LEAGUE:
				return eInternalContainer().eInverseRemove(this, Football_dbPackage.LEAGUE__TEAMS, League.class, msgs);
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
			case Football_dbPackage.TEAM__NAME:
				return getName();
			case Football_dbPackage.TEAM__LEAGUE:
				return getLeague();
			case Football_dbPackage.TEAM__PLAYERS:
				return getPlayers();
			case Football_dbPackage.TEAM__MATCHES:
				return getMatches();
			case Football_dbPackage.TEAM__NUMBER_MATCHES:
				return getNumber_matches();
			case Football_dbPackage.TEAM__WINS:
				return getWins();
			case Football_dbPackage.TEAM__DRAWS:
				return getDraws();
			case Football_dbPackage.TEAM__LOSSES:
				return getLosses();
			case Football_dbPackage.TEAM__POINTS:
				return getPoints();
			case Football_dbPackage.TEAM__GOALS_SCORED:
				return getGoals_scored();
			case Football_dbPackage.TEAM__GOALS_CONCEDED:
				return getGoals_conceded();
			case Football_dbPackage.TEAM__CLEAN_SHEETS:
				return getClean_sheets();
			case Football_dbPackage.TEAM__AVERAGE_POSSESION:
				return getAverage_possesion();
			case Football_dbPackage.TEAM__SHOTS:
				return getShots();
			case Football_dbPackage.TEAM__SHOTS_ON_TARGET:
				return getShots_on_target();
			case Football_dbPackage.TEAM__POINTS_PER_GAME:
				return getPoints_per_game();
			case Football_dbPackage.TEAM__GOALS_DIFFERENCE:
				return getGoals_difference();
			case Football_dbPackage.TEAM__SHOOT_ACCURACY:
				return getShoot_accuracy();
			case Football_dbPackage.TEAM__SHOOTS_PER_GAME:
				return getShoots_per_game();
			case Football_dbPackage.TEAM__SHOOTS_ON_TARGET_PER_GAME:
				return getShoots_on_target_per_game();
			case Football_dbPackage.TEAM__SCORED_GOALS_PER_GAME:
				return getScored_goals_per_game();
			case Football_dbPackage.TEAM__CONCEDED_GOALS_PER_GAME:
				return getConceded_goals_per_game();
			case Football_dbPackage.TEAM__GOALS_PER_SHOOTS:
				return getGoals_per_shoots();
			case Football_dbPackage.TEAM__GOALS_PER_SHOOTS_ON_TARGET:
				return getGoals_per_shoots_on_target();
			case Football_dbPackage.TEAM__ELO:
				return getElo();
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
			case Football_dbPackage.TEAM__NAME:
				setName((String)newValue);
				return;
			case Football_dbPackage.TEAM__LEAGUE:
				setLeague((League)newValue);
				return;
			case Football_dbPackage.TEAM__PLAYERS:
				getPlayers().clear();
				getPlayers().addAll((Collection<? extends Player>)newValue);
				return;
			case Football_dbPackage.TEAM__MATCHES:
				getMatches().clear();
				getMatches().addAll((Collection<? extends Match>)newValue);
				return;
			case Football_dbPackage.TEAM__WINS:
				setWins((Integer)newValue);
				return;
			case Football_dbPackage.TEAM__DRAWS:
				setDraws((Integer)newValue);
				return;
			case Football_dbPackage.TEAM__LOSSES:
				setLosses((Integer)newValue);
				return;
			case Football_dbPackage.TEAM__POINTS:
				setPoints((Integer)newValue);
				return;
			case Football_dbPackage.TEAM__GOALS_SCORED:
				setGoals_scored((Integer)newValue);
				return;
			case Football_dbPackage.TEAM__GOALS_CONCEDED:
				setGoals_conceded((Integer)newValue);
				return;
			case Football_dbPackage.TEAM__CLEAN_SHEETS:
				setClean_sheets((Integer)newValue);
				return;
			case Football_dbPackage.TEAM__AVERAGE_POSSESION:
				setAverage_possesion((Integer)newValue);
				return;
			case Football_dbPackage.TEAM__SHOTS:
				setShots((Integer)newValue);
				return;
			case Football_dbPackage.TEAM__SHOTS_ON_TARGET:
				setShots_on_target((Integer)newValue);
				return;
			case Football_dbPackage.TEAM__POINTS_PER_GAME:
				setPoints_per_game((Double)newValue);
				return;
			case Football_dbPackage.TEAM__GOALS_DIFFERENCE:
				setGoals_difference((Integer)newValue);
				return;
			case Football_dbPackage.TEAM__SHOOT_ACCURACY:
				setShoot_accuracy((Double)newValue);
				return;
			case Football_dbPackage.TEAM__SHOOTS_PER_GAME:
				setShoots_per_game((Double)newValue);
				return;
			case Football_dbPackage.TEAM__SHOOTS_ON_TARGET_PER_GAME:
				setShoots_on_target_per_game((Double)newValue);
				return;
			case Football_dbPackage.TEAM__SCORED_GOALS_PER_GAME:
				setScored_goals_per_game((Double)newValue);
				return;
			case Football_dbPackage.TEAM__CONCEDED_GOALS_PER_GAME:
				setConceded_goals_per_game((Double)newValue);
				return;
			case Football_dbPackage.TEAM__GOALS_PER_SHOOTS:
				setGoals_per_shoots((Double)newValue);
				return;
			case Football_dbPackage.TEAM__GOALS_PER_SHOOTS_ON_TARGET:
				setGoals_per_shoots_on_target((Double)newValue);
				return;
			case Football_dbPackage.TEAM__ELO:
				setElo((Double)newValue);
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
			case Football_dbPackage.TEAM__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__LEAGUE:
				setLeague((League)null);
				return;
			case Football_dbPackage.TEAM__PLAYERS:
				getPlayers().clear();
				return;
			case Football_dbPackage.TEAM__MATCHES:
				getMatches().clear();
				return;
			case Football_dbPackage.TEAM__WINS:
				setWins(WINS_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__DRAWS:
				setDraws(DRAWS_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__LOSSES:
				setLosses(LOSSES_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__POINTS:
				setPoints(POINTS_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__GOALS_SCORED:
				setGoals_scored(GOALS_SCORED_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__GOALS_CONCEDED:
				setGoals_conceded(GOALS_CONCEDED_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__CLEAN_SHEETS:
				setClean_sheets(CLEAN_SHEETS_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__AVERAGE_POSSESION:
				setAverage_possesion(AVERAGE_POSSESION_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__SHOTS:
				setShots(SHOTS_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__SHOTS_ON_TARGET:
				setShots_on_target(SHOTS_ON_TARGET_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__POINTS_PER_GAME:
				setPoints_per_game(POINTS_PER_GAME_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__GOALS_DIFFERENCE:
				setGoals_difference(GOALS_DIFFERENCE_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__SHOOT_ACCURACY:
				setShoot_accuracy(SHOOT_ACCURACY_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__SHOOTS_PER_GAME:
				setShoots_per_game(SHOOTS_PER_GAME_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__SHOOTS_ON_TARGET_PER_GAME:
				setShoots_on_target_per_game(SHOOTS_ON_TARGET_PER_GAME_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__SCORED_GOALS_PER_GAME:
				setScored_goals_per_game(SCORED_GOALS_PER_GAME_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__CONCEDED_GOALS_PER_GAME:
				setConceded_goals_per_game(CONCEDED_GOALS_PER_GAME_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__GOALS_PER_SHOOTS:
				setGoals_per_shoots(GOALS_PER_SHOOTS_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__GOALS_PER_SHOOTS_ON_TARGET:
				setGoals_per_shoots_on_target(GOALS_PER_SHOOTS_ON_TARGET_EDEFAULT);
				return;
			case Football_dbPackage.TEAM__ELO:
				setElo(ELO_EDEFAULT);
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
			case Football_dbPackage.TEAM__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Football_dbPackage.TEAM__LEAGUE:
				return getLeague() != null;
			case Football_dbPackage.TEAM__PLAYERS:
				return players != null && !players.isEmpty();
			case Football_dbPackage.TEAM__MATCHES:
				return matches != null && !matches.isEmpty();
			case Football_dbPackage.TEAM__NUMBER_MATCHES:
				return number_matches != NUMBER_MATCHES_EDEFAULT;
			case Football_dbPackage.TEAM__WINS:
				return wins != WINS_EDEFAULT;
			case Football_dbPackage.TEAM__DRAWS:
				return draws != DRAWS_EDEFAULT;
			case Football_dbPackage.TEAM__LOSSES:
				return losses != LOSSES_EDEFAULT;
			case Football_dbPackage.TEAM__POINTS:
				return points != POINTS_EDEFAULT;
			case Football_dbPackage.TEAM__GOALS_SCORED:
				return goals_scored != GOALS_SCORED_EDEFAULT;
			case Football_dbPackage.TEAM__GOALS_CONCEDED:
				return goals_conceded != GOALS_CONCEDED_EDEFAULT;
			case Football_dbPackage.TEAM__CLEAN_SHEETS:
				return clean_sheets != CLEAN_SHEETS_EDEFAULT;
			case Football_dbPackage.TEAM__AVERAGE_POSSESION:
				return average_possesion != AVERAGE_POSSESION_EDEFAULT;
			case Football_dbPackage.TEAM__SHOTS:
				return shots != SHOTS_EDEFAULT;
			case Football_dbPackage.TEAM__SHOTS_ON_TARGET:
				return shots_on_target != SHOTS_ON_TARGET_EDEFAULT;
			case Football_dbPackage.TEAM__POINTS_PER_GAME:
				return points_per_game != POINTS_PER_GAME_EDEFAULT;
			case Football_dbPackage.TEAM__GOALS_DIFFERENCE:
				return goals_difference != GOALS_DIFFERENCE_EDEFAULT;
			case Football_dbPackage.TEAM__SHOOT_ACCURACY:
				return shoot_accuracy != SHOOT_ACCURACY_EDEFAULT;
			case Football_dbPackage.TEAM__SHOOTS_PER_GAME:
				return shoots_per_game != SHOOTS_PER_GAME_EDEFAULT;
			case Football_dbPackage.TEAM__SHOOTS_ON_TARGET_PER_GAME:
				return shoots_on_target_per_game != SHOOTS_ON_TARGET_PER_GAME_EDEFAULT;
			case Football_dbPackage.TEAM__SCORED_GOALS_PER_GAME:
				return scored_goals_per_game != SCORED_GOALS_PER_GAME_EDEFAULT;
			case Football_dbPackage.TEAM__CONCEDED_GOALS_PER_GAME:
				return conceded_goals_per_game != CONCEDED_GOALS_PER_GAME_EDEFAULT;
			case Football_dbPackage.TEAM__GOALS_PER_SHOOTS:
				return goals_per_shoots != GOALS_PER_SHOOTS_EDEFAULT;
			case Football_dbPackage.TEAM__GOALS_PER_SHOOTS_ON_TARGET:
				return goals_per_shoots_on_target != GOALS_PER_SHOOTS_ON_TARGET_EDEFAULT;
			case Football_dbPackage.TEAM__ELO:
				return elo != ELO_EDEFAULT;
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
		result.append(", number_matches: ");
		result.append(number_matches);
		result.append(", wins: ");
		result.append(wins);
		result.append(", draws: ");
		result.append(draws);
		result.append(", losses: ");
		result.append(losses);
		result.append(", points: ");
		result.append(points);
		result.append(", goals_scored: ");
		result.append(goals_scored);
		result.append(", goals_conceded: ");
		result.append(goals_conceded);
		result.append(", clean_sheets: ");
		result.append(clean_sheets);
		result.append(", average_possesion: ");
		result.append(average_possesion);
		result.append(", shots: ");
		result.append(shots);
		result.append(", shots_on_target: ");
		result.append(shots_on_target);
		result.append(", points_per_game: ");
		result.append(points_per_game);
		result.append(", goals_difference: ");
		result.append(goals_difference);
		result.append(", shoot_accuracy: ");
		result.append(shoot_accuracy);
		result.append(", shoots_per_game: ");
		result.append(shoots_per_game);
		result.append(", shoots_on_target_per_game: ");
		result.append(shoots_on_target_per_game);
		result.append(", scored_goals_per_game: ");
		result.append(scored_goals_per_game);
		result.append(", conceded_goals_per_game: ");
		result.append(conceded_goals_per_game);
		result.append(", goals_per_shoots: ");
		result.append(goals_per_shoots);
		result.append(", goals_per_shoots_on_target: ");
		result.append(goals_per_shoots_on_target);
		result.append(", elo: ");
		result.append(elo);
		result.append(')');
		return result.toString();
	}

} //TeamImpl
