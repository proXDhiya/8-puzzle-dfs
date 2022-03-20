public class Bored {
    private int[] boredArray = new int[9];


    // copy constructor
    public Bored(Bored bored) {
        for (int i = 0; i < boredArray.length; i++) {
            this.boredArray[i] = bored.boredArray[i];
        }
    }


    public Bored(String str) {
        // copy string to array
        for (int i = 0; i < 9; i++) {
            this.boredArray[i] = Character.getNumericValue(str.charAt(i));
        }
    }


    public void printBored() {
        for (int i = 0; i < boredArray.length; i++) {
            if (i % 3 == 0)         System.out.print("\n-------------\n| ");
            if (boredArray[i] == 0) System.out.print("  | ");
            else                    System.out.print(boredArray[i] + " | ");
        }
        System.out.println("\n-------------\n");
    }


    public boolean isSolved(String end) {
        for (int i = 0; i < 9; i++)
            if (this.boredArray[i] != Character.getNumericValue(end.charAt(i))) return false;
        return true;
    }


    public void moveUp() {
        for (int i = 0; i < 9; i++) {
            if (this.boredArray[i] == 0) if (i < 3) return;
            else {
                this.boredArray[i] = this.boredArray[i - 3];
                this.boredArray[i - 3] = 0;
                return;
            }
        }
    }

    
    public void moveDown() {
        for (int i = 0; i < 9; i++) {
            if (this.boredArray[i] == 0) if (i > 5) return;
            else {
                this.boredArray[i] = this.boredArray[i + 3];
                this.boredArray[i + 3] = 0;
                return;
            }
        }
    }


    public void moveLeft() {
        for (int i = 0; i < 9; i++) {
            if (this.boredArray[i] == 0) if (i % 3 == 0) return;
            else {
                this.boredArray[i] = this.boredArray[i - 1];
                this.boredArray[i - 1] = 0;
                return;
            }
        }
    }


    public void moveRight() {
        for (int i = 0; i < 9; i++) {
            if (this.boredArray[i] == 0) if (i % 3 == 2) return;
            else {
                this.boredArray[i] = this.boredArray[i + 1];
                this.boredArray[i + 1] = 0;
                return;
            }
        }
    }


    // compare two bored
    public boolean equals(Bored bored) {
        for (int i = 0; i < boredArray.length; i++)
            if (boredArray[i] != bored.boredArray[i]) return false;
        return true;
    }
}
