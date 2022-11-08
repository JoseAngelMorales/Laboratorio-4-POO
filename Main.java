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
                String menu2 = "\nElija una de las opciones\n1. Apagar radio\n2. Modo radio\n3. Modo telefono\n4. Modo reproduccion\n5. Modo producitvidad";
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
                                }
                            }
                        }
                    }
                }
            }
        }
    } 
}
