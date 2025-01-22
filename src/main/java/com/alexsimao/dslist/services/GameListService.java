package com.alexsimao.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexsimao.dslist.dto.GameListDTO;
import com.alexsimao.dslist.entities.GameList;
import com.alexsimao.dslist.repositories.GameListRepository;

@Service
public class GameListService {

  @Autowired
  private GameListRepository gameListRepository;

  public List<GameListDTO> findAll() {
    List<GameList> list = gameListRepository.findAll();
    List<GameListDTO> dto = list.stream().map(gameList -> new GameListDTO(gameList)).toList();
    return dto;
  }

}
