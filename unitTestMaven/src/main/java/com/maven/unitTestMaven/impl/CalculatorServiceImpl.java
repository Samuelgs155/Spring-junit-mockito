package com.maven.unitTestMaven.impl;

import com.maven.unitTestMaven.CalculatorService;
import com.maven.unitTestMaven.DataService;

public class CalculatorServiceImpl implements CalculatorService {
	private DataService dataService;

	public double calculateAverage() {
		int[] numbers = dataService.getListOfNumbers();
		double avg = 0;
		for (int i : numbers) {
			avg += i;
		}
		return (numbers.length > 0) ? avg / numbers.length : 0;
	}

	public void setDataService(DataService dataService) {
		this.dataService = dataService;
	}

}
