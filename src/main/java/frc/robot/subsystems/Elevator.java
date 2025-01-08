package frc.robot.subsystems;


import com.ctre.phoenix6.hardware.TalonFX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Elevator extends SubsystemBase {
    private static Elevator INSTANCE;
    private final TalonFX leadDriveMotor;
    private final TalonFX followerDriveMotor;

    private final TalonFX leadTiltMotor;
    private final TalonFX followerTiltMotor;

    public static Elevator getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Elevator();
        }
        return INSTANCE;
    }

    private Elevator() {
        // TODO: Set the default command, if any, for this subsystem by calling setDefaultCommand(command)
        //       in the constructor or in the robot coordination class, such as RobotContainer.
        //       Also, you can call addChild(name, sendableChild) to associate sendables with the subsystem
        //       such as SpeedControllers, Encoders, DigitalInputs, etc.
        leadDriveMotor = new TalonFX();
    }
}

