import java.util.ArrayList;

public class Cancion {
  public String nombre;
  public String artista;
  public String duracion;
  public String genero;
  public String listaActual;
  public ArrayList<Cancion> listaReproduccionRock;
  public ArrayList<Cancion> listaReproduccionPop;
  public ArrayList<Cancion> listaReproduccionClasica;

  public Cancion() {
    this.nombre = "";
    this.artista = "";
    this.duracion = "";
    this.genero = "";
    this.listaActual = "";
    this.listaReproduccionRock = new ArrayList<Cancion>();
    this.listaReproduccionPop = new ArrayList<Cancion>();
    this.listaReproduccionClasica = new ArrayList<Cancion>();
  }

  public Cancion(String nombre, String artista, String duracion, String genero) {
    this.nombre = nombre;
    this.artista = artista;
    this.duracion = duracion;
    this.genero = genero;
  }

  public String getNombre() {
    return this.nombre;
  }
  
  public String getArtista() {
    return this.artista;
  }
  
  public String getDuracion() {
    return this.duracion;
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
  
  public void setDuracion(String duracion) {
    this.duracion = duracion;
  }
  
  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getDatosCancion () {
    return "nombre: " + this.getNombre() + "\n" + 
           "artista: " + this.getArtista() + "\n" + 
           "duracion: " + this.getDuracion() + "\n" + 
           "genero: " + this.getGenero();
  }

  public String getListaActual() {
    return this.listaActual;
  }

  public void setListaActual(String lista) {
    this.listaActual = lista;
  }

  public void asignarCancionActual(Cancion cancion) {
    this.setArtista(cancion.getArtista());
    this.setDuracion(cancion.getDuracion());
    this.setGenero(cancion.getGenero());
    this.setNombre(cancion.getNombre());
  }

  public ArrayList<Cancion> obtenerListaReproduccionRock() {
    this.llenarListaReproduccionRock();
    this.setListaActual("Rock");
    return this.listaReproduccionRock;
  }

  public ArrayList<Cancion> obtenerListaReproduccionPop() {
    this.llenarListaReproduccionPop();
    this.setListaActual("Pop");
    return this.listaReproduccionPop;
  }

  public ArrayList<Cancion> obtenerListaReproduccionClasica() {
    this.llenarListaReproduccionClasica();
    this.setListaActual("Clasica");
    return this.listaReproduccionClasica;
  }

  public void llenarListaReproduccionRock() {
    this.listaReproduccionRock.add(new Cancion("Patience", "Guns N' Roses", "5:57", "rock"));
    this.listaReproduccionRock.add(new Cancion("Don't Stop Me Now", "Queen", "3:33", "rock"));
    this.listaReproduccionRock.add(new Cancion("The Sound Of Silence", "Disturbed", "4:20", "rock"));
    this.listaReproduccionRock.add(new Cancion("The Final Countdown", "Europe", "4:57", "rock"));
    this.listaReproduccionRock.add(new Cancion("I Was Made For Lovin' You", "KISS", "4:22", "rock"));
  }

  public void llenarListaReproduccionPop() {
    this.listaReproduccionPop.add(new Cancion("Las de la intuicion", "Shakira", "3:37", "pop"));
    this.listaReproduccionPop.add(new Cancion("Me muero", "Carlos Rivera", "3:19", "pop"));
    this.listaReproduccionPop.add(new Cancion("Mientes", "Camila", "3:43", "pop"));
    this.listaReproduccionPop.add(new Cancion("Confieso", "Kany Garcia", "3:46", "pop"));
    this.listaReproduccionPop.add(new Cancion("Sofia", "Alvaro Soler", "3:34", "pop"));
  }

  public void llenarListaReproduccionClasica() {
    this.listaReproduccionClasica.add(new Cancion("Uptown Girl", "Billy Joel", "3:24", "clasica"));
    this.listaReproduccionClasica.add(new Cancion("Imagine", "John Lennon", "3:41", "clasica"));
    this.listaReproduccionClasica.add(new Cancion("Jailhouse Rock", "Elvis Presley", "3:36", "clasica"));
    this.listaReproduccionClasica.add(new Cancion("You're The One That I Want", "Grease", "3:16", "clasica"));
    this.listaReproduccionClasica.add(new Cancion("It's My Life", "Bon Jovi", "4:27", "clasica"));
  }

}