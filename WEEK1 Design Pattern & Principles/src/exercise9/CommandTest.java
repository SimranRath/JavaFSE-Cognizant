package exercise9;

public class CommandTest {
 public static void main(String[] args) {
     // Create a light
     Light light = new Light();

     // Create commands
     Command lightOnCommand = new LightOnCommand(light);
     Command lightOffCommand = new LightOffCommand(light);

     // Create a remote control
     RemoteControl remoteControl = new RemoteControl();

     // Set light on command
     remoteControl.setCommand(lightOnCommand);
     remoteControl.pressButton();

     // Set light off command
     remoteControl.setCommand(lightOffCommand);
     remoteControl.pressButton();
 }
}
