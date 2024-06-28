package FigureFamily;

import algoFamilyFloorCalculation.FloorCalculationSquare;
import algoFamilySurfaceCalculation.SurfaceCalculationCube;
import algoFamilyVolumeCalculation.VolumeCalculationCube;

public class Cuboid extends Figure{
	
	public Cuboid (double length, double width, double height) {
		super ();
		this.param1 = length;
		this.param2 = width;
		this.param3 = height;
		
		floorCalculation = new FloorCalculationSquare();
		surfaceCalculation = new SurfaceCalculationCube();
		volumeCalculation = new VolumeCalculationCube();
	}

}
