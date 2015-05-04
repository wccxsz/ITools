package echuang.com.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.UniqueConstraint;

import echuang.com.util.Sexuality;

@Entity(name="T_Users")
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="F_UserID")
	private Integer Id;
	
	@Column(name="F_UserName",unique=true,length=100,nullable=false)
	private String userName;
	
	@Column(name="F_Sex")
	private Sexuality sex;
	
	@Column(name="F_Email",length=50)
	private String email;
	
	@Column(name="F_EmailConfirmed")
	private boolean emailConfirmed = false;
	
	@Column(name="F_PasswordHash",length=255)
	private String passwordHash;
	
	@Column(name="F_PhoneNumber",length=50)
	private String phoneNumber;
	
	@Column(name="F_PhoneNumberConfirmed")
	private boolean phoneNumberConfirmed = false;
	
	@Column(name="F_AccessFailedCount")
	private int accessFailedCount = 0;
	
	@Column(name="F_LockoutEnabled")
	private boolean lockoutEnabled = false;
	
	@Column(name="F_LockoutEndDateUtc")
	private Date lockoutEndDateUtc = new Date();
	
	@Column(name="F_IsDisabled")
	private boolean isDisabled = false;
	
	@Column(name="F_SCore")
	private int score = 0;
	
	@Column(name="F_Rank")
	public int rank = 1;
	
	@Column(name="F_ConsecutiveNumber")
	public int consecutiveNumber = 0;
	
	@Column(name="F_Icon")
	public String icon = "";
	
	@Column(name="F_IsDeleted")
	private boolean isDeleted = false;
	
	@Column(name="F_EmployeeName",length=50,nullable=false)
	private String employeeName;
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="T_UserInRole",
		joinColumns={@JoinColumn(name="F_UserID")},
		inverseJoinColumns={@JoinColumn(name="F_RoleID")},
		uniqueConstraints={@UniqueConstraint(columnNames={"F_UserID","F_RoleID"})})
	private Set<Role> roles = new HashSet<Role>(); 
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public Sexuality getSex() {
		return sex;
	}

	public void setSex(Sexuality sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isEmailConfirmed() {
		return emailConfirmed;
	}

	public void setEmailConfirmed(boolean emailConfirmed) {
		this.emailConfirmed = emailConfirmed;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public boolean isPhoneNumberConfirmed() {
		return phoneNumberConfirmed;
	}

	public void setPhoneNumberConfirmed(boolean phoneNumberConfirmed) {
		this.phoneNumberConfirmed = phoneNumberConfirmed;
	}

	public int getAccessFailedCount() {
		return accessFailedCount;
	}

	public void setAccessFailedCount(int accessFailedCount) {
		this.accessFailedCount = accessFailedCount;
	}

	public boolean isLockoutEnabled() {
		return lockoutEnabled;
	}

	public void setLockoutEnabled(boolean lockoutEnabled) {
		this.lockoutEnabled = lockoutEnabled;
	}

	public Date getLockoutEndDateUtc() {
		return lockoutEndDateUtc;
	}

	public void setLockoutEndDateUtc(Date lockoutEndDateUtc) {
		this.lockoutEndDateUtc = lockoutEndDateUtc;
	}

	public boolean isDisabled() {
		return isDisabled;
	}

	public void setDisabled(boolean isDisabled) {
		this.isDisabled = isDisabled;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public int getConsecutiveNumber() {
		return consecutiveNumber;
	}

	public void setConsecutiveNumber(int consecutiveNumber) {
		this.consecutiveNumber = consecutiveNumber;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public boolean isDeleted() {
		return isDeleted;
	}

	public void setDeleted(boolean isDeleted) {
		this.isDeleted = isDeleted;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	
}
