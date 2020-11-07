package food;

public class meal {
     
	private fruit fruit;
	private Dairy dairy;
	private grain grain;
    private vegetable veg;
  	
	public meal() {}
	
	public meal(fruit f,Dairy d, grain g, vegetable v)
	{
		this.fruit=f;
		this.dairy=d;
		this.grain=g;
		this.veg=v;
	}
	
	public String whatsInThisMeal()
	{
		String answer = "This meal contains :";
		
		if(fruit != null) answer += "some fruit";
		if(dairy != null) answer += "some dairy";
		if(grain != null) answer += "some grain";
		if(veg !=null) answer += "some vegetables";
		
		return answer;
		
		
		
	}
}
	











