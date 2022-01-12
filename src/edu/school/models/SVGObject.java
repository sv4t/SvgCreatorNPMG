package edu.school.models;

import java.awt.Color;

public abstract class SVGObject {
	private int x;
	private int y;
	private Color color;
	private Color fill;
	private int strokeWidth;
	
	public SVGObject(Color color, int strokeWidth, Color fill, int x, int y)
	{
		setX(x);
		setY(y);
		setColor(color);
		setStrokeWidth(strokeWidth);
		setFill(fill);
	}
	
	public SVGObject(int x, int y)
	{
		this(Color.BLACK, 2, Color.BLACK, x, y);
	}
	
	public SVGObject()
	{
		this(0,0);
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Color getFill() 
    {
        return this.fill;
    }

    public void setFill(Color fill) 
    {
        this.fill = fill;
    }

	public int getStrokeWidth() {
		return strokeWidth;
	}

	public void setStrokeWidth(int strokeWidth) {
		this.strokeWidth = strokeWidth;
	}
	
	public abstract String toSvgCode();
	
	protected String toRGB(Color color)
	{
		if(color == null)
			return "";
		String result = "rgb(";
		result += color.getRed()+",";
		result += color.getGreen()+",";
		result += color.getBlue()+")";
		return result;
	}
}
