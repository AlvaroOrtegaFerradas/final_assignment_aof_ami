package parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;


import football_db.Football_dbFactory;
import football_db.Football_dbPackage;
import football_db.Game_Week;
import football_db.League;
import football_db.Match;
import football_db.Player;
import football_db.Season;
import football_db.Team;
import football_db.impl.*;
import football_db.util.*;

public class FootballParser {

	private List<Team> teams = new ArrayList<>();
	private List<Player> players = new ArrayList<>();
	private List<Match> matches = new ArrayList<>();
	public int game_week_num = 1;
	public int match_num = 1;
	
	private Team findTeam(List<Team> teams, String teamName) {
		return teams.stream().
				filter(t-> t.getName().equals(teamName)).
				findAny().orElse(null);
						
	}
	private void addGame_Week (Football_dbFactory factory,Season season) {
		Game_Week game_week = factory.createGame_Week();
		game_week.setMatches_number(10);
		game_week.setNumber(game_week_num);
		game_week_num++;
		season.getGame_weeks().add(game_week);
	}
	
	private void addMatch (Football_dbFactory factory,Season season, List <Team> teams, String home_team_name, String away_team_name,int match_game_week, int goals_home_team, int goals_away_team, int home_possession, int away_possession, int home_corners, int away_corners, int home_shots, int away_shots, int home_shots_on_target, int away_shots_on_target, int home_faults, int away_faults, int home_yellow_cards, int away_yellow_cards, int home_red_cards, int away_red_cards) {
		Match match = factory.createMatch();
		Team team;
		match.setMatch_number(match_num);
		match_num++;
	
		match.setGoals_home_team(goals_home_team);
		match.setGoals_away_team(goals_away_team);
		match.setHome_possesion(home_possession);
		match.setAway_possesion(away_possession);
		match.setHome_corners(home_corners);
		match.setAway_corners(away_corners);
		match.setHome_shots(home_shots);
		match.setAway_shots(away_shots);
		match.setHome_shots_on_target(home_shots_on_target);
		match.setAway_shots_on_target(away_shots_on_target);
		match.setHome_faults(home_faults);
		match.setAway_faults(away_faults);
		match.setHome_yellow_cards(home_yellow_cards);
		match.setAway_yellow_cards(away_yellow_cards);
		match.setHome_red_cards(home_red_cards);
		match.setAway_red_cards(away_red_cards);
		
		
		
		for (int i = 0; i < teams.size(); i++) {
			team = teams.get(i);
			if(team.getName().equals(home_team_name)) {
				match.setHome_team(team);;
			}
			if(team.getName().equals(away_team_name)) {
				match.setAway_team(team);
			}
		}
		if (match.getGoals_home_team() < match.getGoals_away_team()) {
			match.setWinner(away_team_name);
			match.setLoser(home_team_name);
		}
		if (match.getGoals_home_team() > match.getGoals_away_team()) {
			match.setWinner(home_team_name);
			match.setLoser(away_team_name);
		}
		
		double home_team_elo = match.getHome_team().getElo();
		double away_team_elo = match.getAway_team().getElo();
		double total_elo = home_team_elo + away_team_elo;
		double home_team_win_probabilities = (double) Math.round(home_team_elo / total_elo * 100*100)/100;
		double away_team_win_probabilities = (double) Math.round(away_team_elo / total_elo * 100*100)/100;
		
		match.setWin_home_team_probabilities(home_team_win_probabilities);
		match.setWin_away_team_probabilities(away_team_win_probabilities);
		
		for (int i = 1; i < season.getWeeks_number()+1; i++) {
			if (match_game_week == i) {
				season.getGame_weeks().get(i-1).getMatches().add(match);
			}
		}
	}

