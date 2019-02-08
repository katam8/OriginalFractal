import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

/*
public void setup() {
    
}

public void draw() {
    noFill();  
    fractal(width / 2, height / 2, 500);
}

public void fractal(int x, int y, int radius) {
    if (radius <= 100) {
        ellipse(x, y, radius, radius);
        //ellipse(y, x, radius, radius);
    } else {
        fractal(x-radius / 2, y, radius / 2);
        fractal(x+radius / 2, y, radius / 4);
        fractal(x, y + radius / 2, radius / 2);
        fractal(x, y - radius / 2, radius / 4);
    }
}     
*/


public void setup() {
  background(255);
  size(800, 800);
}

public void draw() {
  fractal(width / 2, height / 2, 500);
}

public void fractal(int x, int y, int radius) {
  noStroke();
  fill(120, (int)((float)(800-x)/800*256), (int)((float)(800-y)/800*256), 90);
  if(radius <= 60) {
    ellipse(x, y, radius, radius);
    ellipse(y, x, radius, radius);
  } else {  
    fractal(x + radius / 2, y, radius / 2);
    fractal(x - radius / 2, y, radius / 2);
    fractal(y + radius / 2, x + radius / 2, radius / 4);
    fractal(y - radius / 2, x - radius / 2, radius / 4);
    fractal(x + radius / 2, y - radius / 2, radius / 4);
    fractal(x - radius / 2, y + radius / 2, radius / 4);
  }
}
  public void settings() {  size(800, 800); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
