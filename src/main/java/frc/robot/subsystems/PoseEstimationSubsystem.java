package frc.robot.subsystems;

import static edu.wpi.first.apriltag.AprilTagFieldLayout.OriginPosition.kBlueAllianceWallRightSide;
import static edu.wpi.first.apriltag.AprilTagFieldLayout.OriginPosition.kRedAllianceWallRightSide;

import java.util.function.Supplier;

import edu.wpi.first.apriltag.AprilTagFieldLayout.OriginPosition;
import edu.wpi.first.math.VecBuilder;
import edu.wpi.first.math.Vector;
import edu.wpi.first.math.estimator.DifferentialDrivePoseEstimator;
import edu.wpi.first.math.estimator.SwerveDrivePoseEstimator;
import edu.wpi.first.math.geometry.Pose2d;
import edu.wpi.first.math.geometry.Rotation2d;
import edu.wpi.first.math.numbers.N3;
import edu.wpi.first.wpilibj.DriverStation.Alliance;
import edu.wpi.first.wpilibj.Notifier;
import edu.wpi.first.wpilibj.smartdashboard.Field2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.DriveTrainConstants;
import frc.robot.Constants;


public class PoseEstimationSubsystem extends SubsystemBase {
    
    private static final Vector<N3> stateStdDevs = VecBuilder.fill(0.1, 0.1, 0.1);

    private static final Vector<N3> visionMeasurementStdDevs = VecBuilder.fill(1.5, 1.5, 1.5);

  //private final Supplier<Rotation2d> rotationSupplier;
  //private final DifferentialDrivePoseEstimator poseEstimator;
  private final Field2d field2d = new Field2d();
 // private final Notifier photonNotifier = new Notifier(photonEstimator);
}
 