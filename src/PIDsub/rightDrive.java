package PIDsub;

import edu.wpi.first.wpilibj.command.PIDSubsystem;

/**
 *
 */
public class rightDrive extends PIDSubsystem {
	private static final double Kp = .2;
	private static final double Ki = 0;
	private static final double Kd = 0;
    // Initialize your subsystem here
    public rightDrive() {
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
    	super("rightDrive", Kp, Ki, Kd);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
    	
    	return 0.0;
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
    }
}
