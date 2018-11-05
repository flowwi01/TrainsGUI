import java.io.FileNotFoundException;

import javafx.geometry.Point2D;

//The offshoot track is 30 degrees off of straight track
public class SwitchLeftTrack extends Track{
	
	//The orientation of the side track
	public int sideOrientation;
	
	//The track to the side of this track
	public Track sideTrack;

	public SwitchLeftTrack(int x, int y, String imgSrc) throws FileNotFoundException{
		super(x,y,imgSrc);
		this.setHeight(60);
		this.setWidth(100);
		this.numRotations = 12;
		this.frontOrientation = 180;
		this.backOrientation = 180;
		this.sideOrientation = 150;
		this.sideTrack = null;
	}	
	
	public Point2D getLeftSwitchCoords(){		
		return this.localToParent(new Point2D(0, this.getHeight() - 40));
	}
}
