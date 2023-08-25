package learning;

public class Son extends Father {

	int sonage = 20;
	public void inteligent () {
		
		System.out.println("son is inteligent");
	}
	
	public void brave() {
		this.grandmotherage = 50;
		//this.motherage = 30;
	
		System.out.println("son is brave");
		System.out.println("son is thinking like" + grandmotherage + super.motherage + grandmotherage + motherage  ) ;
	}
	
}