	private void addPlayer (Football_dbFactory factory,List <Team> teams, String name, int age, String position,String team_name, int minutes_played, String country, int matches_played, int goals_scored, int assists, int yellow_cards, int red_cards) {
		//
	 
		Player player = factory.createPlayer();
		
		Team team;
	
		player.setName(name);
		player.setAge(age);
		player.setPosition(position);
		player.setGoals_scored(goals_scored);
		player.setAssists(assists);
		player.setMinutes_played(minutes_played);
		player.setMatches_played(matches_played);
		player.setCountry(country);
		player.setYellow_cards(yellow_cards);
		player.setRed_cards(red_cards);
		
		
		if(matches_played > 0) {
			double goals_per_match = (double) Math.round((double) goals_scored / (double)matches_played*100)/100;
			double assists_per_match = (double) Math.round((double)assists/ (double)matches_played*100)/100;
			double minutes_per_match = (double) Math.round((double)minutes_played / (double)matches_played*100)/100;
			double yellows_per_match = (double) Math.round((double)yellow_cards/ (double)matches_played*100)/100;
			double red_per_match = (double) Math.round((double)red_cards / (double)matches_played*100)/100;
			
			player.setGoals_per_match(goals_per_match);
			player.setAssists_per_match(assists_per_match);
			player.setMinutes_played_per_match(minutes_per_match);
			player.setYellow_cards_per_match(yellows_per_match);
			player.setRed_cards_per_match(red_per_match);
			
	
		}
		if(goals_scored > 0) {
			double minutes_per_goal = (double) Math.round((double)minutes_played/(double)goals_scored*100)/100;
			player.setMinutes_per_goal(minutes_per_goal);
		}
		
		if(assists > 0) {
			double minutes_per_assist = (double) Math.round((double)minutes_played/(double)assists*100)/100;
			player.setMinutes_per_assists(minutes_per_assist);
		}
		
		if(yellow_cards > 0) {
			double minutes_per_yellow_card = (double) Math.round((double)minutes_played/(double)yellow_cards*100)/100;
			player.setMinutes_per_yellow_cards(minutes_per_yellow_card);
		}
		
		if(red_cards > 0) {
			double minutes_per_red_card = (double) Math.round((double)minutes_played/(double)red_cards*100)/100;
			player.setMinutes_per_red_cards(minutes_per_red_card);
		}
		
		double player_ELO = (double) Math.round((double) (0.6*goals_scored+0.6*assists+0.3*matches_played-0.2*yellow_cards- 0.3*red_cards)*100)/100;
		player.setPlayer_elo(player_ELO);
		
		
		
		for (int i = 0; i < teams.size(); i++) {
			team = teams.get(i);
			if(team.getName().equals(team_name)) {
				player.setTeam(team);
			}
		}
		
		
	}
	
	private void addTeam (Football_dbFactory factory,League foot, String name, int wins, int draws, int losses, int goals_scored, int goals_conceded, int clean_sheets, int average_possession, int shots, int shots_on_target) {
		Team team = factory.createTeam();
		
		team.setName(name);
		team.setWins(wins);
		team.setDraws(draws);
		team.setLosses(losses);
		team.setGoals_scored(goals_scored);
		team.setGoals_conceded(goals_conceded);
		team.setClean_sheets(clean_sheets);
		team.setAverage_possesion(average_possession);
		team.setShots(shots);
		team.setShots_on_target(shots_on_target);
		
		int games = wins + draws + losses;
		int points = 3*wins+draws;
		double points_per_game = (double) Math.round((double)points/(double)games*100)/100;
		int goal_difference = team.getGoals_scored() - team.getGoals_conceded();
		double shoot_accuracy = (double) Math.round((double)shots_on_target/(double)shots*100)/100;
		double shoots_per_game = (double) Math.round((double)shots/(double)games*100)/100;
		double shoots_on_target_per_game = (double) Math.round((double)shots_on_target /(double)games*100)/100;
		double scored_goals_per_game = (double) Math.round((double)goals_scored/(double)games*100)/100;
		double conceded_goals_per_game = (double) Math.round((double)goals_conceded /(double)games*100)/100;
		double goals_per_shoots = (double) Math.round((double)goals_scored/(double)shots*100)/100;
		double goals_per_shoots_on_target = (double) Math.round((double)goals_scored/(double)shots_on_target*100)/100;
		double ELO = (double) Math.round(((double)0.6*points + (double)0.35*goals_scored-(double)0.2*goals_conceded+(double)0.1*clean_sheets+(double)0.05*average_possession+(double)0.05*shots+(double)0.05*shots_on_target)*100)/100;
		team.setPoints(points);
		team.setPoints_per_game(points_per_game);
		team.setGoals_difference(goal_difference);
		team.setShoot_accuracy(shoot_accuracy);
		team.setShoots_per_game(shoots_per_game);
		team.setShoots_on_target_per_game(shoots_on_target_per_game);
		team.setScored_goals_per_game(scored_goals_per_game);
		team.setConceded_goals_per_game(conceded_goals_per_game);
		team.setGoals_per_shoots(goals_per_shoots);
		team.setGoals_per_shoots_on_target(goals_per_shoots_on_target);
		team.setElo(ELO);
		
		foot.getTeams().add(team);
		
	}
	
