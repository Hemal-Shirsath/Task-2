public class TrafficLight {
    public static void main(String[] args) {
        String light = "red"; // Example input

        switch (light.toLowerCase()) {
            case "red": System.out.println("Stop"); break;
            case "yellow": System.out.println("Get Ready"); break;
            case "green": System.out.println("Go"); break;
            default: System.out.println("Invalid color");
        }
    }
}
