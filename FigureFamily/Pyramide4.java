package FigureFamily;

import algoFamilyFloorCalculation.FloorCalculationSquare;
import algoFamilySurfaceCalculation.SurfaceCalculationPyramide4;
import algoFamilyVolumeCalculation.VolumeCalculationPyramide4;

public class Pyramide4 extends Figure{
	
	public Pyramide4 (double base, double width, double height) {
		super ();
		this.param1 = base;
		this.param2 = width;
		this.param3 = height;
		
		floorCalculation = new FloorCalculationSquare();
		surfaceCalculation = new SurfaceCalculationPyramide4();
		volumeCalculation = new VolumeCalculationPyramide4();
	}

}
