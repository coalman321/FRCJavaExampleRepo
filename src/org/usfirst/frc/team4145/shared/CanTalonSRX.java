package org.usfirst.frc.team4145.shared;

import edu.wpi.first.wpilibj.CANSpeedController;
import edu.wpi.first.wpilibj.tables.ITable;

/**
 * WARNING ---- DUMMY TALON SRX CLASS DO NOT USE ON COMPETITON SOFTWARE!!!!!
 * THIS WAS DESIGNED TO STOP A FEW ERROS IN TEST CODE!
 * @author Cole Tucker
 *
 */

public class CanTalonSRX implements CANSpeedController{
	
	public CanTalonSRX(int busID) {
		
	}

	@Override
	public double get() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void set(double speed) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setInverted(boolean isInverted) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean getInverted() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void disable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopMotor() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pidWrite(double output) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPID(double p, double i, double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getP() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getI() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getD() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setSetpoint(double setpoint) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getSetpoint() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getError() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void enable() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void reset() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void startLiveWindowMode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopLiveWindowMode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initTable(ITable subtable) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ITable getTable() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ControlMode getControlMode() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setControlMode(int mode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setP(double p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setI(double i) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setD(double d) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double getBusVoltage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getOutputVoltage() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getOutputCurrent() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getTemperature() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getPosition() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getSpeed() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setVoltageRampRate(double rampRate) {
		// TODO Auto-generated method stub
		
	}

}
