package com.example.chess_android.Pieces;

import android.icu.text.Transliterator;

import com.example.chess_android.Coordinates;
import com.example.chess_android.Position;

import java.util.ArrayList;

public class Pawn extends Piece {
    public Pawn(boolean white) {
        super(white);
    }



    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates, Position[][] board) {
        ArrayList<Coordinates> allowedMoves = new ArrayList<>();
        allowedMoves.clear();
        Coordinates c;

        if (coordinates.getX()+2 <8 && coordinates.getY()-1 >=0){
            if(board[coordinates.getX()+2][coordinates.getY()-1].getPiece() ==null){
                c = new Coordinates(coordinates.getX()+2 , coordinates.getY()-1);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()+2][coordinates.getY()-1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()+2 , coordinates.getY()-1);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()+1 <8 && coordinates.getY()-2 >=0){
            if(board[coordinates.getX()+1][coordinates.getY()-2].getPiece() ==null){
                c = new Coordinates(coordinates.getX()+1 , coordinates.getY()-2);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()+1][coordinates.getY()-2].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()+1 , coordinates.getY()-2);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()-2 >= 0 && coordinates.getY()-1 >=0){
            if(board[coordinates.getX()-2][coordinates.getY()-1].getPiece() ==null){
                c = new Coordinates(coordinates.getX()-2 , coordinates.getY()-1);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()-2][coordinates.getY()-1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()-2 , coordinates.getY()-1);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()-1 >=0  && coordinates.getY()-2 >=0){
            if(board[coordinates.getX()-1][coordinates.getY()-2].getPiece() ==null){
                c = new Coordinates(coordinates.getX()-1 , coordinates.getY()-2);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()-1][coordinates.getY()-2].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()-1 , coordinates.getY()-2);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()+2 <8 && coordinates.getY()+1 <8){
            if(board[coordinates.getX()+2][coordinates.getY()+1].getPiece() ==null){
                c = new Coordinates(coordinates.getX()+2 , coordinates.getY()+1);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()+2][coordinates.getY()+1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()+2 , coordinates.getY()+1);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()+1 <8 && coordinates.getY()+2 <8){
            if(board[coordinates.getX()+1][coordinates.getY()+2].getPiece() ==null){
                c = new Coordinates(coordinates.getX()+1 , coordinates.getY()+2);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()+1][coordinates.getY()+2].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()+1 , coordinates.getY()+2);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()-2 >=0 && coordinates.getY()+1 <8){
            if(board[coordinates.getX()-2][coordinates.getY()+1].getPiece() ==null){
                c = new Coordinates(coordinates.getX()-2 , coordinates.getY()+1);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()-2][coordinates.getY()+1].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()-2 , coordinates.getY()+1);
                    allowedMoves.add(c);
                }
            }
        }

        if (coordinates.getX()-1 >=0 && coordinates.getY()+2 <8){
            if(board[coordinates.getX()-1][coordinates.getY()+2].getPiece() ==null){
                c = new Coordinates(coordinates.getX()-1 , coordinates.getY()+2);
                allowedMoves.add(c);
            }else{
                if(board[coordinates.getX()-1][coordinates.getY()+2].getPiece().isWhite() != board[coordinates.getX()][coordinates.getY()].getPiece().isWhite()){
                    c = new Coordinates(coordinates.getX()-1 , coordinates.getY()+2);
                    allowedMoves.add(c);
                }
            }
        }
        return allowedMoves;
    }
}
