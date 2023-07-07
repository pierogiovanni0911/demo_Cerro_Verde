package com.saluddigital.cerroverde.model;

public class HistorialMedico {
    private int idHistoria;
    private String antecedentesMedicos;
    private Receta receta;
    private String diagnostico;
    private String tratamiento;

    public HistorialMedico(int idHistoria, String antecedentesMedicos, Receta receta, String diagnostico, String tratamiento) {
        this.idHistoria = idHistoria;
        this.antecedentesMedicos = antecedentesMedicos;
        this.receta = receta;
        this.diagnostico = diagnostico;
        this.tratamiento = tratamiento;
    }

    public int getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    public String getAntecedentesMedicos() {
        return antecedentesMedicos;
    }

    public void setAntecedentesMedicos(String antecedentesMedicos) {
        this.antecedentesMedicos = antecedentesMedicos;
    }

    public Receta getReceta() {
        return receta;
    }

    public void setReceta(Receta receta) {
        this.receta = receta;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }
    
    @Override
    public String toString(){
        return "HistorialMedico{" +
            "idHistoria=" + idHistoria +
            ", antecedentesMedicos='" + antecedentesMedicos + '\'' +
            ", receta='" + receta.toString() + '\'' +
            ", diagnostico='" + diagnostico + '\'' +
            ", tratamiento='" + tratamiento + '\'' +
            '}';
    }
}
