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

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.
//Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public Location getLocation() {
        return location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }
//    Setters


    public void setName(String name) {
        this.name = name;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

//    to String Method

    @Override
    public String toString() {
        String emptyField = "Data not available";
        String doesNotExist = "OOPS! This job does not seem to exist.";
        if((name == "" || name == null) && (employer.getValue() == "" ||employer.getValue() == null) && (location.getValue() == "" || location.getValue() == null) && (positionType.getValue() == "" || positionType.getValue() == null) && (coreCompetency.getValue() == "" || coreCompetency.getValue() == null)) {
            return doesNotExist;
        }
        if(name == "" || name == null) {
            name = emptyField;
        }
        if(employer.getValue() == "" || employer.getValue() == null) {
            employer.setValue(emptyField);
        }
        if(location.getValue() == "" || location.getValue() == null) {
            location.setValue(emptyField);
        }
        if(positionType.getValue() == "" || positionType.getValue() == null) {
            positionType.setValue(emptyField);
        }
        if(coreCompetency.getValue() == "" || coreCompetency.getValue() == null) {
            coreCompetency.setValue(emptyField);
        }

//        return String.format("\nID: %x\nName: %s\nEmployer: %s\nLocation: %s\nPosition Type: %s\nCore Competency: %s\n", this.getId(), this.getName(), this.getEmployer(), this.getLocation(), this.getPositionType(), this.getCoreCompetency());
        return "\nID: " + this.getId() + "\nName: " + this.getName() + "\nEmployer: " + this.getEmployer() + "\nLocation: " + this.getLocation() + "\nPosition Type: " + this.getPositionType() + "\nCore Competency: " + this.getCoreCompetency() + "\n";
    }
}
