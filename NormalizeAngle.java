import java.util.*;
public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        System.out.print('\u000C');
        int result = angle % 360;
        
        return result;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        System.out.print('\u000C');
        int result = integer % 360;
        return result;
    }

    public static void main(String[] args){

    }
}
