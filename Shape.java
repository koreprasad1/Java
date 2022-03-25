package Test;

public class Shape {
    private double width,height,radius;
    
    public void setValues(double height,double width)
    {
    	this.height = height;
    	this.width = width;
    }
    public double getheight()
    {
    	return height;
    }
	public double getwidth()
	{
		return width;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getradius()
	{
		return radius;
	}
}
