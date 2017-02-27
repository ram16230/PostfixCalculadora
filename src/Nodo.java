/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author OscarIvan
 */
public class Nodo <T>{
    protected T  Valor; 
    protected Nodo Siguiente; 
    
    public Nodo(T valor)
    {
        this.Valor = valor;
    }
    
    public void setValor(T valor)
    {
        this.Valor = valor;
    }
    
    public T getValor()
    {
        return this.Valor;
    } 
    
    public void setSiguiente(Nodo siguiente)
    {
        this.Siguiente = siguiente;
    }
    
    public Nodo getSiguiente()
    {
        return this.Siguiente;
    }
    
    
            
}
