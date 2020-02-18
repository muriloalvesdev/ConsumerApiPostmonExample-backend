package br.com.postmon.service;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import br.com.postmon.model.Address;
import br.com.postmon.model.CityInfo;
import br.com.postmon.model.StateInfo;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConsumerApiPostmonServiceTest {

  @Autowired
  private ConsumerApiPostmonService service;

  @Test
  public void consumerTest() {
    Address address = service.consumer("40020160");

    CityInfo cityInfo = address.getCityInfo();
    StateInfo stateInfo = address.getStateInfo();

    assertEquals("Centro", address.getNeighborhood());
    assertEquals("Salvador", address.getCity());

    assertEquals("564.732,642", stateInfo.getMeters());
    assertEquals("29", stateInfo.getCodeIBGE());
    assertEquals("Bahia", stateInfo.getName());

    assertEquals("40020160", address.getPostalCode());
    assertEquals("692,819", cityInfo.getMeters());
    assertEquals("2927408", cityInfo.getCodeIBGE());
    assertEquals("BA", address.getState());
  }
}
