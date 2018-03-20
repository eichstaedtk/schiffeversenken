package schiffeversenken.domain;

import java.util.Objects;
import java.util.UUID;

/**
 * Created by konrad.eichstaedt@gmx.de on 20.03.18.
 */

public class Spieler {

  protected Spieler() {
  }

  private Spieler(String vorname, String nachname, String spielerName) {
    this.id = UUID.randomUUID().toString();
    this.vorname = vorname;
    this.nachname = nachname;
    this.spielerName = spielerName;
  }

  private String id;

  private String vorname;

  private String nachname;

  private String spielerName;

  public static Spieler instance(String vorname, String nachname, String spielerName) {
    return new Spieler(vorname,nachname,spielerName);
  }

  public String getId() {
    return id;
  }

  public String getVorname() {
    return vorname;
  }

  public String getNachname() {
    return nachname;
  }

  public String getSpielerName() {
    return spielerName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Spieler spieler = (Spieler) o;
    return Objects.equals(id, spieler.id);
  }

  @Override
  public int hashCode() {

    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return "Spieler{" +
        "id='" + id + '\'' +
        ", vorname='" + vorname + '\'' +
        ", nachname='" + nachname + '\'' +
        ", spielerName='" + spielerName + '\'' +
        '}';
  }
}
