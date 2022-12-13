/**
 */
package football_db.impl;

import football_db.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Football_dbFactoryImpl extends EFactoryImpl implements Football_dbFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Football_dbFactory init() {
		try {
			Football_dbFactory theFootball_dbFactory = (Football_dbFactory)EPackage.Registry.INSTANCE.getEFactory(Football_dbPackage.eNS_URI);
			if (theFootball_dbFactory != null) {
				return theFootball_dbFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Football_dbFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Football_dbFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Football_dbPackage.LEAGUE: return createLeague();
			case Football_dbPackage.SEASON: return createSeason();
			case Football_dbPackage.TEAM: return createTeam();
			case Football_dbPackage.PLAYER: return createPlayer();
			case Football_dbPackage.MATCH: return createMatch();
			case Football_dbPackage.GAME_WEEK: return createGame_Week();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public League createLeague() {
		LeagueImpl league = new LeagueImpl();
		return league;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Season createSeason() {
		SeasonImpl season = new SeasonImpl();
		return season;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Team createTeam() {
		TeamImpl team = new TeamImpl();
		return team;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Player createPlayer() {
		PlayerImpl player = new PlayerImpl();
		return player;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Match createMatch() {
		MatchImpl match = new MatchImpl();
		return match;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Game_Week createGame_Week() {
		Game_WeekImpl game_Week = new Game_WeekImpl();
		return game_Week;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Football_dbPackage getFootball_dbPackage() {
		return (Football_dbPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Football_dbPackage getPackage() {
		return Football_dbPackage.eINSTANCE;
	}

} //Football_dbFactoryImpl
