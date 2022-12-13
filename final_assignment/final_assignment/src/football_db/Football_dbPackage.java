/**
 */
package football_db;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see football_db.Football_dbFactory
 * @model kind="package"
 * @generated
 */
public interface Football_dbPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "football_db";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/football_db";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "football_db";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Football_dbPackage eINSTANCE = football_db.impl.Football_dbPackageImpl.init();

	/**
	 * The meta object id for the '{@link football_db.impl.LeagueImpl <em>League</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see football_db.impl.LeagueImpl
	 * @see football_db.impl.Football_dbPackageImpl#getLeague()
	 * @generated
	 */
	int LEAGUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Teams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__TEAMS = 1;

	/**
	 * The feature id for the '<em><b>Seasons</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__SEASONS = 2;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__COUNTRY = 3;

	/**
	 * The feature id for the '<em><b>Teams number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE__TEAMS_NUMBER = 4;

	/**
	 * The number of structural features of the '<em>League</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>League</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAGUE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link football_db.impl.SeasonImpl <em>Season</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see football_db.impl.SeasonImpl
	 * @see football_db.impl.Football_dbPackageImpl#getSeason()
	 * @generated
	 */
	int SEASON = 1;

	/**
	 * The feature id for the '<em><b>Start year season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__START_YEAR_SEASON = 0;

	/**
	 * The feature id for the '<em><b>End year season</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__END_YEAR_SEASON = 1;

	/**
	 * The feature id for the '<em><b>League</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__LEAGUE = 2;

	/**
	 * The feature id for the '<em><b>Game weeks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__GAME_WEEKS = 3;

	/**
	 * The feature id for the '<em><b>Weeks number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON__WEEKS_NUMBER = 4;

	/**
	 * The number of structural features of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Season</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEASON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link football_db.impl.TeamImpl <em>Team</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see football_db.impl.TeamImpl
	 * @see football_db.impl.Football_dbPackageImpl#getTeam()
	 * @generated
	 */
	int TEAM = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NAME = 0;

	/**
	 * The feature id for the '<em><b>League</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__LEAGUE = 1;

	/**
	 * The feature id for the '<em><b>Players</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__PLAYERS = 2;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__MATCHES = 3;

	/**
	 * The feature id for the '<em><b>Number matches</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__NUMBER_MATCHES = 4;

	/**
	 * The feature id for the '<em><b>Wins</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__WINS = 5;

	/**
	 * The feature id for the '<em><b>Draws</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__DRAWS = 6;

	/**
	 * The feature id for the '<em><b>Losses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__LOSSES = 7;

	/**
	 * The feature id for the '<em><b>Points</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__POINTS = 8;

	/**
	 * The feature id for the '<em><b>Goals scored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__GOALS_SCORED = 9;

	/**
	 * The feature id for the '<em><b>Goals conceded</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__GOALS_CONCEDED = 10;

	/**
	 * The feature id for the '<em><b>Clean sheets</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CLEAN_SHEETS = 11;

	/**
	 * The feature id for the '<em><b>Average possesion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__AVERAGE_POSSESION = 12;

	/**
	 * The feature id for the '<em><b>Shots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__SHOTS = 13;

	/**
	 * The feature id for the '<em><b>Shots on target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__SHOTS_ON_TARGET = 14;

	/**
	 * The feature id for the '<em><b>Points per game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__POINTS_PER_GAME = 15;

	/**
	 * The feature id for the '<em><b>Goals difference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__GOALS_DIFFERENCE = 16;

	/**
	 * The feature id for the '<em><b>Shoot accuracy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__SHOOT_ACCURACY = 17;

	/**
	 * The feature id for the '<em><b>Shoots per game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__SHOOTS_PER_GAME = 18;

	/**
	 * The feature id for the '<em><b>Shoots on target per game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__SHOOTS_ON_TARGET_PER_GAME = 19;

	/**
	 * The feature id for the '<em><b>Scored goals per game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__SCORED_GOALS_PER_GAME = 20;

	/**
	 * The feature id for the '<em><b>Conceded goals per game</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__CONCEDED_GOALS_PER_GAME = 21;

	/**
	 * The feature id for the '<em><b>Goals per shoots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__GOALS_PER_SHOOTS = 22;

	/**
	 * The feature id for the '<em><b>Goals per shoots on target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__GOALS_PER_SHOOTS_ON_TARGET = 23;

	/**
	 * The feature id for the '<em><b>Elo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM__ELO = 24;

	/**
	 * The number of structural features of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_FEATURE_COUNT = 25;

	/**
	 * The number of operations of the '<em>Team</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link football_db.impl.PlayerImpl <em>Player</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see football_db.impl.PlayerImpl
	 * @see football_db.impl.Football_dbPackageImpl#getPlayer()
	 * @generated
	 */
	int PLAYER = 3;

	/**
	 * The feature id for the '<em><b>Team</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__TEAM = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__AGE = 2;

	/**
	 * The feature id for the '<em><b>Position</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__POSITION = 3;

	/**
	 * The feature id for the '<em><b>Goals scored</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__GOALS_SCORED = 4;

	/**
	 * The feature id for the '<em><b>Assists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ASSISTS = 5;

	/**
	 * The feature id for the '<em><b>Minutes played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__MINUTES_PLAYED = 6;

	/**
	 * The feature id for the '<em><b>Matches played</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__MATCHES_PLAYED = 7;

	/**
	 * The feature id for the '<em><b>Country</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__COUNTRY = 8;

	/**
	 * The feature id for the '<em><b>Yellow cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__YELLOW_CARDS = 9;

	/**
	 * The feature id for the '<em><b>Red cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__RED_CARDS = 10;

	/**
	 * The feature id for the '<em><b>Goals per match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__GOALS_PER_MATCH = 11;

	/**
	 * The feature id for the '<em><b>Assists per match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__ASSISTS_PER_MATCH = 12;

	/**
	 * The feature id for the '<em><b>Minutes played per match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__MINUTES_PLAYED_PER_MATCH = 13;

	/**
	 * The feature id for the '<em><b>Red cards per match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__RED_CARDS_PER_MATCH = 14;

	/**
	 * The feature id for the '<em><b>Yellow cards per match</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__YELLOW_CARDS_PER_MATCH = 15;

	/**
	 * The feature id for the '<em><b>Minutes per goal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__MINUTES_PER_GOAL = 16;

	/**
	 * The feature id for the '<em><b>Minutes per assists</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__MINUTES_PER_ASSISTS = 17;

	/**
	 * The feature id for the '<em><b>Minutes per red cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__MINUTES_PER_RED_CARDS = 18;

	/**
	 * The feature id for the '<em><b>Minutes per yellow cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__MINUTES_PER_YELLOW_CARDS = 19;

	/**
	 * The feature id for the '<em><b>Player elo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER__PLAYER_ELO = 20;

	/**
	 * The number of structural features of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_FEATURE_COUNT = 21;

	/**
	 * The number of operations of the '<em>Player</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAYER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link football_db.impl.MatchImpl <em>Match</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see football_db.impl.MatchImpl
	 * @see football_db.impl.Football_dbPackageImpl#getMatch()
	 * @generated
	 */
	int MATCH = 4;

	/**
	 * The feature id for the '<em><b>Match number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__MATCH_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Home team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME_TEAM = 1;

	/**
	 * The feature id for the '<em><b>Away team</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY_TEAM = 2;

	/**
	 * The feature id for the '<em><b>Game week</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__GAME_WEEK = 3;

	/**
	 * The feature id for the '<em><b>Goals home team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__GOALS_HOME_TEAM = 4;

	/**
	 * The feature id for the '<em><b>Goals away team</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__GOALS_AWAY_TEAM = 5;

	/**
	 * The feature id for the '<em><b>Home possesion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME_POSSESION = 6;

	/**
	 * The feature id for the '<em><b>Away possesion</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY_POSSESION = 7;

	/**
	 * The feature id for the '<em><b>Home corners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME_CORNERS = 8;

	/**
	 * The feature id for the '<em><b>Away corners</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY_CORNERS = 9;

	/**
	 * The feature id for the '<em><b>Home shots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME_SHOTS = 10;

	/**
	 * The feature id for the '<em><b>Away shots</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY_SHOTS = 11;

	/**
	 * The feature id for the '<em><b>Home shots on target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME_SHOTS_ON_TARGET = 12;

	/**
	 * The feature id for the '<em><b>Away shots on target</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY_SHOTS_ON_TARGET = 13;

	/**
	 * The feature id for the '<em><b>Home faults</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME_FAULTS = 14;

	/**
	 * The feature id for the '<em><b>Away faults</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY_FAULTS = 15;

	/**
	 * The feature id for the '<em><b>Home yellow cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME_YELLOW_CARDS = 16;

	/**
	 * The feature id for the '<em><b>Away yellow cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY_YELLOW_CARDS = 17;

	/**
	 * The feature id for the '<em><b>Home red cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__HOME_RED_CARDS = 18;

	/**
	 * The feature id for the '<em><b>Away red cards</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__AWAY_RED_CARDS = 19;

	/**
	 * The feature id for the '<em><b>Winner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__WINNER = 20;

	/**
	 * The feature id for the '<em><b>Loser</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__LOSER = 21;

	/**
	 * The feature id for the '<em><b>Win home team probabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__WIN_HOME_TEAM_PROBABILITIES = 22;

	/**
	 * The feature id for the '<em><b>Win away team probabilities</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH__WIN_AWAY_TEAM_PROBABILITIES = 23;

	/**
	 * The number of structural features of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_FEATURE_COUNT = 24;

	/**
	 * The number of operations of the '<em>Match</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MATCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link football_db.impl.Game_WeekImpl <em>Game Week</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see football_db.impl.Game_WeekImpl
	 * @see football_db.impl.Football_dbPackageImpl#getGame_Week()
	 * @generated
	 */
	int GAME_WEEK = 5;

	/**
	 * The feature id for the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_WEEK__NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Matches</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_WEEK__MATCHES = 1;

	/**
	 * The feature id for the '<em><b>Season</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_WEEK__SEASON = 2;

	/**
	 * The feature id for the '<em><b>Matches number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_WEEK__MATCHES_NUMBER = 3;

	/**
	 * The number of structural features of the '<em>Game Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_WEEK_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Game Week</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GAME_WEEK_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link football_db.League <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>League</em>'.
	 * @see football_db.League
	 * @generated
	 */
	EClass getLeague();

	/**
	 * Returns the meta object for the attribute '{@link football_db.League#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see football_db.League#getName()
	 * @see #getLeague()
	 * @generated
	 */
	EAttribute getLeague_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link football_db.League#getTeams <em>Teams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Teams</em>'.
	 * @see football_db.League#getTeams()
	 * @see #getLeague()
	 * @generated
	 */
	EReference getLeague_Teams();

	/**
	 * Returns the meta object for the containment reference list '{@link football_db.League#getSeasons <em>Seasons</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seasons</em>'.
	 * @see football_db.League#getSeasons()
	 * @see #getLeague()
	 * @generated
	 */
	EReference getLeague_Seasons();

	/**
	 * Returns the meta object for the attribute '{@link football_db.League#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see football_db.League#getCountry()
	 * @see #getLeague()
	 * @generated
	 */
	EAttribute getLeague_Country();

	/**
	 * Returns the meta object for the attribute '{@link football_db.League#getTeams_number <em>Teams number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Teams number</em>'.
	 * @see football_db.League#getTeams_number()
	 * @see #getLeague()
	 * @generated
	 */
	EAttribute getLeague_Teams_number();

	/**
	 * Returns the meta object for class '{@link football_db.Season <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Season</em>'.
	 * @see football_db.Season
	 * @generated
	 */
	EClass getSeason();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Season#getStart_year_season <em>Start year season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start year season</em>'.
	 * @see football_db.Season#getStart_year_season()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_Start_year_season();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Season#getEnd_year_season <em>End year season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End year season</em>'.
	 * @see football_db.Season#getEnd_year_season()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_End_year_season();

	/**
	 * Returns the meta object for the container reference '{@link football_db.Season#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>League</em>'.
	 * @see football_db.Season#getLeague()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_League();

	/**
	 * Returns the meta object for the containment reference list '{@link football_db.Season#getGame_weeks <em>Game weeks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Game weeks</em>'.
	 * @see football_db.Season#getGame_weeks()
	 * @see #getSeason()
	 * @generated
	 */
	EReference getSeason_Game_weeks();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Season#getWeeks_number <em>Weeks number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weeks number</em>'.
	 * @see football_db.Season#getWeeks_number()
	 * @see #getSeason()
	 * @generated
	 */
	EAttribute getSeason_Weeks_number();

	/**
	 * Returns the meta object for class '{@link football_db.Team <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Team</em>'.
	 * @see football_db.Team
	 * @generated
	 */
	EClass getTeam();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see football_db.Team#getName()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Name();

	/**
	 * Returns the meta object for the container reference '{@link football_db.Team#getLeague <em>League</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>League</em>'.
	 * @see football_db.Team#getLeague()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_League();

	/**
	 * Returns the meta object for the containment reference list '{@link football_db.Team#getPlayers <em>Players</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Players</em>'.
	 * @see football_db.Team#getPlayers()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Players();

	/**
	 * Returns the meta object for the reference list '{@link football_db.Team#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Matches</em>'.
	 * @see football_db.Team#getMatches()
	 * @see #getTeam()
	 * @generated
	 */
	EReference getTeam_Matches();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getNumber_matches <em>Number matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number matches</em>'.
	 * @see football_db.Team#getNumber_matches()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Number_matches();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getWins <em>Wins</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Wins</em>'.
	 * @see football_db.Team#getWins()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Wins();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getDraws <em>Draws</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Draws</em>'.
	 * @see football_db.Team#getDraws()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Draws();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getLosses <em>Losses</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Losses</em>'.
	 * @see football_db.Team#getLosses()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Losses();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getPoints <em>Points</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points</em>'.
	 * @see football_db.Team#getPoints()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Points();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getGoals_scored <em>Goals scored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals scored</em>'.
	 * @see football_db.Team#getGoals_scored()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Goals_scored();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getGoals_conceded <em>Goals conceded</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals conceded</em>'.
	 * @see football_db.Team#getGoals_conceded()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Goals_conceded();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getClean_sheets <em>Clean sheets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Clean sheets</em>'.
	 * @see football_db.Team#getClean_sheets()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Clean_sheets();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getAverage_possesion <em>Average possesion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Average possesion</em>'.
	 * @see football_db.Team#getAverage_possesion()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Average_possesion();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getShots <em>Shots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shots</em>'.
	 * @see football_db.Team#getShots()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Shots();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getShots_on_target <em>Shots on target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shots on target</em>'.
	 * @see football_db.Team#getShots_on_target()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Shots_on_target();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getPoints_per_game <em>Points per game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Points per game</em>'.
	 * @see football_db.Team#getPoints_per_game()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Points_per_game();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getGoals_difference <em>Goals difference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals difference</em>'.
	 * @see football_db.Team#getGoals_difference()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Goals_difference();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getShoot_accuracy <em>Shoot accuracy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shoot accuracy</em>'.
	 * @see football_db.Team#getShoot_accuracy()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Shoot_accuracy();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getShoots_per_game <em>Shoots per game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shoots per game</em>'.
	 * @see football_db.Team#getShoots_per_game()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Shoots_per_game();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getShoots_on_target_per_game <em>Shoots on target per game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Shoots on target per game</em>'.
	 * @see football_db.Team#getShoots_on_target_per_game()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Shoots_on_target_per_game();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getScored_goals_per_game <em>Scored goals per game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scored goals per game</em>'.
	 * @see football_db.Team#getScored_goals_per_game()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Scored_goals_per_game();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getConceded_goals_per_game <em>Conceded goals per game</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conceded goals per game</em>'.
	 * @see football_db.Team#getConceded_goals_per_game()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Conceded_goals_per_game();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getGoals_per_shoots <em>Goals per shoots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals per shoots</em>'.
	 * @see football_db.Team#getGoals_per_shoots()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Goals_per_shoots();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getGoals_per_shoots_on_target <em>Goals per shoots on target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals per shoots on target</em>'.
	 * @see football_db.Team#getGoals_per_shoots_on_target()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Goals_per_shoots_on_target();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Team#getElo <em>Elo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Elo</em>'.
	 * @see football_db.Team#getElo()
	 * @see #getTeam()
	 * @generated
	 */
	EAttribute getTeam_Elo();

	/**
	 * Returns the meta object for class '{@link football_db.Player <em>Player</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Player</em>'.
	 * @see football_db.Player
	 * @generated
	 */
	EClass getPlayer();

	/**
	 * Returns the meta object for the container reference '{@link football_db.Player#getTeam <em>Team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Team</em>'.
	 * @see football_db.Player#getTeam()
	 * @see #getPlayer()
	 * @generated
	 */
	EReference getPlayer_Team();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see football_db.Player#getName()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Name();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getAge <em>Age</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Age</em>'.
	 * @see football_db.Player#getAge()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Age();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getPosition <em>Position</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Position</em>'.
	 * @see football_db.Player#getPosition()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Position();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getGoals_scored <em>Goals scored</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals scored</em>'.
	 * @see football_db.Player#getGoals_scored()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Goals_scored();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getAssists <em>Assists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assists</em>'.
	 * @see football_db.Player#getAssists()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Assists();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getMinutes_played <em>Minutes played</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes played</em>'.
	 * @see football_db.Player#getMinutes_played()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Minutes_played();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getMatches_played <em>Matches played</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matches played</em>'.
	 * @see football_db.Player#getMatches_played()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Matches_played();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getCountry <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Country</em>'.
	 * @see football_db.Player#getCountry()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Country();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getYellow_cards <em>Yellow cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yellow cards</em>'.
	 * @see football_db.Player#getYellow_cards()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Yellow_cards();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getRed_cards <em>Red cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red cards</em>'.
	 * @see football_db.Player#getRed_cards()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Red_cards();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getGoals_per_match <em>Goals per match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals per match</em>'.
	 * @see football_db.Player#getGoals_per_match()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Goals_per_match();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getAssists_per_match <em>Assists per match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Assists per match</em>'.
	 * @see football_db.Player#getAssists_per_match()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Assists_per_match();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getMinutes_played_per_match <em>Minutes played per match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes played per match</em>'.
	 * @see football_db.Player#getMinutes_played_per_match()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Minutes_played_per_match();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getRed_cards_per_match <em>Red cards per match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Red cards per match</em>'.
	 * @see football_db.Player#getRed_cards_per_match()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Red_cards_per_match();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getYellow_cards_per_match <em>Yellow cards per match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yellow cards per match</em>'.
	 * @see football_db.Player#getYellow_cards_per_match()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Yellow_cards_per_match();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getMinutes_per_goal <em>Minutes per goal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes per goal</em>'.
	 * @see football_db.Player#getMinutes_per_goal()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Minutes_per_goal();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getMinutes_per_assists <em>Minutes per assists</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes per assists</em>'.
	 * @see football_db.Player#getMinutes_per_assists()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Minutes_per_assists();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getMinutes_per_red_cards <em>Minutes per red cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes per red cards</em>'.
	 * @see football_db.Player#getMinutes_per_red_cards()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Minutes_per_red_cards();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getMinutes_per_yellow_cards <em>Minutes per yellow cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Minutes per yellow cards</em>'.
	 * @see football_db.Player#getMinutes_per_yellow_cards()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Minutes_per_yellow_cards();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Player#getPlayer_elo <em>Player elo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Player elo</em>'.
	 * @see football_db.Player#getPlayer_elo()
	 * @see #getPlayer()
	 * @generated
	 */
	EAttribute getPlayer_Player_elo();

	/**
	 * Returns the meta object for class '{@link football_db.Match <em>Match</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Match</em>'.
	 * @see football_db.Match
	 * @generated
	 */
	EClass getMatch();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getMatch_number <em>Match number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Match number</em>'.
	 * @see football_db.Match#getMatch_number()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Match_number();

	/**
	 * Returns the meta object for the reference '{@link football_db.Match#getHome_team <em>Home team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Home team</em>'.
	 * @see football_db.Match#getHome_team()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Home_team();

	/**
	 * Returns the meta object for the reference '{@link football_db.Match#getAway_team <em>Away team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Away team</em>'.
	 * @see football_db.Match#getAway_team()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Away_team();

	/**
	 * Returns the meta object for the container reference '{@link football_db.Match#getGame_week <em>Game week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Game week</em>'.
	 * @see football_db.Match#getGame_week()
	 * @see #getMatch()
	 * @generated
	 */
	EReference getMatch_Game_week();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getGoals_home_team <em>Goals home team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals home team</em>'.
	 * @see football_db.Match#getGoals_home_team()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Goals_home_team();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getGoals_away_team <em>Goals away team</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Goals away team</em>'.
	 * @see football_db.Match#getGoals_away_team()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Goals_away_team();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getHome_possesion <em>Home possesion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home possesion</em>'.
	 * @see football_db.Match#getHome_possesion()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Home_possesion();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getAway_possesion <em>Away possesion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away possesion</em>'.
	 * @see football_db.Match#getAway_possesion()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Away_possesion();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getHome_corners <em>Home corners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home corners</em>'.
	 * @see football_db.Match#getHome_corners()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Home_corners();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getAway_corners <em>Away corners</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away corners</em>'.
	 * @see football_db.Match#getAway_corners()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Away_corners();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getHome_shots <em>Home shots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home shots</em>'.
	 * @see football_db.Match#getHome_shots()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Home_shots();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getAway_shots <em>Away shots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away shots</em>'.
	 * @see football_db.Match#getAway_shots()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Away_shots();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getHome_shots_on_target <em>Home shots on target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home shots on target</em>'.
	 * @see football_db.Match#getHome_shots_on_target()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Home_shots_on_target();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getAway_shots_on_target <em>Away shots on target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away shots on target</em>'.
	 * @see football_db.Match#getAway_shots_on_target()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Away_shots_on_target();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getHome_faults <em>Home faults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home faults</em>'.
	 * @see football_db.Match#getHome_faults()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Home_faults();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getAway_faults <em>Away faults</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away faults</em>'.
	 * @see football_db.Match#getAway_faults()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Away_faults();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getHome_yellow_cards <em>Home yellow cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home yellow cards</em>'.
	 * @see football_db.Match#getHome_yellow_cards()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Home_yellow_cards();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getAway_yellow_cards <em>Away yellow cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away yellow cards</em>'.
	 * @see football_db.Match#getAway_yellow_cards()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Away_yellow_cards();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getHome_red_cards <em>Home red cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Home red cards</em>'.
	 * @see football_db.Match#getHome_red_cards()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Home_red_cards();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getAway_red_cards <em>Away red cards</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Away red cards</em>'.
	 * @see football_db.Match#getAway_red_cards()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Away_red_cards();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getWinner <em>Winner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Winner</em>'.
	 * @see football_db.Match#getWinner()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Winner();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getLoser <em>Loser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Loser</em>'.
	 * @see football_db.Match#getLoser()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Loser();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getWin_home_team_probabilities <em>Win home team probabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win home team probabilities</em>'.
	 * @see football_db.Match#getWin_home_team_probabilities()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Win_home_team_probabilities();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Match#getWin_away_team_probabilities <em>Win away team probabilities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Win away team probabilities</em>'.
	 * @see football_db.Match#getWin_away_team_probabilities()
	 * @see #getMatch()
	 * @generated
	 */
	EAttribute getMatch_Win_away_team_probabilities();

	/**
	 * Returns the meta object for class '{@link football_db.Game_Week <em>Game Week</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Game Week</em>'.
	 * @see football_db.Game_Week
	 * @generated
	 */
	EClass getGame_Week();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Game_Week#getNumber <em>Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number</em>'.
	 * @see football_db.Game_Week#getNumber()
	 * @see #getGame_Week()
	 * @generated
	 */
	EAttribute getGame_Week_Number();

	/**
	 * Returns the meta object for the containment reference list '{@link football_db.Game_Week#getMatches <em>Matches</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Matches</em>'.
	 * @see football_db.Game_Week#getMatches()
	 * @see #getGame_Week()
	 * @generated
	 */
	EReference getGame_Week_Matches();

	/**
	 * Returns the meta object for the container reference '{@link football_db.Game_Week#getSeason <em>Season</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Season</em>'.
	 * @see football_db.Game_Week#getSeason()
	 * @see #getGame_Week()
	 * @generated
	 */
	EReference getGame_Week_Season();

	/**
	 * Returns the meta object for the attribute '{@link football_db.Game_Week#getMatches_number <em>Matches number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matches number</em>'.
	 * @see football_db.Game_Week#getMatches_number()
	 * @see #getGame_Week()
	 * @generated
	 */
	EAttribute getGame_Week_Matches_number();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Football_dbFactory getFootball_dbFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link football_db.impl.LeagueImpl <em>League</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see football_db.impl.LeagueImpl
		 * @see football_db.impl.Football_dbPackageImpl#getLeague()
		 * @generated
		 */
		EClass LEAGUE = eINSTANCE.getLeague();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAGUE__NAME = eINSTANCE.getLeague_Name();

		/**
		 * The meta object literal for the '<em><b>Teams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAGUE__TEAMS = eINSTANCE.getLeague_Teams();

		/**
		 * The meta object literal for the '<em><b>Seasons</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEAGUE__SEASONS = eINSTANCE.getLeague_Seasons();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAGUE__COUNTRY = eINSTANCE.getLeague_Country();

		/**
		 * The meta object literal for the '<em><b>Teams number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEAGUE__TEAMS_NUMBER = eINSTANCE.getLeague_Teams_number();

		/**
		 * The meta object literal for the '{@link football_db.impl.SeasonImpl <em>Season</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see football_db.impl.SeasonImpl
		 * @see football_db.impl.Football_dbPackageImpl#getSeason()
		 * @generated
		 */
		EClass SEASON = eINSTANCE.getSeason();

		/**
		 * The meta object literal for the '<em><b>Start year season</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__START_YEAR_SEASON = eINSTANCE.getSeason_Start_year_season();

		/**
		 * The meta object literal for the '<em><b>End year season</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__END_YEAR_SEASON = eINSTANCE.getSeason_End_year_season();

		/**
		 * The meta object literal for the '<em><b>League</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__LEAGUE = eINSTANCE.getSeason_League();

		/**
		 * The meta object literal for the '<em><b>Game weeks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEASON__GAME_WEEKS = eINSTANCE.getSeason_Game_weeks();

		/**
		 * The meta object literal for the '<em><b>Weeks number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEASON__WEEKS_NUMBER = eINSTANCE.getSeason_Weeks_number();

		/**
		 * The meta object literal for the '{@link football_db.impl.TeamImpl <em>Team</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see football_db.impl.TeamImpl
		 * @see football_db.impl.Football_dbPackageImpl#getTeam()
		 * @generated
		 */
		EClass TEAM = eINSTANCE.getTeam();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NAME = eINSTANCE.getTeam_Name();

		/**
		 * The meta object literal for the '<em><b>League</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__LEAGUE = eINSTANCE.getTeam_League();

		/**
		 * The meta object literal for the '<em><b>Players</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__PLAYERS = eINSTANCE.getTeam_Players();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEAM__MATCHES = eINSTANCE.getTeam_Matches();

		/**
		 * The meta object literal for the '<em><b>Number matches</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__NUMBER_MATCHES = eINSTANCE.getTeam_Number_matches();

		/**
		 * The meta object literal for the '<em><b>Wins</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__WINS = eINSTANCE.getTeam_Wins();

		/**
		 * The meta object literal for the '<em><b>Draws</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__DRAWS = eINSTANCE.getTeam_Draws();

		/**
		 * The meta object literal for the '<em><b>Losses</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__LOSSES = eINSTANCE.getTeam_Losses();

		/**
		 * The meta object literal for the '<em><b>Points</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__POINTS = eINSTANCE.getTeam_Points();

		/**
		 * The meta object literal for the '<em><b>Goals scored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__GOALS_SCORED = eINSTANCE.getTeam_Goals_scored();

		/**
		 * The meta object literal for the '<em><b>Goals conceded</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__GOALS_CONCEDED = eINSTANCE.getTeam_Goals_conceded();

		/**
		 * The meta object literal for the '<em><b>Clean sheets</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__CLEAN_SHEETS = eINSTANCE.getTeam_Clean_sheets();

		/**
		 * The meta object literal for the '<em><b>Average possesion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__AVERAGE_POSSESION = eINSTANCE.getTeam_Average_possesion();

		/**
		 * The meta object literal for the '<em><b>Shots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__SHOTS = eINSTANCE.getTeam_Shots();

		/**
		 * The meta object literal for the '<em><b>Shots on target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__SHOTS_ON_TARGET = eINSTANCE.getTeam_Shots_on_target();

		/**
		 * The meta object literal for the '<em><b>Points per game</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__POINTS_PER_GAME = eINSTANCE.getTeam_Points_per_game();

		/**
		 * The meta object literal for the '<em><b>Goals difference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__GOALS_DIFFERENCE = eINSTANCE.getTeam_Goals_difference();

		/**
		 * The meta object literal for the '<em><b>Shoot accuracy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__SHOOT_ACCURACY = eINSTANCE.getTeam_Shoot_accuracy();

		/**
		 * The meta object literal for the '<em><b>Shoots per game</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__SHOOTS_PER_GAME = eINSTANCE.getTeam_Shoots_per_game();

		/**
		 * The meta object literal for the '<em><b>Shoots on target per game</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__SHOOTS_ON_TARGET_PER_GAME = eINSTANCE.getTeam_Shoots_on_target_per_game();

		/**
		 * The meta object literal for the '<em><b>Scored goals per game</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__SCORED_GOALS_PER_GAME = eINSTANCE.getTeam_Scored_goals_per_game();

		/**
		 * The meta object literal for the '<em><b>Conceded goals per game</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__CONCEDED_GOALS_PER_GAME = eINSTANCE.getTeam_Conceded_goals_per_game();

		/**
		 * The meta object literal for the '<em><b>Goals per shoots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__GOALS_PER_SHOOTS = eINSTANCE.getTeam_Goals_per_shoots();

		/**
		 * The meta object literal for the '<em><b>Goals per shoots on target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__GOALS_PER_SHOOTS_ON_TARGET = eINSTANCE.getTeam_Goals_per_shoots_on_target();

		/**
		 * The meta object literal for the '<em><b>Elo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEAM__ELO = eINSTANCE.getTeam_Elo();

		/**
		 * The meta object literal for the '{@link football_db.impl.PlayerImpl <em>Player</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see football_db.impl.PlayerImpl
		 * @see football_db.impl.Football_dbPackageImpl#getPlayer()
		 * @generated
		 */
		EClass PLAYER = eINSTANCE.getPlayer();

		/**
		 * The meta object literal for the '<em><b>Team</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PLAYER__TEAM = eINSTANCE.getPlayer_Team();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__NAME = eINSTANCE.getPlayer_Name();

		/**
		 * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__AGE = eINSTANCE.getPlayer_Age();

		/**
		 * The meta object literal for the '<em><b>Position</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__POSITION = eINSTANCE.getPlayer_Position();

		/**
		 * The meta object literal for the '<em><b>Goals scored</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__GOALS_SCORED = eINSTANCE.getPlayer_Goals_scored();

		/**
		 * The meta object literal for the '<em><b>Assists</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__ASSISTS = eINSTANCE.getPlayer_Assists();

		/**
		 * The meta object literal for the '<em><b>Minutes played</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__MINUTES_PLAYED = eINSTANCE.getPlayer_Minutes_played();

		/**
		 * The meta object literal for the '<em><b>Matches played</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__MATCHES_PLAYED = eINSTANCE.getPlayer_Matches_played();

		/**
		 * The meta object literal for the '<em><b>Country</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__COUNTRY = eINSTANCE.getPlayer_Country();

		/**
		 * The meta object literal for the '<em><b>Yellow cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__YELLOW_CARDS = eINSTANCE.getPlayer_Yellow_cards();

		/**
		 * The meta object literal for the '<em><b>Red cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__RED_CARDS = eINSTANCE.getPlayer_Red_cards();

		/**
		 * The meta object literal for the '<em><b>Goals per match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__GOALS_PER_MATCH = eINSTANCE.getPlayer_Goals_per_match();

		/**
		 * The meta object literal for the '<em><b>Assists per match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__ASSISTS_PER_MATCH = eINSTANCE.getPlayer_Assists_per_match();

		/**
		 * The meta object literal for the '<em><b>Minutes played per match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__MINUTES_PLAYED_PER_MATCH = eINSTANCE.getPlayer_Minutes_played_per_match();

		/**
		 * The meta object literal for the '<em><b>Red cards per match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__RED_CARDS_PER_MATCH = eINSTANCE.getPlayer_Red_cards_per_match();

		/**
		 * The meta object literal for the '<em><b>Yellow cards per match</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__YELLOW_CARDS_PER_MATCH = eINSTANCE.getPlayer_Yellow_cards_per_match();

		/**
		 * The meta object literal for the '<em><b>Minutes per goal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__MINUTES_PER_GOAL = eINSTANCE.getPlayer_Minutes_per_goal();

		/**
		 * The meta object literal for the '<em><b>Minutes per assists</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__MINUTES_PER_ASSISTS = eINSTANCE.getPlayer_Minutes_per_assists();

		/**
		 * The meta object literal for the '<em><b>Minutes per red cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__MINUTES_PER_RED_CARDS = eINSTANCE.getPlayer_Minutes_per_red_cards();

		/**
		 * The meta object literal for the '<em><b>Minutes per yellow cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__MINUTES_PER_YELLOW_CARDS = eINSTANCE.getPlayer_Minutes_per_yellow_cards();

		/**
		 * The meta object literal for the '<em><b>Player elo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PLAYER__PLAYER_ELO = eINSTANCE.getPlayer_Player_elo();

		/**
		 * The meta object literal for the '{@link football_db.impl.MatchImpl <em>Match</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see football_db.impl.MatchImpl
		 * @see football_db.impl.Football_dbPackageImpl#getMatch()
		 * @generated
		 */
		EClass MATCH = eINSTANCE.getMatch();

		/**
		 * The meta object literal for the '<em><b>Match number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__MATCH_NUMBER = eINSTANCE.getMatch_Match_number();

		/**
		 * The meta object literal for the '<em><b>Home team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__HOME_TEAM = eINSTANCE.getMatch_Home_team();

		/**
		 * The meta object literal for the '<em><b>Away team</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__AWAY_TEAM = eINSTANCE.getMatch_Away_team();

		/**
		 * The meta object literal for the '<em><b>Game week</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MATCH__GAME_WEEK = eINSTANCE.getMatch_Game_week();

		/**
		 * The meta object literal for the '<em><b>Goals home team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__GOALS_HOME_TEAM = eINSTANCE.getMatch_Goals_home_team();

		/**
		 * The meta object literal for the '<em><b>Goals away team</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__GOALS_AWAY_TEAM = eINSTANCE.getMatch_Goals_away_team();

		/**
		 * The meta object literal for the '<em><b>Home possesion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__HOME_POSSESION = eINSTANCE.getMatch_Home_possesion();

		/**
		 * The meta object literal for the '<em><b>Away possesion</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__AWAY_POSSESION = eINSTANCE.getMatch_Away_possesion();

		/**
		 * The meta object literal for the '<em><b>Home corners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__HOME_CORNERS = eINSTANCE.getMatch_Home_corners();

		/**
		 * The meta object literal for the '<em><b>Away corners</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__AWAY_CORNERS = eINSTANCE.getMatch_Away_corners();

		/**
		 * The meta object literal for the '<em><b>Home shots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__HOME_SHOTS = eINSTANCE.getMatch_Home_shots();

		/**
		 * The meta object literal for the '<em><b>Away shots</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__AWAY_SHOTS = eINSTANCE.getMatch_Away_shots();

		/**
		 * The meta object literal for the '<em><b>Home shots on target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__HOME_SHOTS_ON_TARGET = eINSTANCE.getMatch_Home_shots_on_target();

		/**
		 * The meta object literal for the '<em><b>Away shots on target</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__AWAY_SHOTS_ON_TARGET = eINSTANCE.getMatch_Away_shots_on_target();

		/**
		 * The meta object literal for the '<em><b>Home faults</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__HOME_FAULTS = eINSTANCE.getMatch_Home_faults();

		/**
		 * The meta object literal for the '<em><b>Away faults</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__AWAY_FAULTS = eINSTANCE.getMatch_Away_faults();

		/**
		 * The meta object literal for the '<em><b>Home yellow cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__HOME_YELLOW_CARDS = eINSTANCE.getMatch_Home_yellow_cards();

		/**
		 * The meta object literal for the '<em><b>Away yellow cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__AWAY_YELLOW_CARDS = eINSTANCE.getMatch_Away_yellow_cards();

		/**
		 * The meta object literal for the '<em><b>Home red cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__HOME_RED_CARDS = eINSTANCE.getMatch_Home_red_cards();

		/**
		 * The meta object literal for the '<em><b>Away red cards</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__AWAY_RED_CARDS = eINSTANCE.getMatch_Away_red_cards();

		/**
		 * The meta object literal for the '<em><b>Winner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__WINNER = eINSTANCE.getMatch_Winner();

		/**
		 * The meta object literal for the '<em><b>Loser</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__LOSER = eINSTANCE.getMatch_Loser();

		/**
		 * The meta object literal for the '<em><b>Win home team probabilities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__WIN_HOME_TEAM_PROBABILITIES = eINSTANCE.getMatch_Win_home_team_probabilities();

		/**
		 * The meta object literal for the '<em><b>Win away team probabilities</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MATCH__WIN_AWAY_TEAM_PROBABILITIES = eINSTANCE.getMatch_Win_away_team_probabilities();

		/**
		 * The meta object literal for the '{@link football_db.impl.Game_WeekImpl <em>Game Week</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see football_db.impl.Game_WeekImpl
		 * @see football_db.impl.Football_dbPackageImpl#getGame_Week()
		 * @generated
		 */
		EClass GAME_WEEK = eINSTANCE.getGame_Week();

		/**
		 * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_WEEK__NUMBER = eINSTANCE.getGame_Week_Number();

		/**
		 * The meta object literal for the '<em><b>Matches</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_WEEK__MATCHES = eINSTANCE.getGame_Week_Matches();

		/**
		 * The meta object literal for the '<em><b>Season</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GAME_WEEK__SEASON = eINSTANCE.getGame_Week_Season();

		/**
		 * The meta object literal for the '<em><b>Matches number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GAME_WEEK__MATCHES_NUMBER = eINSTANCE.getGame_Week_Matches_number();

	}

} //Football_dbPackage
