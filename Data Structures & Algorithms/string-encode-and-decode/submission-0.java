class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for (String s : strs) {
            sb.append(s.length())
            .append('#')
            .append(s);
        }

        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> decoded_result = new ArrayList<>();

        int i = 0;

        while (i < str.length()) {

            // Find the '#'
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }

            // Parse the length
            int len = Integer.parseInt(str.substring(i, j));

            // Move to the start of the actual string
            j++;

            // Read exactly 'len' characters
            decoded_result.add(str.substring(j, j + len));

            // Move to the next encoded string
            i = j + len;
        }

        return decoded_result;
    }
}
