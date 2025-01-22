package com.alexsimao.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexsimao.dslist.dto.GameListDTO;
import com.alexsimao.dslist.services.GameListServise;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

  @Autowired
  private GameListServise gameListServise;

  @GetMapping
  public List<GameListDTO> findAll() {
    List<GameListDTO> result = gameListServise.findAll();
    return result;
  }

}
