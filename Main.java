import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Radio miRadio = new Radio();
        Cancion musica = new Cancion();
        Contacto contactos = new Contacto();
        Scanner teclado = new Scanner(System.in);
        int indiceCancion = 0;

        musica.llenarListaReproduccionClasica();
        musica.llenarListaReproduccionPop();
        musica.llenarListaReproduccionRock();
        contactos.llenarListaContactos();

        String menu1 = "\nBienvenido encienda la radio para acceder a las demas opciones\n1. Encender radio ";
        int op1 = 0;
        while(op1 != 1){
            System.out.println(menu1);
            op1 = teclado.nextInt();
            teclado.nextLine();
            while(op1 == 1){
                String menu2 = "\nElija una de las opciones\n1. Apagar radio\n2. Modo radio\n3. Modo telefono\n4. Modo reproduccion\n5. Modo productividad";
                System.out.println(menu2);
                int op2 = teclado.nextInt();
                teclado.nextLine();
                while(op2 < 6 && op2 >= 1){
                    switch(op2){
                        case 1:{
                            op1 = 0;
                            op2 = 0;
                            break;
                        }
                        case 2:{
                            String menu3 = "\n--Modo Radio--\nElija una de las opciones\n1. Apagar radio\n2. Cambiar modo\n3. Cambiar volumen\n4. Cambiar FM/AM\n5. Cambiar emisora\n6. Guardar emisora\n7. Cargar emisora";
                            System.out.println(menu3);
                            int op3 = teclado.nextInt();
                            teclado.nextLine();
                            while(op3 < 8 && op3 >= 1){
                                switch(op3){
                                    case 1:{
                                        op1 = 0;
                                        op2 = 0;
                                        op3 = 0;
                                        break;
                                    }
                                    case 2:{
                                        op2 = 0;
                                        op3 = 0;
                                        break;
                                    }
                                    case 3:{
                                        System.out.println("Desea aumentar (0) o disminuir (1) el volumen");
                                        int op31 = 0;
                                        op31 = teclado.nextInt();
                                        teclado.nextLine();
                                        System.out.println(miRadio.cambiarVolumen(op31));
                                        break;
                                    }
                                    case 4:{
                                        System.out.println(miRadio.cambiarFmAm());
                                        break;
                                    }
                                    case 5:{
                                        System.out.println("Desea aumentar (+) o disminuir (-) la emisora");
                                        String op32 = "";
                                        op32 = teclado.next();
                                        teclado.nextLine();
                                        miRadio.cambiarEmisora(op32);
                                        break;
                                    }
                                    case 6:{
                                        ArrayList<Double> emisoras = miRadio.getListaEmisoras();
                                        double emisora = miRadio.getEmisora();
                                        emisoras.add(emisora);
                                        miRadio.setListaEmisoras(emisoras);
                                        break;
                                    }
                                    case 7:{
                                        System.out.println("Que emisora desea cargar: ");
                                        double emi = teclado.nextDouble();
                                        teclado.nextLine();
                                        miRadio.SetEmisora(emi);
                                        break;
                                    }
                                }
                                op3 = 0;
                            }
                            break;
                        }
                        case 3:{
                            String menu4 = "\n--Modo Telefono--\nElija una de las opciones\n1. Apagar radio\n2. Cambiar modo\n3. Cambiar volumen\n4. Mostrar contactos\n5. Llamar contacto\n6. Llamar ultimo contacto";
                            System.out.println(menu4);
                            int op4 = teclado.nextInt();
                            teclado.nextLine();
                            while(op4 < 7 && op4 >= 1){
                                switch(op4){
                                    case 1:{
                                        op1 = 0;
                                        op2 = 0;
                                        op4 = 0;
                                        break;
                                    }
                                    case 2:{
                                        op2 = 0;
                                        op4 = 0;
                                        break;
                                    } 
                                    case 3:{
                                        System.out.println("Desea aumentar (0) o disminuir (1) el volumen");
                                        int op41 = 0;
                                        op41 = teclado.nextInt();
                                        teclado.nextLine();
                                        System.out.println(miRadio.cambiarVolumen(op41));
                                        break;
                                    }
                                    case 4:{
                                        System.out.println(contactos.obtenerListaContactos());
                                        break;
                                    }
                                    case 5:{
                                        System.out.println("Numero del contacto que desea llamar: ");
                                        String numero = teclado.nextLine();
                                        String ultimonom;
                                        String ultimonum;
                                        for(Contacto contacto : contactos.obtenerListaContactos()){
                                            if(numero.equals(contacto.getNumero()) == true){
                                                ultimonom = contacto.getNombre();
                                                ultimonum = contacto.getNumero();
                                                System.out.println("Llamando a contacto.getNombre()...");    
                                            }
                                                int resp = 0;
                                                while(resp != 1){
                                                    System.out.println("Presione 1 para finalizar la llamada");
                                                    resp = teclado.nextInt();
                                                    teclado.nextLine();
                                                }
                                            }
                                    }
                                    case 6:{
                                       //System.out.println(Llamando a ) + ultimonom;
                                        int resp = 0;
                                        while(resp != 1){
                                            System.out.println("Presione 1 para finalizar la llamada");
                                            resp = teclado.nextInt();
                                            teclado.nextLine();  
                                        }
                                    }
                                }
                                op4 = 0;
                            }
                            break;
                        }
                        case 4:{
                            String menu5 = "\n--Modo Reproduccion--\nElija una de las opciones\n1. Apagar radio\n2. Cambiar modo\n3. Elegir lista de reproduccion\n4. Cambiar cancion\n5. Escuchar cancion";
                            System.out.println(menu5);
                            int op5 = teclado.nextInt();
                            teclado.nextLine(); 
                            while(op5 < 6 && op5>=1){
                                switch(op5){
                                    case 1:{
                                        op1 = 0;
                                        op2 = 0;
                                        op5 = 0;
                                        break;
                                    }
                                    case 2:{
                                        op2 = 0;
                                        op5 = 0;
                                        break;
                                    }
                                    case 3:{
                                        System.out.println("Elija una lista de reproducción\n1. Música Rock\n2. Música Pop\n3. Música Clásica");
                                        int listaRep = 0;
                                        listaRep = teclado.nextInt();
                                        teclado.nextLine();
                                        switch(listaRep) {
                                            case 1: {
                                                System.out.println("\n Actualmente lista de reproducción Rock \n La canción actual en reproducción es \n");
                                                ArrayList<Cancion> cancionActual = musica.obtenerListaReproduccionRock();
                                                musica.asignarCancionActual(cancionActual.get(indiceCancion));
                                                System.out.println(musica.getDatosCancion());
                                                break;
                                            }
                                            case 2: {
                                                System.out.println("\n Actualmente lista de reproducción Pop \n La canción actual en reproducción es \n");
                                                ArrayList<Cancion> cancionActual = musica.obtenerListaReproduccionPop();
                                                musica.asignarCancionActual(cancionActual.get(indiceCancion));
                                                System.out.println(musica.getDatosCancion());
                                                break;
                                            }
                                            case 3: {
                                                System.out.println("\n Actualmente lista de reproducción Clásica \n La canción actual en reproducción es \n");
                                                ArrayList<Cancion> cancionActual = musica.obtenerListaReproduccionClasica();
                                                musica.asignarCancionActual(cancionActual.get(indiceCancion));
                                                System.out.println(musica.getDatosCancion());
                                                break;
                                            }
                                        }
                                    }
                                    case 4:{
                                        System.out.println("Desea avanzar (0) o retroceder (1) la cancion: ");
                                        int canc = teclado.nextInt();
                                        String listaActual = musica.getListaActual();
                                        if(canc == 0){
                                            indiceCancion+=1;
                                            if(listaActual.equals("Rock")) {
                                                ArrayList<Cancion> cancionActual = musica.obtenerListaReproduccionRock();
                                                musica.asignarCancionActual(cancionActual.get(indiceCancion));
                                                System.out.println(musica.getDatosCancion());
                                            }
                                            if(listaActual.equals("Pop")) {
                                                ArrayList<Cancion> cancionActual = musica.obtenerListaReproduccionPop();
                                                musica.asignarCancionActual(cancionActual.get(indiceCancion));
                                                System.out.println(musica.getDatosCancion());
                                            }
                                            if(listaActual.equals("Clasica")) {
                                                ArrayList<Cancion> cancionActual = musica.obtenerListaReproduccionClasica();
                                                musica.asignarCancionActual(cancionActual.get(indiceCancion));
                                                System.out.println(musica.getDatosCancion());
                                            }
                                        }
                                        if(canc == 1){
                                            indiceCancion-=1;
                                            if(listaActual.equals("Rock")) {
                                                ArrayList<Cancion> cancionActual = musica.obtenerListaReproduccionRock();
                                                musica.asignarCancionActual(cancionActual.get(indiceCancion));
                                                System.out.println(musica.getDatosCancion());
                                            }
                                            if(listaActual.equals("Pop")) {
                                                ArrayList<Cancion> cancionActual = musica.obtenerListaReproduccionPop();
                                                musica.asignarCancionActual(cancionActual.get(indiceCancion));
                                                System.out.println(musica.getDatosCancion());
                                            }
                                            if(listaActual.equals("Clasica")) {
                                                ArrayList<Cancion> cancionActual = musica.obtenerListaReproduccionClasica();
                                                musica.asignarCancionActual(cancionActual.get(indiceCancion));
                                                System.out.println(musica.getDatosCancion());
                                            }
                                        }
                                        break;
                                    }
                                    case 5:{
                                        System.out.println("Escuchando: ");
                                        //System.out.print(playlistactual.pos[numcancion])
                                        break;
                                    }
                                }
                                
                                op5 = 0;
                            }
                            break;
                        }
                        case 5:{
                            String menu6 = "\n--Modo Productividad--\nElija una de las opciones\n1. Apagar radio\n2. Cambiar modo\n3. Elegir lista de reproduccion\n4. Cambiar cancion\n5. Escuchar cancion";
                            System.out.println(menu6);
                            int op6 = teclado.nextInt();
                            teclado.nextLine();
                            while(op6==1){
                                switch(op6){
                                    case 1:{
                                        System.out.println(contactos.obtenerListaContactos());
                                        break;
                                    }
                                }
                                op6 = 0;
                            }
                            break;
                        }
                    }
                }
            }
        } 
    }
}