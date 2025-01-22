package com.alexsimao.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexsimao.dslist.dto.GameDTO;
import com.alexsimao.dslist.dto.GameMinDTO;
import com.alexsimao.dslist.services.GameService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
@RequestMapping(value = "/games")
public class GameController {

  @Autowired
  private GameService gameService;

  @GetMapping
  public List<GameMinDTO> findAll() {
    List<GameMinDTO> result = gameService.findAll();
    return result;
  }

  @GetMapping(value = "/all")
  public List<GameDTO> findAllAll() {
    List<GameDTO> result = gameService.findAllAll();
    return result;
  }

  @GetMapping(value = "/{id}")
  public GameDTO getMethodName(@PathVariable Long id) {
    GameDTO result = gameService.findById(id);
    return result;
  }

}
