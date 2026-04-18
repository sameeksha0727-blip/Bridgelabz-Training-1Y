package LamdaExpresison;

interface LightAction {
    void execute();
}

public class SmartLighting {
    public static void main(String[] args) {

        LightAction motion = () -> System.out.println("Lights ON (Motion detected)");

        LightAction night = () -> System.out.println("Dim Lights (Night mode)");

        LightAction voice = () -> System.out.println("Lights OFF (Voice command)");

        motion.execute();
        night.execute();
        voice.execute();
    }
}
