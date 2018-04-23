public class Cercle {
	
	private float x;
	private float y;
 
	Cercle(float xx, float yy)
	{
		x=xx;
		y=yy;
	}

	Cercle ()
	{
		x=0;
		y=0;
	}
	
	Cercle (Cercle c)
	{
		x=c.X();
		y=c.Y();
	}
	
	public float getX()
	{
		return x;
	}
	
	public void setX()
	{
		this.x=xx;
	}
	
	public float getY()
	{
		return y;
	}
	
	public void setY()
	{
		this.x=xx;
	}
	
	@Override
    	public String toString()
	{
        	return "x: "+x+ " y: "+y;
    	}
	
	@Override
	public Boolean equals(Cercle c)
	{
		return x.equals(c.getX()) && y.equals(c.getY());
	}
	
	public static void main(String[] args) 
	{
		Cercle c1 = new Cercle(12,15);
		Cercle c2 = new Cercle(13,14);
		Cercle c3 = new Cercle(12,11);
		
	}
}
