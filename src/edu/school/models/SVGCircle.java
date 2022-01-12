package edu.school.models;

import java.awt.Color;

public class SVGCircle extends SVGObject {

    private int radius;

    public SVGCircle(
			Color strokeColor, int strokeWidth, Color fill, int centerX, int centerY, int radius)
	{
		super(strokeColor, strokeWidth, fill, centerX, centerY);
		setRadius(radius);
	}

    public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
    @Override
	public String toSvgCode() {
		String result = "<circle ";
		result += "cx=\""+getX()+"\" cy=\""+getY()+"\" ";
		result += "r=\""+getRadius()+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\" ";
        result += "fill=\""+toRGB(getFill())+"\"/>";
		return result;
	}

}
