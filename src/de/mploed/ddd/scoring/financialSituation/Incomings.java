package de.mploed.ddd.scoring.financialSituation;

class Incomings {
	private int salary;
	private int otherIncome;

	Incomings(int salary, int otherIncome) {
		this.salary = salary;
		this.otherIncome = otherIncome;
	}

	int sum() {
		return salary + otherIncome;
	}
}