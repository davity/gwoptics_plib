package org.gwoptics.graphics.colourmap;

import org.gwoptics.graphics.Colour;

/**
 * <p>
 * IColourmap interface provides several functions that are required for a colourmap to be used by an object.
 * If you use a colourmap in your object it should be stored as an IColourmap if you want any variation of
 * colourmap to be used.
 * </p>
 * 
 * <p>
 * While writing your own colourmap it should be noted there is already the EquationColourmap and RGBColourmap
 * that might suit your needs. A custom colourmap should be written to be very efficient as it can be called upon 
 * many times while plotting graphs and such,
 * </p>
 * <p>History</p>
 * 
 * <p>
 * From 0.2.4 the IColourmap has been made more general so nodes are not required to generate 
 * maps, ie equations can be used instead.
 * </p>
 * 
 * @author Daniel Brown 12/6/09
 * @since 0.1.1
 * @see RGBColourmap
 * @see EquationColourmap
 */

public interface IColourmap {
	/**
	 * Gets a Colour object from the colourmap.
	 * 
	 * @param l location to get colour
	 */
	Colour getColourAtLocation(float l);
	/**
	 * Gets an integer form of a Colour from the colourmap
	 * @param l
	 */
	int getIntAtLocation(float l);
	/**
	 * This function needs to be called whenever a node is changed, added, or removed to update
	 * the colourmap.
	 */
	public void generateColourmap();
	/**
	 * Should return true if 0 value for what the colourmap is displaying is represented by the colour at the point 0.5
	 */
	public boolean isCentreAtZero();
	/**
	 * Should return whether colourmap has been generated or not
	 */
	public boolean isGenerated();
}
