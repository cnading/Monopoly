package monopoly;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Piece {


	String[] pieceList = {"The Scottie Dog", "The Top Hat", "The Thimble", "The Boot", "The Wheelbarrow", "The Cat", "The Racing Car", "The Battleship"};
	String[] pieceURLs = {"scottieDog.png", "topHat.jpg", "thimble.jpg", "boot.jpg", "wheelbarrow.jpg", "cat.jpg", "carPiece.jpg", "boat.jpg"};
	int[] widthHeight = {29, 30, 39, 30, 23, 30, 27, 30, 52, 30, 25, 30, 29, 30, 30, 30};
	JLabel imageLabel;
	
	public JLabel getImageLabel() {
		return imageLabel;
	}


	public void setImageLabel(JLabel imageLabel) {
		this.imageLabel = imageLabel;
	}

	private int positionX, positionY, pieceNum;
	
	public Piece(int pieceNumber, int posX, int posY) {
		positionX = posX;
		positionY = posY;
		pieceNum = pieceNumber;
		ImageIcon image = new ImageIcon(getPieceURL());
	    imageLabel = new JLabel(image); 
	    imageLabel.setBounds(positionX, positionY, widthHeight[2 * pieceNumber], widthHeight[2 * pieceNumber + 1]);
	}
	
	
	public String getPieceURL() {
		return pieceURLs[pieceNum];
	}


	public String getPieceName() {
		return pieceList[pieceNum];
	}



	public int getPositionX() {
		return positionX;
	}

	public void setPositionX(int positionX) {
		this.positionX = positionX;
	}

	public int getPositionY() {
		return positionY;
	}

	public void setPositionY(int positionY) {
		this.positionY = positionY;
	}

	public int getPieceNum() {
		return pieceNum;
	}

	public void setPieceNum(int pieceNum) {
		this.pieceNum = pieceNum;
	}

}
