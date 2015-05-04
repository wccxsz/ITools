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

@Entity(name="T_Roles")
public class Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="F_RoleID")
	private Integer Id;
	
	@Column(name="F_RoleName",length=250)
	private String roleName;
	
	@Column(name="F_CreateTime")
	private Date createTime = new Date();
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="T_UserInRole", 
		joinColumns={@JoinColumn(name="F_RoleID")},
		inverseJoinColumns={@JoinColumn(name="F_UserID")},
		uniqueConstraints={@UniqueConstraint(columnNames={"F_UserID","F_RoleID"})})
	private Set<User> roles = new HashSet<User>(); 

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Set<User> getRoles() {
		return roles;
	}

	public void setRoles(Set<User> roles) {
		this.roles = roles;
	}
	
	
}