	void reader(String matchesFile, String playersFile, String teamsFile) {
		try {
			int number_of_game_weeks = 38;
			Football_dbPackage.eINSTANCE.eClass();
			Football_dbFactory factory = Football_dbFactory.eINSTANCE;
			League foot = factory.createLeague();
			foot.setName("Premier League");
			foot.setCountry("England");
			foot.setTeams_number(20);
			
			Season season = factory.createSeason();
			season.setStart_year_season(2018);
			season.setEnd_year_season(2019);
			season.setWeeks_number(38);
			foot.getSeasons().add(season);
			
			for (int i = 0; i < number_of_game_weeks; i++) {
				addGame_Week(factory, season);
				}
			
			
			
			String row = "";
			int i  = 0;
			File csvFile = new File(teamsFile);
			if (!csvFile.equals(null)) {
				BufferedReader csvReader = new BufferedReader(new FileReader(teamsFile));
				while ((row = csvReader.readLine()) != null) {
					if (i==0) {
						i++;
						continue;
					}
					String[] data = row.split(";");
					addTeam(factory, foot, data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]),Integer.parseInt(data[5]),Integer.parseInt(data[6]),Integer.parseInt(data[7]),Integer.parseInt(data[8]),Integer.parseInt(data[9])); 
							 
					
				}
				csvReader.close();
	
			}
			else {
				System.out.println("Could not find file: " + teamsFile);
			}
			
			//----------------------------------------
			teams = foot.getTeams();
			
			i =0 ;
			
			File csvFile2 = new File(playersFile);
			if (!csvFile2.equals(null)) {
				BufferedReader csvReader = new BufferedReader(new FileReader(playersFile));
				while ((row = csvReader.readLine()) != null) {
					if (i==0) {
						i++;
						continue;
					}
					String[] data = row.split(";");
					addPlayer(factory, teams, data[0],Integer.parseInt(data[1]),data[2], data[3], Integer.parseInt(data[4]),data[5], Integer.parseInt(data[6]), Integer.parseInt(data[7]), Integer.parseInt(data[8]), Integer.parseInt(data[9]), Integer.parseInt(data[10]));

					//addPlayer(factory, foot, data[0],,data[3],Integer.parseInt(data[4]),data[5],Integer.parseInt(data[6]),Integer.parseInt(data[7]),Integer.parseInt(data[8]),Integer.parseInt(data[9]),Integer.parseInt(data[10]));
				}
				csvReader.close();
	
			}
			else {
				System.out.println("Could not find file: " + teamsFile);
			}
			
			//-----------------------
			i = 0;
			File csvFile3 = new File(matchesFile);
			if (!csvFile3.equals(null)) {
				BufferedReader csvReader = new BufferedReader(new FileReader(matchesFile));
				while ((row = csvReader.readLine()) != null) {
					if (i==0) {
						i++;
						continue;
					}
					String[] data = row.split(";");
					addMatch(factory, season,teams,data[0],data[1], Integer.parseInt(data[2]), Integer.parseInt(data[3]), Integer.parseInt(data[4]), Integer.parseInt(data[17]), Integer.parseInt(data[18]),Integer.parseInt(data[5]),Integer.parseInt(data[6]),Integer.parseInt(data[11]),Integer.parseInt(data[12]),Integer.parseInt(data[13]), Integer.parseInt(data[14]),Integer.parseInt(data[15]), Integer.parseInt(data[16]),Integer.parseInt(data[7]), Integer.parseInt(data[9]),Integer.parseInt(data[8]), Integer.parseInt(data[10]));
				}
				csvReader.close();
	
			}
			else {
				System.out.println("Could not find file: " + teamsFile);
			}
			
			//-------------------------
			
			saveFile(foot);
			
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void saveFile(League league) {
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> map = registry.getExtensionToFactoryMap();
        map.put("xmi", new XMIResourceFactoryImpl());

        ResourceSet rs = new ResourceSetImpl();
        Resource resource = rs.createResource(URI.createURI("./model/premier_18_19.xmi"));

        resource.getContents().add(league);

        // Save file
        try {
            resource.save(Collections.EMPTY_MAP);
        } catch (IOException e) {
            System.out.println("Could not save xmi-file.");
            e.printStackTrace();
        }
        System.out.println("Xmi-file created!");
	}
}