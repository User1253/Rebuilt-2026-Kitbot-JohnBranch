// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

public final class Constants {
  public static class OperatorConstants {
    public static final int kDriverControllerPort = 0;
  }

  public class IndexConstants {
    public static final int theIdentitificationNumbertThatAllowsUsProgrammersToEasilyRecongnizeTheMotorResponsibleForTheIndexingOfTheGamePieceWhichIsKnownAsFuelThisVariableIsOtherWiseKnownAsTheMotorIDOfTheIndexerMotor = 2;
    
    public static final double theHolyVoltageMultiplier = 0.67;
  }

  public static class TowerConstants {
    public static final int RollerID = 1;
    public static final int RollerMotorCurrentLimit = 60;

    public static final double speed = 1.0;
  }

  public static class DrivetrainConstants {
    public static final int leftFrontTalonID = 1; 
    public static final int leftBackTalonID = 3; 
    public static final int rightFrontTalonID = 2; 
    public static final int rightBackTalonID = 4; 

    public static final int currentLimit = 60;
  }
}
