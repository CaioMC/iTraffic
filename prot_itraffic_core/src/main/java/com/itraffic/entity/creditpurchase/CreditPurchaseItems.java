package com.itraffic.entity.creditpurchase;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CREDITPURCHASEITEMS")
public class CreditPurchaseItems implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
    private int id;
	
	@Column(name = "VALUE", nullable = false)
    private float value;
	
	@Column(name = "TYPEITEMENUM", nullable = false)
    private TypeItemEnum typeItemEnum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public TypeItemEnum getTypeItemEnum() {
        return typeItemEnum;
    }

    public void setTypeItemEnum(TypeItemEnum typeItemEnum) {
        this.typeItemEnum = typeItemEnum;
    }

}
