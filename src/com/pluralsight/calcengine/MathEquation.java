package com.pluralsight.calcengine;

public class MathEquation {

    private   double leftVal;
    private  double rightVal;
    private  char opCode = 'a';
    private  double result;


    public double getLeftVal() {

        return leftVal;
    }
    public void setLeftVal(double leftVal){

        this.leftVal = leftVal;
    }
    public double getRightVal(){

        return this.rightVal;
    }
    public void setRightVal(double rightVal){
        this.rightVal = rightVal;
    }
    public double getopCode(){

        return opCode;
    }
    public void setopCode(char opCode){
        this.opCode = opCode;
    }
    public double getResult(){

        return  result;
    }
    public MathEquation(){

    }
    public MathEquation(char opCode){
        this.opCode = opCode;
    }
    public MathEquation(char opCode, double leftVal, double rightVal){
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;

    }
    public void execute() {
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'd':
                Math.round (result = leftVal / rightVal);
                break;
            case 'm':
             Math.round(result = leftVal * rightVal);
                break;
            default:
                System.out.println("Error - invalid Opcode" ) ;
                result = 0.0d;
        }

    }
}
