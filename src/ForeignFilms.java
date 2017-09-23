public class ForeignFilms extends Films {

	private String language;
	private String translation;
	private String subtitle;
	private static String[] subtitleArray;
	private static int numberOfSubtitles;

	public ForeignFilms() {
		super();
		language = " ";
		translation = "";
		subtitleArray = new String[numberOfSubtitles];
		numberOfSubtitles = 0;
		
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getLanguage() {
		return language;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	public String getTranslation() {
		return translation;
	}

	public static void addSubtitles(String subtitle) {
		subtitleArray[numberOfSubtitles] = subtitle;
		numberOfSubtitles++;
	}

	public String getSubtitles() {
		String subtitles = "";
		for (int index = 0; index < numberOfSubtitles; index++) {
			subtitles = subtitles + "\n" + subtitleArray[index];
		}
		return subtitles;

	}

	public void setSubtitle(String sub) {
		 subtitle=sub;
	}

}
