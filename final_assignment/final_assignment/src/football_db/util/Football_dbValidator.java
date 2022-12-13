/**
 */
package football_db.util;

import football_db.*;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see football_db.Football_dbPackage
 * @generated
 */
public class Football_dbValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Football_dbValidator INSTANCE = new Football_dbValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "football_db";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Football_dbValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Football_dbPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Football_dbPackage.LEAGUE:
				return validateLeague((League)value, diagnostics, context);
			case Football_dbPackage.SEASON:
				return validateSeason((Season)value, diagnostics, context);
			case Football_dbPackage.TEAM:
				return validateTeam((Team)value, diagnostics, context);
			case Football_dbPackage.PLAYER:
				return validatePlayer((Player)value, diagnostics, context);
			case Football_dbPackage.MATCH:
				return validateMatch((Match)value, diagnostics, context);
			case Football_dbPackage.GAME_WEEK:
				return validateGame_Week((Game_Week)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeague(League league, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(league, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(league, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(league, diagnostics, context);
		if (result || diagnostics != null) result &= validateLeague_check_number_teams(league, diagnostics, context);
		return result;
	}

	/**
	 * Validates the check_number_teams constraint of '<em>League</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLeague_check_number_teams(League league, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "check_number_teams", getObjectLabel(league, context) },
						 new Object[] { league },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeason(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(season, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(season, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(season, diagnostics, context);
		if (result || diagnostics != null) result &= validateSeason_check_year_season(season, diagnostics, context);
		return result;
	}

	/**
	 * Validates the check_year_season constraint of '<em>Season</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSeason_check_year_season(Season season, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "check_year_season", getObjectLabel(season, context) },
						 new Object[] { season },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeam(Team team, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(team, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(team, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(team, diagnostics, context);
		if (result || diagnostics != null) result &= validateTeam_check_matches(team, diagnostics, context);
		return result;
	}

	/**
	 * Validates the check_matches constraint of '<em>Team</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTeam_check_matches(Team team, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "check_matches", getObjectLabel(team, context) },
						 new Object[] { team },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(player, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(player, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(player, diagnostics, context);
		if (result || diagnostics != null) result &= validatePlayer_check_number_of_matches(player, diagnostics, context);
		return result;
	}

	/**
	 * Validates the check_number_of_matches constraint of '<em>Player</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePlayer_check_number_of_matches(Player player, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "check_number_of_matches", getObjectLabel(player, context) },
						 new Object[] { player },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatch(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(match, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(match, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(match, diagnostics, context);
		if (result || diagnostics != null) result &= validateMatch_check_match(match, diagnostics, context);
		return result;
	}

	/**
	 * Validates the check_match constraint of '<em>Match</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMatch_check_match(Match match, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "check_match", getObjectLabel(match, context) },
						 new Object[] { match },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame_Week(Game_Week game_Week, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(game_Week, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(game_Week, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(game_Week, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(game_Week, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(game_Week, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(game_Week, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(game_Week, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(game_Week, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(game_Week, diagnostics, context);
		if (result || diagnostics != null) result &= validateGame_Week_check_matches_number(game_Week, diagnostics, context);
		return result;
	}

	/**
	 * Validates the check_matches_number constraint of '<em>Game Week</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateGame_Week_check_matches_number(Game_Week game_Week, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO implement the constraint
		// -> specify the condition that violates the constraint
		// -> verify the diagnostic details, including severity, code, and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "check_matches_number", getObjectLabel(game_Week, context) },
						 new Object[] { game_Week },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Football_dbValidator
