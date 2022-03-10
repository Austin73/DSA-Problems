 public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
            Arrays.sort(arr);
            int minDiff=Math.abs(arr[1]-arr[0]);
            for(int i=2;i<arr.length;i++)
            {
                    int temp= arr[i] - arr[i-1];
                    if(temp < minDiff)
                            minDiff= temp;
            }
            List<List<Integer>> res= new ArrayList<>();
            HashSet<Integer> set= new HashSet<>();
            for(int i=0;i<arr.length;i++)
            {
                    int target= (arr[i]-minDiff);
                    if(set.contains(target))
                    {
                         List<Integer> newList= new ArrayList<>();
                            newList.add(target);
                            newList.add(arr[i]);
                            res.add(newList);
                    }
                    
                    set.add(arr[i]);
            }
            return res;
