// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

import frc.robot.Constants.DrivetrainConstants;

/** Add your docs here. */
public class drivetrainIOTalonSRX implements drivetrainIO{
   TalonSRX leftBackTalon; 
   TalonSRX leftFrontTalon;
   TalonSRX rightFrontTalon;
   TalonSRX rightBackTalon;

   public void setVoltages(double left, double right) {
      leftFrontTalon.set(ControlMode.PercentOutput, left);
      leftBackTalon.set(ControlMode.PercentOutput, -left);
      rightBackTalon.set(ControlMode.PercentOutput, -right);
      rightFrontTalon.set(ControlMode.PercentOutput, right);
   }

   public drivetrainIOTalonSRX() {
      leftBackTalon = new TalonSRX(DrivetrainConstants.leftBackTalonID);
      leftFrontTalon = new TalonSRX(DrivetrainConstants.leftFrontTalonID);
      rightBackTalon = new TalonSRX(DrivetrainConstants.rightBackTalonID); 
      rightFrontTalon = new TalonSRX(DrivetrainConstants.rightFrontTalonID); 

      leftBackTalon.configContinuousCurrentLimit(DrivetrainConstants.currentLimit);
      leftFrontTalon.configContinuousCurrentLimit(DrivetrainConstants.currentLimit);
      rightBackTalon.configContinuousCurrentLimit(DrivetrainConstants.currentLimit);
      rightFrontTalon.configContinuousCurrentLimit(DrivetrainConstants.currentLimit);

      leftFrontTalon.setInverted(false);
      leftBackTalon.setInverted(true);
      rightFrontTalon.setInverted(false);
      rightBackTalon.setInverted(true);
   }

}
