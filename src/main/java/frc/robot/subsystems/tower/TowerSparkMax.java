// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems.tower;

import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.PersistMode;
import com.revrobotics.ResetMode;
import com.revrobotics.spark.SparkMax;

import frc.robot.Constants.TowerConstants;

public class TowerSparkMax implements TowerIO {
    private SparkMax roller;

    public TowerSparkMax() {
        roller = new SparkMax(TowerConstants.RollerID, MotorType.kBrushless);

        SparkMaxConfig rollerConfig = new SparkMaxConfig();
        rollerConfig.inverted(true);
        rollerConfig.smartCurrentLimit(TowerConstants.RollerMotorCurrentLimit);
        roller.configure(rollerConfig, ResetMode.kResetSafeParameters, PersistMode.kNoPersistParameters);
    }

    @Override
    public void setRollerVolts(double speed) {
        roller.set(speed);
    }
}