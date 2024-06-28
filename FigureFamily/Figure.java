package FigureFamily;

import java.lang.Math;
import algoFamilyFloorCalculation.FloorCalculation;
import algoFamilySurfaceCalculation.SurfaceCalculation;
import algoFamilyVolumeCalculation.VolumeCalculation;

public abstract class Figure {
	
	public static Figure figure;
	
	public double param1;
	public double param2;
	public double param3;
	private double roundingScale = Math.pow(10, 2);
	
	public double floorResult;
	public double surfaceResult;
	public double volumeResult;
	
	protected FloorCalculation floorCalculation;
	protected SurfaceCalculation surfaceCalculation;
	protected VolumeCalculation volumeCalculation;
	
	public Figure() {}
	
	public void roundFloorResult () { 
		floorResult = Math.floor(floorResult * roundingScale) / roundingScale;
	}
	
	public void roundSurfaceResult () {
		surfaceResult = Math.floor(surfaceResult * roundingScale) / roundingScale;
	}
	
	public void roundVolumeResult () {
		volumeResult = Math.floor(volumeResult * roundingScale) / roundingScale;
	}

	public void giveFloorResult(double param1, double param2) {
		floorResult = floorCalculation.calculateFloor(param1, param2);
		roundFloorResult ();
	}
	
	public void giveSurfaceResult(double param1, double param2, double param3) {
		surfaceResult = surfaceCalculation.calculateSurface(param1, param2, param3);
		roundSurfaceResult ();	
	}
	
	public void giveVolumeResult(double param1, double param2, double param3) {
		volumeResult = volumeCalculation.calculateVolume(param1, param2, param3);
		roundVolumeResult ();		
	}
	
	public void giveAllResults(double param1, double param2, double param3) {
		giveFloorResult(param1, param2);
		giveSurfaceResult(param1, param2, param3);
		giveVolumeResult(param1, param2, param3);	
	}
}

stem.out.println(floorResult);
		System.out.println(surfaceResult);
		System.out.println(volumeResult);*/
	}
	
}
