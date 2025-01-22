package com.alexsimao.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexsimao.dslist.dto.GameDTO;
import com.alexsimao.dslist.dto.GameMinDTO;
import com.alexsimao.dslist.entities.Game;
import com.alexsimao.dslist.repositories.GameRepository;

@Service
public class GameService {

  @Autowired
  private GameRepository gameRepository;

  public List<GameMinDTO> findAll() {
    List<Game> result = gameRepository.findAll();
    List<GameMinDTO> dto = result.stream().map(game -> new GameMinDTO(game)).toList();
    return dto;
  }

  public List<GameDTO> findAllAll() {
    List<Game> result = gameRepository.findAll();
    List<GameDTO> dto = result.stream().map(game -> new GameDTO(game)).toList();
    return dto;
  }

  @Transactional(readOnly = true)
  public GameDTO findById(long id) {
    Game result = gameRepository.findById(id).get();
    GameDTO dto = new GameDTO(result);
    return dto;
  }

}
