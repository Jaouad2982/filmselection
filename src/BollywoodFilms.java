
public class BollywoodFilms extends ForeignFilms {

	private static String[] secondaryLanguageArray;
	private static String[] songArray;
	private static int numberOfSongs;
	private static int numberOfSecondaryLanguage;
	private String songs;
	
	public BollywoodFilms() {
		super();
		secondaryLanguageArray = new String[5];
		songArray = new String[20];
		numberOfSongs = 0;
		numberOfSecondaryLanguage = 0;
	}

	public static void addSong(String songName) {
		songArray[numberOfSongs] = songName;
		numberOfSongs++;

	}

	public String getSongs() {
		String allSongs = "";
		for (int index = 0; index < numberOfSongs; index++) {
			allSongs = allSongs + "\n" + songArray[index];
		}

		return allSongs;
	}

	public static void addSecondaryLanguage(String secondaryLanguages) {
		secondaryLanguageArray[numberOfSecondaryLanguage] = secondaryLanguages;
		numberOfSecondaryLanguage++;

	}

	public static void getSecondaryLanguage() {
		String allSecondaryLanguage = " ";
		for (int i = 0; i < numberOfSecondaryLanguage; i++) {
			allSecondaryLanguage = allSecondaryLanguage + " \n" + secondaryLanguageArray[i];
		}
	}

	public void printAllSongInformation() {
		for (int index = 0; index < numberOfSongs; index++) {
			System.out.println("Song name: " + songArray[index]);
		}
	}

	public void printAllsecondaryLanguageInfo() {
		for (int index = 0; index < numberOfSecondaryLanguage; index++) {
			System.out.println("secondary Language is " + secondaryLanguageArray[index]);
		}
	}

	public String toString() {
		return super.toString();
	}

	public void setSecondaryLanguage(String secondaryLanguage) {
		this.secondaryLanguageArray = secondaryLanguageArray;

	}

	public void setSongs(String[] songsArray) {
		this.songs = songs;
	}

	public String[] getSongs(String[] Songs) {
		return Songs;
	}

	public void setSongs(String songs2) {
	
		
	}


}