package org.git.sample;

public class SourceCode {
	private void pull() {
		System.out.println("Pull Source Code");
	}
	private void push() {
		System.out.println("Push Source Code");
	}
<<<<<<< HEAD

	private void code() {
		System.out.println("Source Code");
	}
	private void gitSource() {
	System.out.println("Git Source Code");


=======
	private void gitSource() {
	System.out.println("Git Source Code");

>>>>>>> 22db5799487662e7a9822bec755ae21ca2935283
	}
	public static void main(String[] args) {
		SourceCode s = new SourceCode();
		s.pull();
		s.push(); 
<<<<<<< HEAD

		s.code();

		s.gitSource();

=======
		s.gitSource();
>>>>>>> 22db5799487662e7a9822bec755ae21ca2935283
	}

}
