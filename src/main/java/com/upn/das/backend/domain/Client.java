package com.upn.das.backend.domain;


import jakarta.persistence.*;


@Entity

public class Client {


  @Id

  @GeneratedValue(strategy = GenerationType.IDENTITY)

  private Long id;
  private String nombre;
  private String apellido;
  private String correo;
  private String area;


  // Getters y Setters

  public Long getId() { return id; }


  public String getNombre() { return nombre; }

  public void setNombre(String nombre) { this.nombre = nombre; }


  public String getApellido() { return apellido; }

  public void setApellido(String apellido) { this.apellido = apellido; }


  public String getCorreo() { return correo; }

  public void setCorreo(String correo) { this.correo = correo; }


  public String getArea() { return area; }

  public void setArea(String area) { this.area = area; }

}

