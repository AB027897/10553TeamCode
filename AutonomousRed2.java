
package org.firstinspires.ftc.teamcode.ftc16072;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Autonomous [red right]", group="Anonymouse")

//Note: Designed to operate from second red line (hence Red2)
public class AutonomousRed2 extends LinearOpMode {
   DcMotor front_left_motor;
   DcMotor front_right_motor;
   DcMotor back_left_motor;
   DcMotor back_right_motor;
   String outcome;

   @Override
   public void runOpMode() throws InterruptedException {
       front_left_motor = hardwareMap.get(DcMotor.class, "front_left_motor");
       front_right_motor = hardwareMap.get(DcMotor.class, "front_right_motor");
       back_left_motor = hardwareMap.get(DcMotor.class, "back_left_motor");
       back_right_motor = hardwareMap.get(DcMotor.class, "back_right_motor");

       front_left_motor.setDirection(DcMotor.Direction.FORWARD);
       front_right_motor.setDirection(DcMotor.Direction.REVERSE);
       back_left_motor.setDirection(DcMotor.Direction.FORWARD);
       back_right_motor.setDirection(DcMotor.Direction.REVERSE);

       front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


       telemetry.addData("Mode", "waiting");
       telemetry.update();

       waitForStart();

       telemetry.addData("Mode", "running");
       telemetry.update();

       front_left_motor.setTargetPosition(-2500);
       front_right_motor.setTargetPosition(-2500);
       back_left_motor.setTargetPosition(-2500);
       back_right_motor.setTargetPosition(-2500);
       front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_left_motor.setPower(0.75);
       front_right_motor.setPower(0.75);
       back_left_motor.setPower(0.75);
       back_right_motor.setPower(0.75);
       while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
       {
           telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
           telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
           telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
           telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
           telemetry.update();
           idle();
       }
       front_left_motor.setPower(0.0);
       front_right_motor.setPower(0.0);
       back_left_motor.setPower(0.0);
       back_right_motor.setPower(0.0);
       front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

       front_left_motor.setTargetPosition(2125);
       front_right_motor.setTargetPosition(-2125);
       back_left_motor.setTargetPosition(2125);
       back_right_motor.setTargetPosition(-2125);
       front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_left_motor.setPower(1.00);
       front_right_motor.setPower(1.00);
       back_left_motor.setPower(1.00);
       back_right_motor.setPower(1.00);
       while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
       {
           telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
           telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
           telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
           telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
           telemetry.update();
           idle();
       }
       front_left_motor.setPower(0.0);
       front_right_motor.setPower(0.0);
       back_left_motor.setPower(0.0);
       back_right_motor.setPower(0.0);
       front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

       front_left_motor.setTargetPosition(-1000);
       front_right_motor.setTargetPosition(-1000);
       back_left_motor.setTargetPosition(-1000);
       back_right_motor.setTargetPosition(-1000);
       front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_left_motor.setPower(0.75);
       front_right_motor.setPower(0.75);
       back_left_motor.setPower(0.75);
       back_right_motor.setPower(0.75);
       while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
       {
           telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
           telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
           telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
           telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
           telemetry.update();
           idle();
       }
       front_left_motor.setPower(0.0);
       front_right_motor.setPower(0.0);
       back_left_motor.setPower(0.0);
       back_right_motor.setPower(0.0);
       front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

       front_left_motor.setTargetPosition(-2125);
       front_right_motor.setTargetPosition(2125);
       back_left_motor.setTargetPosition(-2125);
       back_right_motor.setTargetPosition(2125);
       front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_left_motor.setPower(1.00);
       front_right_motor.setPower(1.00);
       back_left_motor.setPower(1.00);
       back_right_motor.setPower(1.00);
       while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
       {
           telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
           telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
           telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
           telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
           telemetry.update();
           idle();
       }
       front_left_motor.setPower(0.0);
       front_right_motor.setPower(0.0);
       back_left_motor.setPower(0.0);
       back_right_motor.setPower(0.0);
       front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

       front_left_motor.setTargetPosition(-250);
       front_right_motor.setTargetPosition(-250);
       back_left_motor.setTargetPosition(-250);
       back_right_motor.setTargetPosition(-250);
       front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_left_motor.setPower(0.75);
       front_right_motor.setPower(0.75);
       back_left_motor.setPower(0.75);
       back_right_motor.setPower(0.75);
       while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
       {
           telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
           telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
           telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
           telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
           telemetry.update();
           idle();
       }
       front_left_motor.setPower(0.0);
       front_right_motor.setPower(0.0);
       back_left_motor.setPower(0.0);
       back_right_motor.setPower(0.0);
       front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER); 
       
