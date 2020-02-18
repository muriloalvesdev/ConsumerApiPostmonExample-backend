package br.com.postmon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import br.com.postmon.model.Address;

@Service
public class ConsumerApiPostmonService {

  @Autowired
  private RestTemplate restTemplate;

  @Value("${url.postmon}")
  private String url;

  public Address consumer(String cep) {
    String fullUrl = url + cep;
    return restTemplate.getForObject(fullUrl, Address.class);
  }

}
