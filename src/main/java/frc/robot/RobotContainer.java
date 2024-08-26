package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class RobotContainer {

    private final RomiDrivetrain m_RomiDrivetrain = new RomiDrivetrain();
    private final Joystick driver = new Joystick(0);

    private final JoystickButton aButton = new JoystickButton(driver, XboxController.Button.kA.value);

    public RobotContainer() {
        configureButtonBindings();
        //connecting to romi wifi network now
    }

    private void configureButtonBindings() {
        aButton.onTrue(new InstantCommand(() -> m_RomiDrivetrain.arcadeDrive(1, 1)));
    }
}
