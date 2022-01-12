package edu.school.models;

import java.awt.Color;

public class SvgRectangle extends SVGObject{

    private int width, height;

    public SvgRectangle(
			Color strokeColor, int strokeWidth, Color fill, int x, int y, int width, int height)
	{
		super(strokeColor, strokeWidth, fill, x, y);
        setWidth(width);
        setHeight(height);
	}

    public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

    public int getHeight() {
		return height;
	}

	public void setHeight(int height){
		this.height = height;
	}

    @Override
	public String toSvgCode() {
		String result = "<rect ";
		result += "x=\""+getX()+"\" y=\""+getY()+"\" ";
		result += "width=\""+getWidth()+"\" height=\""+getHeight()+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\" ";
		result += "fill=\""+toRGB(getFill())+"\"/>";
		return result;
	}

}
