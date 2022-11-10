import java.util.ArrayList;

public class Contacto {
  private String nombre;
  private String numero;
  private ArrayList<Contacto> listaContactos;

  public Contacto() {
    this.nombre = "";
    this.numero = "";
    this.listaContactos = new ArrayList<Contacto>();
  }

  public Contacto(String nombre, String numero) {
    this.nombre = nombre;
    this.numero = numero;
  }

  public ArrayList<Contacto> obtenerListaContactos() {
    this.llenarListaContactos();
    return this.listaContactos;
  }

  public String getNombre() {
    return this.nombre;
  }

  public String getNumero() {
    return this.numero;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getDatosContacto () {
    return "contacto: " + this.getNombre() + "\n" + 
            "número: " + this.getNumero();
  }

  public void llenarListaContactos() {
    this.listaContactos.add(new Contacto("Contacto 1", "12345678"));
    this.listaContactos.add(new Contacto("Contacto 2", "02345678"));
    this.listaContactos.add(new Contacto("Contacto 3", "00345678"));
    this.listaContactos.add(new Contacto("Contacto 4", "00045678"));
    this.listaContactos.add(new Contacto("Contacto 5", "00005678"));
    this.listaContactos.add(new Contacto("Contacto 6", "00000678"));
    this.listaContactos.add(new Contacto("Contacto 7", "00000078"));
  }
}
