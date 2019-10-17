package event_registry.event;

public class events {
	int id;
	String name;
	String type;
	int seatsAvail;
	int totalSeats;
	
	public events(int id, String name, String type, int seatsAvail, int totalSeats) {
		this.id = id;
		this.name = name;
		this.type = type;
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

	public String getType() {
		return type;
	}

	public void setType(String genre) {
		this.type = type;
	}

	public int getSeats_avail() {
		return seatsAvail;
	}

	public void setSeats_avail(int seatsAvail) {
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
        return "Id:" + id + " | " + "Name:" + name + " | " + "Type:" + type + " | " + "Seats Available = " + seatsAvail + " | " + "Total Seats = " + totalSeats; 
    }

}
