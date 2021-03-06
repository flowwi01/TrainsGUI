import java.io.FileNotFoundException;

import javafx.geometry.Point2D;

public class SensorTrack extends Track{
	public SensorTrack(int x, int y, String imgSrc) throws FileNotFoundException{
		super(x,y,imgSrc);
		this.setHeight(55);
		this.setWidth(50);
		this.numRotations = 12;
		this.frontOrientation = 0;
		this.backOrientation = 0;
	}

	@Override
	Point2D getFrontCoords() {
		return this.localToParent(this.getWidth(),0);
	}	
	
	@Override
	Point2D getBackCoords() {
		return this.localToParent(0,0);
	}	
}
