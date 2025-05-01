package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Source: https://leetcode.com/problems/add-two-numbers/description/
class TwoNumbersSum {

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> fCopy = new ArrayList<>(first);
        ArrayList<Integer> sCopy = new ArrayList<>(second);

        Collections.reverse(fCopy);
        Collections.reverse(sCopy);

        int complement = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < Math.max(fCopy.size(), sCopy.size()); i++){
            int firstVal = i < fCopy.size() ? fCopy.get(i) : 0;
            int secondVal = i < sCopy.size() ? sCopy.get(i) : 0;
            int total = firstVal + secondVal + complement;
            complement = 0;
            if (total >= 10){
                complement = 1;
                total -= 10;
            }
            result.add(i, total);
        }

        // Si quedó acarreo pendiente, añadirlo
        if (complement > 0) {
            result.add(complement);
        }

        Collections.reverse(result);
        return result;
    }
}
