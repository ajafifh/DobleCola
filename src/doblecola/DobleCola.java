/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doblecola;

/**
 *
 * @author Alberto Jafif
 * @author Abraham Attie
 */
public class DobleCola <T> extends ColaA<T>{

    public DobleCola(){
        super();
    }
    
    public DobleCola(int max) {
        super(max);
    }

    /*Método para insertar al principio con floorMod*/
    public void insertarAlPrincipio(T dato){
        if((fin+1)%cola.length == inicio)
            super.expande();
        inicio=Math.floorMod(Math.abs(inicio)-1, cola.length);
        cola[inicio]=dato;
        if(fin == -1)
            fin=0;
    }
    
    /*Método para eliminar el elemento
    que está al final de la cola
    */
    public T eliminaAlFinal(){
        if(isEmpty())
            throw new EmptyCollectionException("Pila Vacía");
        T resultado;
        resultado = cola[fin];
        cola[fin] = null;
        if(inicio == fin){
            inicio = -1;
            fin = -1;
        }
        else{
            fin=Math.floorMod(Math.abs(fin)-1, cola.length);
        }
        return resultado;
    }
    
    /*Método para consultar el elemento al 
    final de la cola
    */
    public T consultaFinal(){
        if(isEmpty())
             throw new EmptyCollectionException("Pila Vacía");
        return cola[fin];
    }
    
    /*Método para imprimir las DobleCola para probar
    soluciones durante la elaboración de la clase
    */
    public String toString(){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<cola.length; i++){
            sb.append(cola[i]+", ");
        }
        return sb.toString();
    }
    
    /*Aparte de éste main, ver las pruebas
    realizadas con JUnit.
    */
    public static void main(String[] args) {
       DobleCola<Integer> cola;
       cola=new DobleCola(5);
       cola.insertar(1);
       cola.insertar(2);
       cola.insertar(3);
       cola.insertar(4);
       cola.insertar(5);
       System.out.println("Floor Mod");
       System.out.println(Math.floorMod(Math.abs(5)-1, 20));
       System.out.println(Math.floorMod(Math.abs(-1)-1, 20));
       System.out.println(Math.floorMod(Math.abs(0)-1, 20));
       System.out.println("Pruebas cola");
       System.out.println(cola.eliminaAlFinal());
       System.out.println(cola.eliminar());
       cola.insertar(6);
       cola.insertarAlPrincipio(7);
       cola.insertarAlPrincipio(8);
       cola.insertarAlPrincipio(9);
       System.out.println(cola.toString());
       System.out.println(cola.consultaPrimero());
       System.out.println(cola.consultaFinal());
    }
    
}
