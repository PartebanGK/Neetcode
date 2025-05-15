class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> occurrenceMap = new HashMap<>();
        for(int num : nums) {
            occurrenceMap.put(num, occurrenceMap.getOrDefault(num, 1) + 1); 
            System.out.println(occurrenceMap.entrySet());
        }
        // System.out.println(occurrenceMap.entrySet());
        List<int[]> arr = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : occurrenceMap.entrySet()) {
            arr.add(new int[] {entry.getValue(), entry.getKey()});
        }

        arr.sort((a,b) -> b[0]-a[0]);

        int[] result = new int[k]; 
        for(int i=0;i<k;i++){
            result[i] = arr.get(i)[1];
        }
        return result;
    }
}
