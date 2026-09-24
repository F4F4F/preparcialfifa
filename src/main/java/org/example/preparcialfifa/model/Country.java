package org.example.preparcialfifa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "country")
@Getter
@Setter
public class Country {
    @Id
    private Integer id;
    private String name;
    private String code;
    private String confederation;


    @OneToMany(mappedBy = "homecountry")
    @JsonIgnore

    private List<Match> homematches;

    @OneToMany(mappedBy = "awaycountry")
    @JsonIgnore

    private List<Match> awaymatches;

    @OneToMany(mappedBy = "playercountry")
    @JsonIgnore

    private List<Player> players;

    @OneToMany(mappedBy = "clubcountry")
    @JsonIgnore

    private List<Club> clubs;
    }
