// Approach 1
class Solution {
	public boolean isAnagram(String s, String t) {
		if(s.length() != t.length()) return false;

        int[] arr = new int[256];
		for (char ch : s.toCharArray()) {
            arr[ch]++;
        }

        for (char ch : t.toCharArray()) {
            if (arr[ch] <= 0)
                return false;
            arr[ch]--;
        }

		return true;
    }
}

// Approach 2
// class Solution {
// 	public boolean isAnagram(String s, String t) {
// 		if(s.length() != t.length()) return false;
        
// 		char[] sArr = s.toCharArray();
//         char[] tArr = t.toCharArray();

//         Arrays.sort(sArr);
//         Arrays.sort(tArr);

// 		return Arrays.equals(sArr, tArr);
//     }
// }

// Approach 3
// class Solution {
// 	public boolean isAnagram(String s, String t) {
// 		if(s.length() != t.length()) return false;
// 		HashMap<Character, Integer> sMap = new HashMap<>();

// 		for(char ch: s.toCharArray())
// 				sMap.compute(ch, (key, value) -> (value == null) ?  1 : value + 1);
		
// 		for(char ch: t.toCharArray()) {
// 			if (!sMap.containsKey(ch))
// 				return false;
//             sMap.compute(ch, (key, value) -> (value == null) ? 0 : value - 1);
//             if (sMap.get(ch) < 0)
//                 return false;
// 		}

// 		return true;
//     }
// }