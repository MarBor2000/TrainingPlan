package models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document("users")
public class User {
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private List<TrainingPlan> trainingPlans;
    private List<Measurment> measurments;
    private List<PersonalRecord> personalRecords;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<TrainingPlan> getTrainingPlans() {
        return trainingPlans;
    }

    public void setTrainingPlans(List<TrainingPlan> trainingPlans) {
        this.trainingPlans = trainingPlans;
    }

    public List<Measurment> getMeasurments() {
        return measurments;
    }

    public void setMeasurments(List<Measurment> measurments) {
        this.measurments = measurments;
    }

    public List<PersonalRecord> getPersonalRecords() {
        return personalRecords;
    }

    public void setPersonalRecords(List<PersonalRecord> personalRecords) {
        this.personalRecords = personalRecords;
    }
}
