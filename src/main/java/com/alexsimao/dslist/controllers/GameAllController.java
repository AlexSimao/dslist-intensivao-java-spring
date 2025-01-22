package com.alexsimao.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alexsimao.dslist.dto.GameDTO;
import com.alexsimao.dslist.services.GameAllService;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping(value = "/games/all")
public class GameAllController {

  @Autowired
  private GameAllService gameAllService;

  @GetMapping
  public List<GameDTO> findAll() {
    List<GameDTO> result = gameAllService.findAll();
    return result;
  }

}
