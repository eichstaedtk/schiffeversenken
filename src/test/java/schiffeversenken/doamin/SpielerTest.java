package schiffeversenken.doamin;

import static org.hamcrest.core.Is.is;

import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Test;
import schiffeversenken.domain.Spieler;

/**
 * Created by konrad.eichstaedt@gmx.de on 20.03.18.
 */
public class SpielerTest {

  @Test
  public void testInstance() {

    Spieler spieler = Spieler.instance("Konrad","Eichstaedt","kei");

    Assert.assertThat(spieler.getId(),is(IsNull.notNullValue()));
  }

}
