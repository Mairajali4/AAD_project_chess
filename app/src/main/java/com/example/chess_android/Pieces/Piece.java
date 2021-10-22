package com.example.chess_android.Pieces;

import android.icu.text.Transliterator;

import com.example.chess_android.Coordinates;
import com.example.chess_android.Position;

import java.util.ArrayList;


public abstract class Piece {

    private boolean white;

    Piece(boolean white) {
        this.white = white;
    }

    public ArrayList<Coordinates> AllowedMoves(Coordinates coordinates , Transliterator.Position[][] board){
        ArrayList<Coordinates> allowedMoves = new ArrayList<>();
        Coordinates c;
        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                c = new Coordinates(i,j);
                allowedMoves.add(c);
            }
        }
        return allowedMoves;
    }

    public boolean isWhite() {
        return white;
    }

    public abstract ArrayList<Coordinates> AllowedMoves(Coordinates coordinates, Position[][] board);
}
