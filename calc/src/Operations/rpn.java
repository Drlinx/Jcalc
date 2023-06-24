package Operations;

import java.util.ArrayList;

class rpn {
    String Ump;
    ArrayList<String> ULO = new ArrayList<String>();

    rpn() {

    }

    /**
     * @brief adds two elements
     */
    void add(int z) {
        Double x;
        x = Double.parseDouble(ULO.get(z)) + Double.parseDouble(ULO.get(z + 1));
        ULO.set(z, Double.toString(x));
        ULO.remove(z + 1);
        ULO.remove(z + 1);
    }

    /**
     * @brief subtracts two elements
     */
    void subtract(int z) {
        Double x;
        x = Double.parseDouble(ULO.get(z)) - Double.parseDouble(ULO.get(z + 1));
        ULO.set(z, Double.toString(x));
        ULO.remove(z + 1);
        ULO.remove(z + 1);
    }

    /**
     * @brief multiplies two elements
     */
    void mult(int z) {
        Double x;
        x = Double.parseDouble(ULO.get(z)) * Double.parseDouble(ULO.get(z + 1));
        ULO.set(z, Double.toString(x));
        ULO.remove(z + 1);
        ULO.remove(z + 1);
    }

    /**
     * @brief the divide operation.
     */
    void divide(int z) {
        Double x;
        x = Double.parseDouble(ULO.get(z)) / Double.parseDouble(ULO.get(z + 1));
        ULO.set(z, Double.toString(x));
        ULO.remove(z + 1);
        ULO.remove(z + 1);
    }

    void modulo(int z) {
        Double x;
        x = Double.parseDouble(ULO.get(z)) % Double.parseDouble(ULO.get(z + 1));
        ULO.set(z, Double.toString(x));
        ULO.remove(z + 1);
        ULO.remove(z + 1);
    }

    /**
     * @brief begins solving the equation.
     */
    void solve() {
        int i = 0;
        String z = "";
        while (ULO.size() != 1 && i < ULO.size()) {
            z = ULO.get(i);
            if (z == "+" && i > 1) {
                add(i - 2);
            } else if (z == "-" && i > 1) {
                subtract(i - 2);
            } else if (z == "*" && i > 1) {
                mult(i - 2);
            } else if (z == "/" && i > 1) {
                divide(i - 2);
            } else if (z == "%" && i > 1) {
                modulo(i - 2);
            }
        }
    }
}