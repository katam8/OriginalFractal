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