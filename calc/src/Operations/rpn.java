package Operations;

import java.io.*;
import java.util.ArrayList;

class rpn {
    String Ump;
    ArrayList<String> ULO = new ArrayList<String>();
    ArrayList<String> ops = new ArrayList<String>();

    rpn() {
        initops();
    }

    void initops() {
        ops.add("+");
        ops.add("-");
        ops.add("*");
        ops.add("/");
    }

    /**
     * @brief adds two elements
     */
    void add() {
        Double x;
        x = Double.parseDouble(ULO.get(0)) + Double.parseDouble(ULO.get(1));
        ULO.set(0, Double.toString(x));
        ULO.remove(1);
        ULO.remove(2);
    }

    /**
     * @brief subtracts two elements
     */
    void subtract() {
        Double x;
        x = Double.parseDouble(ULO.get(0)) - Double.parseDouble(ULO.get(1));
        ULO.set(0, Double.toString(x));
        ULO.remove(1);
        ULO.remove(2);
    }

    /**
     * @brief multiplies two elements
     */
    void mult() {
        Double x;
        x = Double.parseDouble(ULO.get(0)) * Double.parseDouble(ULO.get(1));
        ULO.set(0, Double.toString(x));
        ULO.remove(1);
        ULO.remove(2);
    }

    /**
     * @brief the divide operation.
     */
    void divide() {
        Double x;
        x = Double.parseDouble(ULO.get(0)) / Double.parseDouble(ULO.get(1));
        ULO.set(0, Double.toString(x));
        ULO.remove(1);
        ULO.remove(2);
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
                add();
            } else if (z == "-" && i > 1) {
                subtract();
            } else if (z == "*" && i > 1) {
                mult();
            } else if (z == "/" && i > 1) {
                divide();
            }
        }
    }
}