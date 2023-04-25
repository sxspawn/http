package ru.kovbasa.http.model;

public class Message {

    private String id;
    private String text;
    private String type;
    private String user;
    private Integer upvotes;

    public Integer getUpvotes() {
        return upvotes;
    }

    @Override
    public String toString() {
        return "\n{\n  id: " + this.id +
                ",\n  text: " + this.text +
                ",\n  type: " + this.type +
                ",\n  user: " + this.user +
                ",\n  upvotes: " + this.upvotes + "\n}";
    }
}
