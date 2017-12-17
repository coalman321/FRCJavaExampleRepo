package org.usfirst.frc.team4145.vision;

import edu.wpi.first.wpilibj.SerialPort;
import edu.wpi.first.wpilibj.SerialPort.Port;

public class VisionProtocol {
	
	private Port port; // 0 = rs232   1 = MXP   2 = USB
	private final int baudrate;
	private SerialPort visionConnection;
	private String LastMsg;
	private String input;
	
	/**
	 * constructs the vision communication protocol over serial
	 * @param port -- either USB or MXP do not use RS232
	 * @param baud rate -- has to match the vision computer
	 */
	
	public VisionProtocol(Port port, final int baud) {
		this.port = port;
		baudrate = baud;
		visionConnection = new SerialPort(baud, port);
	}
	
	/**
	 * default constructor for vision communications
	 * assumes MXP and baud of 115200
	 */
	public VisionProtocol() {
		this(Port.kMXP, 115200);
	}
	
	/**
	 * gets the data from the serial port and calculates a result --
	 * need to investigate how received data is stored
	 * it may insert at the beginning or be tacked onto the end
	 */
	private void updateMsg() {
		input = visionConnection.readString();
		int loc = input.indexOf(')');
		LastMsg = input.substring(0,loc);
	}
	
	/**WARNING MAY REQUIRE ADDITIONAL TWEAKING BEFORE USE!
	 * message protocol: (x adjust, y adjust, rot adjust)
	 * x -- left / right   y -- forward / back   
	 * rot -- turn left / right
	 * @see updateMsg()
	 * @return last coordinate set from vision results
	 */
	public String getLastMsg() {
		updateMsg();
		return LastMsg;
	}
	
	/**
	 * call this at the end of the match to release the serial
	 * port resources to avoid conflict
	 */
	public void done() {
		visionConnection.flush();
		visionConnection.free();
	}

}
