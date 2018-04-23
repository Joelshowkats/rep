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
}