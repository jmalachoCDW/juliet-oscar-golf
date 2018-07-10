package sample.src;

public class Golfer {

	private String firstname;
	private String lastname;
	private double handicap;
	
	public Golfer (String firstname, String lastname, double handicap) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.handicap = handicap;
		
	}
	
	public String getFirstname () {
		return firstname;
		
	}

	public String getLastname () {
		return lastname;
		
	}
	
	public Double getHandicap () {
		return handicap;
		
	}
}
