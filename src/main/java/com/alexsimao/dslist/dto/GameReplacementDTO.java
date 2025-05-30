package com.alexsimao.dslist.dto;

public class GameReplacementDTO {
  private Integer sourceIndex;
  private Integer destinationIndex;

  public GameReplacementDTO() {
  }

  public GameReplacementDTO(Integer sourceIndex, Integer destinationIndex) {
    this.sourceIndex = sourceIndex;
    this.destinationIndex = destinationIndex;
  }

  public Integer getSourceIndex() {
    return sourceIndex;
  }

  public void setSourceIndex(Integer sourceIndex) {
    this.sourceIndex = sourceIndex;
  }

  public Integer getDestinationIndex() {
    return destinationIndex;
  }

  public void setDestinationIndex(Integer destinationIndex) {
    this.destinationIndex = destinationIndex;
  }

}
