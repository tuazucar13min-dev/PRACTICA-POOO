/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.quick_sort;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author CIELO
 */
public class QUICK_SORT {
  
    public void mostrarProductosOrdenadosPorPrecio(){
    List<Integer> codigos = new ArrayList<>();
    
    //Recogera todos los códigos de productos de la clase ROPA
    for (Integer codigo: productosMap.KeySet()){
      if (codigo >= 1001 && codigo <= 1024)// CLASE ROPA 
      {{ codigos.add(codigo);
      }
      }
      
    List<Integer> codigosOrdenados = quickSortCodigosPorPrecio(codigos ); 
    System.out.println("================ ROPA ================");
        System.out.printf("%-8s %-25s %-20s %-15s %-10s%n", "CODIGO", "NOMBRE", "MARCA"," GÉNERO ", "PRECIO");

        for ( int codigo : codigoOrdenados ){
            String[]datos = productosMap.get(codigo);
            double precio = preciosMap.get(codigo);
            System.out.printf("%-8s %-25s %-20s %-15s s/ %.2f%n"),
            codigo, datos[0], datos[1], datos[2],precio );
        }
    }
    }

    private List<Integer>quickSortCodigosPorPrecio(List<Integer> codigos ){
    if (codigos.size()<= 1 ){
    return codigos;
    }
    // Elegir pivote
    int indicePivote = codigos.size()/2;
    int codigoPivote = codigos.get(indicePivote);
    double precioPivote= preciosMap.get(codigoPivote);
    
    // Creación de las listas L, E, G
    List<Integer> L = new ArrayList<>(); // Precios < Pivote
    List<Integer> E = new ArrayList<>(); // Precios = Pivote
    List<Integer> G = new ArrayList<>(); // Precios > Pivote
    
    // Distribución de elementos 
    for ( int  codigo : codigos ){
        double precio = preciosMap.get(codigo);
        if (precio < precioPivote){
            L.add(codigo);
        }
        else if (precio > precioPivote){
            G.add(codigo);
        }
        else {
            E.add(codigo);
        }
        
    }
    
    //Aplicar recursivamente 
    List<Integer> sortdL = quickSortCodigosPorPrecio(L);
    List<Integer> sortdG = quickSortCodigosPorPrecio(G);
            
    List<Integer> resultados = new ArrayList<>();
    resultados.addAll(sortedL);
    resultados.addAll(E);
    resultados.addAll(sortedG);
    
    return resultados;
    }
    
}
