/**
 */
package football_db.impl;

import football_db.Football_dbPackage;
import football_db.Player;
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
 * An implementation of the model object '<em><b>Player</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link football_db.impl.PlayerImpl#getTeam <em>Team</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getName <em>Name</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getAge <em>Age</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getGoals_scored <em>Goals scored</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getAssists <em>Assists</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getMinutes_played <em>Minutes played</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getMatches_played <em>Matches played</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getCountry <em>Country</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getYellow_cards <em>Yellow cards</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getRed_cards <em>Red cards</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getGoals_per_match <em>Goals per match</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getAssists_per_match <em>Assists per match</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getMinutes_played_per_match <em>Minutes played per match</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getRed_cards_per_match <em>Red cards per match</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getYellow_cards_per_match <em>Yellow cards per match</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getMinutes_per_goal <em>Minutes per goal</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getMinutes_per_assists <em>Minutes per assists</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getMinutes_per_red_cards <em>Minutes per red cards</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getMinutes_per_yellow_cards <em>Minutes per yellow cards</em>}</li>
 *   <li>{@link football_db.impl.PlayerImpl#getPlayer_elo <em>Player elo</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PlayerImpl extends MinimalEObjectImpl.Container implements Player {
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
	 * The default value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected static final int AGE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAge() <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAge()
	 * @generated
	 * @ordered
	 */
	protected int age = AGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected static final String POSITION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPosition() <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPosition()
	 * @generated
	 * @ordered
	 */
	protected String position = POSITION_EDEFAULT;

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
	 * The default value of the '{@link #getAssists() <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssists()
	 * @generated
	 * @ordered
	 */
	protected static final int ASSISTS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAssists() <em>Assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssists()
	 * @generated
	 * @ordered
	 */
	protected int assists = ASSISTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinutes_played() <em>Minutes played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes_played()
	 * @generated
	 * @ordered
	 */
	protected static final int MINUTES_PLAYED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMinutes_played() <em>Minutes played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes_played()
	 * @generated
	 * @ordered
	 */
	protected int minutes_played = MINUTES_PLAYED_EDEFAULT;

	/**
	 * The default value of the '{@link #getMatches_played() <em>Matches played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches_played()
	 * @generated
	 * @ordered
	 */
	protected static final int MATCHES_PLAYED_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMatches_played() <em>Matches played</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatches_played()
	 * @generated
	 * @ordered
	 */
	protected int matches_played = MATCHES_PLAYED_EDEFAULT;

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
	 * The default value of the '{@link #getYellow_cards() <em>Yellow cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYellow_cards()
	 * @generated
	 * @ordered
	 */
	protected static final int YELLOW_CARDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getYellow_cards() <em>Yellow cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYellow_cards()
	 * @generated
	 * @ordered
	 */
	protected int yellow_cards = YELLOW_CARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getRed_cards() <em>Red cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed_cards()
	 * @generated
	 * @ordered
	 */
	protected static final int RED_CARDS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRed_cards() <em>Red cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed_cards()
	 * @generated
	 * @ordered
	 */
	protected int red_cards = RED_CARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGoals_per_match() <em>Goals per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_per_match()
	 * @generated
	 * @ordered
	 */
	protected static final double GOALS_PER_MATCH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getGoals_per_match() <em>Goals per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGoals_per_match()
	 * @generated
	 * @ordered
	 */
	protected double goals_per_match = GOALS_PER_MATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAssists_per_match() <em>Assists per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssists_per_match()
	 * @generated
	 * @ordered
	 */
	protected static final double ASSISTS_PER_MATCH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getAssists_per_match() <em>Assists per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssists_per_match()
	 * @generated
	 * @ordered
	 */
	protected double assists_per_match = ASSISTS_PER_MATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinutes_played_per_match() <em>Minutes played per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes_played_per_match()
	 * @generated
	 * @ordered
	 */
	protected static final double MINUTES_PLAYED_PER_MATCH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinutes_played_per_match() <em>Minutes played per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes_played_per_match()
	 * @generated
	 * @ordered
	 */
	protected double minutes_played_per_match = MINUTES_PLAYED_PER_MATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getRed_cards_per_match() <em>Red cards per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed_cards_per_match()
	 * @generated
	 * @ordered
	 */
	protected static final double RED_CARDS_PER_MATCH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getRed_cards_per_match() <em>Red cards per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRed_cards_per_match()
	 * @generated
	 * @ordered
	 */
	protected double red_cards_per_match = RED_CARDS_PER_MATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getYellow_cards_per_match() <em>Yellow cards per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYellow_cards_per_match()
	 * @generated
	 * @ordered
	 */
	protected static final double YELLOW_CARDS_PER_MATCH_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getYellow_cards_per_match() <em>Yellow cards per match</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYellow_cards_per_match()
	 * @generated
	 * @ordered
	 */
	protected double yellow_cards_per_match = YELLOW_CARDS_PER_MATCH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinutes_per_goal() <em>Minutes per goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes_per_goal()
	 * @generated
	 * @ordered
	 */
	protected static final double MINUTES_PER_GOAL_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinutes_per_goal() <em>Minutes per goal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes_per_goal()
	 * @generated
	 * @ordered
	 */
	protected double minutes_per_goal = MINUTES_PER_GOAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinutes_per_assists() <em>Minutes per assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes_per_assists()
	 * @generated
	 * @ordered
	 */
	protected static final double MINUTES_PER_ASSISTS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinutes_per_assists() <em>Minutes per assists</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes_per_assists()
	 * @generated
	 * @ordered
	 */
	protected double minutes_per_assists = MINUTES_PER_ASSISTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinutes_per_red_cards() <em>Minutes per red cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes_per_red_cards()
	 * @generated
	 * @ordered
	 */
	protected static final double MINUTES_PER_RED_CARDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinutes_per_red_cards() <em>Minutes per red cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes_per_red_cards()
	 * @generated
	 * @ordered
	 */
	protected double minutes_per_red_cards = MINUTES_PER_RED_CARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinutes_per_yellow_cards() <em>Minutes per yellow cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes_per_yellow_cards()
	 * @generated
	 * @ordered
	 */
	protected static final double MINUTES_PER_YELLOW_CARDS_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getMinutes_per_yellow_cards() <em>Minutes per yellow cards</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinutes_per_yellow_cards()
	 * @generated
	 * @ordered
	 */
	protected double minutes_per_yellow_cards = MINUTES_PER_YELLOW_CARDS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPlayer_elo() <em>Player elo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer_elo()
	 * @generated
	 * @ordered
	 */
	protected static final double PLAYER_ELO_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getPlayer_elo() <em>Player elo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlayer_elo()
	 * @generated
	 * @ordered
	 */
	protected double player_elo = PLAYER_ELO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PlayerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Football_dbPackage.Literals.PLAYER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team getTeam() {
		if (eContainerFeatureID() != Football_dbPackage.PLAYER__TEAM) return null;
		return (Team)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTeam(Team newTeam, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTeam, Football_dbPackage.PLAYER__TEAM, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTeam(Team newTeam) {
		if (newTeam != eInternalContainer() || (eContainerFeatureID() != Football_dbPackage.PLAYER__TEAM && newTeam != null)) {
			if (EcoreUtil.isAncestor(this, newTeam))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTeam != null)
				msgs = ((InternalEObject)newTeam).eInverseAdd(this, Football_dbPackage.TEAM__PLAYERS, Team.class, msgs);
			msgs = basicSetTeam(newTeam, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__TEAM, newTeam, newTeam));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAge() {
		return age;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAge(int newAge) {
		int oldAge = age;
		age = newAge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__AGE, oldAge, age));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(String newPosition) {
		String oldPosition = position;
		position = newPosition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__POSITION, oldPosition, position));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__GOALS_SCORED, oldGoals_scored, goals_scored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAssists() {
		return assists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssists(int newAssists) {
		int oldAssists = assists;
		assists = newAssists;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__ASSISTS, oldAssists, assists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinutes_played() {
		return minutes_played;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutes_played(int newMinutes_played) {
		int oldMinutes_played = minutes_played;
		minutes_played = newMinutes_played;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__MINUTES_PLAYED, oldMinutes_played, minutes_played));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMatches_played() {
		return matches_played;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatches_played(int newMatches_played) {
		int oldMatches_played = matches_played;
		matches_played = newMatches_played;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__MATCHES_PLAYED, oldMatches_played, matches_played));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__COUNTRY, oldCountry, country));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getYellow_cards() {
		return yellow_cards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYellow_cards(int newYellow_cards) {
		int oldYellow_cards = yellow_cards;
		yellow_cards = newYellow_cards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__YELLOW_CARDS, oldYellow_cards, yellow_cards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRed_cards() {
		return red_cards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed_cards(int newRed_cards) {
		int oldRed_cards = red_cards;
		red_cards = newRed_cards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__RED_CARDS, oldRed_cards, red_cards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getGoals_per_match() {
		return goals_per_match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGoals_per_match(double newGoals_per_match) {
		double oldGoals_per_match = goals_per_match;
		goals_per_match = newGoals_per_match;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__GOALS_PER_MATCH, oldGoals_per_match, goals_per_match));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getAssists_per_match() {
		return assists_per_match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssists_per_match(double newAssists_per_match) {
		double oldAssists_per_match = assists_per_match;
		assists_per_match = newAssists_per_match;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__ASSISTS_PER_MATCH, oldAssists_per_match, assists_per_match));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinutes_played_per_match() {
		return minutes_played_per_match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutes_played_per_match(double newMinutes_played_per_match) {
		double oldMinutes_played_per_match = minutes_played_per_match;
		minutes_played_per_match = newMinutes_played_per_match;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__MINUTES_PLAYED_PER_MATCH, oldMinutes_played_per_match, minutes_played_per_match));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getRed_cards_per_match() {
		return red_cards_per_match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRed_cards_per_match(double newRed_cards_per_match) {
		double oldRed_cards_per_match = red_cards_per_match;
		red_cards_per_match = newRed_cards_per_match;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__RED_CARDS_PER_MATCH, oldRed_cards_per_match, red_cards_per_match));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getYellow_cards_per_match() {
		return yellow_cards_per_match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYellow_cards_per_match(double newYellow_cards_per_match) {
		double oldYellow_cards_per_match = yellow_cards_per_match;
		yellow_cards_per_match = newYellow_cards_per_match;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__YELLOW_CARDS_PER_MATCH, oldYellow_cards_per_match, yellow_cards_per_match));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinutes_per_goal() {
		return minutes_per_goal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutes_per_goal(double newMinutes_per_goal) {
		double oldMinutes_per_goal = minutes_per_goal;
		minutes_per_goal = newMinutes_per_goal;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__MINUTES_PER_GOAL, oldMinutes_per_goal, minutes_per_goal));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinutes_per_assists() {
		return minutes_per_assists;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutes_per_assists(double newMinutes_per_assists) {
		double oldMinutes_per_assists = minutes_per_assists;
		minutes_per_assists = newMinutes_per_assists;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__MINUTES_PER_ASSISTS, oldMinutes_per_assists, minutes_per_assists));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinutes_per_red_cards() {
		return minutes_per_red_cards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutes_per_red_cards(double newMinutes_per_red_cards) {
		double oldMinutes_per_red_cards = minutes_per_red_cards;
		minutes_per_red_cards = newMinutes_per_red_cards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__MINUTES_PER_RED_CARDS, oldMinutes_per_red_cards, minutes_per_red_cards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getMinutes_per_yellow_cards() {
		return minutes_per_yellow_cards;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinutes_per_yellow_cards(double newMinutes_per_yellow_cards) {
		double oldMinutes_per_yellow_cards = minutes_per_yellow_cards;
		minutes_per_yellow_cards = newMinutes_per_yellow_cards;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__MINUTES_PER_YELLOW_CARDS, oldMinutes_per_yellow_cards, minutes_per_yellow_cards));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getPlayer_elo() {
		return player_elo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPlayer_elo(double newPlayer_elo) {
		double oldPlayer_elo = player_elo;
		player_elo = newPlayer_elo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Football_dbPackage.PLAYER__PLAYER_ELO, oldPlayer_elo, player_elo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Football_dbPackage.PLAYER__TEAM:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTeam((Team)otherEnd, msgs);
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
			case Football_dbPackage.PLAYER__TEAM:
				return basicSetTeam(null, msgs);
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
			case Football_dbPackage.PLAYER__TEAM:
				return eInternalContainer().eInverseRemove(this, Football_dbPackage.TEAM__PLAYERS, Team.class, msgs);
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
			case Football_dbPackage.PLAYER__TEAM:
				return getTeam();
			case Football_dbPackage.PLAYER__NAME:
				return getName();
			case Football_dbPackage.PLAYER__AGE:
				return getAge();
			case Football_dbPackage.PLAYER__POSITION:
				return getPosition();
			case Football_dbPackage.PLAYER__GOALS_SCORED:
				return getGoals_scored();
			case Football_dbPackage.PLAYER__ASSISTS:
				return getAssists();
			case Football_dbPackage.PLAYER__MINUTES_PLAYED:
				return getMinutes_played();
			case Football_dbPackage.PLAYER__MATCHES_PLAYED:
				return getMatches_played();
			case Football_dbPackage.PLAYER__COUNTRY:
				return getCountry();
			case Football_dbPackage.PLAYER__YELLOW_CARDS:
				return getYellow_cards();
			case Football_dbPackage.PLAYER__RED_CARDS:
				return getRed_cards();
			case Football_dbPackage.PLAYER__GOALS_PER_MATCH:
				return getGoals_per_match();
			case Football_dbPackage.PLAYER__ASSISTS_PER_MATCH:
				return getAssists_per_match();
			case Football_dbPackage.PLAYER__MINUTES_PLAYED_PER_MATCH:
				return getMinutes_played_per_match();
			case Football_dbPackage.PLAYER__RED_CARDS_PER_MATCH:
				return getRed_cards_per_match();
			case Football_dbPackage.PLAYER__YELLOW_CARDS_PER_MATCH:
				return getYellow_cards_per_match();
			case Football_dbPackage.PLAYER__MINUTES_PER_GOAL:
				return getMinutes_per_goal();
			case Football_dbPackage.PLAYER__MINUTES_PER_ASSISTS:
				return getMinutes_per_assists();
			case Football_dbPackage.PLAYER__MINUTES_PER_RED_CARDS:
				return getMinutes_per_red_cards();
			case Football_dbPackage.PLAYER__MINUTES_PER_YELLOW_CARDS:
				return getMinutes_per_yellow_cards();
			case Football_dbPackage.PLAYER__PLAYER_ELO:
				return getPlayer_elo();
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
			case Football_dbPackage.PLAYER__TEAM:
				setTeam((Team)newValue);
				return;
			case Football_dbPackage.PLAYER__NAME:
				setName((String)newValue);
				return;
			case Football_dbPackage.PLAYER__AGE:
				setAge((Integer)newValue);
				return;
			case Football_dbPackage.PLAYER__POSITION:
				setPosition((String)newValue);
				return;
			case Football_dbPackage.PLAYER__GOALS_SCORED:
				setGoals_scored((Integer)newValue);
				return;
			case Football_dbPackage.PLAYER__ASSISTS:
				setAssists((Integer)newValue);
				return;
			case Football_dbPackage.PLAYER__MINUTES_PLAYED:
				setMinutes_played((Integer)newValue);
				return;
			case Football_dbPackage.PLAYER__MATCHES_PLAYED:
				setMatches_played((Integer)newValue);
				return;
			case Football_dbPackage.PLAYER__COUNTRY:
				setCountry((String)newValue);
				return;
			case Football_dbPackage.PLAYER__YELLOW_CARDS:
				setYellow_cards((Integer)newValue);
				return;
			case Football_dbPackage.PLAYER__RED_CARDS:
				setRed_cards((Integer)newValue);
				return;
			case Football_dbPackage.PLAYER__GOALS_PER_MATCH:
				setGoals_per_match((Double)newValue);
				return;
			case Football_dbPackage.PLAYER__ASSISTS_PER_MATCH:
				setAssists_per_match((Double)newValue);
				return;
			case Football_dbPackage.PLAYER__MINUTES_PLAYED_PER_MATCH:
				setMinutes_played_per_match((Double)newValue);
				return;
			case Football_dbPackage.PLAYER__RED_CARDS_PER_MATCH:
				setRed_cards_per_match((Double)newValue);
				return;
			case Football_dbPackage.PLAYER__YELLOW_CARDS_PER_MATCH:
				setYellow_cards_per_match((Double)newValue);
				return;
			case Football_dbPackage.PLAYER__MINUTES_PER_GOAL:
				setMinutes_per_goal((Double)newValue);
				return;
			case Football_dbPackage.PLAYER__MINUTES_PER_ASSISTS:
				setMinutes_per_assists((Double)newValue);
				return;
			case Football_dbPackage.PLAYER__MINUTES_PER_RED_CARDS:
				setMinutes_per_red_cards((Double)newValue);
				return;
			case Football_dbPackage.PLAYER__MINUTES_PER_YELLOW_CARDS:
				setMinutes_per_yellow_cards((Double)newValue);
				return;
			case Football_dbPackage.PLAYER__PLAYER_ELO:
				setPlayer_elo((Double)newValue);
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
			case Football_dbPackage.PLAYER__TEAM:
				setTeam((Team)null);
				return;
			case Football_dbPackage.PLAYER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__AGE:
				setAge(AGE_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__POSITION:
				setPosition(POSITION_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__GOALS_SCORED:
				setGoals_scored(GOALS_SCORED_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__ASSISTS:
				setAssists(ASSISTS_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__MINUTES_PLAYED:
				setMinutes_played(MINUTES_PLAYED_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__MATCHES_PLAYED:
				setMatches_played(MATCHES_PLAYED_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__COUNTRY:
				setCountry(COUNTRY_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__YELLOW_CARDS:
				setYellow_cards(YELLOW_CARDS_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__RED_CARDS:
				setRed_cards(RED_CARDS_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__GOALS_PER_MATCH:
				setGoals_per_match(GOALS_PER_MATCH_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__ASSISTS_PER_MATCH:
				setAssists_per_match(ASSISTS_PER_MATCH_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__MINUTES_PLAYED_PER_MATCH:
				setMinutes_played_per_match(MINUTES_PLAYED_PER_MATCH_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__RED_CARDS_PER_MATCH:
				setRed_cards_per_match(RED_CARDS_PER_MATCH_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__YELLOW_CARDS_PER_MATCH:
				setYellow_cards_per_match(YELLOW_CARDS_PER_MATCH_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__MINUTES_PER_GOAL:
				setMinutes_per_goal(MINUTES_PER_GOAL_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__MINUTES_PER_ASSISTS:
				setMinutes_per_assists(MINUTES_PER_ASSISTS_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__MINUTES_PER_RED_CARDS:
				setMinutes_per_red_cards(MINUTES_PER_RED_CARDS_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__MINUTES_PER_YELLOW_CARDS:
				setMinutes_per_yellow_cards(MINUTES_PER_YELLOW_CARDS_EDEFAULT);
				return;
			case Football_dbPackage.PLAYER__PLAYER_ELO:
				setPlayer_elo(PLAYER_ELO_EDEFAULT);
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
			case Football_dbPackage.PLAYER__TEAM:
				return getTeam() != null;
			case Football_dbPackage.PLAYER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Football_dbPackage.PLAYER__AGE:
				return age != AGE_EDEFAULT;
			case Football_dbPackage.PLAYER__POSITION:
				return POSITION_EDEFAULT == null ? position != null : !POSITION_EDEFAULT.equals(position);
			case Football_dbPackage.PLAYER__GOALS_SCORED:
				return goals_scored != GOALS_SCORED_EDEFAULT;
			case Football_dbPackage.PLAYER__ASSISTS:
				return assists != ASSISTS_EDEFAULT;
			case Football_dbPackage.PLAYER__MINUTES_PLAYED:
				return minutes_played != MINUTES_PLAYED_EDEFAULT;
			case Football_dbPackage.PLAYER__MATCHES_PLAYED:
				return matches_played != MATCHES_PLAYED_EDEFAULT;
			case Football_dbPackage.PLAYER__COUNTRY:
				return COUNTRY_EDEFAULT == null ? country != null : !COUNTRY_EDEFAULT.equals(country);
			case Football_dbPackage.PLAYER__YELLOW_CARDS:
				return yellow_cards != YELLOW_CARDS_EDEFAULT;
			case Football_dbPackage.PLAYER__RED_CARDS:
				return red_cards != RED_CARDS_EDEFAULT;
			case Football_dbPackage.PLAYER__GOALS_PER_MATCH:
				return goals_per_match != GOALS_PER_MATCH_EDEFAULT;
			case Football_dbPackage.PLAYER__ASSISTS_PER_MATCH:
				return assists_per_match != ASSISTS_PER_MATCH_EDEFAULT;
			case Football_dbPackage.PLAYER__MINUTES_PLAYED_PER_MATCH:
				return minutes_played_per_match != MINUTES_PLAYED_PER_MATCH_EDEFAULT;
			case Football_dbPackage.PLAYER__RED_CARDS_PER_MATCH:
				return red_cards_per_match != RED_CARDS_PER_MATCH_EDEFAULT;
			case Football_dbPackage.PLAYER__YELLOW_CARDS_PER_MATCH:
				return yellow_cards_per_match != YELLOW_CARDS_PER_MATCH_EDEFAULT;
			case Football_dbPackage.PLAYER__MINUTES_PER_GOAL:
				return minutes_per_goal != MINUTES_PER_GOAL_EDEFAULT;
			case Football_dbPackage.PLAYER__MINUTES_PER_ASSISTS:
				return minutes_per_assists != MINUTES_PER_ASSISTS_EDEFAULT;
			case Football_dbPackage.PLAYER__MINUTES_PER_RED_CARDS:
				return minutes_per_red_cards != MINUTES_PER_RED_CARDS_EDEFAULT;
			case Football_dbPackage.PLAYER__MINUTES_PER_YELLOW_CARDS:
				return minutes_per_yellow_cards != MINUTES_PER_YELLOW_CARDS_EDEFAULT;
			case Football_dbPackage.PLAYER__PLAYER_ELO:
				return player_elo != PLAYER_ELO_EDEFAULT;
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
		result.append(", age: ");
		result.append(age);
		result.append(", position: ");
		result.append(position);
		result.append(", goals_scored: ");
		result.append(goals_scored);
		result.append(", assists: ");
		result.append(assists);
		result.append(", minutes_played: ");
		result.append(minutes_played);
		result.append(", matches_played: ");
		result.append(matches_played);
		result.append(", country: ");
		result.append(country);
		result.append(", yellow_cards: ");
		result.append(yellow_cards);
		result.append(", red_cards: ");
		result.append(red_cards);
		result.append(", goals_per_match: ");
		result.append(goals_per_match);
		result.append(", assists_per_match: ");
		result.append(assists_per_match);
		result.append(", minutes_played_per_match: ");
		result.append(minutes_played_per_match);
		result.append(", red_cards_per_match: ");
		result.append(red_cards_per_match);
		result.append(", yellow_cards_per_match: ");
		result.append(yellow_cards_per_match);
		result.append(", minutes_per_goal: ");
		result.append(minutes_per_goal);
		result.append(", minutes_per_assists: ");
		result.append(minutes_per_assists);
		result.append(", minutes_per_red_cards: ");
		result.append(minutes_per_red_cards);
		result.append(", minutes_per_yellow_cards: ");
		result.append(minutes_per_yellow_cards);
		result.append(", player_elo: ");
		result.append(player_elo);
		result.append(')');
		return result.toString();
	}

} //PlayerImpl
