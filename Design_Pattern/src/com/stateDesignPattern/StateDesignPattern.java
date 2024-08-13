package com.stateDesignPattern;

interface State {
	void handelRequest();
}

class ConcreateStateA implements State {

	@Override
	public void handelRequest() {

		System.out.println("Handeling request in State A");
	}

}

class ConcreateStateB implements State {

	@Override
	public void handelRequest() {
		System.out.println("Handeling request in State B");

	}

}

class Context {
	private State currentState;

	public void setCurrentState(State state) {
		this.currentState = state;
	}

	public void request() {
		currentState.handelRequest();
	}
}

public class StateDesignPattern {

	public static void main(String[] args) {
		Context context = new Context();

		State stateA = new ConcreateStateA();
		State stateB = new ConcreateStateB();

		context.setCurrentState(stateA);
		context.request();

		context.setCurrentState(stateB);
		context.request();
	}
}
