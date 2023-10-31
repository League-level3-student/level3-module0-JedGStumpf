package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
    // 1. make a main method
	public static void main(String[] args) {

        // 2. create an array of 5 robots.
		Robot[] robArr = new Robot[5];
		
	

        // 3. use a for loop to initialize the robots.
		int x = 25;
		int y = 550;
		for (int i = 0; i < robArr.length; i++) {
			robArr[i] = new Robot();
			robArr[i].setX(x);
			robArr[i].setY(y);
			robArr[i].miniaturize();
			robArr[i].setSpeed(10);
			robArr[i].show();
			x += 75;
		}

        // 4. make each robot start at the bottom of the screen, side by side, facing up
		
        // 5. use another for loop to iterate through the array and make each robot move
        // a random amount less than 50.
		boolean race = true;
		while (race) {
			Random rand = new Random();
			
			for (int i = 0; i < robArr.length; i++) {
				int moveAmt = rand.nextInt(50);
				
				robArr[i].move(moveAmt);
				if (robArr[i].getY() <= 0) {
					race = false;
					System.out.println("Robot in position# "+ i + " has won the Race");
				}
			}
//			y -= ;
		}

    
        // 6. use a while loop to repeat step 5 until a robot has reached the top of the
        // screen.
    
        // 7. declare that robot the winner and throw it a party!
    
        // 8. try different races with different amounts of robots.
    
        // 9. make the robots race around a circular track.
	}
}
