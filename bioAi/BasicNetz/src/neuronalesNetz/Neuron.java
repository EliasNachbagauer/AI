package neuronalesNetz;

import java.util.ArrayList;

public class Neuron {
	double[] gewicht;
	double schwellewert;
	ArrayList<Neuron> sendToArrayList;

	public Neuron(ArrayList<Neuron> sendTo) {
		this.sendToArrayList = sendTo;
	}

	public int fire(double[] input) {

		double sum = 0;
		double length = Math.min(input.length, gewicht.length);

		for (int i = 0; i < length; i++) {
			sum += gewicht[i] * input[i];
		}
		if (schwellewert <= sum) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public int fire(int[] input) {

		double sum = 0;
		double length = Math.min(input.length, gewicht.length);

		for (int i = 0; i < length; i++) {
			sum += gewicht[i] * input[i];
		}
		if (schwellewert <= sum) {
			return 1;
		} else {
			return 0;
		}
	}

}
