package org.firstinspires.ftc.teamcode.opmodes.auto;

import com.acmerobotics.dashboard.config.*;
import com.qualcomm.robotcore.eventloop.opmode.*;

import org.firstinspires.ftc.teamcode.roadrunner.drive.old.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.subsystems.*;

@Config
public abstract class BlueRight extends LinearOpMode {
    Robot bot;
    SampleMecanumDrive drive;
    //other parts of the bot

    //trajectory sequences

    @Override
    public void runOpMode() {
        telemetry.addLine("Status: Initializing");
        telemetry.update();

        bot = new Robot(hardwareMap, telemetry);
        drive = new SampleMecanumDrive(hardwareMap);





    }
}
