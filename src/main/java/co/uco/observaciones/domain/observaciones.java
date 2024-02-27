package co.uco.observaciones.domain;

import java.util.ArrayList;
import java.util.List;

public class observaciones {

    private long id;

    private List<recomendaciones> recomendacionesList = new ArrayList<>();

    private String descripcion;

    private String mejora;

    public observaciones (){
        this.id=1;
        this. recomendacionesList.add(new recomendaciones());
        this.descripcion= "vacio";
        this.mejora="vacio";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<recomendaciones> getRecomendacionesList(){
        return  recomendacionesList;
    }
    public void setRecomendacionesList(List<recomendaciones> recomendacionesList) {
        this.recomendacionesList = recomendacionesList;
    }

    public String getMejora() {
        return mejora;
    }

    public void setMejora(String mejora) {
        this.mejora = mejora;
    }
}
