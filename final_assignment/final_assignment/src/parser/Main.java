package parser;


public class Main {
	public static final String DATA_M = "dataset/matches.csv";
	public static final String DATA_P = "dataset/players.csv";
	public static final String DATA_T = "dataset/teams.csv";
	
	public static void main (String[] args) {
		FootballParser foot = new FootballParser();
		foot.reader(DATA_M,DATA_P,DATA_T);
	}

}
