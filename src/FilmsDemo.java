import java.util.Scanner;

public class FilmsDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Films[] arrayFilms = new Films[10];
		Films myFavoriteFilm = new Films();
		ForeignFilms myFavoriteForeignFilm = new ForeignFilms();
		BollywoodFilms myBollywoodFilm = new BollywoodFilms();
		int option;

		
		do {
			System.out.println("Press 1 to enter the information about the film");
			System.out.println("Press 2 to enter the information about the Foreign film");
			System.out.println("Press 3 to enter the information about the bollywood film");
			System.out.println("Press 4 to view the film info");
			System.out.println("Press 5 to view the Foreign film info");
			System.out.println("Press 6 to view the bollywood film info");
			System.out.println("Press 7 to exit");
			option = input.nextInt();

			if (option == 1) {
				enterAllInformation(myFavoriteFilm);
			}
			if (option == 2) {
				enterAllInformation(myFavoriteForeignFilm);
			}
			if (option == 3) {
				enterAllInformation(myBollywoodFilm);
			}
			if (option == 4) {
				System.out.println("Name of film : " + myFavoriteFilm.getNameOfFilm());
				System.out.println("Name of the director(s) : " + myFavoriteFilm.getDirectorName());
				System.out.println("The year of release : " + myFavoriteFilm.getYearOfRelease());
			}
			if (option == 5) {
				System.out.println("Name of film : " + myFavoriteForeignFilm.getNameOfFilm());
				System.out.println("Name of the director(s) : " + myFavoriteForeignFilm.getDirectorName());
				System.out.println("The year of release : " + myFavoriteForeignFilm.getYearOfRelease());
				System.out.println("Language : " + myFavoriteForeignFilm.getLanguage());
				System.out.println("subtitle's information : " + myFavoriteForeignFilm.getSubtitles());
				System.out.println("translation : " + myFavoriteForeignFilm.getTranslation());
			}
			if (option == 6) {
				System.out.println("Name of film : " + myBollywoodFilm.getNameOfFilm());
				System.out.println("Name of the director(s) : " + myBollywoodFilm.getDirectorName());
				System.out.println("The year of release : " + myBollywoodFilm.getYearOfRelease());
				System.out.println("Language : " + myBollywoodFilm.getLanguage());
				System.out.println("Translation : " + myBollywoodFilm.getTranslation());
				System.out.println("Language : " + myBollywoodFilm.getLanguage());
				System.out.println("Songs: " + myBollywoodFilm.getTranslation());
			}

		} while (option != 7);
	}



	public static void enterAllInformation(Films myFavoriteFilm) {
		if (myFavoriteFilm != null) {
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the name of the film");
			String name = input.nextLine();
			System.out.println("Enter the name of the direcor of the film.");
			String dirName = input.nextLine();
			System.out.println("Enter the year of its release");
			int year = input.nextInt();

			myFavoriteFilm.setNameOfFilm(name);
			myFavoriteFilm.setDirectorName(dirName);
			myFavoriteFilm.setYearOfRelease(year);

			if (myFavoriteFilm instanceof ForeignFilms) {
				ForeignFilms myFavoriteForeignFilm = (ForeignFilms) myFavoriteFilm;
																				
				System.out.println("Enter the language used for this film");
				String language = input.nextLine();
			    input.next();
				System.out.println("Enter the list of subtitles used for this film");
				String sub = input.nextLine();
				input.next();
				System.out.println("Enter the translation used for this film");
				String translation = input.nextLine();
				
				myFavoriteForeignFilm.setLanguage(language);
				myFavoriteForeignFilm.setSubtitle(sub);
				myFavoriteForeignFilm.setLanguage(translation);

				if (myFavoriteFilm instanceof BollywoodFilms) {
					BollywoodFilms myBollywoodFilm = (BollywoodFilms) myFavoriteFilm;
					System.out.println("Enter the secondary Language used for this film");
					String secondaryLanguage = input.nextLine();
					myBollywoodFilm.setSecondaryLanguage(secondaryLanguage);
					System.out.println("Enter the list of songs for this film");
					String songs=input.nextLine();
					myBollywoodFilm.setSongs(songs);
				}

			}

		}
	}
}