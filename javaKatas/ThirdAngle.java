package javaKatas;

public class ThirdAngle {
    public static int otherAngle(int angle1, int angle2) {
        return (angle1<0)||(angle2<0)?0: 180 -(angle1 +angle2);
    }
}