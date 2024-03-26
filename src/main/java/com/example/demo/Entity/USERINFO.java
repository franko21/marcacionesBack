package com.example.demo.Entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity

@Table(name = "USERINFO")
public class USERINFO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long userid;
	
	private String badgenumber;
	private Long accgroup;
	private String ssn;
	private String name;
	private String gender;
	private String title;
	private String pager;
	private String men_usu;
	private Date birthday;
	
	private String street;
	private String city;
	private String state;
	private String zip;
	private String ophone;
	private String fphone;
	
	private int defaultdeptid;
	private int att;
    private int inlate;
	private int outearly;
	private int overtime;
	private int sep;
	private int holiday;
	private String minzu;
	private String password;
	private int lunchduration;
	private byte[] photo;
	private byte[] notes;
	private Long privilege;
	private int inheritdeptsch;
	private int inheritdeptschclass;
	private int autoschplan;
	private Long minautoschinterval;
	private int registerot;
	private int inheritdeptrule;
	private int emprivilege;
	private String cardno;
	private String otadmin;
	private String otpass;
	private String otprivadmin;
	private Long pin1;
	private String opcionempleado;
	private String sirhapass;
	private String email;
	private Long checkonline;
	private Long checkemail;
	private String genero;
	private String estadocivil;
	private String lugartrabajo;
	private String cargo;
	private String tipocontrato;
	private Date fecharenuncia;
	private int discapacidad;
	private int cargasfamiliares;
	private String tiposangre;
	private String telcasa;
	private String telcel;
	private String nombrecontacto;
	private String telcontacto;
	private String observacion;
	private byte[] firma;
	private Long checkorder;
	private String tvacacion;


	private String svacacion;
	private String adicional;
	private String empresa;
	private String area;
	private String division;
	private String subdivision;
	private String unidad;
	private String lineasupervision;
	private String horarioasignado;
	private Long facegroup;
	
	private Long useaccgrouptz;
	private Long verifycode;
	private Long expires;
	private Long validcount;
	private Date validtimebegin;
	private Date validtimeend;
	private Long timezone1;
	private Long timezone2;
	private Long timezone3;
	private Date fecharegistro;
	private Date hiredday;
	
	
	
	public Date getHiredday() {
		return hiredday;
	}
	public void setHiredday(Date hiredday) {
		this.hiredday = hiredday;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getOphone() {
		return ophone;
	}
	public void setOphone(String ophone) {
		this.ophone = ophone;
	}
	public String getFphone() {
		return fphone;
	}
	public void setFphone(String fphone) {
		this.fphone = fphone;
	}
	public int getDefaultdeptid() {
		return defaultdeptid;
	}
	public void setDefaultdeptid(int defaultdeptid) {
		this.defaultdeptid = defaultdeptid;
	}
	public int getAtt() {
		return att;
	}
	public void setAtt(int att) {
		this.att = att;
	}
	public int getInlate() {
		return inlate;
	}
	public void setInlate(int inlate) {
		this.inlate = inlate;
	}
	public int getOutearly() {
		return outearly;
	}
	public void setOutearly(int outearly) {
		this.outearly = outearly;
	}
	public int getOvertime() {
		return overtime;
	}
	public void setOvertime(int overtime) {
		this.overtime = overtime;
	}
	public int getSep() {
		return sep;
	}
	public void setSep(int sep) {
		this.sep = sep;
	}
	public int getHoliday() {
		return holiday;
	}
	public void setHoliday(int holiday) {
		this.holiday = holiday;
	}
	public String getMinzu() {
		return minzu;
	}
	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getLunchduration() {
		return lunchduration;
	}
	public void setLunchduration(int lunchduration) {
		this.lunchduration = lunchduration;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public byte[] getNotes() {
		return notes;
	}
	public void setNotes(byte[] notes) {
		this.notes = notes;
	}
	public Long getPrivilege() {
		return privilege;
	}
	public void setPrivilege(Long privilege) {
		this.privilege = privilege;
	}
	public int getInheritdeptsch() {
		return inheritdeptsch;
	}
	public void setInheritdeptsch(int inheritdeptsch) {
		this.inheritdeptsch = inheritdeptsch;
	}
	public int getInheritdeptschclass() {
		return inheritdeptschclass;
	}
	public void setInheritdeptschclass(int inheritdeptschclass) {
		this.inheritdeptschclass = inheritdeptschclass;
	}
	public int getAutoschplan() {
		return autoschplan;
	}
	public void setAutoschplan(int autoschplan) {
		this.autoschplan = autoschplan;
	}
	public Long getMinautoschinterval() {
		return minautoschinterval;
	}
	public void setMinautoschinterval(Long minautoschinterval) {
		this.minautoschinterval = minautoschinterval;
	}
	public int getRegisterot() {
		return registerot;
	}
	public void setRegisterot(int registerot) {
		this.registerot = registerot;
	}
	public int getInheritdeptrule() {
		return inheritdeptrule;
	}
	public void setInheritdeptrule(int inheritdeptrule) {
		this.inheritdeptrule = inheritdeptrule;
	}
	public int getEmprivilege() {
		return emprivilege;
	}
	public void setEmprivilege(int emprivilege) {
		this.emprivilege = emprivilege;
	}
	public String getCardno() {
		return cardno;
	}
	public void setCardno(String cardno) {
		this.cardno = cardno;
	}
	public String getOtadmin() {
		return otadmin;
	}
	public void setOtadmin(String otadmin) {
		this.otadmin = otadmin;
	}
	public String getOtpass() {
		return otpass;
	}
	public void setOtpass(String otpass) {
		this.otpass = otpass;
	}
	public String getOtprivadmin() {
		return otprivadmin;
	}
	public void setOtprivadmin(String otprivadmin) {
		this.otprivadmin = otprivadmin;
	}
	public Long getPin1() {
		return pin1;
	}
	public void setPin1(Long pin1) {
		this.pin1 = pin1;
	}
	public String getOpcionempleado() {
		return opcionempleado;
	}
	public void setOpcionempleado(String opcionempleado) {
		this.opcionempleado = opcionempleado;
	}
	public String getSirhapass() {
		return sirhapass;
	}
	public void setSirhapass(String sirhapass) {
		this.sirhapass = sirhapass;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getCheckonline() {
		return checkonline;
	}
	public void setCheckonline(Long checkonline) {
		this.checkonline = checkonline;
	}
	public Long getCheckemail() {
		return checkemail;
	}
	public void setCheckemail(Long checkemail) {
		this.checkemail = checkemail;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public String getEstadocivil() {
		return estadocivil;
	}
	public void setEstadocivil(String estadocivil) {
		this.estadocivil = estadocivil;
	}
	public String getLugartrabajo() {
		return lugartrabajo;
	}
	public void setLugartrabajo(String lugartrabajo) {
		this.lugartrabajo = lugartrabajo;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getTipocontrato() {
		return tipocontrato;
	}
	public void setTipocontrato(String tipocontrato) {
		this.tipocontrato = tipocontrato;
	}
	public Date getFecharenuncia() {
		return fecharenuncia;
	}
	public void setFecharenuncia(Date fecharenuncia) {
		this.fecharenuncia = fecharenuncia;
	}
	public int getDiscapacidad() {
		return discapacidad;
	}
	public void setDiscapacidad(int discapacidad) {
		this.discapacidad = discapacidad;
	}
	public int getCargasfamiliares() {
		return cargasfamiliares;
	}
	public void setCargasfamiliares(int cargasfamiliares) {
		this.cargasfamiliares = cargasfamiliares;
	}
	public String getTiposangre() {
		return tiposangre;
	}
	public void setTiposangre(String tiposangre) {
		this.tiposangre = tiposangre;
	}
	public String getTelcasa() {
		return telcasa;
	}
	public void setTelcasa(String telcasa) {
		this.telcasa = telcasa;
	}
	public String getTelcel() {
		return telcel;
	}
	public void setTelcel(String telcel) {
		this.telcel = telcel;
	}
	public String getNombrecontacto() {
		return nombrecontacto;
	}
	public void setNombrecontacto(String nombrecontacto) {
		this.nombrecontacto = nombrecontacto;
	}
	public String getTelcontacto() {
		return telcontacto;
	}
	public void setTelcontacto(String telcontacto) {
		this.telcontacto = telcontacto;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public byte[] getFirma() {
		return firma;
	}
	public void setFirma(byte[] firma) {
		this.firma = firma;
	}
	public Long getCheckorder() {
		return checkorder;
	}
	public void setCheckorder(Long checkorder) {
		this.checkorder = checkorder;
	}
	public String getTvacacion() {
		return tvacacion;
	}
	public void setTvacacion(String tvacacion) {
		this.tvacacion = tvacacion;
	}
	public String getSvacacion() {
		return svacacion;
	}
	public void setSvacacion(String svacacion) {
		this.svacacion = svacacion;
	}
	public String getAdicional() {
		return adicional;
	}
	public void setAdicional(String adicional) {
		this.adicional = adicional;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	public String getSubdivision() {
		return subdivision;
	}
	public void setSubdivision(String subdivision) {
		this.subdivision = subdivision;
	}
	public String getUnidad() {
		return unidad;
	}
	public void setUnidad(String unidad) {
		this.unidad = unidad;
	}
	public String getLineasupervision() {
		return lineasupervision;
	}
	public void setLineasupervision(String lineasupervision) {
		this.lineasupervision = lineasupervision;
	}
	public String getHorarioasignado() {
		return horarioasignado;
	}
	public void setHorarioasignado(String horarioasignado) {
		this.horarioasignado = horarioasignado;
	}
	public Long getFacegroup() {
		return facegroup;
	}
	public void setFacegroup(Long facegroup) {
		this.facegroup = facegroup;
	}
	public Long getUseaccgrouptz() {
		return useaccgrouptz;
	}
	public void setUseaccgrouptz(Long useaccgrouptz) {
		this.useaccgrouptz = useaccgrouptz;
	}
	public Long getVerifycode() {
		return verifycode;
	}
	public void setVerifycode(Long verifycode) {
		this.verifycode = verifycode;
	}
	public Long getExpires() {
		return expires;
	}
	public void setExpires(Long expires) {
		this.expires = expires;
	}
	public Long getValidcount() {
		return validcount;
	}
	public void setValidcount(Long validcount) {
		this.validcount = validcount;
	}
	public Date getValidtimebegin() {
		return validtimebegin;
	}
	public void setValidtimebegin(Date validtimebegin) {
		this.validtimebegin = validtimebegin;
	}
	public Date getValidtimeend() {
		return validtimeend;
	}
	public void setValidtimeend(Date validtimeend) {
		this.validtimeend = validtimeend;
	}
	public Long getTimezone1() {
		return timezone1;
	}
	public void setTimezone1(Long timezone1) {
		this.timezone1 = timezone1;
	}
	public Long getTimezone2() {
		return timezone2;
	}
	public void setTimezone2(Long timezone2) {
		this.timezone2 = timezone2;
	}
	public Long getTimezone3() {
		return timezone3;
	}
	public void setTimezone3(Long timezone3) {
		this.timezone3 = timezone3;
	}
	public Date getFecharegistro() {
		return fecharegistro;
	}
	public void setFecharegistro(Date fecharegistro) {
		this.fecharegistro = fecharegistro;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public String getBadgenumber() {
		return badgenumber;
	}
	public void setBadgenumber(String badgenumber) {
		this.badgenumber = badgenumber;
	}
	public Long getAccgroup() {
		return accgroup;
	}
	public void setAccgroup(Long accgroup) {
		this.accgroup = accgroup;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getPager() {
		return pager;
	}
	public void setPager(String pager) {
		this.pager = pager;
	}
	public String getMen_usu() {
		return men_usu;
	}
	public void setMen_usu(String men_usu) {
		this.men_usu = men_usu;
	}
	
	
	
	
	
}
