public class CheckIfTwoStringArraysAreEquivalent_1662 {
    public boolean arrayStringsAreEqual(String[] arr1, String[] arr2) {
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        for (String s: arr1) {
            result1.append(s);
        }
        for (String s: arr2) {
            result2.append(s);
        }

        return (result1.toString()).equals(result2.toString());
    }

    public static void main(String[] args) {

    }

}
