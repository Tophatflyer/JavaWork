// Use XOR to encode and decode a message.
class Chapter5Q7 {
	public static void main(String args[]) {
		String msg = "This is a test";
		String encmsg = "";
		String decmsg = "";
		String key = "abcdefgh";
		System.out.print("Original message: ");
		System.out.println(msg);
		// encode the message
		for(int i=0, j = 0; i < msg.length(); i++, j++){
			encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
			if(j == 7)
				j = 0;
		}	
		System.out.print("Encoded message: ");
		System.out.println(encmsg);
		// decode the message
		for(int i=0, j = 0; i < msg.length(); i++, j++){
			decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
			if(j == 7)
				j = 0;
		}
		System.out.print("Decoded message: ");
		System.out.println(decmsg);
	}
}