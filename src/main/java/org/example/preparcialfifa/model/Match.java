package org.example.preparcialfifa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Table(name = "match")
@Getter
@Setter
public class Match {
    @Id
    private int id;
    @Column(name = "match_date")
    private Date matchDate;
    private String stadium;


    @ManyToOne

    @JoinColumn(name = "home_country_id")
    private Country homecountry;


    @ManyToOne
    @JoinColumn(name = "away_country_id")
    private Country awaycountry;

}
