
package interfacesej3;

public class InterfacesEj3 {

   
    public static void main(String[] args) {
       Gato gato = new Gato();
       Perro perro = new Perro();                   /* Creacion de las instancias*/
       TalkAdmin relojcucu = new TalkAdmin();
       
       metodoHablar(gato);
       metodoHablar(perro);     
       metodoHablar(relojcucu);
    }
    
    public static void metodoHablar (Hablador habla){
        habla.hablar();          /* Metodo para hacer hablar a los animales, por parametro
                                    pasamos el tipo de dato Hablador (interfaz) */
    }
    
}
