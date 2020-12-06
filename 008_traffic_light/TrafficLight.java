import java.util.Random;

class TrafficLight {
    public static void main(String[] args) {
        String[] lights = {"Green", "Yellow", "Red", "Red + Yellow"};
        Random random = new Random();

        int count = 0;
        while (count < 10) {
            int index = random.nextInt(lights.length);
            System.out.println(lights[index] + " - " + action(lights[index]));
            count++;
        }
    }

    public static String action(String light) {
        if (light.equals("Green")) { return "Go!"; }
        if (light.equals("Yellow")) { return "Stop!"; }
        if (light.equals("Red")) { return "Stop!"; }
        if (light.equals("Red + Yellow")) { return "Get ready to go!"; }
        return "Traffic light is broken!";
    }
}