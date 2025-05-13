class ContainsDuplicate {
  
    public boolean hasDuplicate(int[] nums) {
        
        Set<Integer> duplicateSet = new HashSet<>();
        
        for(int i : nums) {
            if(duplicateSet.contains(i)) {
                return true;
            } else {
                duplicateSet.add(i);
            }
        }
        
        return false;
    }
}
