package org.sevenup.domain.location;

import org.springframework.data.annotation.Id;

public class Location {

	@Id
	private String id;

	private double[] position;

	public double[] getPosition() {
		return position;
	}

	public void setPosition(double[] position) {
		this.position = position;
	}
}