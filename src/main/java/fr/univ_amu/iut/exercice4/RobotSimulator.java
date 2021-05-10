package fr.univ_amu.iut.exercice4;

import java.util.List;

public class RobotSimulator {
    private Robot robot;
    private String instructions;

    public RobotSimulator(Robot robot, String instructions) {
        this.robot = robot;
        this.instructions = instructions;
    }

    public void simulate() {
        for(int j = 0; j < instructions.length(); j++) {
            if (Movement.getMovement(instructions.charAt(j)) == Movement.LEFT) {
                robot.turnLeft();
            }
            if (Movement.getMovement(instructions.charAt(j)) == Movement.RIGHT) {
                robot.turnRight();
            }
            if (Movement.getMovement(instructions.charAt(j)) == Movement.ADVANCE) {
                robot.advance();
            }
        }
    }

    public List<Movement> getMovements() {
        return null;
    }
}



