import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class JuegoClueTerminal {
    private static HashMap<Integer, String> HMasesino = new HashMap<>();
    private static HashMap<Integer, String> HMarma = new HashMap<>();
    private static HashMap<Integer, String> HMlugar = new HashMap<>();
    private static HashMap<String, String> amelia = new HashMap<>();
    private static HashMap<String, String> victor = new HashMap<>();
    private static HashMap<String, String> daniel = new HashMap<>();
    private static HashMap<String, String> henry = new HashMap<>();
    private static HashMap<String, String> olive = new HashMap<>();

    static respuesta respuestaCorrecta = new respuesta();
    static respuesta solucion = new respuesta();
    static Random rand = new Random();
    static int numeroAleatorio = rand.nextInt(5) + 1;

    public static void main(String[] args) {
        agregarPersonajes();
        generarHistoria();

        jugar();
    }

    public static void agregarPersonajes(){
        // ------------------ HashMap Asesino ------------------
        HMasesino.put(1, "Dr. Daniel Plum");
        HMasesino.put(2, "Srta. Amelia Scarlet");
        HMasesino.put(3, "Cnel. Henry Mustard");
        HMasesino.put(4, "Prof. Olive Green");
        HMasesino.put(5, "Sr. Victor White");

        // ------------------ HashMap Arma ------------------
        HMarma.put(1, "Candelabro");
        HMarma.put(2, "Cuchillo");
        HMarma.put(3, "Cuerda");
        HMarma.put(4, "Revolver");
        HMarma.put(5, "Veneno");

        // ------------------ HashMap Lugar ------------------
        HMlugar.put(1, "Salon Principal");
        HMlugar.put(2, "Comedor");
        HMlugar.put(3, "Invernadero");
        HMlugar.put(4, "Biblioteca");
        HMlugar.put(5, "Vestibulo");
    }

    public static void mapAmelia(){
        // ------------- Sospechosos -------------
        amelia.put("Dr. Daniel Plum", "Alega que estaba en el invernadero, ocupado cuidando sus plantas y preparando sus próximos experimentos.");
        amelia.put("Srta. Amelia Scarlet", "Sostiene que cenó en el comedor con el grupo y luego se retiró a su habitación para practicar su próximo monólogo teatral.");
        amelia.put("Cnel. Henry Mustard", "Explica que después de la cena, se retiró al salón principal para disfrutar de un buen libro y un vaso de whisky escocés.");
        amelia.put("Prof. Olive Green", "Afirma que se encontraba en la biblioteca, investigando sobre plantas exóticas y tomando notas detalladas.");
        amelia.put("Sr. Victor White", "Dice que se dirigió al vestíbulo para hacer una llamada de negocios importante después de la cena.");
        // ------------- Arma -------------
        amelia.put("Candelabro", "Se encontró huellas dactilares en el candelabro, pero la perilla de la vela está limpia y sin huellas.");
        amelia.put("Cuchillo", "El cuchillo tiene manchas de sangre en la hoja y se encontró en el comedor.");
        amelia.put("Cuerda", "La cuerda está deshilachada en uno de los extremos y presenta rastros de tierra del jardín del invernadero.");
        amelia.put("Revolver", "El revólver fue encontrado en la biblioteca.");
        amelia.put("Veneno", "Se encontró una botella de veneno en el invernadero, con un poco de líquido faltante.");
        // ------------- Lugares -------------
        amelia.put("Salon Principal", "Se encontraron huellas de zapatos en el suelo, pero no se hallaron objetos inusuales en la habitación.");
        amelia.put("Comedor", "Se encontró un mantel manchado con una mancha de vino y un cuchillo de cocina ensangrentado.");
        amelia.put("Bibliotecas", "Se halló una copa de brandy vacía en la biblioteca junto con una nota misteriosa.");
        amelia.put("Invernadero", "Se descubrió tierra en el suelo y en la mesa de trabajo, además de la botella de veneno.");
        amelia.put("Vestibulo", "No se encontraron pruebas significativas en el vestíbulo, pero se halló una ventana abierta.");
    }

    public static void mapVictor(){
        // ------------- Sospechosos -------------
        victor.put("Dr. Daniel Plum", "Alega que estaba en la biblioteca, estudiando un libro de biología durante el momento del asesinato.");
        victor.put("Srta. Amelia Scarlet", "Sostiene que cenó en el comedor con el grupo y luego se retiró a su habitación para practicar su próximo monólogo teatral.");
        victor.put("Cnel. Henry Mustard", "Explica que después de la cena, se retiró al salón principal para disfrutar de un buen libro y un vaso de whisky escocés.");
        victor.put("Prof. Olive Green", "Afirma que se encontraba en la biblioteca, investigando sobre plantas exóticas y tomando notas detalladas.");
        victor.put("Sr. Victor White", "Alega que después de la cena, estuvo en el comedor para disfrutar de un coñac. Luego, se retiró al vestíbulo para hacer una llamada de negocios importante.");
        // ------------- Arma -------------
        victor.put("Candelabro", "No se encontraron pruebas significativas relacionadas con el candelabro.");
        victor.put("Cuchillo", "El cuchillo de cocina está limpio y sin manchas de sangre.");
        victor.put("Cuerda", "La cuerda no tiene signos de haber sido utilizada en el crimen.");
        victor.put("Revolver", "No se encontró un revólver en ninguna de las habitaciones.");
        victor.put("Veneno", "La botella de veneno ha sido manipulada.");
        // ------------- Lugares -------------
        victor.put("Salon Principal", "No se encontraron pruebas significativas en el salón principal.");
        victor.put("Bibliotecas", "No se encontraron pruebas significativas en la biblioteca.");
        victor.put("Comedor", "No se encontraron pruebas significativas en el comedor.");
        victor.put("Vestibulo", "No se encontraron pruebas significativas en el vestíbulo.");
        victor.put("Invernadero", "El invernadero es donde ocurrió el asesinato, pero no se encontraron pistas adicionales.");
    }

    public static void mapDaniel(){
        // ------------- Sospechosos -------------
        daniel.put("Dr. Daniel Plum", "Afirma que cenó en el comedor con el grupo y luego se retiró al vestíbulo para preparar una presentación de su último experimento científico. Sin embargo, no puede proporcionar una coartada precisa para el momento del asesinato.");
        daniel.put("Srta. Amelia Scarlet", "Sostiene que estuvo en el invernadero, cuidando de sus plantas y relajándose después de la cena.");
        daniel.put("Cnel. Henry Mustard", "Explica que después de la cena, se retiró al salón principal para disfrutar de un buen libro y un vaso de whisky escocés.");
        daniel.put("Prof. Olive Green", "Afirma que se encontraba en la biblioteca, investigando sobre plantas exóticas y tomando notas detalladas.");
        daniel.put("Sr. Victor White", "Alega que después de la cena, se retiró a su habitación para revisar algunos documentos de negocios y preparar una propuesta.");
        // ------------- Arma -------------
        daniel.put("Candelabro", "El candelabro presenta manchas de sangre y huellas dactilares.");
        daniel.put("Cuchillo", "El cuchillo de cocina está limpio y sin manchas de sangre.");
        daniel.put("Cuerda", "La cuerda no tiene signos de haber sido utilizada en el crimen.");
        daniel.put("Revolver", "El revólver fue encontrado en la biblioteca.");
        daniel.put("Veneno", "La botella de veneno no ha sido manipulada.");
        // ------------- Lugares -------------
        daniel.put("Salon Principal", "En el salón principal se encontraron pruebas que indican que fue el lugar del asesinato, incluyendo el candelabro manchado de sangre y huellas dactilares.");
        daniel.put("Bibliotecas", "No se encontraron pruebas significativas en la biblioteca.");
        daniel.put("Comedor", "No se encontraron pruebas significativas en el comedor.");
        daniel.put("Vestibulo", "No se encontraron pruebas significativas en el vestíbulo.");
        daniel.put("Invernadero", "Se descubrió tierra en el suelo y en la mesa de trabajo, además de la botella de veneno.");
    }

    public static void mapHenry(){
        // ------------- Sospechosos -------------
        henry.put("Dr. Daniel Plum", "Alega que estaba en el comedor durante la cena, después se retiró a su habitación para revisar sus investigaciones científicas.");
        henry.put("Srta. Amelia Scarlet", "Sostiene que cenó en el comedor y luego pasó tiempo en la biblioteca ensayando su próximo papel.");
        henry.put("Cnel. Henry Mustard", " Explica que después de la cena, se retiró al salón principal para disfrutar de un libro y una copa de whisky escocés. Sin embargo, no puede proporcionar una coartada precisa para el momento del asesinato.");
        henry.put("Prof. Olive Green", "Afirma que estaba en el invernadero cuidando de sus plantas durante la cena.");
        henry.put("Sr. Victor White", "Alega que estuvo en el vestíbulo para hacer una llamada de negocios importante después de la cena.");
        // ------------- Arma -------------
        henry.put("Candelabro", "Se encontró huellas dactilares en el candelabro, pero la perilla de la vela está limpia y sin huellas.");
        henry.put("Cuchillo", "El cuchillo de cocina está limpio y sin manchas de sangre.");
        henry.put("Cuerda", "La cuerda muestra signos de haber sido usada en el crimen y está deshilachada en uno de los extremos.");
        henry.put("Revolver", "El revólver fue encontrado en la biblioteca.");
        henry.put("Veneno", "La botella de veneno no ha sido manipulada.");
        // ------------- Lugares -------------
        henry.put("Salon Principal", "En el salón principal se encontraron pruebas que indican que fue el lugar del asesinato, incluyendo el candelabro manchado de sangre y huellas dactilares.");
        henry.put("Bibliotecas", "No se encontraron pruebas significativas en la biblioteca.");
        henry.put("Invernadero", "El invernadero es donde ocurrió el asesinato. Es un espacio lleno de plantas exóticas y mesas de trabajo con herramientas para el cuidado de las plantas.");
        henry.put("Comedor", "No se encontraron pruebas significativas en el comedor.");
        henry.put("Vestibulo", "No se encontraron pruebas significativas en el vestíbulo.");
    }

    public static void mapOlive(){
        // ------------- Sospechosos -------------
        olive.put("Dr. Daniel Plum", " Alega que estaba en el comedor durante la cena, después se retiró a su habitación para revisar sus investigaciones científicas.");
        olive.put("Srta. Amelia Scarlet", "Sostiene que cenó en el comedor y luego pasó tiempo en la biblioteca ensayando su próximo papel.");
        olive.put("Cnel. Henry Mustard", "Explica que después de la cena, se retiró al salón principal para disfrutar de un libro y una copa de whisky escocés.");
        olive.put("Prof. Olive Green", " Afirma que cenó en el comedor y luego se retiró a su habitación para preparar su clase del día siguiente. Sin embargo, no puede proporcionar una coartada precisa para el momento del asesinato.");
        olive.put("Sr. Victor White", "Alega que estuvo en el invernadero cuidando de sus plantas durante la cena.");
        // ------------- Arma -------------
        olive.put("Candelabro", "No se encontraron pruebas significativas relacionadas con el candelabro.");
        olive.put("Cuchillo", "El cuchillo de cocina está limpio y sin manchas de sangre.");
        olive.put("Cuerda", "La cuerda no tiene signos de haber sido utilizada en el crimen.");
        olive.put("Revolver", "El revólver se encontró en el vestíbulo con una bala disparada y huellas dactilares de la Profesora Olive Green.");
        olive.put("Veneno", "La botella de veneno no ha sido manipulada.");
        // ------------- Lugares -------------
        olive.put("Salon Principal", "No se encontraron pruebas significativas en el salón principal.");
        olive.put("Bibliotecas", "No se encontraron pruebas significativas en la biblioteca.");
        olive.put("Comedor", "No se encontraron pruebas significativas en el comedor.");
        olive.put("Vestibulo", "En el vestíbulo se encontraron pruebas que indican que fue el lugar del asesinato, incluyendo el revólver con una bala disparada.");
        olive.put("Invernadero", "No se encontraron pruebas significativas en el invernadero.");
    }

    public static void generarHistoria(){
        respuestaCorrecta.setAsesino(HMasesino.get(numeroAleatorio));
        respuestaCorrecta.setArma(HMarma.get(numeroAleatorio));
        respuestaCorrecta.setLugar(HMlugar.get(numeroAleatorio));
    }

    public static void jugar(){
        mapAmelia();
        mapVictor();
        mapDaniel();
        mapHenry();
        mapOlive();
        Scanner scanner = new Scanner(System.in);
        String jugar, respuesta, sospechoso, arma, lugar;
        String numero;
        do{
            System.out.println("Bienvenido a Asesinato en el Expreso Oriente.");
            System.out.println("En este juego, interpretaras al renombrado detective belga Hercules Poirot.\n" +
                    "Para jugar tendras que preguntar a los testigos, y revisar su coartada con la evidencia que hay \nde las armas y los lugares. OJO: Solo tienes 7 oportunidades para hacer alguna pregunta, despues de eso tendras que resolver el caso.\n" +
                    "Si estas listo, escribe: \"Si\"");
            System.out.print("Respuesta: ");
            jugar = scanner.nextLine();
            switch (numeroAleatorio){
                case 1:
                    for(int i = 0; i < 7; i++){
                        System.out.println("Que quiere revisar, detective: (Escribe la opcion)");
                        System.out.println("1. Sospechosos\t2. Armas\t3. Lugares");
                        System.out.print("Respuesta: ");
                        respuesta = scanner.nextLine();
                        if(respuesta.equalsIgnoreCase("sospechosos")){
                            System.out.println("\nA quien le quieres preguntar? (Escribe el numero por favor)");
                            System.out.println("1. Dr. Daniel Plum\t 2. Srta. Amelia Scarlet\t 3. Cnel. Henry Mustard\t 4. Prof. Olive Green\t 5. Sr. Victor White");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(daniel.get("Dr. Daniel Plum"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(daniel.get("Srta. Amelia Scarlet"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(daniel.get("Cnel. Henry Mustard"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(daniel.get("Prof. Olive Green"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(daniel.get("Sr. Victor White"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        } else if(respuesta.equalsIgnoreCase("armas")){
                            System.out.println("\nQue arma quieres revisar? (Escribe el numero por favor)");
                            System.out.println("1. Candelabro\t 2. Cuchillo\t 3. Cuerda\t 4. Revolver\t 5. Veneno");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(daniel.get("Candelabro"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(daniel.get("Cuchillo"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(daniel.get("Cuerda"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(daniel.get("Revolver"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(daniel.get("Veneno"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        } else if(respuesta.equalsIgnoreCase("lugares")){
                            System.out.println("\nQue lugar quieres ver? (Escribe el numero por favor)");
                            System.out.println("1. Salon Principal\t 2. Biblioteca\t 3. Invernadero\t 4. Comedor\t 5. Vestibulo");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(daniel.get("Salon Principal"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(daniel.get("Biblioteca"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(daniel.get("Invernadero"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(daniel.get("Comedor"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(daniel.get("Vestibulo"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        }
                    }
                    System.out.println("\nHora de resolver el caso, detective (Escribe el nombre o palabra)");
                    System.out.println("\nAsesino: 1. Dr. Daniel Plum\t 2. Srta. Amelia Scarlet\t 3. Cnel. Henry Mustard\t 4. Prof. Olive Green\t 5. Sr. Victor White");
                    sospechoso = scanner.nextLine();
                    System.out.println("\nArma: 1. Candelabro\t 2. Cuchillo\t 3. Cuerda\t 4. Revolver\t 5. Veneno");
                    arma = scanner.nextLine();
                    System.out.println("\nLugar: 1. Salon Principal\t 2. Biblioteca\t 3. Invernadero\t 4. Comedor\t 5. Vestibulo");
                    lugar = scanner.nextLine();
                    solucion.setAsesino(sospechoso);
                    solucion.setArma(arma);
                    solucion.setLugar(lugar);
                    System.out.println(solucion.getAsesino());
                    System.out.println("\n" + respuestaCorrecta.getAsesino());
                    if(solucion.getAsesino().equals(respuestaCorrecta.getAsesino())){
                        if(solucion.getArma().equals(respuestaCorrecta.getArma())){
                            if(solucion.getLugar().equals(respuestaCorrecta.getLugar())){
                                System.out.println("\nFelicidades Detective, lo ha hecho de nuevo!!!");
                            }
                        }
                    } else{
                        System.out.println("\nDetective, temo decirle que todos murieron a falta de su destreza.");
                    }
                    break;
                case 2:
                    for(int i = 0; i < 7; i++){
                        System.out.println("Que quiere revisar, detective: (Escribe la opcion)");
                        System.out.println("1. Sospechosos\t2. Armas\t3. Lugares");
                        System.out.print("Respuesta: ");
                        respuesta = scanner.nextLine();
                        if(respuesta.equalsIgnoreCase("sospechosos")){
                            System.out.println("\nA quien le quieres preguntar? (Escribe el numero por favor)");
                            System.out.println("1. Dr. Daniel Plum\t 2. Srta. Amelia Scarlet\t 3. Cnel. Henry Mustard\t 4. Prof. Olive Green\t 5. Sr. Victor White");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(amelia.get("Dr. Daniel Plum"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(amelia.get("Srta. Amelia Scarlet"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(amelia.get("Cnel. Henry Mustard"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(amelia.get("Prof. Olive Green"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(amelia.get("Sr. Victor White"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        } else if(respuesta.equalsIgnoreCase("armas")){
                            System.out.println("\nQue arma quieres revisar? (Escribe el numero por favor)");
                            System.out.println("1. Candelabro\t 2. Cuchillo\t 3. Cuerda\t 4. Revolver\t 5. Veneno");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(amelia.get("Candelabro"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(amelia.get("Cuchillo"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(amelia.get("Cuerda"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(amelia.get("Revolver"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(amelia.get("Veneno"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        } else if(respuesta.equalsIgnoreCase("lugares")){
                            System.out.println("\nQue lugar quieres ver? (Escribe el numero por favor)");
                            System.out.println("1. Salon Principal\t 2. Biblioteca\t 3. Invernadero\t 4. Comedor\t 5. Vestibulo");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(amelia.get("Salon Principal"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(amelia.get("Biblioteca"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(amelia.get("Invernadero"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(amelia.get("Comedor"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(amelia.get("Vestibulo"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        }
                    }
                    System.out.println("\nHora de resolver el caso, detective (Escribe el nombre o palabra)");
                    System.out.println("\nAsesino: 1. Dr. Daniel Plum\t 2. Srta. Amelia Scarlet\t 3. Cnel. Henry Mustard\t 4. Prof. Olive Green\t 5. Sr. Victor White");
                    sospechoso = scanner.nextLine();
                    System.out.println("\nArma: 1. Candelabro\t 2. Cuchillo\t 3. Cuerda\t 4. Revolver\t 5. Veneno");
                    arma = scanner.nextLine();
                    System.out.println("\nLugar: 1. Salon Principal\t 2. Biblioteca\t 3. Invernadero\t 4. Comedor\t 5. Vestibulo");
                    lugar = scanner.nextLine();
                    solucion.setAsesino(sospechoso);
                    solucion.setArma(arma);
                    solucion.setLugar(lugar);
                    System.out.println(solucion.getAsesino());
                    System.out.println("\n" + respuestaCorrecta.getAsesino());
                    if(solucion.getAsesino().equals(respuestaCorrecta.getAsesino())){
                        if(solucion.getArma().equals(respuestaCorrecta.getArma())){
                            if(solucion.getLugar().equals(respuestaCorrecta.getLugar())){
                                System.out.println("\nFelicidades Detective, lo ha hecho de nuevo!!!");
                            }
                        }
                    } else{
                        System.out.println("\nDetective, temo decirle que todos murieron a falta de su destreza.");
                    }
                    break;
                case 3:
                    for(int i = 0; i < 7; i++){
                        System.out.println("Que quiere revisar, detective: (Escribe la opcion)");
                        System.out.println("1. Sospechosos\t2. Armas\t3. Lugares");
                        System.out.print("Respuesta: ");
                        respuesta = scanner.nextLine();
                        if(respuesta.equalsIgnoreCase("sospechosos")){
                            System.out.println("\nA quien le quieres preguntar? (Escribe el numero por favor)");
                            System.out.println("1. Dr. Daniel Plum\t 2. Srta. Amelia Scarlet\t 3. Cnel. Henry Mustard\t 4. Prof. Olive Green\t 5. Sr. Victor White");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(henry.get("Dr. Daniel Plum"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(henry.get("Srta. Amelia Scarlet"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(henry.get("Cnel. Henry Mustard"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(henry.get("Prof. Olive Green"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(henry.get("Sr. Victor White"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        } else if(respuesta.equalsIgnoreCase("armas")){
                            System.out.println("\nQue arma quieres revisar? (Escribe el numero por favor)");
                            System.out.println("1. Candelabro\t 2. Cuchillo\t 3. Cuerda\t 4. Revolver\t 5. Veneno");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(henry.get("Candelabro"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(henry.get("Cuchillo"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(henry.get("Cuerda"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(henry.get("Revolver"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(henry.get("Veneno"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        } else if(respuesta.equalsIgnoreCase("lugares")){
                            System.out.println("\nQue lugar quieres ver? (Escribe el numero por favor)");
                            System.out.println("1. Salon Principal\t 2. Biblioteca\t 3. Invernadero\t 4. Comedor\t 5. Vestibulo");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(henry.get("Salon Principal"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(henry.get("Biblioteca"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(henry.get("Invernadero"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(henry.get("Comedor"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(henry.get("Vestibulo"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        }
                    }
                    System.out.println("\nHora de resolver el caso, detective (Escribe el nombre o palabra)");
                    System.out.println("\nAsesino: 1. Dr. Daniel Plum\t 2. Srta. Amelia Scarlet\t 3. Cnel. Henry Mustard\t 4. Prof. Olive Green\t 5. Sr. Victor White");
                    sospechoso = scanner.nextLine();
                    System.out.println("\nArma: 1. Candelabro\t 2. Cuchillo\t 3. Cuerda\t 4. Revolver\t 5. Veneno");
                    arma = scanner.nextLine();
                    System.out.println("\nLugar: 1. Salon Principal\t 2. Biblioteca\t 3. Invernadero\t 4. Comedor\t 5. Vestibulo");
                    lugar = scanner.nextLine();
                    solucion.setAsesino(sospechoso);
                    solucion.setArma(arma);
                    solucion.setLugar(lugar);
                    System.out.println(solucion.getAsesino());
                    System.out.println("\n" + respuestaCorrecta.getAsesino());
                    if(solucion.getAsesino().equals(respuestaCorrecta.getAsesino())){
                        if(solucion.getArma().equals(respuestaCorrecta.getArma())){
                            if(solucion.getLugar().equals(respuestaCorrecta.getLugar())){
                                System.out.println("\nFelicidades Detective, lo ha hecho de nuevo!!!");
                            }
                        }
                    } else{
                        System.out.println("\nDetective, temo decirle que todos murieron a falta de su destreza.");
                    }
                    break;
                case 4:
                    for(int i = 0; i < 7; i++){
                        System.out.println("Que quiere revisar, detective: (Escribe la opcion)");
                        System.out.println("1. Sospechosos\t2. Armas\t3. Lugares");
                        System.out.print("Respuesta: ");
                        respuesta = scanner.nextLine();
                        if(respuesta.equalsIgnoreCase("sospechosos")){
                            System.out.println("\nA quien le quieres preguntar? (Escribe el numero por favor)");
                            System.out.println("1. Dr. Daniel Plum\t 2. Srta. Amelia Scarlet\t 3. Cnel. Henry Mustard\t 4. Prof. Olive Green\t 5. Sr. Victor White");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(olive.get("Dr. Daniel Plum"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(olive.get("Srta. Amelia Scarlet"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(olive.get("Cnel. Henry Mustard"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(olive.get("Prof. Olive Green"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(olive.get("Sr. Victor White"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        } else if(respuesta.equalsIgnoreCase("armas")){
                            System.out.println("\nQue arma quieres revisar? (Escribe el numero por favor)");
                            System.out.println("1. Candelabro\t 2. Cuchillo\t 3. Cuerda\t 4. Revolver\t 5. Veneno");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(olive.get("Candelabro"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(olive.get("Cuchillo"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(olive.get("Cuerda"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(olive.get("Revolver"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(olive.get("Veneno"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        } else if(respuesta.equalsIgnoreCase("lugares")){
                            System.out.println("\nQue lugar quieres ver? (Escribe el numero por favor)");
                            System.out.println("1. Salon Principal\t 2. Biblioteca\t 3. Invernadero\t 4. Comedor\t 5. Vestibulo");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(olive.get("Salon Principal"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(olive.get("Biblioteca"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(olive.get("Invernadero"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(olive.get("Comedor"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(olive.get("Vestibulo"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        }
                    }
                    System.out.println("\nHora de resolver el caso, detective (Escribe el nombre o palabra)");
                    System.out.println("\nAsesino: 1. Dr. Daniel Plum\t 2. Srta. Amelia Scarlet\t 3. Cnel. Henry Mustard\t 4. Prof. Olive Green\t 5. Sr. Victor White");
                    sospechoso = scanner.nextLine();
                    System.out.println("\nArma: 1. Candelabro\t 2. Cuchillo\t 3. Cuerda\t 4. Revolver\t 5. Veneno");
                    arma = scanner.nextLine();
                    System.out.println("\nLugar: 1. Salon Principal\t 2. Biblioteca\t 3. Invernadero\t 4. Comedor\t 5. Vestibulo");
                    lugar = scanner.nextLine();
                    solucion.setAsesino(sospechoso);
                    solucion.setArma(arma);
                    solucion.setLugar(lugar);
                    System.out.println(solucion.getAsesino());
                    System.out.println("\n" + respuestaCorrecta.getAsesino());
                    if(solucion.getAsesino().equals(respuestaCorrecta.getAsesino())){
                        if(solucion.getArma().equals(respuestaCorrecta.getArma())){
                            if(solucion.getLugar().equals(respuestaCorrecta.getLugar())){
                                System.out.println("\nFelicidades Detective, lo ha hecho de nuevo!!!");
                            }
                        }
                    } else{
                        System.out.println("\nDetective, temo decirle que todos murieron a falta de su destreza.");
                    }
                    break;
                case 5:
                    for(int i = 0; i < 7; i++){
                        System.out.println("Que quiere revisar, detective: (Escribe la opcion)");
                        System.out.println("1. Sospechosos\t2. Armas\t3. Lugares");
                        System.out.print("Respuesta: ");
                        respuesta = scanner.nextLine();
                        if(respuesta.equalsIgnoreCase("sospechosos")){
                            System.out.println("\nA quien le quieres preguntar? (Escribe el numero por favor)");
                            System.out.println("1. Dr. Daniel Plum\t 2. Srta. Amelia Scarlet\t 3. Cnel. Henry Mustard\t 4. Prof. Olive Green\t 5. Sr. Victor White");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(victor.get("Dr. Daniel Plum"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(victor.get("Srta. Amelia Scarlet"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(victor.get("Cnel. Henry Mustard"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(victor.get("Prof. Olive Green"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(victor.get("Sr. Victor White"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        } else if(respuesta.equalsIgnoreCase("armas")){
                            System.out.println("\nQue arma quieres revisar? (Escribe el numero por favor)");
                            System.out.println("1. Candelabro\t 2. Cuchillo\t 3. Cuerda\t 4. Revolver\t 5. Veneno");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(victor.get("Candelabro"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(victor.get("Cuchillo"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(victor.get("Cuerda"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(victor.get("Revolver"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(victor.get("Veneno"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        } else if(respuesta.equalsIgnoreCase("lugares")){
                            System.out.println("\nQue lugar quieres ver? (Escribe el numero por favor)");
                            System.out.println("1. Salon Principal\t 2. Biblioteca\t 3. Invernadero\t 4. Comedor\t 5. Vestibulo");
                            System.out.print("Respuesta: ");
                            numero = scanner.nextLine();
                            switch (numero){
                                case "1":
                                    System.out.println();
                                    System.out.println(victor.get("Salon Principal"));
                                    break;
                                case "2":
                                    System.out.println();
                                    System.out.println(victor.get("Biblioteca"));
                                    break;
                                case "3":
                                    System.out.println();
                                    System.out.println(victor.get("Invernadero"));
                                    break;
                                case "4":
                                    System.out.println();
                                    System.out.println(victor.get("Comedor"));
                                    break;
                                case "5":
                                    System.out.println();
                                    System.out.println(victor.get("Vestibulo"));
                                    break;
                                default:
                                    System.out.println();
                                    System.out.println("Asegurate de escribir un numero del 1 - 5.");
                                    numero = scanner.nextLine();
                                    break;
                            }
                        }
                    }
                    System.out.println("\nHora de resolver el caso, detective (Escribe el nombre o palabra)");
                    System.out.println("\nAsesino: 1. Dr. Daniel Plum\t 2. Srta. Amelia Scarlet\t 3. Cnel. Henry Mustard\t 4. Prof. Olive Green\t 5. Sr. Victor White");
                    sospechoso = scanner.nextLine();
                    System.out.println("\nArma: 1. Candelabro\t 2. Cuchillo\t 3. Cuerda\t 4. Revolver\t 5. Veneno");
                    arma = scanner.nextLine();
                    System.out.println("\nLugar: 1. Salon Principal\t 2. Biblioteca\t 3. Invernadero\t 4. Comedor\t 5. Vestibulo");
                    lugar = scanner.nextLine();
                    solucion.setAsesino(sospechoso);
                    solucion.setArma(arma);
                    solucion.setLugar(lugar);
                    System.out.println(solucion.getAsesino());
                    System.out.println("\n" + respuestaCorrecta.getAsesino());
                    if(solucion.getAsesino().equals(respuestaCorrecta.getAsesino())){
                        if(solucion.getArma().equals(respuestaCorrecta.getArma())){
                            if(solucion.getLugar().equals(respuestaCorrecta.getLugar())){
                                System.out.println("\nFelicidades Detective, lo ha hecho de nuevo!!!");
                            }
                        }
                    } else{
                        System.out.println("\nDetective, temo decirle que todos murieron a falta de su destreza.");
                    }
                    break;
            }
            System.out.println("\nQuieres volver a jugar?");
            jugar = scanner.nextLine();
        }while(jugar.equalsIgnoreCase("si"));
    }
}
