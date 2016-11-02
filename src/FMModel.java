/**
 * FMModel.java
 *
 * Model class that handles data structures and states
 *
 * @author Brandon Nguyen, nguye299@purdue.edu, Lab Section G06
 *
 * @version October 29, 2016
 *
 */
public class FMModel {

    private Foilermaker controller;
    private String username;
    private String password;
    private String gameKey;
    private int numOfParticipants;
    private String[] participants;
    private String[] words;

    public FMModel(Foilermaker controller) {
        this.controller = controller;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getGameKey() {
        return this.gameKey;
    }

    public int getNumOfParticipants() {
        return this.numOfParticipants;
    }
}