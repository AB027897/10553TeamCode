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
@TeleOp(name="TeleOp2")

public class TeleOp2 extends LinearOpMode {


   // Establishes the motors and servos being used + telemetry elapsed time
   private ElapsedTime runtime = new ElapsedTime();
   private DcMotor front_left_motor = null;
   private DcMotor front_right_motor = null;
   private DcMotor back_left_motor = null;
   private DcMotor back_right_motor = null;
   private DcMotor lift  = null;
   private DcMotor pulley = null;
   private DcMotor shooter_left = null;
   private DcMotor shooter_right = null;
   private Servo feeder = null;
   private CRServo intake = null;
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
       lift = hardwareMap.get(DcMotor.class, "lift");
       pulley = hardwareMap.get(DcMotor.class, "pulley");
       feeder = hardwareMap.get(CRServo.class, "feeder");
       intake_servo = hardwareMap.get(Servo.class, "intake_servo");
       //Sets motor directions 
       front_left_motor.setDirection(DcMotor.Direction.REVERSE);
       front_right_motor.setDirection(DcMotor.Direction.FORWARD);
       back_left_motor.setDirection(DcMotor.Direction.REVERSE);
       back_right_motor.setDirection(DcMotor.Direction.FORWARD);
       shooter_left.setDirection(DcMotor.Direction.FORWARD);
       shooter_right.setDirection(DcMotor.Direction.REVERSE);
       lift.setDirection(DcMotor.Direction.FORWARD);
       pulley.setDirection(DcMotor.Direction.REVERSE);
       waitForStart();
       runtime.reset();
       // While this program is running (Init & Start)
       while (opModeIsActive()) {
           // Assigns variables to the motor powers
           double leftFrontPower;
           double rightFrontPower;
           double leftBackPower;
           double rightBackPower;
           double liftPower; 
           double 
           //Takes input from gamepads and assigns it to the variables attached to motor power
           double drive = -gamepad1.left_stick_y;
           double turn  = gamepad1.left_stick_x;
           double strafe = gamepad1.right_stick_x;
           double lift  = gamepad2.left_stick_y;
           double shoot = gamepad2.right_stick_y; 
           double intake= gamepad2.left_trigger;
           double reverseIntake = -gamepad2.right_trigger;
           //Takes input from gamepad2 buttons and sets the power for the scooper servos and the shooting servos.
           if(gamepad2.left_bumper) {
               scoop_left.setPower(servoPower);
               scoop_right.setPower(-servoPower);
           } else if(gamepad2.right_bumper) {
               scoop_left.setPower(-servoPower);
               scoop_right.setPower(servoPower);
           } 
           // Has power amounts respond to joystick and makes sure the power isn’t over the maximum input of a motor
           leftFrontPower    = Range.clip(drive + strafe + turn, -1.0, 1.0) ;
           rightFrontPower   = Range.clip(drive - strafe - turn, -1.0, 1.0) ;
           leftBackPower = Range.clip(drive - strafe + turn , -1.0, 1.0);
           rightBackPower = Range.clip(drive + strafe - turn , -1.0, 1.0);
           //position+= (aimPos + aimNeg)*0.1;
           // Has motors respond to input values.
           front_left_motor.setPower(leftFrontPower);
           front_right_motor.setPower(rightFrontPower);
           back_left_motor.setPower(leftBackPower);
           back_right_motor.setPower(rightBackPower);
           //Regular servos move to position.
           // Shows the power that the motors are running at as well as the time on the telemetry
           telemetry.addData("Status:", "Run Time: " + runtime.toString());
           telemetry.addData("Current Motor Powers", "front left (%.2f), front right (%.2f), back left (%.2f), back right (%.2f)", leftFrontPower, rightFrontPower, leftBackPower, rightBackPower);
           telemetry.update();
       }
   }
}
