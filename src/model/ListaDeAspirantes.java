/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JorgeLuis
 */
public class ListaDeAspirantes {
    private List<Aspirante> aspirantes;
    
    public ListaDeAspirantes() {
        aspirantes = new ArrayList<>();
    }
    
    public boolean add(Aspirante aspirante) {
        return aspirantes.add(aspirante);
    }
    
    public boolean remove(Aspirante aspirante) {
        return aspirantes.remove(aspirante);
    }
    
    public int size() {
        return aspirantes.size();
    }
    
    public boolean isEmpty() {
        return aspirantes.isEmpty();
    }
    
    public Aspirante get(int posicion) {
        return aspirantes.get(posicion);
    }
    
    public static void main(String[] args) {
        ListaDeAspirantes lista = new ListaDeAspirantes();
        lista.add(new Aspirante("Juanita"));
        lista.add(new Aspirante("Josefa"));
        lista.add(new Aspirante("Julio"));
        lista.add(new Aspirante("Jorge"));
        
        for (int i = 0; i < lista.size(); i++) {
            Aspirante aspirante = lista.get(i);
            System.out.println("Aspirante: " + aspirante.getNombre());
            System.out.println("Aceptado: " +
                    (aspirante.isAceptado() ? "Sí" : "No"));
        }
    }
}
