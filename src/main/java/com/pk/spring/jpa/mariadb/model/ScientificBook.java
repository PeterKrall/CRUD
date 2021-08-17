package com.pk.spring.jpa.mariadb.model;

import javax.persistence.*;

@Entity
public class ScientificBook extends Book {

    public ScientificBook() {
    }

    public ScientificBook(String title, String description, String topic, boolean published) {
        super(title,description, published);
        this.topic = topic;
        setPublished(published);
    }


    @Column(name = "topic")
    private String topic;

    public String getTopic() { return topic; }

    public void setTopic(String topic) { this.topic = topic; }
}
