package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.VictorSPXControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase {
    
    private VictorSPX m_armUp;
    private final static int intakeDeviceID3 = 3;


     public ArmSubsystem() {

        m_armUp = new VictorSPX(intakeDeviceID3);
        m_armUp.configFactoryDefault();

    }

    public void setSpeed(double speed) {
        m_armUp.set(VictorSPXControlMode.PercentOutput, speed);
    
    }    

    public void up(){
        setSpeed(1);
    }

    
    public void down(){
        setSpeed(-1);
    }

}
