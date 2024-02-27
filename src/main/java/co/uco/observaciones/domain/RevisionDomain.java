package co.uco.observaciones.domain;

import java.time.LocalDateTime;

public class RevisionDomain {
    private String id;
    private String observacionId;
    private LocalDateTime fecha = LocalDateTime.now();
    private String equipoId;

    //Constructor, Getters y Setters

    public RevisionDomain(String id, String observacionId, LocalDateTime fecha, String equipoId) {
        this.id = id;
        this.observacionId = observacionId;
        this.fecha = fecha;
        this.equipoId = equipoId;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setObservacionId(String observacionId) {
        this.observacionId = observacionId;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setEquipoId(String equipoId) {
        this.equipoId = equipoId;
    }

    public String getId() {
        return id;
    }

    public String getObservacionId() {
        return observacionId;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getEquipoId() {
        return equipoId;
    }
}


