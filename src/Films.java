
public class Films extends Object {
	private String nameOfFilm;
	private String directorName;
	private int yearOfRelease;
	
	public Films() {
		super();
		nameOfFilm = " ";
		directorName = " ";
		yearOfRelease = 0;
	}

	public String getNameOfFilm() {
		return nameOfFilm;
	}

	public void setNameOfFilm(String name) {
		nameOfFilm = name;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String dirName) {
		directorName = dirName;
	}

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int year) {
		yearOfRelease = year;
	}
	public String toString() {
		return "The name of the film is " + nameOfFilm + "name of direcor is " + directorName + " year of release is "
				+ yearOfRelease;
	}

	public boolean Equal(Object otherObject) {
		boolean isEqual = false;
		if (otherObject != null && otherObject instanceof Films) {
			Films otherFilms = (Films) (otherObject);
			if ((this.nameOfFilm.equals(otherFilms.nameOfFilm) && (this.directorName.equals(otherFilms.directorName))
					&& (this.yearOfRelease == otherFilms.yearOfRelease))) {

			}
		}
		return isEqual;
	}


}
