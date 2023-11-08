package com.goodnews.map.map.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Document(collection = "goodnews")
public class OffMapInfo {

    @Id
    private String id;
    private String type;
    private String name;
    private Double lon;
    private Double lat;
    private int canuse;
    @Field("facility")
    private Facility facility;

    }




