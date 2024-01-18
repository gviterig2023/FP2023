import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) throws Exception {        
        //Encontrar el número secreto de una persona en base a su fecha de nacimiento.
        //Se debe sumar el día, el mes y el año de la fecha, y el resultado tiene que ser sumado sus dígitos que lo componen.
		//Ejemplo: 30-11-2000 
		//La suma sería: 2041
		//El número secreto será: 7
		//Para dividir usamos el "/"
		//Para obtener el residuo de una división se usa "%"
        int dia, mes, anio, total;
        int n1, n2, n3, n4, num_secreto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite día: ");
        dia = sc.nextInt();
        System.out.println("Digite mes: ");
        mes = sc.nextInt();
        System.out.println("Digite año: ");
        anio = sc.nextInt();
        total = dia+mes+anio;

        // Descomponer los valores
        n1 = total/1000;
        n2 = (total/100)%10;
        n3 = (total/10)%10;
        n4 = total%10;
        num_secreto = n1+n2+n3+n4;
        System.out.println("El número secreto es: "+ num_secreto);
        sc.close();
    }
}
