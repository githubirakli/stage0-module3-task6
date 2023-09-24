package lang.print.gaps.task6;


     public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int roundNumber= Math.round(numberToBeRounded);
        System.out.println("Rounded number is:"+roundNumber);
    }
    public static void main(String[]args){
        FloatTypeCasting floatCaster=new FloatTypeCasting();
        float numberToBeRounded=7.6f;
        floatCaster.roundNumber(numberToBeRounded);
    }
    }
