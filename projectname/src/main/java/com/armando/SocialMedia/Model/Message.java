package com.armando.SocialMedia.Model;

import java.sql.Timestamp;

/**
 * This is a class that models a Message.
 */
public class Message {
    public int message_id; // Automatically generated by the database
    public int posted_by;  // References an existing account
    public String message_text; // Message content, must not be blank or exceed 255 characters
    public long time_posted_epoch; // Epoch time provided by the front-end
    public Timestamp created_at; // New field: Tracks when the message was created
    public Timestamp updated_at; // New field: Tracks the last time the message was updated

    // No-args constructor for Jackson ObjectMapper
    public Message() {}

    // Constructor for creating a new Message without timestamps
    public Message(int posted_by, String message_text, long time_posted_epoch) {
        this.posted_by = posted_by;
        this.message_text = message_text;
        this.time_posted_epoch = time_posted_epoch;
    }

    // Constructor for retrieving a Message from the database with all fields
    public Message(int message_id, int posted_by, String message_text, long time_posted_epoch, Timestamp created_at, Timestamp updated_at) {
        this.message_id = message_id;
        this.posted_by = posted_by;
        this.message_text = message_text;
        this.time_posted_epoch = time_posted_epoch;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    // Getters and Setters
    public int getMessage_id() {
        return message_id;
    }

    public void setMessage_id(int message_id) {
        this.message_id = message_id;
    }

    public int getPosted_by() {
        return posted_by;
    }

    public void setPosted_by(int posted_by) {
        this.posted_by = posted_by;
    }

    public String getMessage_text() {
        return message_text;
    }

    public void setMessage_text(String message_text) {
        this.message_text = message_text;
    }

    public long getTime_posted_epoch() {
        return time_posted_epoch;
    }

    public void setTime_posted_epoch(long time_posted_epoch) {
        this.time_posted_epoch = time_posted_epoch;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    // Overriding equals() method for comparison
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return message_id == message.message_id &&
                posted_by == message.posted_by &&
                time_posted_epoch == message.time_posted_epoch &&
                message_text.equals(message.message_text) &&
                created_at.equals(message.created_at) &&
                updated_at.equals(message.updated_at);
    }

    // Overriding toString() for debugging
    @Override
    public String toString() {
        return "Message{" +
                "message_id=" + message_id +
                ", posted_by=" + posted_by +
                ", message_text='" + message_text + '\'' +
                ", time_posted_epoch=" + time_posted_epoch +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
