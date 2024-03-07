









// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.VisionSubsystem;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;


public final class AutonDrive extends SequentialCommandGroup {

  private static final DriveSubsystem DriveTrainSubsystem = null;
  private DriveSubsystem m_DriveTrainSubsystem;



public AutonDrive(DriveSubsystem driveTrainSubsystem) {
    m_DriveTrainSubsystem = driveTrainSubsystem;
    

     System.out.println("AutonDrive starting");

    addCommands(
      new RunCommand(m_DriveTrainSubsystem::forwardSlow, m_DriveTrainSubsystem).withTimeout(2 ),
     // leave a non-ending stop command at the end of the sequence to ensure another command cannot start
        // for rest of auton period
        new RunCommand( m_DriveTrainSubsystem::stop, m_DriveTrainSubsystem )
    
    );
  }
 }

