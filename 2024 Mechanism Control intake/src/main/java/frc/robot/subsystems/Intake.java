
package frc.robot.subsystems;

import frc.robot.Constants;
import frc.robot.RobotContainer;
import frc.robot.commands.*;

import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.*;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.InvertType;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

public class Intake extends SubsystemBase {
    private final WPI_TalonSRX FlyWheelTalon;
  
    public Intake() {
      FlyWheelTalon = new WPI_TalonSRX(Constants.IntakePorts.Flywheel);
      FlyWheelTalon.setInverted(false);
      FlyWheelTalon.configFactoryDefault();
    }

    public void setFlywheelPower(double speed) {
      FlyWheelTalon.set(ControlMode.PercentOutput, speed);
    }

    public double getCurrent() {
      return FlyWheelTalon.getStatorCurrent();
    }
  
    @Override
    public void periodic() {
    }
  }
  