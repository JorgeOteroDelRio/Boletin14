
package boletin14;

public class Aplicacion {

    public static void main(String[] args) {
        try{
            System.out.println("La temperatura en grados farenheit es= " + ConversorTemperaturas.centigradosAFharenheit(80)+"ºF");
        }catch(TemperaturaErradaExcepcion e){
            System.out.println(e.getMessage());
        }
        ConversorTemperaturas.centigradosAReamur(78);
        ConversorTemperaturas.centigradosAReamurObligatorio(68);
    }
    
}
