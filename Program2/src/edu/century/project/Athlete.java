package edu.century.project;

/**
 * 
 * @author Cody
 * @version 1.0
 */
public class Athlete {
    private String name;
    private Country homeCountry;
    private Sport specialty;
    private int skill;
    private int medals;
    
    /**
	 * 
	 */
    public Athlete() {
        this.name = "DEFAULT";
        this.homeCountry = Country.selectRandomCountry();
        this.specialty = Sport.selectRandomSport();
        this.skill = 5;
        this.medals = 0;
    }
    
    /**
	 * 
	 * @param name
	 * @param home
	 * @param specialty
	 * @param skill
	 * @param medals
	 */
    public Athlete (String name, Country home, Sport specialty, int skill, int medals) {
        this.name = name;
        this.homeCountry = home;
        this.specialty = specialty;
        this.skill = skill;
        this.medals = medals;
    }
    
	/**
	 * 
	 * @return
	 */
    public String getName() {
        return name;
    }
    
    /**
	 * This will set the athletes name and will
	 * check to verify that it has at least one
	 * character and if it doesn't it will set the 
	 * name to DEFAULT
	 * 
	 * @param name A string representing the athletes name
	 */
    public void setName(String name) {
        if (name.length() > 1)
            this.name = name;
        else {
            this.name = "DEFAULT";
        }
    }
    
    /**
     * 
     * @return
     */
    public Country getHomeCountry() {
        return homeCountry;
    }
    
    /**
	 * 
	 * @param home
	 */
    public void setHomeNation(Country home) {
        homeCountry = home;
    }
    
    /**
	 * 
	 * @return
	 */
    public Sport getSpecialty() {
        return specialty;
    }
    
    /**
     * 
     * @param specialty
     */
    public void setSpecialty(Sport specialty) {
        this.specialty = specialty;
    }
    
    /**
	 * 
	 * @return
	 */
    public int getSkill() {
        return skill;
    }
    
    /**
     * 
     * @param skill
     */
    public void setSkill(int skill) {
        if (skill >=0 && skill <= 10) {
            this.skill = skill;
        } else {
            this.skill = 0;
        }    
    }
    
    /**
	 * 
	 * @return
	 */
    public int getMedals() {
        return medals;
    }
    
    /**
     * 
     * @param medals
     */
    public void setMedals(int medals) {
        if (medals < 0) {
            this.medals = 0;
        } else {
            this.medals = medals;
        }    
    }
    
    
    public boolean equals (Athlete a) {

        if (a == null)
        	return false;
        
        if (getClass() != a.getClass())
            return false;
        
        if ((getName().equalsIgnoreCase (a.getName())) &&
            (getHomeCountry() == a.getHomeCountry()) &&
            (getSpecialty() == a.getSpecialty()) &&
            (getSkill() == a.getSkill()) &&
            (getMedals() == a.getMedals()))
            return true;
        
        else return false;    
            
    }
    
    public String toString () {
        return "Athlete name: " + getName() + ", Home Country: " + getHomeCountry() +
                ", Specialty: " + getSpecialty() + ", skill level: " + getSkill() + 
                ", number of medals: " + medals;
    }
    
}
