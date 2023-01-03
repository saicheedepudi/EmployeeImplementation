import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.*;

interface Company {
	void assignSalaries(int[] salaries);

	void averageSalary();

	void maxSalary();

	void minSalary();
}
/*
 * model output for cut and paste 
 * Incomes of ____ credited 
 * Average salary of ____ is ____ 
 * Maximum salary amongst ____ is ____ 
 * Minimum salary amongst ____ is ____
 */

class EngineerFirm implements Company{
	private final int[] income;

	public EngineerFirm(int n) {
		income = new int[n];
		for (int i = 0; i < n; i++) {
			income[i] = 0;
		}
	}
	
	public void assignSalaries(int[] salaries) {
		if(salaries != null) {
			for(int i=0;i<salaries.length;i++) {
				income[i] = salaries[i];
			}
		}
		System.out.println("Income for engineers credited");
	}
	
	public void averageSalary() {
		int avgSalary = 0;
		for(int i=0;i<income.length;i++) {
			avgSalary += income[i];
		}
		System.out.println("Avg Salary of engineers is "+avgSalary/income.length);
	}

	public void maxSalary() {
		int max = Arrays.stream(income).max().getAsInt();
		System.out.println("Max salary amongt engineers is "+max);
	}

	public void minSalary() {
		int min = Arrays.stream(income).min().getAsInt();
		System.out.println("Min salary amongt engineers is "+min);
	}
}

class AccountantFirm implements Company{
	private final int[] income;

	public AccountantFirm(int n) {
		income = new int[n];
		for (int i = 0; i < n; i++) {
			income[i] = 0;
		}
	}
    public void assignSalaries(int[] salaries) {
    	if(salaries != null) {
			for(int i=0;i<salaries.length;i++) {
				income[i] = salaries[i];
			}
		}
    	System.out.println("Income for accountants credited");
	}
    public void averageSalary() {
		int avgSalary = 0;
		for(int i=0;i<income.length;i++) {
			avgSalary += income[i];
		}
		System.out.println("Avg Salary of accountants is "+avgSalary/income.length);
	}

	public void maxSalary() {
		int max = Arrays.stream(income).max().getAsInt();
		System.out.println("Max salary amongt accountants is "+max);
	}

	public void minSalary() {
		int min = Arrays.stream(income).min().getAsInt();
		System.out.println("Min salary amongt accountants is "+min);
	}
}


public class EmployeeImplementation {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		String[] count = sc.nextLine().split(" ");
		EngineerFirm e = new EngineerFirm(Integer.parseInt(count[0]));
		AccountantFirm a = new AccountantFirm(Integer.parseInt(count[1]));
		count = sc.nextLine().split(" ");
		int[] incomeEngineers = new int[count.length];
		for (int i = 0; i < count.length; i++) {
			incomeEngineers[i] = Integer.parseInt(count[i]);
		}
		e.assignSalaries(incomeEngineers);
		count = sc.nextLine().split(" ");
		int[] incomeAccountants = new int[count.length];
		for (int i = 0; i < count.length; i++) {
			incomeAccountants[i] = Integer.parseInt(count[i]);
		}
		a.assignSalaries(incomeAccountants);
		e.averageSalary();
		e.maxSalary();
		e.minSalary();
		a.averageSalary();
		a.maxSalary();
		a.minSalary();
	}
}