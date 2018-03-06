class First{
	
	static double Delta(int a, int b, int c){
		return ((b*b) - 4*(a * c));
	}

	static void Roots(int a, int b, int c, double d){
		double x1, x2;
		x1 = (-b - Math.sqrt(d)) / (2*a);
		x2 = (-b + Math.sqrt(d)) / (2*a);
		if (d>0){	
			System.out.println("Pierwszy pierwiastek: " + x1);
			System.out.println("Drugi pierwiastek: " + x2);
		} else if (d==0) {
			System.out.println("Pierwiastek: " + x1);
		} else 
			System.out.println("Brak rozwiazan rzeczywistych");
	}

	static void Polynomial(int a, int b, int c){
		double d;
		d = Delta(a, b, c);
		System.out.println("Delta: " + d);
		Roots(a, b, c, d);
	}
		
		
	public static void main(String[] args){
		int A = 0;
		int B = 0; 
		int C = 0;
		if (args.length == 0) {
			System.err.println("No arguments.");
			System.exit(1);
		}
		try {
			A = Integer.parseInt(args[0]);
			B = Integer.parseInt(args[1]);
			C = Integer.parseInt(args[2]);
		} catch (NumberFormatException e) {
			System.err.println("Arguments must be integers.");
			System.exit(1);
		}
		System.out.println("Wielomian: " + A + "x^2+" + B + "x+" + C + "=0");
		Polynomial(A, B, C);
	}
}
