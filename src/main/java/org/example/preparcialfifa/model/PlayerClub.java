package org.example.preparcialfifa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Entity
@Table(name = "playerclub")
@Getter
@Setter
public class PlayerClub {

    @EmbeddedId
    private PlayerClubPK id;

    @Column(name = "end_date")
    private Date endDate;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "player_id")
    private Player playerclub;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "club_id")
    private Club clubplayer;
}
