import java.util.ArrayList;

public class Cancion {
  public String nombre;
  public String artista;
  public String anio;
  public String genero;
  public ArrayList<Cancion> listaReproduccionRock;
  public ArrayList<Cancion> listaReproduccionPop;
  public ArrayList<Cancion> listaReproduccionClasica;

  public Cancion() {
    this.nombre = "";
    this.artista = "";
    this.anio = "";
    this.genero = "";
    this.listaReproduccionRock = new ArrayList<Cancion>();
    this.listaReproduccionPop = new ArrayList<Cancion>();
    this.listaReproduccionClasica = new ArrayList<Cancion>();
  }

  public Cancion(String nombre, String artista, String anio, String genero) {
    this.nombre = nombre;
    this.artista = artista;
    this.anio = anio;
    this.genero = genero;
  }

  public String getNombre() {
    return this.nombre;
  }
  
  public String getArtista() {
    return this.artista;
  }
  
  public String getAnio() {
    return this.anio;
  }
  
  public String getGenero() {
    return this.genero;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }
  
  public void setArtista(String artista) {
    this.artista = artista;
  }
  
  public void setAnio(String anio) {
    this.anio = anio;
  }
  
  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getDatosCancion () {
    return "nombre: " + this.getNombre() + "\n" + 
           "artista: " + this.getArtista() + "\n" + 
           "anio: " + this.getAnio() + "\n" + 
           "genero: " + this.getGenero();
  }

  public ArrayList<Cancion> obtenerListaReproduccionRock() {
    this.llenarListaReproduccionRock();
    return this.listaReproduccionRock;
  }

  public ArrayList<Cancion> obtenerListaReproduccionPop() {
    this.llenarListaReproduccionPop();
    return this.listaReproduccionPop;
  }

  public ArrayList<Cancion> obtenerListaReproduccionClasica() {
    this.llenarListaReproduccionClasica();
    return this.listaReproduccionClasica;
  }

  public void llenarListaReproduccionRock() {
    this.listaReproduccionRock.add(new Cancion("Cancion rock 1", "artista", "2022", "rock"));
    this.listaReproduccionRock.add(new Cancion("Cancion rock 2", "artista", "2022", "rock"));
    this.listaReproduccionRock.add(new Cancion("Cancion rock 3", "artista", "2022", "rock"));
    this.listaReproduccionRock.add(new Cancion("Cancion rock 4", "artista", "2022", "rock"));
    this.listaReproduccionRock.add(new Cancion("Cancion rock 5", "artista", "2022", "rock"));
  }

  public void llenarListaReproduccionPop() {
    this.listaReproduccionPop.add(new Cancion("Cancion pop 1", "artista", "2022", "pop"));
    this.listaReproduccionPop.add(new Cancion("Cancion pop 2", "artista", "2022", "pop"));
    this.listaReproduccionPop.add(new Cancion("Cancion pop 3", "artista", "2022", "pop"));
    this.listaReproduccionPop.add(new Cancion("Cancion pop 4", "artista", "2022", "pop"));
    this.listaReproduccionPop.add(new Cancion("Cancion pop 5", "artista", "2022", "pop"));
  }

  public void llenarListaReproduccionClasica() {
    this.listaReproduccionClasica.add(new Cancion("Cancion clasica 1", "artista", "2022", "clasica"));
    this.listaReproduccionClasica.add(new Cancion("Cancion clasica 2", "artista", "2022", "clasica"));
    this.listaReproduccionClasica.add(new Cancion("Cancion clasica 3", "artista", "2022", "clasica"));
    this.listaReproduccionClasica.add(new Cancion("Cancion clasica 4", "artista", "2022", "clasica"));
    this.listaReproduccionClasica.add(new Cancion("Cancion clasica 5", "artista", "2022", "clasica"));
  }

}
