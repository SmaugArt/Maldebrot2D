/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Global;

/**
 *
 * @author demin
 */
public class ComplexValue {
    public double x;
    public double iY;
    public ComplexValue(double x, double y) {
        this.x=x;
        this.iY=y;
    }
    
    public double ComplexValuePowReal(){
        double value= (this.x*this.x)-(this.iY*this.iY);
        return value;
    }
    
    public double ComplexValuePowCom(){
        double value= 2*this.x*this.iY;
        return value;
    }
    
    public void PlusComplexValue(double x, double iY){
        double value1= this.x+x;
        double value2= this.iY+iY;
    }
    
    public double AbsolutlyValue(){
        double value= Math.sqrt(this.x*this.x + this.iY*this.iY);
        return value;
    }
}
