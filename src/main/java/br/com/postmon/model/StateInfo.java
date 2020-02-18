package br.com.postmon.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateInfo {

  @JsonProperty("area_km2")
  private String meters;

  @JsonProperty("codigo_ibge")
  private String codeIBGE;

  @JsonProperty("nome")
  private String name;

  public String getMeters() {
    return meters;
  }

  public void setMeters(String meters) {
    this.meters = meters;
  }

  public String getCodeIBGE() {
    return codeIBGE;
  }

  public void setCodeIBGE(String codeIBGE) {
    this.codeIBGE = codeIBGE;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "StateInfo [meters=" + meters + ", codeIBGE=" + codeIBGE + ", name=" + name + "]";
  }

}
