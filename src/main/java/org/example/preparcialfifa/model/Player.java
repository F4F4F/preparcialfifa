package org.example.preparcialfifa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "player")
@Getter
@Setter
public class Player {
    @Id
    private Integer id;
    private String name;
    @Column(name = "birth_date")
    private Date birthdate;
    private String position;

    @Column(name="fifa_score")
    private Integer fifaScore;


    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "country_id")
    private Country playercountry;

    @OneToMany(mappedBy = "playerclub")
    @JsonIgnore
    private List<PlayerClub> playerclubs;

}
