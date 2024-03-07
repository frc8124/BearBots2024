package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.RunCommand;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.subsystems.DriveSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

public class AutonScore extends SequentialCommandGroup {
    
    private static final DriveSubsystem DriveTrainSubsystem = null;
    private DriveSubsystem m_DriveTrainSubsystem;
    private IntakeSubsystem m_IntakeSubsystem;


    public AutonScore(DriveSubsystem driveTrainSubsystem, IntakeSubsystem intakeSubsystem) {
     m_DriveTrainSubsystem = driveTrainSubsystem;
     m_IntakeSubsystem = intakeSubsystem;

     System.out.println("AutonScore starting");

    addCommands(
      new RunCommand(m_DriveTrainSubsystem::forwardSlow, m_DriveTrainSubsystem).withTimeout(0.5),
      new RunCommand(m_DriveTrainSubsystem::turnleft, m_DriveTrainSubsystem).withTimeout(1.58),
      new RunCommand(m_IntakeSubsystem::inward, m_IntakeSubsystem),
     // leave a non-ending stop command at the end of the sequence to ensure another command cannot start
        // for rest of auton period
        new RunCommand( m_DriveTrainSubsystem::stop, m_DriveTrainSubsystem )
    
    );
  }
}
