import java.util.Arrays;

public class Seat {
    private boolean[][] seats; // 2D array to represent seats (true: available, false: booked)

    public Seat(int rows, int cols) {
        seats = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            Arrays.fill(seats[i], true);
        }
    }

    public void displaySeats() {
        System.out.println("this is your seat");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j]) {
                    System.out.print("o ");
                } else {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }

    public boolean bookSeat(int row, int col) {
        if (row >= 0 && row < seats.length && col >= 0 && col < seats[0].length && seats[row][col]) {
            seats[row][col] = false;
            System.out.println("Seat at row " + row  + ", col " + col  + " booked successfully.");
            return true;
        } else {
            System.out.println("Invalid seat selection or seat already booked.");
            return false;
        }
    }
}
