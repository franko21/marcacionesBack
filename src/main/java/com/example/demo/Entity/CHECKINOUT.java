package com.example.demo.Entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "checkinout")
public class CHECKINOUT implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	
	
	private Long userid;

	
    private Date checktime;
	
	private String checktype;
	private Long verifycode;
	private String sensorid;
	private String memoinfo;
	private String workcode;
	private String sn;
	private String verifyapprove;
	private String geolt;
	private String geolg;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String marctype;
	private Long editada;
	private String motivo;
	
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Date getChecktime() {
		return checktime;
	}
	public void setChecktime(Date checktime) {
		this.checktime = checktime;
	}
	public String getChecktype() {
		return checktype;
	}
	public void setChecktype(String checktype) {
		this.checktype = checktype;
	}
	public Long getVerifycode() {
		return verifycode;
	}
	public void setVerifycode(Long verifycode) {
		this.verifycode = verifycode;
	}
	public String getSensorid() {
		return sensorid;
	}
	public void setSensorid(String sensorid) {
		this.sensorid = sensorid;
	}
	public String getMemoinfo() {
		return memoinfo;
	}
	public void setMemoinfo(String memoinfo) {
		this.memoinfo = memoinfo;
	}
	public String getWorkcode() {
		return workcode;
	}
	public void setWorkcode(String workcode) {
		this.workcode = workcode;
	}
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getVerifyapprove() {
		return verifyapprove;
	}
	public void setVerifyapprove(String verifyapprove) {
		this.verifyapprove = verifyapprove;
	}
	public String getGeolt() {
		return geolt;
	}
	public void setGeolt(String geolt) {
		this.geolt = geolt;
	}
	public String getGeolg() {
		return geolg;
	}
	public void setGeolg(String geolg) {
		this.geolg = geolg;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getMarctype() {
		return marctype;
	}
	public void setMarctype(String marctype) {
		this.marctype = marctype;
	}
	public Long getEditada() {
		return editada;
	}
	public void setEditada(Long editada) {
		this.editada = editada;
	}
	public String getMotivo() {
		return motivo;
	}
	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}
		
	

}
