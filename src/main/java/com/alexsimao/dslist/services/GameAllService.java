package com.alexsimao.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alexsimao.dslist.dto.GameDTO;
import com.alexsimao.dslist.entities.Game;
import com.alexsimao.dslist.repositories.GameRepository;

@Service
public class GameAllService {

  @Autowired
  private GameRepository gameAllRepository;

  public List<GameDTO> findAll() {
    List<Game> result = gameAllRepository.findAll();
    var dto = result.stream().map(game -> new GameDTO(game)).toList();
    return dto;
  }

}
