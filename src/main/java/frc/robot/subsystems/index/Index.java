// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.index;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IndexConstants;

public class Index extends SubsystemBase {
  
  IndexIO index;

  public Command setIndexVoltagesCommand(DoubleSupplier voltage) {
    return this.run(() -> this.index.setVoltage(voltage.getAsDouble()));
  }

  public Command setIndexVoltageArcadeCommand(double indexVoltage) {
    return this.run(() -> {
      this.index.setVoltage(indexVoltage * IndexConstants.theHolyVoltageMultiplier);
    });
  }

  public Index() {
    this.index = new IndexIOTalonSRX();
  }
}
