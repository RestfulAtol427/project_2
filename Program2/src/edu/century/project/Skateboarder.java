package edu.century.project;

import java.util.Random;

/**
 * 
 * @author Cody
 * @version 1.0
 */
public class Skateboarder extends Athlete {
	Random rand = new Random();
	private String name;
    private Country homeCountry;
    private int skill;
    private int medals;
    private int style = rand.nextInt(10);

    /**
     * 
     */
	public Skateboarder() {
		this.name = "DEFAULT";
        this.homeCountry = Country.selectRandomCountry();
        this.skill = 5;
        this.medals = 0;
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 * @param name
	 * @param home
	 * @param skill
	 * @param medals
	 */
	public Skateboarder(String name, Country home, int skill, int medals) {
		super(name, home, skill, medals);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	public double getSkill() {
		return skill + (1 * style);
	}
}
