package modul;

public class Task2 {
    public static void main(String[] args) {
        String startPos = "a1";
        String lastPos = "B3";
        System.out.println(checkTurn(startPos, lastPos) ? "You can do this turn" : "You can`t do this turn");
    }

    public static boolean checkTurn(String fPos, String sPos) {
        int lCoordA = transformLetterCoord(fPos);
        int nCoordA = transformNumCoord(fPos);
        int lCoordB = transformLetterCoord(sPos);
        int nCoordB = transformNumCoord(sPos);

        if (validationOfCoords(lCoordA, lCoordB, nCoordA, nCoordB)) {
            if ((letterRangeOfTurn(lCoordA, lCoordB) == 2 && numRangeOfTurn(nCoordA, nCoordB) == 1) ||
                    (letterRangeOfTurn(lCoordA, lCoordB) == 1 && numRangeOfTurn(nCoordA, nCoordB) == 2)) {
                return true;
            }
        } else {
            System.out.println("Incorrect coords");
        }
        return false;
    }


    public static int letterRangeOfTurn(int a, int b) {
        return Math.abs(a - b);
    }

    public static int numRangeOfTurn(int a, int b) {
        return Math.abs(a - b);
    }

    public static boolean validationOfCoords(int lCoordA, int lCoordB, int nCoordA, int nCoordB) {
        if (lCoordA <= 8 && lCoordA >= 0 && lCoordB <= 8 && lCoordB >= 0 &&
                nCoordA <= 8 && nCoordA >= 0 && nCoordB <= 8 && nCoordB >= 0) {
            return true;
        }
        return false;
    }

    public static int transformLetterCoord(String coord) {
        coord = coord.toUpperCase();
        coord = coord.trim();
        coord = coord.substring(0, 1);

        switch (coord) {
            case "A":
                return 0;
            case "B":
                return 1;
            case "C":
                return 2;
            case "D":
                return 3;
            case "E":
                return 4;
            case "F":
                return 5;
            case "G":
                return 6;
            case "H":
                return 7;
        }
        return -1;
    }


    public static int transformNumCoord(String coord) {
        coord = coord.toUpperCase();
        coord = coord.trim();
        coord = coord.substring(1);

        return Integer.valueOf(coord) - 1;

    }
}


