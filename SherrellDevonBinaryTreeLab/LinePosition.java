/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarytree;

/**
 *
 * @author Devon
 */
public class LinePosition {
    private ObjectList list;
	private int line_number;
	private int word_position;
	
	/**
	 * Class constructor
	 */
	public LinePosition() {
		this.line_number = 0;
		this.word_position = 0;
		this.list = new ObjectList();
	}
	
	/**
	 * Class constructor
	 * @param l_number
	 * @param w_position
	 */
	public LinePosition(int l_number, int w_position){
		this.line_number = l_number;
		this.word_position = w_position;		
	}
	
	/**
	 * Returns the line number
	 * @return
	 */
	public int get_line() {
		return this.line_number;
	}
	
	/**
	 * Returns the word count
	 * @return
	 */
	public int get_word() {
		return this.word_position;
	}
}
