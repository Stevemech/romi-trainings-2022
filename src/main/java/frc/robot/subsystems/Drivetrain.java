// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Drivetrain extends SubsystemBase {
  /**
   * PN: 
   * Include: 
   *  - 2 Sparks (1 left, 1 right -- same as last time)
   *  - 2 Encoders (WPILib class, ctrl-click on class name to look at constructor) -- left has ports 4,5 and right has ports 6,7
   *  - 1 DifferentialDrive class -- does the math of figuring out side speeds for us (look at class for constructor)
   */

  public Drivetrain() {
    /**
     * PN:
     * Here, use the setDistancePerPulse method of the Encoders 
     * to tell each one how much distance to report per pulse/count -- use the constants you made and some math
     *  
     * Reset the encoders using the method you made below
     * 
     * Finally, use SmartDashboard.putNumber() two times to add the left and right distances to the GUI.
     * 
     * 
     */
 
   
  }

  /**
   * PN: 
   * Make a curvatureDrive method which calls the curvatureDrive method in DifferentialDrive
   * @param throttle
   * @param steering
   * @param isQuickTurn
   */

  /**
   * PN: 
   * Make a resetEncoders method which resets each encoder (use the Encoder reset method)
   */

  /**
   * PN: Make two methods which each return the distance reading from the left or right encoders, respectively
   * @return distance in inches for left/right encoders
   */
}
