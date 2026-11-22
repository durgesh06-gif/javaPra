package Encapsulation;

public class Anime {
	private int endeps;
	private int streps;
	private int date;
	private String name;
	private String gen;
	
	public Anime(int endeps, int streps, int date, String name, String gen) {
		super();
		this.endeps = endeps;
		this.streps = streps;
		this.date = date;
		this.name = name;
		this.gen = gen;
	}
	public int getEndeps() {
		return endeps;
	}
	public void setEndeps(int endeps) {
		this.endeps = endeps;
	}
	public int getStreps() {
		return streps;
	}
	public void setStreps(int streps) {
		this.streps = streps;
	}
	public int getDate() {
		return date;
	}
	public void setDate(int date) {
		this.date = date;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGen() {
		return gen;
	}
	public void setGen(String gen) {
		this.gen = gen;
	}

}
