package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import org.firstinspires.ftc.robotcore.external.navigation.DistanceUnit;
import com.qualcomm.robotcore.hardware.DistanceSensor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;


@TeleOp
public class CitireDistanceSensor extends LinearOpMode {

    DistanceSensor distance;

    @Override
    public void runOpMode() {

        distance = hardwareMap.get(DistanceSensor.class, "distance");

        waitForStart();
        while (opModeIsActive()) {
            // If the distance in centimeters is less than 10, set the power to 0.3
            if (distance.getDistance(DistanceUnit.CM) < 10) {
                telemetry.addData("Status senzor: ", "DISTANTA MICA");
            } else {
                telemetry.addData("Status senzor: ", "DISTANTA MARE");
            }
            telemetry.update();
        }
    }
}
