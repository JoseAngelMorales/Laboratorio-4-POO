import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
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
                                    }
                                    case 2:{
                                        op2 = 0;
                                        op3 = 0;
                                    }
                                    case 3:{ //Todo esto podria ir en el metodo de cambiar volumen pero lo pongo aqui para tener algo de referencia
                                        System.out.println("Desea aumentar (0) o disminuir (1) el volumen");
                                        int op31 = 0;
                                        op31 = teclado.nextInt();
                                        teclado.nextLine();
                                        if(op31 == 0){
                                        //Radio.SetVolumen(getVolumen()+1)
                                            }
                                        if(op31 == 0){
                                            //Radio.SetVolumen(getVolumen()-1)
                                            }
                                    }
                                    case 4:{
                                        //Radio.FM/AM() (si el modulo no tiene if para ver si ya esta en am o fm ponerlo aca)
                                    }
                                    case 5:{ //Lo mismo que para el de volumen
                                        System.out.println("Desea aumentar (0) o disminuir (1) la emisora");
                                        int op32 = 0;
                                        op32 = teclado.nextInt();
                                        teclado.nextLine();
                                        if(op32 == 0){
                                        //Radio.SetVolumen(getVolumen()+1)
                                            }
                                        if(op32 == 0){
                                            //Radio.SetVolumen(getVolumen()-1)
                                            }
                                    }
                                    case 6:{
                                        //ArrayList<int>.append(getEmisora()) Agregar la emisora actual al array que hay que tener de emisoras
                                    }
                                    case 7:{
                                        System.out.println("Que emisora desea cargar: ");
                                        int emi = teclado.nextInt();
                                        //Radio.SetEmisora(emi)
                                    }
                                }
                            }
                        }
                        case 3:{
                            String menu4 = "\n--Modo Telefono--\nElija una de las opciones\n1. Apagar radio\n2. Cambiar modo\n3. Cambiar volumen\n4. Mostrar contactos\n5. Llamar contacto\n6. Llamar ultimo contacto";
                            System.out.println(menu4);
                            int op4 = teclado.nextInt();
                            teclado.nextLine();
                            while(op4 < 6 && op4 >= 1){
                                switch(op4){
                                    case 1:{
                                        op1 = 0;
                                        op2 = 0;
                                        op4 = 0;
                                    }
                                    case 2:{
                                        op2 = 0;
                                        op4 = 0;
                                    } 
                                    case 3:{//Todo esto podria ir en el metodo de cambiar volumen pero lo pongo aqui para tener algo de referencia
                                        System.out.println("Desea aumentar (0) o disminuir (1) el volumen");
                                        int op41 = 0;
                                        op41 = teclado.nextInt();
                                        teclado.nextLine();
                                        if(op41 == 0){
                                            //Radio.SetVolumen(getVolumen()+1)
                                        }
                                        if(op41 == 0){
                                            //Radio.SetVolumen(getVolumen()-1)
                                        }
                                    }
                                    case 4:{
                                        //for Contactos contacto | ArrayList<Contactos>
                                            //print contacto 
                                    }
                                    case 5:{
                                        System.out.println("Numero del contacto que desea llamar: ");
                                        int numero = teclado.nextInt();
                                        teclado.nextLine();
                                        String ultimonom;
                                        int ulimonum;
                                        //for Contactos contacto | ArrayList<Contactos>
                                            //if numero == contacto.getNumero();
                                                //ultimonom = contacto.getNombre();
                                                //ultimonum = contacto.getNumero();
                                                //Esto de ultimonom y num creo que no funciona pero al menos para tener una base
                                                //System.out.println(Llamando a contacto.getNombre()...);
                                                int resp = 0;
                                                while(resp != 1){
                                                    System.out.println("Presione 1 para finalizar la llamada");
                                                    resp = teclado.nextInt();
                                                    teclado.nextLine();
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
                            }
                        }
                    }
                }
            }
        } 
    }
}