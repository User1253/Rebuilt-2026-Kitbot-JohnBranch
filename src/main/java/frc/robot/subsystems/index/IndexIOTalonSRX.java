// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.index;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.TalonSRXConfiguration;

import frc.robot.Constants.IndexConstants;

public class IndexIOTalonSRX implements IndexIO {
  TalonSRX indexTalon; 

  TalonSRXConfiguration config = new TalonSRXConfiguration();
   
  public IndexIOTalonSRX() {
    indexTalon = new TalonSRX(IndexConstants.theIdentitificationNumbertThatAllowsUsProgrammersToEasilyRecongnizeTheMotorResponsibleForTheIndexingOfTheGamePieceWhichIsKnownAsFuelThisVariableIsOtherWiseKnownAsTheMotorIDOfTheIndexerMotor);
  }

  @Override
  public void setVoltage(double voltage) {
    indexTalon.set(ControlMode.PercentOutput, voltage);
  }

}
