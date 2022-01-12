package edu.school.models;

import java.awt.Color;

public class SvgPolygon extends SVGObject{

    private int coords [];

    public SvgPolygon(
			Color strokeColor, int strokeWidth, Color fill, int x1, int y1, int... coords)
	{
		super(strokeColor, strokeWidth, fill, x1, y1);
		setCoords(coords);
	}

    public void setCoords(int coords[]){
        if(coords.length == 0){
            throw new IllegalArgumentException("You should give more than 1 point's coordinates!");
        }else if(coords.length == 2){
            throw new IllegalArgumentException("You should give more than 2 point's coordinates!");
        }
        if(coords.length %2 != 0){
            throw new IllegalArgumentException("You should give an even amount of coordinates!");
        }
        this.coords = coords;
    }

    public int[] getCoords(){
        return this.coords;
    }

    public String polygonString() {
        String polygonString = "";

        for(int i = 1; i <= getCoords().length; i++){
            if(i % 2 == 0 && getCoords()[i-1] != 0){
                polygonString += getCoords()[i-2] + "," + getCoords()[i-1];
            }
            if(i != getCoords().length){
                polygonString += " ";
            }
        }

        return polygonString;
    }

    @Override
	public String toSvgCode() {
		String result = "<polygon ";
		result += "points=\""+ getX() + "," + getY() + " " + polygonString() +"\" ";
		result += "stroke=\""+toRGB(getColor())+"\" ";
		result += "stroke-width=\""+getStrokeWidth()+"\" ";
        result += "fill=\""+toRGB(getFill())+"\"/>";
		return result;
	}


}
