
package org.usfirst.frc.team4468.robot;

import edu.wpi.first.wpilibj.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	public void robotInit(){
		CMap.initialize();
	}
	
	public void autonomousInit(){
		
	}
	
}
