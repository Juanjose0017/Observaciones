package co.uco.observaciones.domain;

public class bitacoras {

    private long id;

    private usuarios usuario;

    private String fecha;

    private descripciones descripcion;

    private revisiones revisiones;

    private estados estados;

    private bitacoras(usuarios usuario, descripciones descripcion) {
        this.id = 1;
        this.usuario = usuario;
        this.fecha = "01/02/2001";
        this.descripcion = descripcion;
        this.revisiones = new revisiones();
        this.estados = new estados();
    }

    public bitacoras(){

    }
    public bitacoras (long id, usuarios usuario, String fecha, descripciones descripcion,revisiones revisiones,estados estados){
        this.id = id;
        this.usuario = usuario;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.revisiones = revisiones;
        this.estados = estados;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public usuarios getUsuario() {
        return usuario;
    }

    public void setUsuario(usuarios usuarioID) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public descripciones getDescription() {
        return descripcion;
    }

    public void setDescripcion(long descriptionID) {
        this.descripcion = descripcion;
    }

    public revisiones getRevision() {
        return revisiones;
    }

    public void setRevision(revisiones revisionesID) {
        this.revisiones = revisiones;
    }

    public estados getEstado() {
        return estados;
    }

    public void setEstado(estados estados) {
        this.estados = estados;
    }
}


