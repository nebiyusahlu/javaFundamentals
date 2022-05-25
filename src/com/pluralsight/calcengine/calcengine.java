package com.pluralsight.calcengine;

public class calcengine {

    public static void main(String[] args) {
//        MathEquation testEquation = new MathEquation();
//        System.out.print("result = ");
//        System.out.println(testEquation.getResult());
        MathEquation[] equations = new MathEquation[4];

//        equations[0] = create(110.2d,545.2d,'d');
//        equations[1] = create(40.2d,545.2d,'m');
//        equations[2] = create(50.4d,56.2d,'s');
//        equations[3] = create(110.2d,98.2d,'a');

        equations[0] = new MathEquation('d',110.2d,545.2d);
        equations[1] = new MathEquation('m',40.2d,545.2d);
        equations[2] = new MathEquation('s',50.4d,56.2d);
        equations[3] = new MathEquation('a',110.2d,98.2d);




        for (MathEquation equation : equations) {
            equation.execute();
           System.out.print("result = ");
           System.out.println(equation.getResult());
       }

    }
//    public static MathEquation create(double leftVal, double rightVal, char opCode){
//
//          MathEquation newMathEquation = new MathEquation();
//
//        newMathEquation.setLeftVal(leftVal);
//        newMathEquation.setRightVal(rightVal);
//        newMathEquation.setopCode(opCode);
//
//        return newMathEquation;


//    }
}
