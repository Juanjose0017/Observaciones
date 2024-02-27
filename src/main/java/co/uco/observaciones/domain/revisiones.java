package co.uco.observaciones.domain;

public class revisiones {
    private long id;

    private observaciones observacion;

    private String fecha;

    private equipos equipos;

    public revisiones(){
        this.id=1;
        this. fecha ="01/01/2020";
        this.observacion = new observaciones();
        this.equipos = new equipos();

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public observaciones getObservacion (){
        return observacion;
        public void setObservacion(observaciones observacion) {
            this.observacion = observacion;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }

        public equipos getEquipo() {
            return equipos;
        }

        public void setEquipo(equipos equipos) {
            this.equipos = equipos;
        }
    }