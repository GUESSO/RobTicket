package demo;/**
 * Created by Lenovo on 2020/2/4.
 */

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

/**
 * Title: TestRobot
 * Project: RobTicket
 * Package: demo
 * Description: Please fill description of the file here
 * Author: lianchenyu
 * Date: 2020/2/4
 */

public class TestRobot {
    public static void main(String[] args){
        try {
            Robot robot = new Robot();
            //鼠标移动到坐标(635,454)
            TestRobot.clickMouse(robot, 635, 454, 500);

            int[] keys = {
                    KeyEvent.VK_L,KeyEvent.VK_I,
                    KeyEvent.VK_A,KeyEvent.VK_N,
                    KeyEvent.VK_C,KeyEvent.VK_H,
                    KeyEvent.VK_E,KeyEvent.VK_N,
                    KeyEvent.VK_Y,KeyEvent.VK_U};
            robot.delay(500);
            TestRobot.pressKey(robot,keys,500);
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void pressKey(Robot robot,int[] keys,int delay){
        for(int i=0;i<keys.length;i++){
            robot.keyPress(keys[i]);
            robot.keyRelease(keys[i]);
            robot.delay(500);
        }
        //处理完需要延迟
        robot.delay(delay);
    }

    public static void clickMouse(Robot robot,int x,int y,int delay){
        robot.mouseMove(x, y);
        robot.delay(500);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        robot.delay(delay);
    }

}
