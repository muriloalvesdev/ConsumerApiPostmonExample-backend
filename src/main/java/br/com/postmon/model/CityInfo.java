package br.com.postmon.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CityInfo {

  @JsonProperty("area_km2")
  private String meters;

  @JsonProperty("codigo_ibge")
  private String codeIBGE;

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

  @Override
  public String toString() {
    return "CityInfo [meters=" + meters + ", codeIBGE=" + codeIBGE + "]";
  }

}
