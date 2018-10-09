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
 **/
public interface ColaADT <T>{
    /*Funcionalidad ColaA*/
    public void insertar(T dato);
    public T eliminar();
    public boolean isEmpty();
    public T consultaPrimero();
    /*Funcionalidad DobleCola*/
    public void insertarAlPrincipio(T dato);
    public T consultaFinal();
    public T eliminaAlFinal();
}
