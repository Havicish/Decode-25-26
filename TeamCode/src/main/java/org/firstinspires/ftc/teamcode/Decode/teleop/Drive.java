package org.firstinspires.ftc.teamcode.Decode.teleop;

import com.qualcomm.robotcore.hardware.DcMotor;

public class Drive {
    private double flSpeed;
    private double frSpeed;
    private double blSpeed;
    private double brSpeed;

    private DcMotor flMotor;
    private DcMotor frMotor;
    private DcMotor blMotor;
    private DcMotor brMotor;

    private String currentState;

    public void init(DcMotor flDrive, DcMotor frDrive, DcMotor blDrive, DcMotor brDrive) {
        this.flMotor = flDrive;
        this.frMotor = frDrive;
        this.blMotor = blDrive;
        this.brMotor = brDrive;

        this.currentState = "idle";
    }

    public void moveInLocalDirection(Vector2 direction, double speed, double time) {

    }
}
