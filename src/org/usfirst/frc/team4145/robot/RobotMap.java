package org.usfirst.frc.team4145.robot;

import org.usfirst.frc.team4145.robot.subsystems.ExampleSubsystem;
import org.usfirst.frc.team4145.shared.CanTalonSRX;

import edu.wpi.first.wpilibj.RobotDrive;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//declare things for public use here
	//Operator interface and Subsystems
	public static OI oi;
	public static ExampleSubsystem exampleSubsystem;

	//drivetrain subsystem
	//these talon SRX's are fake versions that do nothing
	//it is just a dummy class to ignore errors
	public static CanTalonSRX one;
	public static CanTalonSRX two;
	public static CanTalonSRX three;
	public static CanTalonSRX four;
	
	//finish declaration in here
	public static void init() {
		//Operator interface and Subsystems
		oi = new OI();
		exampleSubsystem = new ExampleSubsystem();
		
		//Drivetrain Subsystem
		one = new CanTalonSRX(1);
		two = new CanTalonSRX(1);
		three = new CanTalonSRX(1);
		four = new CanTalonSRX(1);
		RobotDrive drive = new RobotDrive(one,two,three,four);
		
		//Subsystem 2
		//some other subsystem stuff here
	}
}
