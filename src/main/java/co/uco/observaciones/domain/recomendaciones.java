package co.uco.observaciones.domain;

public class recomendaciones {

    private long id;

    private String recomendacion;

    public recomendaciones(){
        this.id=1;
        this.recomendacion = "ninguna recomendacion aun";
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(String recomendacion) {
        this.recomendacion = recomendacion;
    }
}
