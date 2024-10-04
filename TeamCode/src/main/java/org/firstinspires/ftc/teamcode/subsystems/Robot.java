package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.hardware.HardwareMap;

import static org.firstinspires.ftc.teamcode.commands.State.*;

//import org.firstinspires.ftc.robotcore.external.*;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.commands.State;

public class Robot {

    public Drivetrain drivetrain;
    public LinearActuator actuator;
    public Arm arm;
    public Claw claw;
    public LinearSlides slide;
    private State state;
    public Intake intake;
    public Launcher plane;
    Telemetry telemetry;

    public Robot(HardwareMap hardwareMap, Telemetry telemetry){
        this.telemetry = telemetry;

        drivetrain = new Drivetrain(hardwareMap);
        actuator = new LinearActuator(hardwareMap);
        arm = new Arm(hardwareMap);
        claw = new Claw(hardwareMap);
        slide = new LinearSlides(hardwareMap);
        intake = new Intake(hardwareMap);
        plane = new Launcher(hardwareMap);
    }

    public void setPosition(State state){
        //actuator.setPosition(state);
        //slide.setPosition(state);
        //claw.setPosition(state);
        this.state = state;
    }

    public void setState(State state){this.state = state;}
    public State getState(){
        return state;
    }
}
