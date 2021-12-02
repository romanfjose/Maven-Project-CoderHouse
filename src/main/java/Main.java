import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
public class Main {

	public static void main(String[] args) {
		
		 //Agregamos la fecha del inicio
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println("Inicio de ejecución de programa " + dtf.format(LocalDateTime.now()));

        //Agregamos un scanner para preguntar el codigo al usuario
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese el codigo del pais a buscar");
        int buscado = scan.nextInt();

        //Creamos los objetos que van a ir en la lista
        
        //Pais ahora es una dependencia
        Pais Argentina = new Pais(1, "Argentina", 54);
        Pais Peru = new Pais(2, "Peru", 51);
        Pais Chile = new Pais(3, "Chile", 52);
        Pais Mexico = new Pais(4, "Mexico", 52);
        Pais Brasil = new Pais(5, "Brasil", 55);
        Pais Colombia = new Pais(6, "Colombia", 57);
        Pais Venezuela = new Pais(7, "Venezuela", 58);
        Pais Ecuador = new Pais(8, "Ecuador", 593);
        Pais Uruguay = new Pais(9, "Uruguay", 598);
        Pais Paraguay = new Pais(10, "Paraguay", 595);
        Pais Bolivia = new Pais(11, "Bolivia", 591);          
        
        //Creamos el array y agregamos los objetos
        List<Pais> list = new ArrayList<Pais>();
        list.add(Argentina);
        list.add(Peru);
        list.add(Chile);
        list.add(Mexico);
        list.add(Brasil);
        list.add(Colombia);
        list.add(Venezuela);
        list.add(Ecuador);
        list.add(Uruguay);
        list.add(Paraguay);
        list.add(Bolivia);
        
        //Filtramos la lista con el codigo del usuario
        
        List<Pais> result = list.stream()
                .filter(a -> Objects.equals(a.codigo, buscado))
                .collect(Collectors.toList());        
        

        
        try {
            System.out.println("El codigo de area corresponde al pais: " + result.get(0).nombre);
        } catch (Exception e) {
            System.out.println("No se encontro el País");
            Mensaje mensaje = new Mensaje();
            //Ahora se guarda un log cuando el programa no lo encuentra y tira un error.
            mensaje.getLogError("Error en el programa paises = new Paises();ma");  
        }
        
        //Damos la fecha de finalización del programa
        System.out.println("Fin de Ejecución de programa " + dtf.format(LocalDateTime.now()));
	        
     
        
        
          
        
	}

}