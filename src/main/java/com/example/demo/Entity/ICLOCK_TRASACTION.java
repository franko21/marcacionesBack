package com.example.demo.Entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "iclock_transaction")
public class ICLOCK_TRASACTION implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	private String emp_code;	
	private String punch_time;
	private String punch_state;
	private int verify_type;
	private String work_code;
	private String terminal_sn;
	private String terminal_alias;
	private String area_alias;
	private String gps_location;
	private String mobile;
	private int source;
	private int purpose;
	private String crc;
	private String reserved;
	private Date upload_time;
	private Date sync_time;
	private String emp_id;
	private String company_id;
	private int mask_flag;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEmp_code() {
		return emp_code;
	}
	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}
	public String getPunch_time() {
		return punch_time;
	}
	public void setPunch_time(String punch_time) {
		this.punch_time = punch_time;
	}
	public String getPunch_state() {
		return punch_state;
	}
	public void setPunch_state(String punch_state) {
		this.punch_state = punch_state;
	}
	public int getVerify_type() {
		return verify_type;
	}
	public void setVerify_type(int verify_type) {
		this.verify_type = verify_type;
	}
	public String getWork_code() {
		return work_code;
	}
	public void setWork_code(String work_code) {
		this.work_code = work_code;
	}
	public String getTerminal_sn() {
		return terminal_sn;
	}
	public void setTerminal_sn(String terminal_sn) {
		this.terminal_sn = terminal_sn;
	}
	public String getTerminal_alias() {
		return terminal_alias;
	}
	public void setTerminal_alias(String terminal_alias) {
		this.terminal_alias = terminal_alias;
	}
	public String getArea_alias() {
		return area_alias;
	}
	public void setArea_alias(String area_alias) {
		this.area_alias = area_alias;
	}
	public String getGps_location() {
		return gps_location;
	}
	public void setGps_location(String gps_location) {
		this.gps_location = gps_location;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getSource() {
		return source;
	}
	public void setSource(int source) {
		this.source = source;
	}
	public int getPurpose() {
		return purpose;
	}
	public void setPurpose(int purpose) {
		this.purpose = purpose;
	}
	public String getCrc() {
		return crc;
	}
	public void setCrc(String crc) {
		this.crc = crc;
	}
	public String getReserved() {
		return reserved;
	}
	public void setReserved(String reserved) {
		this.reserved = reserved;
	}
	public Date getUpload_time() {
		return upload_time;
	}
	public void setUpload_time(Date upload_time) {
		this.upload_time = upload_time;
	}
	public Date getSync_time() {
		return sync_time;
	}
	public void setSync_time(Date sync_time) {
		this.sync_time = sync_time;
	}
	public String getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(String emp_id) {
		this.emp_id = emp_id;
	}
	public String getCompany_id() {
		return company_id;
	}
	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}
	public int getMask_flag() {
		return mask_flag;
	}
	public void setMask_flag(int mask_flag) {
		this.mask_flag = mask_flag;
	}
	
	

	
	
	
	

}
