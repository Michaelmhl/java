

class Calculation {
	
	public int sum(int a, int b)
	{
		return a+b;
	}
	
	public int mul(int a, int b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation obj = new Calculation();
		int sum = obj.sum(10,10);
		int mul = obj.mul(5, 10);
		
		System.out.println("sum :: " +sum+"\nmul :: "+mul );

	}

}
