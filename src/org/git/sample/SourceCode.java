package org.git.sample;

public class SourceCode {
	private void pull() {
		System.out.println("Pull Source Code");
	}
	private void push() {
		System.out.println("Push Source Code");
	}
	public static void main(String[] args) {
		SourceCode s = new SourceCode();
		s.pull();
		s.push(); 
	}

}
