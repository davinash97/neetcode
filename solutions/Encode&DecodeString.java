class Solution {

	private final char key = '~';
	public String encode(List<String> strs) {
		StringBuilder str = new StringBuilder();

		for(String s: strs) {
			str.append(s).append(key);
		}
		return str.toString();
	}

	public List<String> decode(String str) {
		List<String> result = new ArrayList<>();
		StringBuilder s = new StringBuilder();

		for(char ch: str.toCharArray()){
			if(ch == key) {
				result.add(s.toString());
				s.setLength(0);
				continue;
			}
			s.append(ch);
		}
		return result;
	}
}
