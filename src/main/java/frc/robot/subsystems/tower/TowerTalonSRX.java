// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.tower;

import com.ctre.phoenix.motorcontrol.TalonSRXControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import frc.robot.Constants.TowerConstants;

public class TowerTalonSRX implements TowerIO{
    private TalonSRX roller;

    public TowerTalonSRX() {
        roller = new TalonSRX(TowerConstants.RollerID);

       roller.configPeakCurrentLimit(TowerConstants.RollerMotorCurrentLimit);
       roller.setInverted(true);
    }


    @Override
    public void setRollerVolts(double speed) {
        roller.set(TalonSRXControlMode.Current, speed);
    }

}