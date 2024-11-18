package lamdaExpression;

public class LamdaDemo implements Square{
	
	private String a;
	
	public LamdaDemo(){
		System.out.println("Test Default Constrctor");
	}
	

	public LamdaDemo(String a) {
		super();
		this.a = a;
		System.out.println("New Constructor :: "+a);
	}


	public static void main(String args[]) {
		
		LamdaDemo esd=new LamdaDemo("Hello String");		
		System.out.println(esd.calculate(5));
		
		Square abc = (int x) -> x * x;
		System.out.println("using lamda::"+abc.calculate(4));
	}

	@Override
	public int calculate(int x) {
		return x*x;
	}
}


