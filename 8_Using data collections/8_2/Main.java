//Using two-dimensional arrays

public class Main {
    public static void main(String[] args) {
        String[][] states = new String[3][2];
        states[0][0] = "Colombo";
        states[0][1] = "Galle";
        states[1][0] = "Colombo";
        states[1][1] = "Galle";
        states[2][0] = "Colombo";
        states[2][1] = "Galle";

        for (int i = 0; i < states.length; i++) {
            StringBuilder sb = new StringBuilder();
            sb.append("The capital of ")
                .append(states[i][0])
                .append(" is ")
                .append(states[i][1])
                .append(".");
            System.out.println(sb.toString());
        }
    }
}
