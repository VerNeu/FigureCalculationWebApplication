package FigureFamily;

import algoFamilyFloorCalculation.FloorCalculationSquare;
import algoFamilySurfaceCalculation.SurfaceCalculationCube;
import algoFamilyVolumeCalculation.VolumeCalculationCube;

public class Dice extends Figure{
	
	public Dice (double length) {
		super ();
		this.param1 = length;
		this.param2 = length;
		this.param3 = length;
		
		floorCalculation = new FloorCalculationSquare();
		surfaceCalculation = new SurfaceCalculationCube();
		volumeCalculation = new VolumeCalculationCube();
	}

}