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
    this.listaContactos.add(new Contacto("Ricardo Arriola", "12345678"));
    this.listaContactos.add(new Contacto("Juan Mendez", "22347678"));
    this.listaContactos.add(new Contacto("Bruno Diaz", "14567234"));
    this.listaContactos.add(new Contacto("Clark Ken", "78654389"));
    this.listaContactos.add(new Contacto("Antonio Estrellas", "12349832"));
    this.listaContactos.add(new Contacto("Marco Antonio", "12786534"));
    this.listaContactos.add(new Contacto("Pepe Gonzalez", "78906543"));
  }
}