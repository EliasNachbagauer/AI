package neuronalesNetz;

import java.util.ArrayList;

public class Netz {
	ArrayList<Neuron> input = new ArrayList<Neuron>();
	ArrayList<Neuron> hidden = new ArrayList<Neuron>();
	ArrayList<Neuron> output = new ArrayList<Neuron>();

	public Netz(int input, int hidden, int output) {
		for (int i = 0; i < input; i++) {
			this.input.add(new Neuron(this.hidden));
		}
		for (int i = 0; i < input; i++) {
			this.input.add(new Neuron(this.output));
		}
		for (int i = 0; i < input; i++) {
			this.input.add(new Neuron(null));
		}
	}

	public int[] compute(double[] inputVektor) {
		int[] inputResault = new int[this.input.size()];
		int[] hiddenResault = new int[this.input.size()];
		int[] outputResault = new int[this.input.size()];

		for (int i = 0; i < this.input.size(); i++) {
			inputResault[i] = this.input.get(i).fire(inputVektor);
		}
		for (int i = 0; i < this.hidden.size(); i++) {
			hiddenResault[i] = this.hidden.get(i).fire(inputResault);
		}
		for (int i = 0; i < this.output.size(); i++) {
			outputResault[i] = this.hidden.get(i).fire(hiddenResault);
		}
		return outputResault;
	}

}
