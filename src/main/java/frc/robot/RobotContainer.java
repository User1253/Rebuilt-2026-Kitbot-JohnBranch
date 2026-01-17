// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.Constants.OperatorConstants;
import frc.robot.Constants.TowerConstants;
import frc.robot.subsystems.drive.drivetrain;
import frc.robot.subsystems.index.Index;
import frc.robot.subsystems.tower.TowerSparkMax;
import frc.robot.subsystems.tower.TowerSubsystem;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;

public class RobotContainer {
  private final CommandXboxController controller = new CommandXboxController(OperatorConstants.kDriverControllerPort);
  // private final TowerSubsystem towerSubsystem;
  
  // private final Index index;

  private final drivetrain drivetrain; 

    private double modifyJoystick(double in) {
    if (Math.abs(in) < 0.1){
      return 0; 
    }
    return in * in * Math.signum(in);
  }

  public RobotContainer() {
    // towerSubsystem = new TowerSubsystem(new TowerSparkMax());
    // index = new Index();
    drivetrain = new drivetrain(); 
    configureBindings();
  }

  private void configureBindings() {
    // controller.leftTrigger().whileTrue(intake());
    // controller.rightTrigger().whileTrue(outake());

    this.drivetrain.setDefaultCommand(
      this.drivetrain.setVoltagesArcadeCommand(
        () -> modifyJoystick(-controller.getLeftY()),
        () -> modifyJoystick(-controller.getRightX())));
  
  }

  // public Command outake() {
  //   return towerSubsystem.setVolts(TowerConstants.speed).alongWith(index.setIndexVoltageArcadeCommand(1.0));
  // }

  // public Command intake() {
  //   return towerSubsystem.setVolts(TowerConstants.speed);
  // }

  public Command getAutonomousCommand() {
      return Commands.print("Hi Sujit"); 
  }
}