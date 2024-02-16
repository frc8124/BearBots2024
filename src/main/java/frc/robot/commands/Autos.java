// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.VisionSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.math.geometry.Pose3d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.geometry.Rotation3d;
import edu.wpi.first.math.geometry.Transform2d;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.math.geometry.Translation2d;
import edu.wpi.first.math.geometry.Translation3d;

public class Autos extends SequentialCommandGroup {

  private static final Translation3d upTranslation = new Translation3d(0.0, 0.0, 1.0);
  private static final Translation3d leftTranslation = new Translation3d(0.0, 1.0, 0.0);
  private static final Translation3d downTranslation = new Translation3d(0.0, 0.0, -1.0);
  private static final Translation3d rightTranslation = new Translation3d(0.0, -1.0, 0.0);
  public static Command exampleAuto(DriveSubsystem m_DriveTrainSubsystem) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'exampleAuto'");
  }
}
