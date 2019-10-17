package event_registry.event;

public class movie {
	int id;
	String name;
	String genre;
	int seatsAvail;
	int totalSeats;
	
	public movie(int id, String name, String genre, int seatsAvail, int totalSeats) {
		this.id = id;
		this.name = name;
		this.genre = genre;
		this.seatsAvail = seatsAvail;
		this.totalSeats = totalSeats;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getSeatsAvail() {
		return seatsAvail;
	}

	public void setSeatsAvail(int seatsAvail) {
		this.seatsAvail = seatsAvail;
	}

	public int getTotalSeats() {
		return totalSeats;
	}

	public void setTotal_seats(int totalSeats) {
		this.totalSeats = totalSeats;
	}

	
	public String toString() 
    { 
        return "Id:" + id + " | " + "Name:" + name + " | " + "Genre:" + genre + " | " + "Seats Available = " + seatsAvail + " | " + "Total Seats = " + totalSeats; 
    } 
}
