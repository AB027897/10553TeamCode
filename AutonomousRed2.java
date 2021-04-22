package org.firstinspires.ftc.teamcode.ftc16072;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import org.firstinspires.ftc.robotcore.external.ClassFactory;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer;
import org.firstinspires.ftc.robotcore.external.navigation.VuforiaLocalizer.CameraDirection;
import org.firstinspires.ftc.robotcore.external.tfod.Recognition;
import org.firstinspires.ftc.robotcore.external.tfod.TFObjectDetector;

import java.util.List;

@com.qualcomm.robotcore.eventloop.opmode.Autonomous(name="Autonomous [red right]", group="Anonymouse")

//Note: Designed thus far to operate from second blue line (hence Blue2)
public class AutonomousRed2 extends LinearOpMode {
   DcMotor front_left_motor;
   DcMotor front_right_motor;
   DcMotor back_left_motor;
   DcMotor back_right_motor;
   String outcome = "";
   int position = 0;
   private static final String TFOD_MODEL_ASSET = "UltimateGoal.tflite";
   private static final String LABEL_FIRST_ELEMENT = "Quad";
   private static final String LABEL_SECOND_ELEMENT = "Single";
   private static final String VUFORIA_KEY =
           "AVgDgHH/////AAABmYSjDOxUjkoloTDlPbTfcxMdY+UnPMMGHvIoENz7ljjIJLU7u/WzCXUMDrkDD3rtaVaTTqHY2RiMeeBO0+nWwRe3aHkzxtpSa0LEdicMGhjyk0JyTKusUjg3l0kj1xYOmTidIjIlCc18/Z3FKZTBKEwZrSgakYxiot2r4zBdXcyMekArDle5NCxpDHATu261ZnwhBJc7UKazEkRCbtn9qaN0a5dB0kX3dhGxrargryTg0AuEj17NaXxy8tnq10HEXb2NiwvOJVFiw3YJhEMvyUq5bmY/c0yEchStOyy2bOswp5xtXE5+Qwy8Ty474gYH5ROWRdwrf+6mzFtS4CGdotST1dAOo3uuMgcTNvxsU4CZ ";
   private VuforiaLocalizer vuforia;
   private TFObjectDetector tfod;

   public void encoder(int position) {
       front_left_motor.setTargetPosition(position);
       front_right_motor.setTargetPosition(position);
       back_left_motor.setTargetPosition(position);
       back_right_motor.setTargetPosition(position);
       front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_left_motor.setPower(0.5);
       front_right_motor.setPower(0.5);
       back_left_motor.setPower(0.5);
       back_right_motor.setPower(0.5);
       while (opModeIsActive() && front_left_motor.getCurrentPosition() < front_left_motor.getTargetPosition()) {
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

   public void right_turn() {
       front_left_motor.setTargetPosition(-2125);
       front_right_motor.setTargetPosition(2125);
       back_left_motor.setTargetPosition(-2125);
       back_right_motor.setTargetPosition(2125);
       front_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_left_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       back_right_motor.setMode(DcMotor.RunMode.RUN_TO_POSITION);
       front_left_motor.setPower(0.75);
       front_right_motor.setPower(0.75);
       back_left_motor.setPower(0.75);
       back_right_motor.setPower(0.75);
       while (opModeIsActive() && front_left_motor.getCurrentPosition() < front_left_motor.getTargetPosition()) {
           idle();
       }
       front_right_motor.setPower(0.0);
       back_left_motor.setPower(0.0);
       back_right_motor.setPower(0.0);
       front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);

   }

   public void left_turn() {
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
       while (opModeIsActive() && front_left_motor.getCurrentPosition() < front_left_motor.getTargetPosition()) {
           idle();
       }
       front_right_motor.setPower(0.0);
       back_left_motor.setPower(0.0);
       back_right_motor.setPower(0.0);
       front_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       front_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_left_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
       back_right_motor.setMode(DcMotor.RunMode.STOP_AND_RESET_ENCODER);
   }
   private void initVuforia() {

       VuforiaLocalizer.Parameters parameters = new VuforiaLocalizer.Parameters();

       parameters.vuforiaLicenseKey = VUFORIA_KEY;
       parameters.cameraDirection = CameraDirection.BACK;

       vuforia = ClassFactory.getInstance().createVuforia(parameters);
   }

   private void initTfod() {
       int tfodMonitorViewId = hardwareMap.appContext.getResources().getIdentifier(
               "tfodMonitorViewId", "id", hardwareMap.appContext.getPackageName());
       TFObjectDetector.Parameters tfodParameters = new TFObjectDetector.Parameters(tfodMonitorViewId);
       tfodParameters.minResultConfidence = 0.8f;
       tfod = ClassFactory.getInstance().createTFObjectDetector(tfodParameters, vuforia);
       tfod.loadModelFromAsset(TFOD_MODEL_ASSET, LABEL_FIRST_ELEMENT, LABEL_SECOND_ELEMENT);
   }


   @Override

   public void runOpMode() throws InterruptedException {
       telemetry.addData("outcome:", outcome);
       telemetry.update();
       initVuforia();
       initTfod();
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
       if (tfod != null) {
           tfod.activate();
           tfod.setZoom(2.5, 16.0/9.0);
       }


       telemetry.addData("Mode", "waiting");
       telemetry.update();

       waitForStart();

       telemetry.addData("Mode", "running");
       telemetry.update();

       encoder(-2500);
       left_turn();
       encoder(-1000);
       right_turn();
       encoder(-250);

       List<Recognition> updatedRecognitions = tfod.getUpdatedRecognitions();


       if (updatedRecognitions.size() != 0 ) {
           if (recognition.getLabel().equals("Quad")) {

               outcome = "C";
               telemetry.update();
               left_turn();
               encoder(-1500);
               right_turn();
               encoder(-8000);
               right_turn();
               encoder(-1750);

               // This is where the wobble goal will be dropped

               encoder(2500);
               left_turn();
               encoder(4000);

           } else if (recognition.getLabel().equals("Single")) {

               outcome = "B";
               telemetry.update();
               left_turn();
               encoder(-1500);
               right_turn();
               encoder(-5750);
               right_turn();
               encoder(-750);
               encoder(1000);
               left_turn();
               encoder(2000);
           }

       } else if (updatedRecognitions.size() == 0 ) {

           outcome = "A";
           telemetry.update();
           right_turn();
           encoder(-2125);
           left_turn();
           encoder(-3500);
           encoder(1500);
           left_turn();
           encoder(-4000);
           right_turn();
           encoder(-2125);

       } else {

           outcome = "UNKNOWN; Parking for power shot";
           telemetry.update();
           left_turn();
           encoder(-2500);
           right_turn();
           encoder(-4125);


       }
       if (tfod != null) {
           tfod.shutdown();
       }
       telemetry.addData("outcome: ", outcome);
       telemetry.update();
       // Insert power shot here 
   }
}










