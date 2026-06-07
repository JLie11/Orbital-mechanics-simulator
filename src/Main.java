public class Main {
    public static void main(String[] args) {
        System.out.println("Program started.");
        Planet earth = new Planet("Earth", 5.972e24, 6371, 25, 14, 0, 0);
        Planet mars = new Planet("Mars", 6.39e23, 3389.5, 56, 76, 0, 0);
        Planet venus = new Planet("Venus", 4.867e24, 6051.8, 12, 34, 0, 0);
        Planet mercury = new Planet("Mercury", 3.285e23, 2439.7, 78, 90, 0, 0);
        Planet jupiter = new Planet("Jupiter", 1.898e27, 69911, 45, 67, 0, 0);
        Planet saturn = new Planet("Saturn", 5.683e26, 58232, 89, 23, 0, 0);
        Planet uranus = new Planet("Uranus", 8.681e25, 25362, 34, 56, 0, 0);
        Planet neptune = new Planet("Neptune", 1.024e26, 24622, 67, 89, 0, 0);
        Planet sun = new Planet("Sun", 1.989e30, 696340, 0, 0, 0, 0);
    }
}