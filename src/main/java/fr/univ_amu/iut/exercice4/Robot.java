package fr.univ_amu.iut.exercice4;


public class Robot {
    private GridPosition gridPosition;
    private Orientation orientation;

    public Robot(GridPosition gridPosition, Orientation orientation) {
        this.gridPosition = gridPosition;
        this.orientation = Orientation.NORTH;

    }

    public GridPosition getGridPosition() {
        return gridPosition;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void turnRight() {
        throw new RuntimeException("Not yet implemented !");
    }

    public void turnLeft() {
        throw new RuntimeException("Not yet implemented !");
    }

    public void advance() {
        throw new RuntimeException("Not yet implemented !");
    }
}

