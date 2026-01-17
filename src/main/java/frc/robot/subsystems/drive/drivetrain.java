// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.drive;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class drivetrain extends SubsystemBase {

  drivetrainIO drivetrain; 


  public Command setVoltagesCommand(DoubleSupplier left, DoubleSupplier right) {
    return this.run(() -> this.drivetrain.setVoltages(12 * left.getAsDouble(), 12 * right.getAsDouble())); 
  }

  public Command setVoltagesArcadeCommand(DoubleSupplier drive, DoubleSupplier steer) {
    return this.run(() -> {
      var speeds = DifferentialDrive.arcadeDriveIK(drive.getAsDouble(), steer.getAsDouble(), false);
      this.drivetrain.setVoltages(12 * (speeds.left), 12 * (-speeds.right));
    });
  }
  /** Creates a new drivetrain. */
  public drivetrain() {
    
    this.drivetrain = new drivetrainIOTalonSRX(); 

  }

 
}
