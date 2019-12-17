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
public class ColorStruct {
        public int red;
	public int  green;
	public int blue;
        public ColorStruct(int r, int g, int b) {
           this.red=r;
           this.blue = b;
           this.green=g;
        }
        
        public ColorStruct() {
           this.red=255;
           this.blue = 255; //белый
           this.green=255;
        }
}
