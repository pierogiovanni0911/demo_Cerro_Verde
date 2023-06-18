package com.saluddigital.cerroverde.model;

import java.util.Date;

// Clase padre
public abstract class Persona {
    
    private int idPersona;
    private String documento;
    private String tipoDoc;
    private String seguroSocial;
    private String primerNombre;
    private String segundoNombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String sexo;
    private String telefono;
    private String correoElectronico;
    private String direccion;
    private String departamento;
    private String provincia;
    private String distrito;
    private String nacionalidad;
    private String estadoCivil;
    private Date fechaNacimiento;

    public Persona(int idPersona, String documento, String tipoDoc, String seguroSocial, String primerNombre, String segundoNombre,
            String apellidoPaterno, String apellidoMaterno, String sexo, String telefono, String correoElectronico,
            String direccion, String departamento, String provincia, String distrito, String nacionalidad, String estadoCivil, 
            Date fechaNacimiento) {
        this.idPersona = idPersona;
        this.documento = documento;
        this.tipoDoc = tipoDoc;
        this.seguroSocial = seguroSocial;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.sexo = sexo;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.direccion = direccion;
        this.departamento = departamento;
        this.provincia = provincia;
        this.distrito = distrito;
        this.nacionalidad = nacionalidad;
        this.estadoCivil = estadoCivil;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(){
    }

    public int getIdPersona() {
        return idPersona;
    }
    public void setId(int idPersona) {
        this.idPersona = idPersona;
    }
    public String getDocumento() {
        return documento;
    }
    public void setDocumento(String documento) {
        this.documento = documento;
    }
    public String getTipoDoc() {
        return tipoDoc;
    }
    public void setTipoDoc(String tipoDoc) {
        this.tipoDoc = tipoDoc;
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
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    @Override
    public String toString() {
    return "Persona{" +
            "idPersona=" + idPersona +
            ", documento='" + documento + '\'' +
            ", tipoDoc='" + tipoDoc + '\'' +
            ", seguroSocial='" + seguroSocial + '\'' +
            ", primerNombre='" + primerNombre + '\'' +
            ", segundoNombre='" + segundoNombre + '\'' +
            ", apellidoPaterno='" + apellidoPaterno + '\'' +
            ", apellidoMaterno='" + apellidoMaterno + '\'' +
            ", sexo='" + sexo + '\'' +
            ", telefono='" + telefono + '\'' +
            ", correoElectronico='" + correoElectronico + '\'' +
            ", direccion='" + direccion + '\'' +
            ", departamento='" + departamento + '\'' +
            ", provincia='" + provincia + '\'' +
            ", distrito='" + distrito + '\'' +
            ", nacionalidad='" + nacionalidad + '\'' +
            ", estadoCivil='" + estadoCivil + '\'' +
            ", fechaNacimiento=" + fechaNacimiento +
            '}';
    }
}
