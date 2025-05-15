class Anagram {
    public List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> result = new ArrayList<>();
        Map<String, List<String>> anagramGroup = new HashMap<>();
        for(String str: strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedString = new String(charArray);
            anagramGroup.putIfAbsent(sortedString, new ArrayList<>());
            anagramGroup.get(sortedString).add(str);
        }
        return new ArrayList<>(anagramGroup.values());
    }
}
