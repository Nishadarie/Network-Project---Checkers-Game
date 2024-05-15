package EnumConstants;

import java.awt.Color;


public enum Colors {
    // Define color constants
	BLACK(new Color(108, 52, 131)),          // Used for black color
	WHITE(new Color(249, 231, 159)),          // Used for white color
	BLUE(new Color(238, 14, 109 )),              // Used for red color
	ORANGE(new Color(244, 208, 63 )),// Used for orange color
	PURPLE(new Color(246, 198, 219)),// Used for purple color
	YELLOW(new Color(255, 116, 0));        // Used for yellow color
	
	
	//properties
	private Color color;
	
	//Constructor
	Colors(Color color){
		this.color = color;
	}
	
	// Get the color value
	public Color getColor(){
		return this.color;
	}
	
	// Get the default color for a player based on their ID
	public static Color getMyDefaultColor(int ID){
		if(ID==1){
			return BLUE.getColor();    // Return RED color for player ID 1
		}
		else if(ID==2){
			return ORANGE.getColor(); // Return ORANGE color for player ID 2
		}
		
		return null;
	}
	
	// Get the focused color for a player based on their ID
	public static Color getFocusedColor(int ID){
		if(ID==1){
			return PURPLE.getColor(); // Return PURPLE color for player ID 1
		}
		else if(ID==2){
			return YELLOW.getColor(); // Return YELLOW color for player ID 2
		}		
		return null;
	}
}