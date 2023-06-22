package com.saluddigital.cerroverde.model;

import java.util.Date;

// Clase padre
public abstract class Persona {
    
    private String documento;
    private String nombre;
    private String apellido;
    private String seguroSocial;
    private String sexo;
    private String telefono;
    private String correoElectronico;
    private String direccion;
    private String departamento;
    private String provincia;
    private String distrito;
    private String estadoCivil;
    private Date fechaNacimiento;

    public Persona(String documento, String nombre, String apellido, String seguroSocial, String sexo,
            String telefono, String correoElectronico, String direccion, String departamento, String provincia,
            String distrito, String estadoCivil, Date fechaNacimiento) {
        this.documento = documento;
        this.nombre = nombre;
        this.apellido = apellido;
        this.seguroSocial = seguroSocial;
        this.sexo = sexo;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(){
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
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getProvincia() {
        return provincia;
    }
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }
    public String getDistrito() {
        return distrito;
    }
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public String toString() {
    return "Persona{" +
            "documento='" + documento + '\'' +
            ", nombre='" + nombre + '\'' +
            ", apellido='" + apellido + '\'' +
            ", seguroSocial='" + seguroSocial + '\'' +
            ", sexo='" + sexo + '\'' +
            ", telefono='" + telefono + '\'' +
            ", correoElectronico='" + correoElectronico + '\'' +
            ", direccion='" + direccion + '\'' +
            ", departamento='" + departamento + '\'' +
            ", provincia='" + provincia + '\'' +
            ", distrito='" + distrito + '\'' +
            ", estadoCivil='" + estadoCivil + '\'' +
            ", fechaNacimiento=" + fechaNacimiento +
            '}';
    }
}
