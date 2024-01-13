package frc.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.Intake;

public class Flywheel extends CommandBase {
   private final Intake intake;
   private final Joystick joy;
   
   public Flywheel(Intake intake, Joystick joy)
   {
     this.intake = intake;
     this.joy = joy;
     addRequirements(intake);
   }
 
  @Override
  public void initialize() {}

  @Override
  public void execute() {
    intake.setFlywheelPower(-joy.getRawAxis(3));
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}