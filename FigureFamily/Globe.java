package FigureFamily;

import algoFamilyFloorCalculation.FloorCalculationCircle;
import algoFamilySurfaceCalculation.SurfaceCalculationGlobe;
import algoFamilyVolumeCalculation.VolumeCalculationGlobe;

public class Globe extends Figure{
	
	public Globe (double radius) {
		super ();	
		this.param1 = radius;
		this.param2 = Math.PI;
		this.param3 = 1;
		
		floorCalculation = new FloorCalculationCircle();
		surfaceCalculation = new SurfaceCalculationGlobe();
		volumeCalculation = new VolumeCalculationGlobe();
	}

}
