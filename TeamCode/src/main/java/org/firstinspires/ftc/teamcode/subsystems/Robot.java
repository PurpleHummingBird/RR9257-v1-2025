package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;

import static org.firstinspires.ftc.teamcode.commands.State.*;

//import org.firstinspires.ftc.robotcore.external.*;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.commands.State;

public class Robot {

    public Drivetrain drivetrain;
    public Arm arm;
    public Claw claw;
    Telemetry telemetry;

    public Robot(HardwareMap hardwareMap, Telemetry telemetry){
        this.telemetry = telemetry;

        drivetrain = new Drivetrain(hardwareMap);
        arm = new Arm(hardwareMap);
        claw = new Claw(hardwareMap);
    }
}