      front_left_motor.setTargetPosition(250);
       front_right_motor.setTargetPosition(250);
       back_left_motor.setTargetPosition(250);
       back_right_motor.setTargetPosition(250);
       front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_left_motor.setPower(0.75);
       front_right_motor.setPower(0.75);
       back_left_motor.setPower(0.75);
       back_right_motor.setPower(0.75);
       while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
       {
           telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
           telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
           telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
           telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
           telemetry.update();
           idle();
       }
       front_left_motor.setPower(0.0);
       front_right_motor.setPower(0.0);
       back_left_motor.setPower(0.0);
       back_right_motor.setPower(0.0);
       front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);


       //pause for 2 seconds, insert sensor/vuforia work here
       resetStartTime();
       while (opModeIsActive() && getRuntime() < 2) {
           idle();
       }

       {  //if: at least 1 ring is spotted (outcomes B or C)
           { //if: (outcome C)
                outcome = "C";
                
       front_left_motor.setTargetPosition(250);
       front_right_motor.setTargetPosition(250);
       back_left_motor.setTargetPosition(250);
       back_right_motor.setTargetPosition(250);
       front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_left_motor.setPower(0.75);
       front_right_motor.setPower(0.75);
       back_left_motor.setPower(0.75);
       back_right_motor.setPower(0.75);
       while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
       {
           telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
           telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
           telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
           telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
           telemetry.update();
           idle();
       }
       front_left_motor.setPower(0.0);
       front_right_motor.setPower(0.0);
       back_left_motor.setPower(0.0);
       back_right_motor.setPower(0.0);
       front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(2125);
               front_right_motor.setTargetPosition(-2125);
               back_left_motor.setTargetPosition(2125);
               back_right_motor.setTargetPosition(-2125);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(0.75);
               front_right_motor.setPower(0.75);
               back_left_motor.setPower(0.75);
               back_right_motor.setPower(0.75);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(-1500);
               front_right_motor.setTargetPosition(-1500);
               back_left_motor.setTargetPosition(-1500);
               back_right_motor.setTargetPosition(-1500);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(0.75);
               front_right_motor.setPower(0.75);
               back_left_motor.setPower(0.75);
               back_right_motor.setPower(0.75);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(-2125);
               front_right_motor.setTargetPosition(2125);
               back_left_motor.setTargetPosition(-2125);
               back_right_motor.setTargetPosition(2125);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(1.00);
               front_right_motor.setPower(1.00);
               back_left_motor.setPower(1.00);
               back_right_motor.setPower(1.00);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(-8000);
               front_right_motor.setTargetPosition(-8000);
               back_left_motor.setTargetPosition(-8000);
               back_right_motor.setTargetPosition(-8000);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(0.75);
               front_right_motor.setPower(0.75);
               back_left_motor.setPower(0.75);
               back_right_motor.setPower(0.75);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(-2125);
               front_right_motor.setTargetPosition(2125);
               back_left_motor.setTargetPosition(-2125);
               back_right_motor.setTargetPosition(2125);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(1.00);
               front_right_motor.setPower(1.00);
               back_left_motor.setPower(1.00);
               back_right_motor.setPower(1.00);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(-1750);
               front_right_motor.setTargetPosition(-1750);
               back_left_motor.setTargetPosition(-1750);
               back_right_motor.setTargetPosition(-1750);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(0.75);
               front_right_motor.setPower(0.75);
               back_left_motor.setPower(0.75);
               back_right_motor.setPower(0.75);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               // This is where the wobble goal will be dropped

               front_left_motor.setTargetPosition(2500);
               front_right_motor.setTargetPosition(2500);
               back_left_motor.setTargetPosition(2500);
               back_right_motor.setTargetPosition(2500);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(0.75);
               front_right_motor.setPower(0.75);
               back_left_motor.setPower(0.75);
               back_right_motor.setPower(0.75);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(2125);
               front_right_motor.setTargetPosition(-2125);
               back_left_motor.setTargetPosition(2125);
               back_right_motor.setTargetPosition(-2125);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(1.00);
               front_right_motor.setPower(1.00);
               back_left_motor.setPower(1.00);
               back_right_motor.setPower(1.00);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(4000);
               front_right_motor.setTargetPosition(4000);
               back_left_motor.setTargetPosition(4000);
               back_right_motor.setTargetPosition(4000);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(0.75);
               front_right_motor.setPower(0.75);
               back_left_motor.setPower(0.75);
               back_right_motor.setPower(0.75);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

           } // else if (outcome B) {
           outcome = "B";
           
      front_left_motor.setTargetPosition(250);
       front_right_motor.setTargetPosition(250);
       back_left_motor.setTargetPosition(250);
       back_right_motor.setTargetPosition(250);
       front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_left_motor.setPower(0.75);
       front_right_motor.setPower(0.75);
       back_left_motor.setPower(0.75);
       back_right_motor.setPower(0.75);
       while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
       {
           telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
           telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
           telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
           telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
           telemetry.update();
           idle();
       }
       front_left_motor.setPower(0.0);
       front_right_motor.setPower(0.0);
       back_left_motor.setPower(0.0);
       back_right_motor.setPower(0.0);
       front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

           front_left_motor.setTargetPosition(2125);
           front_right_motor.setTargetPosition(-2125);
           back_left_motor.setTargetPosition(2125);
           back_right_motor.setTargetPosition(-2125);
           front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_left_motor.setPower(1.00);
           front_right_motor.setPower(1.00);
           back_left_motor.setPower(1.00);
           back_right_motor.setPower(1.00);
           while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
           {
               telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
               telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
               telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
               telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
               telemetry.addData("Outcome Sensed:", outcome);
               telemetry.update();
               idle();
           }
           front_left_motor.setPower(0.0);
           front_right_motor.setPower(0.0);
           back_left_motor.setPower(0.0);
           back_right_motor.setPower(0.0);
           front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

           front_left_motor.setTargetPosition(-1500);
           front_right_motor.setTargetPosition(-1500);
           back_left_motor.setTargetPosition(-1500);
           back_right_motor.setTargetPosition(-1500);
           front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_left_motor.setPower(0.75);
           front_right_motor.setPower(0.75);
           back_left_motor.setPower(0.75);
           back_right_motor.setPower(0.75);
           while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
           {
               telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
               telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
               telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
               telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
               telemetry.addData("Outcome Sensed:", outcome);
               telemetry.update();
               idle();
           }
           front_left_motor.setPower(0.0);
           front_right_motor.setPower(0.0);
           back_left_motor.setPower(0.0);
           back_right_motor.setPower(0.0);
           front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

           front_left_motor.setTargetPosition(-2125);
           front_right_motor.setTargetPosition(2125);
           back_left_motor.setTargetPosition(-2125);
           back_right_motor.setTargetPosition(2125);
           front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_left_motor.setPower(1.00);
           front_right_motor.setPower(1.00);
           back_left_motor.setPower(1.00);
           back_right_motor.setPower(1.00);
           while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
           {
               telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
               telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
               telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
               telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
               telemetry.addData("Outcome Sensed:", outcome);
               telemetry.update();
               idle();
           }
           front_left_motor.setPower(0.0);
           front_right_motor.setPower(0.0);
           back_left_motor.setPower(0.0);
           back_right_motor.setPower(0.0);
           front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

           front_left_motor.setTargetPosition(-5750);
           front_right_motor.setTargetPosition(-5750);
           back_left_motor.setTargetPosition(-5750);
           back_right_motor.setTargetPosition(-5750);
           front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_left_motor.setPower(0.75);
           front_right_motor.setPower(0.75);
           back_left_motor.setPower(0.75);
           back_right_motor.setPower(0.75);
           while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
           {
               telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
               telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
               telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
               telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
               telemetry.addData("Outcome Sensed:", outcome);
               telemetry.update();
               idle();
           }
           front_left_motor.setPower(0.0);
           front_right_motor.setPower(0.0);
           back_left_motor.setPower(0.0);
           back_right_motor.setPower(0.0);
           front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

           front_left_motor.setTargetPosition(-2125);
           front_right_motor.setTargetPosition(2125);
           back_left_motor.setTargetPosition(-2125);
           back_right_motor.setTargetPosition(2125);
           front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_left_motor.setPower(1.00);
           front_right_motor.setPower(1.00);
           back_left_motor.setPower(1.00);
           back_right_motor.setPower(1.00);
           while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
           {
               telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
               telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
               telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
               telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
               telemetry.addData("Outcome Sensed:", outcome);
               telemetry.update();
               idle();
           }
           front_left_motor.setPower(0.0);
           front_right_motor.setPower(0.0);
           back_left_motor.setPower(0.0);
           back_right_motor.setPower(0.0);
           front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

           front_left_motor.setTargetPosition(-750);
           front_right_motor.setTargetPosition(-750);
           back_left_motor.setTargetPosition(-750);
           back_right_motor.setTargetPosition(-750);
           front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_left_motor.setPower(0.75);
           front_right_motor.setPower(0.75);
           back_left_motor.setPower(0.75);
           back_right_motor.setPower(0.75);
           while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
           {
               telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
               telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
               telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
               telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
               telemetry.addData("Outcome Sensed:", outcome);
               telemetry.update();
               idle();
           }
           front_left_motor.setPower(0.0);
           front_right_motor.setPower(0.0);
           back_left_motor.setPower(0.0);
           back_right_motor.setPower(0.0);
           front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

           front_left_motor.setTargetPosition(1000);
           front_right_motor.setTargetPosition(1000);
           back_left_motor.setTargetPosition(1000);
           back_right_motor.setTargetPosition(1000);
           front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_left_motor.setPower(0.75);
           front_right_motor.setPower(0.75);
           back_left_motor.setPower(0.75);
           back_right_motor.setPower(0.75);
           while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
           {
               telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
               telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
               telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
               telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
               telemetry.addData("Outcome Sensed:", outcome);
               telemetry.update();
               idle();
           }
           front_left_motor.setPower(0.0);
           front_right_motor.setPower(0.0);
           back_left_motor.setPower(0.0);
           back_right_motor.setPower(0.0);
           front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

           front_left_motor.setTargetPosition(2125);
           front_right_motor.setTargetPosition(-2125);
           back_left_motor.setTargetPosition(2125);
           back_right_motor.setTargetPosition(-2125);
           front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_left_motor.setPower(1.00);
           front_right_motor.setPower(1.00);
           back_left_motor.setPower(1.00);
           back_right_motor.setPower(1.00);
           while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
           {
               telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
               telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
               telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
               telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
               telemetry.addData("Outcome Sensed:", outcome);
               telemetry.update();
               idle();
           }
           front_left_motor.setPower(0.0);
           front_right_motor.setPower(0.0);
           back_left_motor.setPower(0.0);
           back_right_motor.setPower(0.0);
           front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

           front_left_motor.setTargetPosition(2000);
           front_right_motor.setTargetPosition(2000);
           back_left_motor.setTargetPosition(2000);
           back_right_motor.setTargetPosition(2000);
           front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
           front_left_motor.setPower(0.75);
           front_right_motor.setPower(0.75);
           back_left_motor.setPower(0.75);
           back_right_motor.setPower(0.75);
           while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
           {
               telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
               telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
               telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
               telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
               telemetry.addData("Outcome Sensed:", outcome);
               telemetry.update();
               idle();
           }
           front_left_motor.setPower(0.0);
           front_right_motor.setPower(0.0);
           back_left_motor.setPower(0.0);
           back_right_motor.setPower(0.0);
           front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
           back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       }
           }

           {//else if nothing is seen (outcome A)
               outcome = "A";
               
       front_left_motor.setTargetPosition(250);
       front_right_motor.setTargetPosition(250);
       back_left_motor.setTargetPosition(250);
       back_right_motor.setTargetPosition(250);
       front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_left_motor.setPower(0.75);
       front_right_motor.setPower(0.75);
       back_left_motor.setPower(0.75);
       back_right_motor.setPower(0.75);
       while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
       {
           telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
           telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
           telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
           telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
           telemetry.update();
           idle();
       }
       front_left_motor.setPower(0.0);
       front_right_motor.setPower(0.0);
       back_left_motor.setPower(0.0);
       back_right_motor.setPower(0.0);
       front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               
               front_left_motor.setTargetPosition(-2125);
               front_right_motor.setTargetPosition(2125);
               back_left_motor.setTargetPosition(-2125);
               back_right_motor.setTargetPosition(2125);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(1.00);
               front_right_motor.setPower(1.00);
               back_left_motor.setPower(1.00);
               back_right_motor.setPower(1.00);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(-2125);
               front_right_motor.setTargetPosition(-2125);
               back_left_motor.setTargetPosition(-2125);
               back_right_motor.setTargetPosition(-2125);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(0.75);
               front_right_motor.setPower(0.75);
               back_left_motor.setPower(0.75);
               back_right_motor.setPower(0.75);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(2125);
               front_right_motor.setTargetPosition(-2125);
               back_left_motor.setTargetPosition(2125);
               back_right_motor.setTargetPosition(-2125);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(1.00);
               front_right_motor.setPower(1.00);
               back_left_motor.setPower(1.00);
               back_right_motor.setPower(1.00);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(-3500);
               front_right_motor.setTargetPosition(-3500);
               back_left_motor.setTargetPosition(-3500);
               back_right_motor.setTargetPosition(-3500);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(0.75);
               front_right_motor.setPower(0.75);
               back_left_motor.setPower(0.75);
               back_right_motor.setPower(0.75);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(1500);
               front_right_motor.setTargetPosition(1500);
               back_left_motor.setTargetPosition(1500);
               back_right_motor.setTargetPosition(1500);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(0.75);
               front_right_motor.setPower(0.75);
               back_left_motor.setPower(0.75);
               back_right_motor.setPower(0.75);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(2125);
               front_right_motor.setTargetPosition(-2125);
               back_left_motor.setTargetPosition(2125);
               back_right_motor.setTargetPosition(-2125);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(1.00);
               front_right_motor.setPower(1.00);
               back_left_motor.setPower(1.00);
               back_right_motor.setPower(1.00);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(-4000);
               front_right_motor.setTargetPosition(-4000);
               back_left_motor.setTargetPosition(-4000);
               back_right_motor.setTargetPosition(-4000);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(0.75);
               front_right_motor.setPower(0.75);
               back_left_motor.setPower(0.75);
               back_right_motor.setPower(0.75);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(-2125);
               front_right_motor.setTargetPosition(2125);
               back_left_motor.setTargetPosition(-2125);
               back_right_motor.setTargetPosition(2125);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(1.00);
               front_right_motor.setPower(1.00);
               back_left_motor.setPower(1.00);
               back_right_motor.setPower(1.00);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

               front_left_motor.setTargetPosition(-2125);
               front_right_motor.setTargetPosition(-2125);
               back_left_motor.setTargetPosition(-2125);
               back_right_motor.setTargetPosition(-2125);
               front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
               front_left_motor.setPower(0.75);
               front_right_motor.setPower(0.75);
               back_left_motor.setPower(0.75);
               back_right_motor.setPower(0.75);
               while (opModeIsActive() && front_left_motor.isBusy())   //leftMotor.getCurrentPosition() < leftMotor.getTargetPosition())
               {
                   telemetry.addData("F.Left Count:", front_left_motor.getCurrentPosition() + "  busy=" + front_left_motor.isBusy());
                   telemetry.addData("F.Right Count:", front_right_motor.getCurrentPosition() + "  busy=" + front_right_motor.isBusy());
                   telemetry.addData("B.Left Count:", back_left_motor.getCurrentPosition() + "  busy=" + back_left_motor.isBusy());
                   telemetry.addData("B.Right Count:", back_right_motor.getCurrentPosition() + "  busy=" + back_right_motor.isBusy());
                   telemetry.addData("Outcome Sensed:", outcome);
                   telemetry.update();
                   idle();
               }
               front_left_motor.setPower(0.0);
               front_right_motor.setPower(0.0);
               back_left_motor.setPower(0.0);
               back_right_motor.setPower(0.0);
               front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
               back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

           }

           // Insert power shot here (Adam help plz)
           // Hopefully all outcomes will have the bot parking in the same spot so the shot can be aimed well
           // no matter what

       }
