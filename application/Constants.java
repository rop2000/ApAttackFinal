package application;
import java.awt.Color;

public final class Constants {
        private Constants() {
                throw new UnsupportedOperationException();
        }
        
    	public static final int MAIN_TIMER_DELAY = 15;
    	
    	public static final int FRAME_WIDTH = 800;
    	public static final int FRAME_HEIGHT = 400;
    	public static final int SCORE_FONT_SIZE = 24;
    	
    	public static final int BG_DX = 2;
    	
    	public static final Color GREEN_COLOR = new Color(0, 176, 80);
    	public static final Color RED_COLOR = new Color(237, 27, 36);
    	
    	public static final int SCORE_X = 10;
    	public static final int SCORE_Y = 25;
    	
    	public static final int PLAYER_GRAVITY = 1;
    	public static final int PLAYER_START_Y = 300;
    	public static final int PLAYER_X_VELOCITY = 4;
    	public static final int PLAYER_Y_VELOCITY = 20;
    	
    	public static final int TEXTBOOK_SPAWN_DELAY = 1000;
    	public static final int TEXTBOOK_SCORE_VALUE = 250;
    	public static final int TEXTBOOK_X_VELOCITY = 2;
    	public static final int TEXTBOOK_START_Y = 125;
    	public static final int TEXTBOOK_START_Y_2 = 175;
    	public static final int TEXTBOOK_START_X = 800;
    	public static final int TEXTBOOK_EATEN_DY = 5;
    	public static final float TEXTBOOK_ALPHA_INCREMENT = 0.04f;
    	
    	public static final int MISSLE_X_VELOCITY = 10;
    	public static final int MISSLE_LENGTH = 20;
    	public static final int MISSLE_Y_OFFSET = 30;
    	
    	public static final int EXAM_X_VELOCITY = 2;
    	public static final int EXAM_START_X = 800;
    	public static final int EXAM_START_Y = 310;
    	public static final int EXAM_SPAWN_DELAY = 2000;
    	public static final int EXAM_HEALTH_MAX = 3;
    	public static final int EXAM_SIZE_FACTOR = 7;
    	public static final int EXAM_JUMPED_ON_DY = 7;
    	
    	public static final int HEALTH_MAX = 200;
    	public static final int HEALTHBAR_WIDTH = 200;
    	public static final int HEALTHBAR_HEIGHT = 25;
    	public static final int HEALTHBAR_X = FRAME_WIDTH - HEALTHBAR_WIDTH - 10;
    	public static final int HEALTHBAR_Y = 10;
    	public static final int HEALTHBAR_FONT_SIZE = 18;
    	public static final int HEALTHBAR_PERCENT_X = Constants.HEALTHBAR_X - 5;
    	public static final int HEALTHBAR_PERCENT_Y = Constants.HEALTHBAR_Y + 20;
}
