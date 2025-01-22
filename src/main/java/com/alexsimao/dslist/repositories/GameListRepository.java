package com.alexsimao.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alexsimao.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
