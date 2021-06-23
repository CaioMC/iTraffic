package com.itraffic.entity.creditpurchase;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.itraffic.entity.employee.Employee;
import com.itraffic.entity.employee.OutputField;
import com.itraffic.entity.terminal.TerminalPoint;
import com.itraffic.entity.user.PrvUser;

@Entity
@Table(name = "CREDITPURCHASE")
public class CreditPurchase implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
    private int id;
    
	@GeneratedValue
	@Column(name = "ORDERDATA", nullable = false)
    private Date orderData;
	
	@Column(name = "PROCESSDATE", nullable = true)
    private Date processDate;
	
	@Column(name = "UNDO", nullable = true)
    private float undo;
	
	@Column(name = "LASTEDIT", nullable = false)
    private Date lastEdit;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "OUTPUTFIELD", nullable = true)
    private OutputField outputField;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PRVUSER", nullable = false)
    private PrvUser prvUser;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "EMPLOYEE", nullable = true)
    private Employee employee;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "TERMINALPOINT", nullable = true)
    private TerminalPoint terminalPoint;
    
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "CREDITPURCHASEITEMS", nullable = false)
    private CreditPurchaseItems creditPurchaseItems;
    
    @Column(name = "CARDTYPEENUM", nullable = false)
    private CardTypeEnum cardTypeEnum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getOrderData() {
        return orderData;
    }

    public void setOrderData(Date orderData) {
        this.orderData = orderData;
    }

    public Date getProcessDate() {
        return processDate;
    }

    public void setProcessDate(Date processDate) {
        this.processDate = processDate;
    }

    public float getUndo() {
        return undo;
    }

    public void setUndo(float undo) {
        this.undo = undo;
    }

    public Date getLastEdit() {
        return lastEdit;
    }

    public void setLastEdit(Date lastEdit) {
        this.lastEdit = lastEdit;
    }

    public OutputField getOutputField() {
        return outputField;
    }

    public void setOutputField(OutputField outputField) {
        this.outputField = outputField;
    }

    public PrvUser getPrvUser() {
        return prvUser;
    }

    public void setPrvUser(PrvUser prvUser) {
        this.prvUser = prvUser;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public TerminalPoint getTerminalPoint() {
        return terminalPoint;
    }

    public void setTerminalPoint(TerminalPoint terminalPoint) {
        this.terminalPoint = terminalPoint;
    }

    public CreditPurchaseItems getCreditPurchaseItems() {
        return creditPurchaseItems;
    }

    public void setCreditPurchaseItems(CreditPurchaseItems creditPurchaseItems) {
        this.creditPurchaseItems = creditPurchaseItems;
    }

    public CardTypeEnum getCardTypeEnum() {
        return cardTypeEnum;
    }

    public void setCardTypeEnum(CardTypeEnum cardTypeEnum) {
        this.cardTypeEnum = cardTypeEnum;
    }

}