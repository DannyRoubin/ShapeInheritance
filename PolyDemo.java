/*
Name: Danny Roubin
Class: CSS 143 Sec B
Assignment: Shape inheritance assignment

Purpose of this file/class is to essentially be a driver to be able to display the four shapes
*/
import java.util.*;
import javax.swing.*;
import java.awt.*;

/*
 * Class PolyDemo (is a JFrame) and PolyDemoPanel (is a JPanel)
 * 
 * Author: Rob Nash
 */


class PolyDemo extends JFrame {
	
	
	public PolyDemo() {
		getContentPane().add( new PolyDemoPanel() );
		//just some windowing stuff that must happen for all Frames
		// increased the window size as per personal preference
		setSize( 1000,1000 );
		setVisible( true );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
	}
	
	// main that calls PolyDemo 
	public static void main( String args[] ) {
		PolyDemo myApp = new PolyDemo();
	}
	
	
	//this is our first "inner" or internal class 
	//the purpose of this class is solely to support the JFrame class above, and I don't want it reused in arbitrary contexts, so by nesting this class here
	//I can indicate the intent a bit more clearly that this class "goes with" the class above it
	//In general, each class is a separate entity that should be contained in a separate file

	// to abbreviate, this is a helper class that allows us to easily populate myShape with a random shape
	public class PolyDemoPanel extends JPanel {		
		Shape[] myShapes= new Shape[20];
		
		public PolyDemoPanel() {
			/*********************************************************************************************************************
			* Code for populating our myShapes changes minimally when new classes are introduced (only in getRandShape())
			*********************************************************************************************************************/
			for( int i = 0; i < 20; i++ ) {
				myShapes[i] =  getRandShape();
			}
		}
		
		/*********************************************************************************************************************
		 * Code for drawing our shapes doesn't change at all! Since we intended to take advantage of polymorphism, we coded 
		 * this "in general" with respect to the superclass, and not specific to any subclass.
		 *********************************************************************************************************************/
		public void paint( Graphics g ) {
			super.paint(g);  //don't remove - required for GUI widgets to draw correctly
			/************************
			 * Late Binding Demo
			 ************************/
			for( int i = 0; i < myShapes.length; i++ ){
				//which draw method is invoked here? There are many forms of the method (polymorphic), so which is chosen?
				//Java has RTTI about every object, and it uses this info to choose the correct method to invoke!
				myShapes[i].paint( g );	
			}	
		}
			
		// method that returns a random int
		public int getRandInt() {
			return ( (int) ( Math.random() * 200 ) );	
		}
		
		// method to return a random shape
		public Shape getRandShape() {
			Shape retVal = null;
			// multiplying getRandInt by 3 to help space the shapes out a bit more so they're not all clumped together
			final int x = getRandInt()*3;
			final int y = getRandInt()*3;
			
			
			/********************************
			 * Polymorphic extensibility demo
			 *
			 *******************************/
			switch( ( int )(Math.random() * 4) ) {
				case 0: 	retVal = new MinecraftPigFace( x,y);
							break;
				case 1: 	retVal = new Pokeball( x,y);
							break;
				case 2: 	retVal = new Square( x,y, getRandInt());
							break;
				case 3: 	retVal = new Circle( x,y, getRandInt());
							break;				
			}
		
			return retVal;
		}



	

	}	
	
}











