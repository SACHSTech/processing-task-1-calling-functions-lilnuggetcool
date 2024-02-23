import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  import processing.core.PApplet;

public class FlowerGarden extends PApplet {
    
    public static void main(String[] args) {
        PApplet.main("FlowerGarden");
    }

    @Override
    public void settings() {
        size(600, 400);
    }

    @Override
    public void setup() {
        background(135, 206, 235); // Set background color to sky blue
        drawFlower(width / 2, height / 2 + 100); // Draw flower at the center of the canvas
        drawGrass(); // Draw grass at the bottom of the canvas
    }

    // Function to draw a flower
    private void drawFlower(float x, float y) {
        // Stem
        fill(0, 128, 0); // Green color for stem
        rect(x - 5, y, 10, 100);

        // Petals
        fill(255, 215, 0); // Yellow color for petals
        for (int i = 0; i < 8; i++) {
            float angle = TWO_PI / 8 * i;
            float petalX = x + cos(angle) * 50;
            float petalY = y - 30 + sin(angle) * 50;
            ellipse(petalX, petalY, 40, 20);
        }

        // Flower center
        fill(255, 69, 0); // Orange color for flower center
        ellipse(x, y, 40, 40);
    }

    // Function to draw grass
    private void drawGrass() {
        fill(0, 128, 0); // Green color for grass
        rect(0, height - 20, width, 20); // Draw a rectangle at the bottom for grass
    }
}
