/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Global;
import Global.PointStruct;
import Global.ColorStruct;
/**
 *
 * @author demin
 */
public class ImageStruct { //структура содержащая набор пикселей по x-y оси
    
    public int width;
    public int height;
    public ColorStruct cur_col; //текущий цвет
    public PointStruct cur_pnt; //текущая точка
    public ColorStruct[][] pixels;
    
    public ImageStruct(int width, int height, int cur_r, int cur_g, int cur_b, int cur_x, int cur_y){
        this.width=width;
        this.height=height;
        cur_col=new ColorStruct(cur_r,cur_g,cur_b);
        cur_pnt=new PointStruct(cur_x, cur_y);
        pixels= new ColorStruct[width][height];
    }
    
    public ImageStruct(int width, int height, ColorStruct cur_col, PointStruct cur_pnt){
        this.width=width;
        this.height=height;
        this.cur_col=cur_col;
        this.cur_pnt=this.cur_pnt;
        pixels= new ColorStruct[width][height];
    }
    
    
    public boolean addColor(int indexMassX, int indexMassY, ColorStruct color){
        if (indexMassX>width-1 || indexMassX<0 || indexMassY>height-1 || indexMassY<0){
           return false;
        }
        if (color == null){
            return false;
        }
        
        pixels[indexMassX][indexMassY]=color;
        return true;
    }

}
