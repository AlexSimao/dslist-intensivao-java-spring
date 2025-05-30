package com.alexsimao.dslist.dto;

import com.alexsimao.dslist.entities.GameList;

public class GameListDTO {

  private Long id;
  private String name;

  GameListDTO() {

  }

  public GameListDTO(GameList entity) {
    this.id = entity.getId();
    this.name = entity.getName();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}
