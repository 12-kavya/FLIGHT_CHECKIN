package com.id.flightcheckin.integration.dto;

public class ReservationUpdateRequest {
	
	private Long id;
	private Boolean checkedIn;
	private int NumberOfBags;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Boolean getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Boolean checkedIn) {
		this.checkedIn = checkedIn;
	}
	public int getNumberOfBags() {
		return NumberOfBags;
	}
	public void setNumberOfBags(int numberOfBags) {
		NumberOfBags = numberOfBags;
	}
	

}
