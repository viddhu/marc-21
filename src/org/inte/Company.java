package org.inte;

public class Company {
	static Company m;
	private Company(){}
	public static Company add() {
	if (m==null)
	{
	m=new Company();
	}
	System.out.println(m);
	return m;
	}
	public void adr() {
		System.out.println("This is greenstech");
	}
		public static void main(String[] args) {
		Company m = add();
		m.adr();
		}
}
