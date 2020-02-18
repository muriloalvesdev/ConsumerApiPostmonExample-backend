package br.com.postmon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.postmon.model.Address;
import br.com.postmon.service.ConsumerApiPostmonService;

@RestController
@RequestMapping("api/postmon/")
public class ConsumerController {

  @Autowired
  private ConsumerApiPostmonService service;

  @GetMapping("find/{cep}")
  public ResponseEntity<Address> find(@PathVariable String cep) {
    return ResponseEntity.ok(service.consumer(cep));
  }

}
