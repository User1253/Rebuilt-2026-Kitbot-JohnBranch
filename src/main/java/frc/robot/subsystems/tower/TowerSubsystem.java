// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.tower;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class TowerSubsystem extends SubsystemBase {

    private TowerIO tower;
    
    public TowerSubsystem(TowerIO _tower){
        tower = _tower;
    }

    public Command setVolts(double volts){
        return this.run(() -> tower.setRollerVolts(volts));
    }
}
 