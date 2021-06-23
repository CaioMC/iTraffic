package com.itraffic.entity.employee;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ROLES")
public class Roles implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
    private String id;
	
	@Column(name = "DESCRITION", nullable = true)
    private String descrition;
	
	@Column(name = "ROLETYPEENUM", nullable = false)
    private RoleTypeEnum roleTypeEnum;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescrition() {
        return descrition;
    }

    public void setDescrition(String descrition) {
        this.descrition = descrition;
    }

    public RoleTypeEnum getRoleTypeEnum() {
        return roleTypeEnum;
    }

    public void setRoleTypeEnum(RoleTypeEnum roleTypeEnum) {
        this.roleTypeEnum = roleTypeEnum;
    }
}
