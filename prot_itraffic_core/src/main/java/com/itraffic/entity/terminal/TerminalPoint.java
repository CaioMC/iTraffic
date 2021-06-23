package com.itraffic.entity.terminal;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TERMINALPOINT")
public class TerminalPoint implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	@Column(name = "ID", nullable = false)
    private int id;
	
	@Column(name = "LATITUDE", nullable = false)
    private String latitude;
	
	@Column(name = "LONGITUDE", nullable = false)
    private String longitude;
	
	@Column(name = "TERMINALSTATUS", nullable = false)
    private boolean terminalStatus;
	
	@Column(name = "NEIGHBORHOOD", nullable = false)
    private String neighborhood;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public boolean isTerminalStatus() {
        return terminalStatus;
    }

    public void setTerminalStatus(boolean terminalStatus) {
        this.terminalStatus = terminalStatus;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
}