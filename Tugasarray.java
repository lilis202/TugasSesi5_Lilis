public class Tugasarray {
    public static void main(String[] args) {
        Object[] data = {1, 2, 4, 10, 20, "Rizwan", "Iko", "Ikok"};
        
        StringBuilder textResult = new StringBuilder();
        StringBuilder numberResult = new StringBuilder();
        
        for (Object item : data) {
            if (item instanceof String) {
                if (textResult.length() > 0) {
                    textResult.append(" ");
                }
                textResult.append((String)item);
            } else if (item instanceof Integer) {
                if (numberResult.length() > 0) {
                    numberResult.append(" ");
                }
                numberResult.append(item);
            }
        }
        
        System.out.println("Array Text adalah: " + textResult.toString());
        System.out.println("Array Number adalah: " + numberResult.toString());
}
}
