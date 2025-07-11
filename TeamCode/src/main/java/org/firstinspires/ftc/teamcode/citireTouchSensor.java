package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.TouchSensor;


@TeleOp
public class citireTouchSensor extends LinearOpMode {
    TouchSensor touchSensor;

    @Override
    public void runOpMode() {
        touchSensor = hardwareMap.get(TouchSensor.class, "senzorulMeu");

        waitForStart();

        int count = 0;

        while (opModeIsActive()) {
            count++;
            telemetry.addData("Senzor: ", touchSensor.isPressed());
            if (touchSensor.isPressed()){
                telemetry.addData("Status senzor: ", "APASAT");
            } else {
                telemetry.addData("Status senzor: ", "NU E APASAT");

            }
            telemetry.addData("Loop count: ", count);
            telemetry.update();
        }
    }
}
