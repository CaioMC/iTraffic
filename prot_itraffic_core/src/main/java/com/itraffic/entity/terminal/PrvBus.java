package com.itraffic.entity.terminal;

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

@Entity
@Table(name = "PRVBUS")
public class PrvBus  implements Serializable {
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
	private Integer ID;
	
	@Column(name = "GATE", nullable = false)
	private String gate;
	
	@Column(name = "BUSCAPACITY", nullable = false)
	private int busCapacity;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "BUSGPS", nullable = true)
	private BusGps busGps;
	
	@Column(name = "DESCRIPTION", nullable = false)
	private String description;
	
	@Column(name = "TIMEEXIT", nullable = false)
	private Date timeExit;
	
	@Column(name = "TIMEARRIVED", nullable = false)
	private Date timeArrived;
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getGate() {
		return gate;
	}
	public void setGate(String gate) {
		this.gate = gate;
	}
	public int getBusCapacity() {
		return busCapacity;
	}
	public void setBusCapacity(int busCapacity) {
		this.busCapacity = busCapacity;
	}
	public BusGps getBusGps() {
		return busGps;
	}
	public void setBusGps(BusGps busGps) {
		this.busGps = busGps;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Date getTimeExit() {
		return timeExit;
	}
	public void setTimeExit(Date timeExit) {
		this.timeExit = timeExit;
	}
	public Date getTimeArrived() {
		return timeArrived;
	}
	public void setTimeArrived(Date timeArrived) {
		this.timeArrived = timeArrived;
	}
}
