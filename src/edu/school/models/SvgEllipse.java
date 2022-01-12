package edu.school.models;

import java.awt.Color;

public class SvgEllipse extends SVGObject{

    private int radiusY, radiusX;

    public SvgEllipse(
			Color strokeColor, int strokeWidth, Color fill, int centerX, int centerY, int radiusX, int radiusY)
	{
		super(strokeColor, strokeWidth, fill, centerX, centerY);
		setRadiusX(radiusX);
        setRadiusY(radiusY);
	}

    public int getRadiusX() {
		return radiusX;
	}

	public void setRadiusX(int radiusX) {
		this.radiusX = radiusX;
	}

    public int getRadiusY() {
		return radiusY;
	}

	public void setRadiusY(int radiusY) {
		this.radiusY = radiusY;
	}

	@Override
    public String toSvgCode() {
		String result = "<ellipse ";
		result += "cx=\""+getX()+"\" cy=\""+getY()+"\" ";
		result += "rx=\""+getRadiusX()+"\" ry=\""+getRadiusY()+"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\" ";
        result += "fill=\""+toRGB(getFill())+"\"/>";
		return result;
	}

}
