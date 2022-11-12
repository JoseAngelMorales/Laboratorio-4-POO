import java.util.ArrayList;

public class Radio implements Acciones {

    private String frecuencia;
    private int volumen;
    private double emisora;
    private ArrayList<Double> listaemisora;
  
    Radio(String frecuencia) {
      this.frecuencia = frecuencia;
    }
  
    Radio() {
      this.frecuencia = "FM";
      this.volumen = 0;
      this.emisora = 0;
    }
  
    public void setFrecuencia(String frecuencia) {
      this.frecuencia = frecuencia;
    }
  
    public String getFrecuencia() {
      return this.frecuencia;
    }

    public void setVolumen(int volumen){
        this.volumen = volumen;
    }

    public int getVolumen(){
        return this.volumen;
    }

    public void SetEmisora(double emisora){
        this.emisora = emisora;
    }

    public double getEmisora(){
        return this.emisora;
    }

    public void setListaEmisoras(ArrayList<Double> listaemisora){
        this.listaemisora = listaemisora;
    }

    public ArrayList<Double> getListaEmisoras(){
        return this.listaemisora;
    }

    public String cambiarVolumen(int opcion) {
      String resultado = "";
      if(opcion == 0){
        if(this.getVolumen()==100){
          resultado = "No se puede subir mas el volumen esta en 100.";
        }
        else{
            this.setVolumen(this.getVolumen()+1);
          resultado = "Se aumento el volumen en 1.";
        }
      }
      if(opcion == 1){
        if(this.getVolumen()==0){
          resultado = "No se puede bajar mas el volumen esta en 0.";
        }
        else{
          this.setVolumen(this.getVolumen()-1);
          resultado = "Se disminuyo el volumen en 1.";
        }
      }
      return resultado;
    }

    //Modo radio
    public String cambiarFmAm() {
      if(this.frecuencia.equals("FM")) {
        setFrecuencia("AM");
      } else if (this.frecuencia.equals("AM")){
        setFrecuencia("FM");
      }
      return "La frecuencia ahora cambió a " + this.getFrecuencia();
    }
    public String cambiarEmisora(String operador) {
        String texto = "";
        if(operador.equalsIgnoreCase("+")){
            this.SetEmisora(this.getEmisora() + 0.5);
            texto = "Se aumento la emisora 0.5";
        }
        else if(operador.equalsIgnoreCase("-")){
          this.SetEmisora(this.getEmisora() - 0.5);
          texto = "Se disminuyó la emisora 0.5";
        }
        return texto + this.getEmisora() + " " + getFrecuencia();
    }
    public String guardarEmisora(String emisora) {
      return "";
    }
    public String cargarEmisora(int emisora) {
      return "";
    }
    public String seleccionarLista() {
      return "";
    }
    public String cambiarCancion(int direccion) {
      return "";
    }
    public String escucharCancion(int i) {
      return "";
    }
    
    //------------------------------------------------------------------------------------------------------------------------------------------------
    //Modo telefono
  
    public boolean conectarDesconectar() {
      return true;
    }
    public String contactos() {
      return "";
    }
    public String llamar(int contacto) {
      return "";
    }
    public String finalizarLlamada() {
      return "";
    }
    public String llamarUltimoContacto() {
      return "";
    }
    
    //------------------------------------------------------------------------------------------------------------------------------------------------
    //Modo productividad
    
    public String verTarjetasPresentacion() {
      return "";
    }
  }