package ar.edu.unlu.poo.labo1.artefactos;

import java.util.*;

public class CatalogoArtefactos {
    Set<Artefacto> catalogo= new HashSet<>();

    public void agregarArtefacto(Artefacto artefacto){
        catalogo.add(artefacto);
    }

    public Set obtenerArtefactosUnicos(){
        return catalogo;
    }

    List buscarArtefactosPorTipo(String tipo){
        List<Artefacto> listaPorTipo = new ArrayList<>();
        for(Artefacto artefacto : catalogo){
            if(artefacto.getTipo().equals(tipo)){
                listaPorTipo.add(artefacto);
            }
        }
        // falta ordenar la lista

        return listaPorTipo;
    }

    Map<String, Integer> contarArtefactosPorTipo(){
        Map<String, Integer> artefactosPorTipo = new HashMap<>();
        Integer uno = 1;
        for(Artefacto artefacto : catalogo){
            String tipoActual = artefacto.getTipo();
            if(artefactosPorTipo.isEmpty() || !artefactosPorTipo.containsKey(tipoActual)){
                artefactosPorTipo.put(tipoActual, 1);
            }
            else if(artefactosPorTipo.containsKey(tipoActual)){
                int conteoActual = artefactosPorTipo.get(tipoActual);
                artefactosPorTipo.put(tipoActual, conteoActual + 1);
            }
        }
        return artefactosPorTipo;
    }

    Artefacto obtenerArtefactoMasPoderoso(){
        Artefacto masPoderoso = null;
        int maximoPoder = 0;
        for(Artefacto artefacto : catalogo){
            if(artefacto.getPoder() >= maximoPoder){
                masPoderoso = artefacto;
            }
        }
        return masPoderoso;
    }
}
