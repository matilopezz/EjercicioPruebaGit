
package interfacesej3;


public abstract class Animal implements Hablador {  /* Clase "Animal" que implementa la interfaz "Hablador"*/
    
    public abstract void hablarAbs(); /*Metodo abstracto "hablarAbs" indica que las instancias pueden hablar*/
    
    public void hablar(){       /*Las subclases concretas "Perro" y "Gato" implementan este metodo ya que son clases concretas*/
    hablarAbs();
}
}
