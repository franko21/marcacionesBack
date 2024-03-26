package com.example.demo.Entity;

import java.io.Serializable;
import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "personnel_employee")
public class PERSONNEL_EMPLOYEE implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private Date create_time;
	
	private String create_user;
	
	private Date change_time;
	
	private String change_user;
	
	private int status;
	
	private String emp_code;
	
	private String first_name;
	
	private String last_name;
	
	private String nickname;
	
	private String passport;
	
	private String driver_license_automobile;
	
	private String driver_license_motorcycle;
	
	private int enable_outdoor_management;
	
	private String photo;
	
	private String self_password;
	
	private String device_password;
	
	private int dev_privilege;
	
	private String card_no;

	private String acc_group;
	
	private String acc_timezone;
	
	private String gender;
	
	private Date birthday;
	
	private String address;
	
	private String postcode;
	
	private String office_tel;
	
	private String contact_tel;
	
	private String mobile;
	
	private String religion;
	
	private String title;
	
	private String enroll_sn;
	
	private String ssn;
	
	private Date update_time;
	
	private Date hire_date;
	
	private String city;
	
	private int is_admin;
	
	private int enable_att;
	
	private int enable_payroll;
	
	private int enable_overtime;
	
	private int enable_holiday;
	
	private int enable_whatsapp;
	
	private int whatsapp_exception;
	
	private int whatsapp_punch;
	
	private int deleted;
	
	private int reserved;
	
	private int del_tag;
	
	private int app_status;
	
	private int app_role;
	
	private String email;
	
	private int enable_sms;
	
	private int sms_exception;
	
	private int sms_punch;
	
	private Date last_login;
	
	private int is_active;
	
	private int department_id;
	
	private String company_id;
	
	private String otp;
	
	private int verified_employee;
	
	private String designation;
	
	private int app_punch_status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public String getCreate_user() {
		return create_user;
	}

	public void setCreate_user(String create_user) {
		this.create_user = create_user;
	}

	public Date getChange_time() {
		return change_time;
	}

	public void setChange_time(Date change_time) {
		this.change_time = change_time;
	}

	public String getChange_user() {
		return change_user;
	}

	public void setChange_user(String change_user) {
		this.change_user = change_user;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getEmp_code() {
		return emp_code;
	}

	public void setEmp_code(String emp_code) {
		this.emp_code = emp_code;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassport() {
		return passport;
	}

	public void setPassport(String passport) {
		this.passport = passport;
	}

	public String getDriver_license_automobile() {
		return driver_license_automobile;
	}

	public void setDriver_license_automobile(String driver_license_automobile) {
		this.driver_license_automobile = driver_license_automobile;
	}

	public String getDriver_license_motorcycle() {
		return driver_license_motorcycle;
	}

	public void setDriver_license_motorcycle(String driver_license_motorcycle) {
		this.driver_license_motorcycle = driver_license_motorcycle;
	}

	public int getEnable_outdoor_management() {
		return enable_outdoor_management;
	}

	public void setEnable_outdoor_management(int enable_outdoor_management) {
		this.enable_outdoor_management = enable_outdoor_management;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getSelf_password() {
		return self_password;
	}

	public void setSelf_password(String self_password) {
		this.self_password = self_password;
	}

	public String getDevice_password() {
		return device_password;
	}

	public void setDevice_password(String device_password) {
		this.device_password = device_password;
	}

	public int getDev_privilege() {
		return dev_privilege;
	}

	public void setDev_privilege(int dev_privilege) {
		this.dev_privilege = dev_privilege;
	}

	public String getCard_no() {
		return card_no;
	}

	public void setCard_no(String card_no) {
		this.card_no = card_no;
	}

	public String getAcc_group() {
		return acc_group;
	}

	public void setAcc_group(String acc_group) {
		this.acc_group = acc_group;
	}

	public String getAcc_timezone() {
		return acc_timezone;
	}

	public void setAcc_timezone(String acc_timezone) {
		this.acc_timezone = acc_timezone;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getOffice_tel() {
		return office_tel;
	}

	public void setOffice_tel(String office_tel) {
		this.office_tel = office_tel;
	}

	public String getContact_tel() {
		return contact_tel;
	}

	public void setContact_tel(String contact_tel) {
		this.contact_tel = contact_tel;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getEnroll_sn() {
		return enroll_sn;
	}

	public void setEnroll_sn(String enroll_sn) {
		this.enroll_sn = enroll_sn;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public Date getUpdate_time() {
		return update_time;
	}

	public void setUpdate_time(Date update_time) {
		this.update_time = update_time;
	}

	public Date getHire_date() {
		return hire_date;
	}

	public void setHire_date(Date hire_date) {
		this.hire_date = hire_date;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getIs_admin() {
		return is_admin;
	}

	public void setIs_admin(int is_admin) {
		this.is_admin = is_admin;
	}

	public int getEnable_att() {
		return enable_att;
	}

	public void setEnable_att(int enable_att) {
		this.enable_att = enable_att;
	}

	public int getEnable_payroll() {
		return enable_payroll;
	}

	public void setEnable_payroll(int enable_payroll) {
		this.enable_payroll = enable_payroll;
	}

	public int getEnable_overtime() {
		return enable_overtime;
	}

	public void setEnable_overtime(int enable_overtime) {
		this.enable_overtime = enable_overtime;
	}

	public int getEnable_holiday() {
		return enable_holiday;
	}

	public void setEnable_holiday(int enable_holiday) {
		this.enable_holiday = enable_holiday;
	}

	public int getEnable_whatsapp() {
		return enable_whatsapp;
	}

	public void setEnable_whatsapp(int enable_whatsapp) {
		this.enable_whatsapp = enable_whatsapp;
	}

	public int getWhatsapp_exception() {
		return whatsapp_exception;
	}

	public void setWhatsapp_exception(int whatsapp_exception) {
		this.whatsapp_exception = whatsapp_exception;
	}

	public int getWhatsapp_punch() {
		return whatsapp_punch;
	}

	public void setWhatsapp_punch(int whatsapp_punch) {
		this.whatsapp_punch = whatsapp_punch;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public int getReserved() {
		return reserved;
	}

	public void setReserved(int reserved) {
		this.reserved = reserved;
	}

	public int getDel_tag() {
		return del_tag;
	}

	public void setDel_tag(int del_tag) {
		this.del_tag = del_tag;
	}

	public int getApp_status() {
		return app_status;
	}

	public void setApp_status(int app_status) {
		this.app_status = app_status;
	}

	public int getApp_role() {
		return app_role;
	}

	public void setApp_role(int app_role) {
		this.app_role = app_role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEnable_sms() {
		return enable_sms;
	}

	public void setEnable_sms(int enable_sms) {
		this.enable_sms = enable_sms;
	}

	public int getSms_exception() {
		return sms_exception;
	}

	public void setSms_exception(int sms_exception) {
		this.sms_exception = sms_exception;
	}

	public int getSms_punch() {
		return sms_punch;
	}

	public void setSms_punch(int sms_punch) {
		this.sms_punch = sms_punch;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}

	public int getIs_active() {
		return is_active;
	}

	public void setIs_active(int is_active) {
		this.is_active = is_active;
	}

	public int getDepartment_id() {
		return department_id;
	}

	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}

	public String getCompany_id() {
		return company_id;
	}

	public void setCompany_id(String company_id) {
		this.company_id = company_id;
	}

	public String getOtp() {
		return otp;
	}

	public void setOtp(String otp) {
		this.otp = otp;
	}

	public int getVerified_employee() {
		return verified_employee;
	}

	public void setVerified_employee(int verified_employee) {
		this.verified_employee = verified_employee;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getApp_punch_status() {
		return app_punch_status;
	}

	public void setApp_punch_status(int app_punch_status) {
		this.app_punch_status = app_punch_status;
	}

	
	
	
	
	
}
