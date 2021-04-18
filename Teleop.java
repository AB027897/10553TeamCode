

// Establishes that this is an FTC code
package org.firstinspires.ftc.teamcode.ftc10553;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

// Sets the preview name on the simulator
@TeleOp(name="DrivingPractice", group="LinearOpMode")

public class TeleOp extends LinearOpMode {


   // Establishes the motors and servos being used + telemetry elapsed time
   private ElapsedTime runtime = new ElapsedTime();
   private DcMotor front_left_motor = null;
   private DcMotor front_right_motor = null;
   private DcMotor back_left_motor = null;
   private DcMotor back_right_motor = null;
   private DcMotor shooter_left = null;
   private DcMotor shooter_right = null;
   private DcMotor bulldozer_left = null;
   private DcMotor bulldozer_right = null;
   private CRServo scoop_left = null;
   private CRServo scoop_right = null;
   private CRServo intake_left = null;
   private CRServo intake_right = null;
   private Servo aim_left = null;
   private Servo aim_right = null;
   double position = 0;
   final double servoPower = 0.3;
   final double shootingPower = 1;
   @Override
   public void runOpMode() {
       telemetry.addData("Status:", "TeleOp Initialized");
       telemetry.update();

// Connects the motor names to the actual configured motors on the robot control phone
       front_left_motor  = hardwareMap.get(DcMotor.class, "front_left_motor");
       front_right_motor = hardwareMap.get(DcMotor.class, "front_right_motor");
       back_left_motor  = hardwareMap.get(DcMotor.class, "back_left_motor");
       back_right_motor = hardwareMap.get(DcMotor.class, "back_right_motor");
       shooter_left = hardwareMap.get(DcMotor.class, "shooter_left");
       shooter_right = hardwareMap.get(DcMotor.class, "shooter_right");
       bulldozer_left = hardwareMap.get(DcMotor.class, "bulldozer_left");
       bulldozer_right = hardwareMap.get(DcMotor.class, "bulldozer_right");
       scoop_left = hardwareMap.get(CRServo.class, "scoop_left");
       scoop_right = hardwareMap.get(CRServo.class, "scoop_right");
       intake_left = hardwareMap.get(CRServo.class, "intake_left");
       intake_right = hardwareMap.get(CRServo.class, "intake_right");
       aim_left = hardwareMap.get(Servo.class, "aim_left");
       aim_right = hardwareMap.get(Servo.class, "aim_right");
       // Sets motor directions
       front_left_motor.setDirection(DcMotor.Direction.FORWARD);
       front_right_motor.setDirection(DcMotor.Direction.REVERSE);
       back_left_motor.setDirection(DcMotor.Direction.FORWARD);
       back_right_motor.setDirection(DcMotor.Direction.REVERSE);
       shooter_left.setDirection(DcMotor.Direction.FORWARD);
       shooter_right.setDirection(DcMotor.Direction.REVERSE);
       bulldozer_left.setDirection(DcMotor.Direction.FORWARD);
       bulldozer_right.setDirection(DcMotor.Direction.REVERSE);
       waitForStart();
       runtime.reset();
       // While this program is running (Init & Start)
       while (opModeIsActive()) {
           // Assigns variables to the motor powers
           double leftFrontPower;
           double rightFrontPower;
           double leftBackPower;
           double rightBackPower;
           double bulldozerPower;
           //Takes input from gamepads and assigns it to the variables attached to motor power
           double drive = -gamepad1.left_stick_y;
           double turn  = gamepad1.left_stick_x;
           double strafe = gamepad1.right_stick_x;
           double bulldozerLift = gamepad2.left_stick_x;
           double aimPos = gamepad2.left_trigger;
           double aimNeg = -gamepad2.right_trigger;
           //Takes input from gamepad2 buttons and sets the power for the scooper servos and the shooting servos.
           if(gamepad2.a) {
               scoop_left.setPower(servoPower);
               scoop_right.setPower(-servoPower);
           } else if(gamepad2.b) {
               scoop_left.setPower(-servoPower);
               scoop_right.setPower(servoPower);
           } else if(gamepad2.x){
               shooter_left.setPower(shootingPower);
               shooter_right.setPower(shootingPower);
           }
           //Takes input from gamepad1 buttons and sets the power for the intake servos.
           if(gamepad1.a) {
               intake_left.setPower(servoPower);
               intake_right.setPower(-servoPower);
           } else if(gamepad1.b) {
               intake_left.setPower(-servoPower);
               intake_right.setPower(servoPower);
           }
           // Has power amounts respond to joystick and makes sure the power isn’t over the maximum input of a motor
           leftFrontPower    = Range.clip(drive + strafe + turn, -1.0, 1.0) ;
           rightFrontPower   = Range.clip(drive - strafe - turn, -1.0, 1.0) ;
           leftBackPower = Range.clip(drive - strafe + turn , -1.0, 1.0);
           rightBackPower = Range.clip(drive + strafe - turn , -1.0, 1.0);
           bulldozerPower = Range.clip(bulldozerLift, -1.0, 1.0);
           position+= (aimPos + aimNeg)*0.1;
           // Has motors respond to input values.
           front_left_motor.setPower(leftFrontPower);
           front_right_motor.setPower(rightFrontPower);
           back_left_motor.setPower(leftBackPower);
           back_right_motor.setPower(rightBackPower);
           bulldozer_left.setPower(bulldozerPower);
           bulldozer_right.setPower(bulldozerPower);
           //Regular servos move to position.
           aim_left.setPosition(position);
           aim_right.setPosition(position);
            // Shows the power that the motors are running at as well as the time on the telemetry
           telemetry.addData("Status:", "Run Time: " + runtime.toString());
           telemetry.addData("Current Motor Powers", "front left (%.2f), front right (%.2f), back left (%.2f), back right (%.2f)", leftFrontPower, rightFrontPower, leftBackPower, rightBackPower);
           telemetry.update();
       }
   }
}


