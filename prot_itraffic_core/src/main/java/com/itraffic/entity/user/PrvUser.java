package com.itraffic.entity.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "PRVUSER")
public class PrvUser {
	
	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
    private int id;
    
	@Column(name = "NAME", nullable = false)
    private String name;
    
	@Column(name = "CPF", nullable = false)
    private String cpf;
    
	@Column(name = "SHORTNAME", nullable = false)
    private String shortName;
    
	@Column(name = "LOGIN", nullable = false)
    private String login;
    
	@Column(name = "PASSWORD", nullable = false)
    private String password;
    
	@Column(name = "STATUS", nullable = false)
    private boolean status;
    
	@Column(name = "email", nullable = true)
    private String email;
    
	@Column(name = "PHONE", nullable = true)
    private String phone;
    
	@Column(name = "TYPEUSERENUM", nullable = false)
    private TypeUserEnum typeUserEnum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TypeUserEnum getTypeUserEnum() {
        return typeUserEnum;
    }

    public void setTypeUserEnum(TypeUserEnum typeUserEnum) {
        this.typeUserEnum = typeUserEnum;
    }
}
