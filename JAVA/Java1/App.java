package JAVA.Java1;
public class App {
    public static void main(String[] args) {
    //A partir del anterior video proporcionado, resuelve 👇
//Declara una variable por cada uno de los siguientes tipos de dato, asignando un valor (nombre y valor
// de tu preferencia):
//boolean --char-- String-- Int-- long-- float

    boolean elTriunfo = true;
    char primeraVocal = 'D';
    String segundoNombre = "Diego";
    int miEdad= 27;
    long premioLoteria = 1500000;
    float valorPI = 3.14F;
 //Imprimir en consola el contenido de al menos tres de las variables que declaraste en el paso anterior.
    System.out.println("¿San miguel ganara, los desfiles? "  + elTriunfo );
    System.out.println("Primera letra de mi nombre es, " + primeraVocal);
    System.out.println("Mi segundo nombre es, " + segundoNombre);

// Declara una nueva variable para almacenar tu edad y otra para almacenar tu nombre e imprimir en
//pantalla un texto que diga “Mi nombre es [nombre], y tengo [edad] años”.
    System.out.println("Mi nombre es " + segundoNombre + " y tengo "  + miEdad + " años");

//Actividad: Seleccionando el Tipo de Dato Adecuado en Java

//Datos:
//1. La temperatura media de una ciudad durante el verano (en grados Celsius).
//2. El precio de un producto en una tienda (en dólares y centavos).
//3. El nombre completo de una persona.
//4. La fecha de nacimiento de una persona.
//5. El número de habitantes de una ciudad.
//6. La duración de una película (en minutos).
//7. Si un artículo está disponible o no en una tienda (true/false).
//8. La distancia entre dos ciudades (en kilómetros).
//9. El número de teléfono de una persona.
//10.La cantidad de existencias de un producto en una tienda.

    double temperaturaPiura= 32.5;
    double precio = 20.5;
    String miNombre = " Diego";
    LocalDate fechaNacimiento = LocalDate.of(1997, 06, 15);
    long habitantesPiura= 1000000;
    short duraciónPelicula= 120;
    boolean tienenChimpunes = true;
    double distanciaPiuraPaita = 141;
    String numeroLaboral= "+51 974941265";
    int cantidadFrutas= 29;

    //Justificacion:
// 1. double. Permite decimales y cubre un alto rango de valores para representar la temperatura.
// 2. double. Permite decimales, cubre un rango de valores precisos para representar el dinero.
// 3. String. Porque permite incluir, caracteres, valor alfanumericos.
// 4. LocalDate permite incluir datos precisos de año,mes y dia.
// 5. long permite incluir datos muy grandes de 64 bits.
// 6. short permite incluir numeros enteros 16 bits.
// 7. double cubre rango de 64 bits, incluye fracciones y permite representar distancias precisas en KM.
// 8. String permite incluir caracteres, valores alfanumericos, preciso para un numero telefonico.
// 9. int permite incluir numeros enteros 32 bits

// ACTIVIDAD COMPLEMENTARIA
// * Declara una variable llamada mensajeBienvenida y asigna como valor "Bienvenido a Java". Asegúrate de
// de elegir el tipo de variable más apropiado para almacenar un mensaje de texto.
// * Declara una variable llamada temperatura Actual y asigna como valor "19". Slecciona el tipo de
//variable que permita representar la temperatura de manera precisa.
// * Declara una variable llamada datoLogico y asigna como valor "true". Elige el tipo de variable
// adecuado para almacenar valores logicos.


String laBienvenida= " Bienvenido a este mundo de Java";
double temperaturaActual =  19;
boolean  datoLogico = true;
System.out.println( laBienvenida + "; la temperatura en la ciudad de Piura es de 19°, "
 + "y seguira asi todo el año " + datoLogico );
    }
}