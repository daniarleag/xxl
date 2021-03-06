/* XXL: The eXtensible and fleXible Library for data processing

Copyright (C) 2000-2011 Prof. Dr. Bernhard Seeger
                        Head of the Database Research Group
                        Department of Mathematics and Computer Science
                        University of Marburg
                        Germany

This library is free software; you can redistribute it and/or
modify it under the terms of the GNU Lesser General Public
License as published by the Free Software Foundation; either
version 3 of the License, or (at your option) any later version.

This library is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
Lesser General Public License for more details.

You should have received a copy of the GNU Lesser General Public
License along with this library;  If not, see <http://www.gnu.org/licenses/>. 

    http://code.google.com/p/xxl/

*/
package xxl.core.indexStructures.vLengthBPlusTree;

import java.util.Stack;

import xxl.core.indexStructures.vLengthBPlusTree.VariableLengthBPlusTree.Node;
import xxl.core.indexStructures.vLengthBPlusTree.VariableLengthBPlusTree.Node.SplitInfo;
/**
 * 
 * Interface for developing the split strategy objects. Which can be used by @see {@link VariableLengthBPlusTree}
 *
 */
public interface Splitter {
	
	
	/**
	 * Splits the node. Returns SplitInfo object @see {@link SplitInfo} which holds index of the entry on which the node will be splitted.   
	 * 
	 * @param path current path 
	 * @param newNode newly allocated empty node
	 * @param node node which cause byte capacity overflow 
	 * @param min start point in bytes for searching for suitable split index  
	 * @param max max bound in bytes for searching; Search is executed on in the following range [min, max]
	 * @return
	 */
	public Node.SplitInfo runSplit(Stack path, VariableLengthBPlusTree.Node newNode, 
			VariableLengthBPlusTree.Node node, int min, int max);
	

}
