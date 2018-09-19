/**
 * Unit 1 Project
 * 
 * In this project you have the opportunity to create a piece of artwork using ASCII 
 * (American Standard Code for Information Interchange). Using the already created file 
 * named `ASCIIArt.java` write a program that outputs your artwork to the console. 
 * The goal of this project is to use ONLY what we have learned in Unit 1 to create 
 * anything you would like so be creative (and school appropriate). Artwork must also have a caption describing what it's depicting.  
 * 
 * For those of you who have dabbled in coding before, try to contain your code to 
 * just what we have discussed in this unit.  
 * 
 * @author Mr. Rasmussen 
 *
 */


//Unit 1 Project
//AP Computer Science, P2

public class ASCIIArt {
	
	public static void stick(int h) { //the stick sticking out of the top of a lighthouse; int h determines its height
		for(int j = 0; j < h; j++) {
			for (int i = 0; i < 6; i++) {
				System.out.print(" ");
			}
			System.out.print("||\n");
		}
	}
	
	public static void triangle() { //triangle roof
		System.out.println("      /\\");
		System.out.println("     /  \\");
		System.out.println("    /    \\");
		System.out.println("   /      \\");
	}
	
	public static void smallestRoof(int width) { //how wide the smallest roof is.
		for (int j = 0; j < 3; j++) {
			
			for (int i = 0; i < width/4 ; i++) { //spaces before left side of smallest roof
				System.out.print(" ");
			}
			
			System.out.print("|");
			for (int i = 0; i < width; i++) { //actual roof
				System.out.print("=");
			}
			System.out.print("|\n");
		}
	}
		
	
	public static void bigRoof(int width) {
		for (int i = 0; i < width; i++) {
			System.out.print("[]");
			}
		System.out.println();
		}
	
	public static void body() {
		System.out.println("  |        |");
	}
	
	public static void windowHorizontal() {
		System.out.println("  | ------ |");
	}
	
	public static void main (String[] args) {
		stick(2);
		triangle();
		smallestRoof(8);
		bigRoof(7);
		bigRoof(7);
		body();
		windowHorizontal();
		System.out.println("  | |    | |");
		windowHorizontal();
		
		for(int i = 0; i < 5; i++) {
			body();
		}
		
		for (int g = 0; g < 16; g++) {
			System.out.print("^");
		}
		
		System.out.println("\nWow. This is my lighthouse.");
	}
}
