package frc.lib.configs;

import com.ctre.phoenix6.configs.MotionMagicConfigs;

public class elevatorConfig {

    public final double leadDriveMotorID;
    public final double followerDriveMotorID;
    public final double leadTiltMotorID;
    public final double followerTiltMotorID;
    public final MotionMagicConfigs driveConfig;
    public final MotionMagicConfigs tiltConfig;

    public elevatorConfig(double ldmID, double fdmID, double ltmID, double ftmID, MotionMagicConfigs dc, MotionMagicConfigs tc) {
        leadDriveMotorID = ldmID;
        followerDriveMotorID = fdmID;
        leadTiltMotorID = ltmID;
        followerTiltMotorID = ftmID;
        driveConfig = dc;
        tiltConfig = tc;
    }



}
