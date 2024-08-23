package com.commandPattern;

//Command Interface
interface Command {
	void execute();
}

//Receiver
class Light {
	void lightOn() {
		System.out.println("Light on");
	}

	void lightOff() {
		System.out.println("Light off");
	}
}

// Concrete Command
class TurnOnLightCommand implements Command {

	private Light light;

	public TurnOnLightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {

		light.lightOn();

	}

}

class TurnOffLightCommand implements Command {

	private Light light;

	public TurnOffLightCommand(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.lightOff();

	}

}

class RemoteControlle{
	
	private Command command;
	
	public void setCommand(Command command) {
		this.command=command;
	}
	
	public void pressButton() {
        command.execute();
    }
}

//Client
public class CommandPattern {
	
	public static void main(String[] args) {
		Light light=new Light();
		
		TurnOnLightCommand on=new TurnOnLightCommand(light);
		TurnOffLightCommand off=new TurnOffLightCommand(light);
		
		RemoteControlle remote=new RemoteControlle();
		
		remote.setCommand(on);
		remote.pressButton();
		
		remote.setCommand(off);
		remote.pressButton();
	}
	
	

}
