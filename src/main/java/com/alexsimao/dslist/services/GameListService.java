package com.alexsimao.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.alexsimao.dslist.dto.GameListDTO;
import com.alexsimao.dslist.entities.GameList;
import com.alexsimao.dslist.projections.GameMinProjection;
import com.alexsimao.dslist.repositories.GameListRepository;
import com.alexsimao.dslist.repositories.GameRepository;

@Service
public class GameListService {

  @Autowired
  private GameListRepository gameListRepository;
  @Autowired
  private GameRepository gameRepository;

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll() {
    List<GameList> list = gameListRepository.findAll();
    List<GameListDTO> dto = list.stream().map(gameList -> new GameListDTO(gameList)).toList();
    return dto;
  }

  @Transactional
  public void move(Long listId, int sorceIndexint, int destnationIndex) {
    List<GameMinProjection> list = gameRepository.searchByList(listId);

    GameMinProjection obj = list.remove(sorceIndexint);
    list.add(destnationIndex, obj);

    int min = Math.min(sorceIndexint, destnationIndex);
    int max = Math.max(sorceIndexint, destnationIndex);

    for (int i = min; i <= max; i++) {
      gameListRepository.updateBelongingPosition(listId, list.get(i).getId(), i);
    }
  }

}
