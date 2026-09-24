package org.example.preparcialfifa.repo;

import org.example.preparcialfifa.model.Club;
import org.example.preparcialfifa.model.PlayerClub;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RepoPlayerClub extends JpaRepository<PlayerClub, Integer> {

}
