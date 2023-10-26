package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.
    public Job(){
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType type, CoreCompetency competency){
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = type;
        this.coreCompetency = competency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    @Override
    public String toString(){
        String newLine = System.lineSeparator();
        if (employer.getValue().equals("") || employer.getValue().equals(null)){
            employer.setValue("Data not available");
        }
        if (location.getValue().equals("") || location.getValue().equals(null)){
            location.setValue("Data not available");
        }
        if (positionType.getValue().equals("") || positionType.getValue().equals(null)){
            positionType.setValue("Data not available");
        }
        if (coreCompetency.getValue().equals("") || coreCompetency.getValue().equals(null)){
            coreCompetency.setValue("Data not available");
        }

        return newLine +
                "ID: " + this.getId() + newLine +
                "Name: " + this.getName() +  newLine +
                "Employer: " + this.getEmployer() + newLine +
                "Location: " +  this.getLocation() + newLine +
                "Position Type: " + this.getPositionType() + newLine +
                "Core Competency: " + this.getCoreCompetency() + newLine;
    }
}
