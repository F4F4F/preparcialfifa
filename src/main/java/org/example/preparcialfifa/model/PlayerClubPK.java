package org.example.preparcialfifa.model;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Embeddable
public class PlayerClubPK implements Serializable {
    @Column(name = "player_id", insertable = false, updatable = false)
    private Integer playerId;

    @Column(name = "club_id", insertable = false, updatable = false)
    private Integer clubId;

    @Column(name = "start_date")
    private Timestamp startDate;
}