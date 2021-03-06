package com.epam.game.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cell {

    private int x;
    private int y;
    private CellStatus status;

    public enum CellStatus {
        FREE, RESERVED, SHOT
    }
}
