package dev.ranieri.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("scores")
public class Score {

    @Id
    private String id;

    private String initials;
    private int points;

    private String game;

    public Score() {
    }

    public Score(String id, String initials, int points) {
        this.id = id;
        this.initials = initials;
        this.points = points;
    }

    public Score(String id, String initials, int points, String game) {
        this.id = id;
        this.initials = initials;
        this.points = points;
        this.game = game;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Score{" +
                "id='" + id + '\'' +
                ", initials='" + initials + '\'' +
                ", points=" + points +
                '}';
    }
}
