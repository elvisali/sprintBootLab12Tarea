package com.miempresa.DTO;

import javax.validation.constraints.Digits;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

public class formularioDTO {
	
	@NotBlank(message ="Campo Obligatorio")
	private String	tipo_documento ;
	@NotBlank(message ="Campo Obligatorio")
	private String	documento ; 
	@NotBlank(message ="Campo Obligatorio")
	private String	nombre ;
	@NotBlank(message ="Campo Obligatorio")
	private String	paterno ;
	@NotBlank(message ="Campo Obligatorio")
	private String	materno ;
	@NotBlank(message ="Campo Obligatorio")
	private String	fecha_nacimiento ; 
	private String	sexo ;
	private OpEstadoCivil[]	estado_civil ;
	private OpSituacionLaboral[]	situacion_laboral ; 
	@NotBlank(message ="Campo Obligatorio")
	@Range(min=11 , max=11, message="Debe tener 11 digitos")
	@Digits(integer=1, fraction=0, message="Debe tener solo numeros")
	private String	ruc_empl ;
	
	public formularioDTO() {}
 
	
 



	public formularioDTO(@NotBlank(message = "Campo Obligatorio") String tipo_documento,
			@NotBlank(message = "Campo Obligatorio") String documento,
			@NotBlank(message = "Campo Obligatorio") String nombre,
			@NotBlank(message = "Campo Obligatorio") String paterno,
			@NotBlank(message = "Campo Obligatorio") String materno,
			@NotBlank(message = "Campo Obligatorio") String fecha_nacimiento, String sexo, OpEstadoCivil[] estado_civil,
			OpSituacionLaboral[] situacion_laboral, @NotBlank(message = "Campo Obligatorio") String ruc_empl) {
		super();
		this.tipo_documento = tipo_documento;
		this.documento = documento;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
		this.fecha_nacimiento = fecha_nacimiento;
		this.sexo = sexo;
		this.estado_civil = estado_civil;
		this.situacion_laboral = situacion_laboral;
		this.ruc_empl = ruc_empl;
	}






	public String getTipo_documento() {
		return tipo_documento;
	}
	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	public String getDocumento() {
		return documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	} 

	public String getSexo() {
		return sexo;
	}
 

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}






	public OpEstadoCivil[] getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(OpEstadoCivil[] estado_civil) {
		this.estado_civil = estado_civil;
	}

	public OpSituacionLaboral[] getSituacion_laboral() {
		return situacion_laboral;
	}

	public void setSituacion_laboral(OpSituacionLaboral[] situacion_laboral) {
		this.situacion_laboral = situacion_laboral;
	} 
	public String getRuc_empl() {
		return ruc_empl;
	} 
	public void setRuc_empl(String ruc_empl) {
		this.ruc_empl = ruc_empl;
	}

 
	
 
	

}
