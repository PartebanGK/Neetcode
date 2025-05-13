class ValidAnagram {
    public boolean isAnagram(String s, String t) {

        Set<String> anagramSet = new HashSet<>();

        char[] source = s.toCharArray();
        char[] target = t.toCharArray();

        Arrays.sort(source);
        Arrays.sort(target);
        
        // System.out.println(source);
        // System.out.println(target);
        
        anagramSet.add(String.valueOf(source));

        boolean flag = (anagramSet.contains(String.valueOf(target))) ? true : false;

        return flag;
    }
}
