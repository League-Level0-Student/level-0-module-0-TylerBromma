package _99_extra;

import org.jointheleague.graphical.robot.Robot;

public class RobotDraw {
	public static void main(String[] args) {
		Robot rob = new Robot();
		rob.penDown();
		rob.setSpeed(90);
		for (int i=0; i<4; i++) {
		rob.move(100);
		rob.turn(90);
		}
		rob.penUp();
		
		rob.move(25);
		rob.turn(90);
		rob.move(25);
		rob.turn(270);
		rob.penDown();
		for(int o=0; o<4; o++) {
			rob.move(50);
			rob.turn(90);
		}
		rob.penUp();
		rob.move(25);
		rob.turn(90);
		rob.penDown();
		rob.move(50);
		rob.penUp();
		rob.turn(270);
		rob.move(25);
		rob.turn(270);
		rob.move(25);
		rob.penDown();
		rob.turn(270);
		rob.move(50);
		rob.penUp();
		rob.turn(90);
		rob.move(50);
		rob.turn(90);
		
		rob.move(75);
		rob.penDown();
		rob.turn(45);
		rob.move(70);
		rob.turn(90);
		rob.move(70);
		rob.hide();
		
	}
}
