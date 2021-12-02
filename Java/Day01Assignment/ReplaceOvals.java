package com.sonata;

public class ReplaceOvals {

	public static void main(String[] args) {
		char input[]={'H','E','l','l','o'};
		 for (int i = 0; i <input.length; i++) { 
		if (input[i]=='a'||input[i]=='e'||input[i]=='i'||input[i]=='o'||input[i]=='u' ||input[i]=='A'||input[i]=='E'||input[i]=='I'||input[i]=='O'||input[i]=='U')
        {
            input[i]= '$';
        }
		 }
		 for (int i = 0; i < input.length; i++) {
	            System.out.print(input[i]);
	}

}
}