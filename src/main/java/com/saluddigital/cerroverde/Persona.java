package com.saluddigital.cerroverde;

import java.time.LocalDate;

public abstract class Persona {
    
    private int id;
    private String documento;
    private String seguroSocial;
    private String primerNombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String sexo;
    private String telefono;
    private String correoElectronico;
    private String direccion;
    private String nacionalidad;
    private String estadoCivil;
    private LocalDate fechaNacimiento;

    public Persona() {
    }    

    public Persona(int id, String documento, String seguroSocial, String primerNombre, String segundoNombre,
            String apellidoPaterno, String apellidoMaterno, String sexo, String telefono, String correoElectronico,
            String direccion, String nacionalidad, String estadoCivil, LocalDate fechaNacimiento) {
        this.id = id;
        this.documento = documento;
        this.seguroSocial = seguroSocial;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.sexo = sexo;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getSeguroSocial() {
        return seguroSocial;
    }
    public void setSeguroSocial(String seguroSocial) {
        this.seguroSocial = seguroSocial;
    }
    public String getPrimerNombre() {
        return primerNombre;
    }
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public String getSegundoNombre() {
        return segundoNombre;
    }
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    public String getApellidoPaterno() {
        return apellidoPaterno;
    }
    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }
    public String getApellidoMaterno() {
        return apellidoMaterno;
    }
    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getCorreoElectronico() {
        return correoElectronico;
    }
    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }
    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularEdad() {
        LocalDate ahora = LocalDate.now();
        int edad = ahora.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.plusYears(edad).isAfter(ahora)) {
            edad--;
        }
        return edad;
    }
    
    @Override
    public String toString() {
    return "Persona{" +
            "id=" + id +
            ", documento='" + documento + '\'' +
            ", seguroSocial='" + seguroSocial + '\'' +
            ", primerNombre='" + primerNombre + '\'' +
            ", segundoNombre='" + segundoNombre + '\'' +
            ", apellidoPaterno='" + apellidoPaterno + '\'' +
            ", apellidoMaterno='" + apellidoMaterno + '\'' +
            ", sexo='" + sexo + '\'' +
            ", telefono='" + telefono + '\'' +
            ", correoElectronico='" + correoElectronico + '\'' +
            ", direccion='" + direccion + '\'' +
            ", nacionalidad='" + nacionalidad + '\'' +
            ", estadoCivil='" + estadoCivil + '\'' +
            ", fechaNacimiento=" + fechaNacimiento +
            '}';
    }
}
