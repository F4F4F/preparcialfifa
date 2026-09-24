package org.example.preparcialfifa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "club")
@Getter
@Setter
public class Club {
    @Id
    private Integer id;
    private String name;
    private String city;
    private Date founded;



    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "country_id")
    private Country clubcountry;

    @OneToMany(mappedBy = "clubplayer")
    @JsonIgnore

    private List<PlayerClub> clubsplayers;
}
