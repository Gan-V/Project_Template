package com.template.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "Account")
public class Account implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "username", columnDefinition = "varchar(50)")
	private String username;
	@Column(name = "fullname", columnDefinition = "nvarchar(50)")
	private String fullname;
	@Column(name = "bcrypt_passwprd", columnDefinition = "varchar(255)")
	private String bcrypt_password;
	@Column(name = "email", columnDefinition = "nvarchar(255)")
	private String email;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date date_of_birth;
	@Column(name = "occupation", columnDefinition = "nvarchar(255)")
	private String occupation;
	@Column(name = "phone", columnDefinition = "varchar(15)")
	private String phone;
	@Column(name = "description", columnDefinition = "nvarchar(255)")
	private String description;
	@Column(name = "address", columnDefinition = "nvarchar(255)")
	private String address;
	@Column(name = "sociallink", columnDefinition = "nvarchar(255)")
	private String sociallink;
	@Column(name = "photo", columnDefinition = "nvarchar(255)")
	private String photo;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date updated_at;
	@Column(name = "actived")
	private Boolean actived;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date actived_at;
	@Column(name = "privacy")
	private Boolean privacy;
	
	public Account() {
	}

	public Account(int id, String username, String fullname, String bcrypt_password, String email, Date date_of_birth,
			String occupation, String phone, String description, String address, String sociallink, String photo,
			Date updated_at, Boolean actived, Date actived_at, Boolean privacy) {
		super();
		this.id = id;
		this.username = username;
		this.fullname = fullname;
		this.bcrypt_password = bcrypt_password;
		this.email = email;
		this.date_of_birth = date_of_birth;
		this.occupation = occupation;
		this.phone = phone;
		this.description = description;
		this.address = address;
		this.sociallink = sociallink;
		this.photo = photo;
		this.updated_at = updated_at;
		this.actived = actived;
		this.actived_at = actived_at;
		this.privacy = privacy;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getBcrypt_password() {
		return bcrypt_password;
	}
	public void setBcrypt_password(String bcrypt_password) {
		this.bcrypt_password = bcrypt_password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSociallink() {
		return sociallink;
	}
	public void setSociallink(String sociallink) {
		this.sociallink = sociallink;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public Date getUpdated_at() {
		return updated_at;
	}
	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}
	public Boolean getActived() {
		return actived;
	}
	public void setActived(Boolean actived) {
		this.actived = actived;
	}
	public Date getActived_at() {
		return actived_at;
	}
	public void setActived_at(Date actived_at) {
		this.actived_at = actived_at;
	}
	public Boolean getPrivacy() {
		return privacy;
	}
	public void setPrivacy(Boolean privacy) {
		this.privacy = privacy;
	}
	
}
