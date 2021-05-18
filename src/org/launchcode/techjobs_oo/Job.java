package org.launchcode.techjobs_oo;

import java.util.*;

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
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String returnedString = "";

        if (name == null && employer == null && location == null && positionType == null && coreCompetency == null) {
            returnedString = "OOPS! This job does not seem to exist.";
        } else {

            returnedString += "ID: " + this.getId() + "\n";

            if (this.getName() == "" || this.getName() == null) {
                returnedString += "Name: Data not available\n";
            } else {
                returnedString += "Name: " + this.getName() + "\n";
            }

            if (this.employer.getValue() == "" || this.employer.getValue() == null) {
                returnedString += "Employer: Data not available\n";
            } else {
                returnedString += "Employer: " + this.getEmployer() + "\n";
            }

            if (this.location.getValue() == "" || this.location.getValue() == null) {
                returnedString += "Location: Data not available\n";
            } else {
                returnedString += "Location: " + this.getLocation() + "\n";
            }

            if (this.positionType.getValue() == "" || this.positionType.getValue() == null) {
                returnedString += "Position Type: Data not available\n";
            } else {
                returnedString += "Position Type: " + this.getPositionType() + "\n";
            }

            if (this.coreCompetency.getValue() == "" || this.coreCompetency.getValue() == null) {
                returnedString += "Core Competency: Data not available\n";
            } else {
                returnedString += "Core Competency: " + this.getCoreCompetency();
            }
        }
        return returnedString;
    }

    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.

    public int getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Employer getEmployer() { return employer; }
    public void setEmployer(Employer employer) { this.employer = employer; }

    public Location getLocation() { return location; }
    public void setLocation(Location location) { this.location = location; }

    public PositionType getPositionType() { return positionType; }
    public void setPositionType(PositionType positionType) { this.positionType = positionType; }

    public CoreCompetency getCoreCompetency() { return coreCompetency; }
    public void setCoreCompetency(CoreCompetency coreCompetency) { this.coreCompetency = coreCompetency; }

//    HashMap<Object, String> fields = new HashMap<>();
//    fields.put(employer, employer.getValue());
//    fields.put(location, location.getValue());
//    fields.put(positionType, positionType.getValue());
//    fields.put(coreCompetency, coreCompetency.getValue());
//    for (Map.Entry<Object, String> field : fields.entrySet()) {
//        if (field.getValue() == "" || field.getValue() == null) {
//            returnedString += String.format("%s: Data not available\n", field.getKey().toString());
//        } else {
//            returnedString += String.format("%s: %s\n", field.getKey().toString(), field.getValue());
//        }
//    }

}
